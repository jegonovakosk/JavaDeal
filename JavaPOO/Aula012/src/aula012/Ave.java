package aula012;
public class Ave extends Animal{
    private String corPena;
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Come Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinha(){
        System.out.println("Construindo Ninho");
    }
    //metodo get set 
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
