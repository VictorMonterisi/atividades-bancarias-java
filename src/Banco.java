import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class Banco {

    private String nome;
    @Setter private List<Conta> contas;
}
