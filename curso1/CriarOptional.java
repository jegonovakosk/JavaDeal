import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Optional;

public class CriarOptional {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
     }
     public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }
    public static double fatorialComTailCall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1,numero*valor);
    }
}
