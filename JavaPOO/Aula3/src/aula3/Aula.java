package aula3;

public class Aula {

    public static void main(String[] args) {
       Caneta caneta = new Caneta();
       caneta.modelo = "Bic Cristal";
       caneta.cor = "Azul";
       //caneta.ponta = 0.5f;
       caneta.carga = 80;
       //caneta.tampada = false;
       caneta.tampar();
               
       caneta.status();
       caneta.rabiscar();
       
    }
    
}
