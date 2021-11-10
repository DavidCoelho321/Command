public class IniciodeMissaoTrabalho implements Trabalho {
    private Missao missao;

    public IniciodeMissaoTrabalho(Missao missao) {
        this.missao = missao;
    }

    public void executar() {
        this.missao.abrirMissao();
    }

    public void cancelar() {
        this.missao.fecharMissao();
    }
}
