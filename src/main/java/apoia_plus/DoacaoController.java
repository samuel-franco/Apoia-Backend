
package apoia_plus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doacoes")
public class DoacaoController {

    private final List<Doacao> doacoes = new ArrayList<>();
    private final AtomicLong contador = new AtomicLong(1);

    @PostMapping
    public Doacao cadastrar(@RequestBody Doacao doacao) {
        doacao.setId(contador.getAndIncrement());
        doacoes.add(doacao);
        return doacao;
    }

    @GetMapping
    public List<Doacao> listar() {
        return doacoes;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doacao> buscar(@PathVariable Long id) {
        return doacoes.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Doacao> atualizar(
            @PathVariable Long id,
            @RequestBody Doacao dados) {

        for (Doacao doacao : doacoes) {
            if (doacao.getId().equals(id)) {
                doacao.setItem(dados.getItem());
                doacao.setDescricao(dados.getDescricao());
                doacao.setDoador(dados.getDoador());
                doacao.setQuantidade(dados.getQuantidade());

                return ResponseEntity.ok(doacao);
            }
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        boolean removido = doacoes.removeIf(
                d -> d.getId().equals(id)
        );

        if (removido) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
