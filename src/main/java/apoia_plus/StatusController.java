
package apoia_plus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public String verificarStatus() {
        return "Apoia+ está funcionando!";
    }
}
