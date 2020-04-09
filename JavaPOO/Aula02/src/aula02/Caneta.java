package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Cor da caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
     
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Nao posso Rabiscar");
               System.out.println(" ");
        System.out.println("---------------------------------------------");
        }else {
            System.out.println("Estou rabiscando ");
               System.out.println(" ");
        System.out.println("---------------------------------------------");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
