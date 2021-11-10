public class Missao {

    private int numero;
    private int missao;
    private String dificuldade;

    public Missao(int numero, int missao) {
        this.numero = numero;
        this.missao = missao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void abrirMissao() {
        this.dificuldade = "Missao iniciada";
    }

    public void fecharMissao() {
        this.dificuldade = "Missao canselada";
    }
}
