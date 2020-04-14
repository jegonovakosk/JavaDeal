package projetopessoa;


public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTabalhando() {
        return trabalhando;
    }

    public void setTabalhando(boolean tabalhando) {
        this.trabalhando = tabalhando;
    }
    
    
    
}
