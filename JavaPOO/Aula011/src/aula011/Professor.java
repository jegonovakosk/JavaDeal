
package aula011;

public class Professor extends Pessoa {
      private String especialidade;
    private float salrio;
    
    public void receberAlmento(float aum){
        this.salrio += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalrio() {
        return salrio;
    }

    public void setSalrio(float salrio) {
        this.salrio = salrio;
    }
}
