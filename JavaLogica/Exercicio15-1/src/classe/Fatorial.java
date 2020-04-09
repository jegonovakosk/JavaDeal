/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author Jego
 */
public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n){
        num = n ;
        int f = 1;
        String s = "";
        for ( int j = n; j > 1; j--){
            f *= j;
            s += j + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
}
