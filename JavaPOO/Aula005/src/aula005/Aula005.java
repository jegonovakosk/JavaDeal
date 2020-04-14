
package aula005;


public class Aula005 {

   
    public static void main(String[] args) {
         
      Teste01 p = new Teste01();
      
      p.setNumConta(1111);
      p.setDono("Jego");
      p.abrirConta("CC");
           
      Teste01 p1 = new Teste01();
      
      p1.setNumConta(2222);
      p1.setDono("Creusa");
      p1.abrirConta("CP");
      
      Teste01 p2 = new Teste01();
      
      p2.setNumConta(3333);
      p2.setDono("Aline");
      p2.abrirConta("CC");
      
      
      
      
      p.depositar(100);
      p1.depositar(200);
      p1.sacar(1000);
      
      p.sacar(150);
      p.fecharConta();
      
      p2.depositar(10000);
      p2.sacar(350);
      
      p.estadoAtual();
      p1.estadoAtual();
      p2.estadoAtual();
      
    }
    
}
