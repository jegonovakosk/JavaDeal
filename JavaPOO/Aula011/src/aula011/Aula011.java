
package aula011;


public class Aula011 {

    public static void main(String[] args) {
           Visitante v1 = new Visitante();
           
          /* v1.setNome("JEGO");
           v1.setIdade(30);
           v1.setSexo("M");
           System.out.println(v1.toString());*/
          Aluno a1 =new Aluno();
          a1.setNome("Claudio");
          a1.setMatricula(1111);
          a1.setCurso("Informatica");
          a1.setIdade(30);
          a1.setSexo("M");
          a1.pagarMensalidade();
          System.out.println("---------------------------------");
          System.out.println("");
          System.out.println("");
          
          Bolsista b1 = new Bolsista();
          b1.setMatricula(1112);
          b1.setNome("Jubileu");
          b1.setBolsa(12.5f);
          b1.setSexo("M");
          b1.pagarMensalidade();
          
          Professor p1 = new Professor();
          p1.setNome("Bettio");
          p1.setIdade(50);
          System.out.println(p1.toString());
          
          
          
    }

    private static boolean ToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
