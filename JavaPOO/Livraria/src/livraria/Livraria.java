package livraria;


public class Livraria {

   
    public static void main(String[] args) {
      
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Jose", 45, "M");
        p[1] = new Pessoa("Joana", 50 ,"F");
        
        l[0] = new Livro("Aprendendo Java","Jose Maria",300,p[0]);
        l[1] = new Livro("POO para Iniciante", "Pedro", 500,p[1]);
        l[2] = new Livro("Aprender Java","Maria", 100,p[0]);
        
        l[0].abrir();
        l[0].folhar(400);
        
        System.out.println(l[0].detales());
    }
    
    
}
