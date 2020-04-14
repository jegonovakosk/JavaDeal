package curso2;

public class calc {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a+b;
        Calculo subtrair = (a ,b) -> a-b;
        Calculo dividir = (a, b) -> a/b;
        Calculo multiplicar = (a, b) -> a*b;

        System.out.println(execultarOperacao(subtrair,500,175));
        System.out.println(execultarOperacao(soma,1,3));
        System.out.println(execultarOperacao(dividir,10000,2));
        System.out.println(execultarOperacao(multiplicar,750,500));
    }
    public static int execultarOperacao(Calculo calculo,int a ,int b){
        return calculo.calculo(a,b);
    }

}


interface Calculo{
    public int calculo( int a , int b );
}