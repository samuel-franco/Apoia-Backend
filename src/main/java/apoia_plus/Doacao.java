
package apoia_plus;

public class Doacao {

    private Long id;
    private String item;
    private String descricao;
    private String doador;
    private Integer quantidade;

    public Doacao() {
    }

    public Doacao(Long id, String item, String descricao,
                  String doador, Integer quantidade) {
        this.id = id;
        this.item = item;
        this.descricao = descricao;
        this.doador = doador;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
