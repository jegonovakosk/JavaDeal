
package aula02;

public class Aula02 {

    public static void main(String[] args) {
       Caneta caneta = new Caneta();
       
       caneta.cor = "Azul";
       caneta.ponta = 0.5f;
       caneta.destampar();
       caneta.status();
       caneta.rabiscar();
       
      Caneta caneta2 = new Caneta();
      
      caneta2.modelo ="Big";
      caneta2.cor = "Preta";
      caneta2.tampar();
      caneta2.status();
      caneta2.rabiscar();
        
    }
    
    
    
}
