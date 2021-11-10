import java.util.ArrayList;
import java.util.List;

public class Conquista {

    private List<Trabalho> trabalhos = new ArrayList<Trabalho>();

    public void executarTarefa(Trabalho trabalho) {
        this.trabalhos.add(trabalho);
        trabalho.executar();
    }

    public void cancelarUltimaTrabalho() {
        if (trabalhos.size() != 0) {
            Trabalho trabalho = this.trabalhos.get(this.trabalhos.size() - 1);
            trabalho.cancelar();
            this.trabalhos.remove(this.trabalhos.size() - 1);
        }
    }
}
