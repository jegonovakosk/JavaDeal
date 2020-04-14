package aula012;

import java.util.HashSet;

public class Aula012 {

    
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachoro k = new Cachoro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
    
}
