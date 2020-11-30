
package com.sc202.lostop;

import ComidaPorDia.ComidaPorDia;

public class ComidaQueVendeMas {
    
    public static int Hamburguesas=ComidaPorDia.Hamburguesas;
    public static int Papas=ComidaPorDia.Papas;
    public static int Pollo=ComidaPorDia.Pollo;
    public static int HotDog=ComidaPorDia.HotDog;
    
    public void LaMasVendida(){
        
        if(Hamburguesas>Papas && Hamburguesas>Pollo && Hamburguesas>HotDog){
            System.out.println("La comida que mas se vende es la hamburguesa");
        }
        if(Papas>Hamburguesas && Papas>Pollo && Papas>HotDog){
           System.out.println("La comida que mas se vende son las papas"); 
        }
        if(Pollo>Hamburguesas && Pollo>Papas && Pollo>HotDog){
            System.out.println("La comida que mas se vende es el pollo");
        }
        if(HotDog>Hamburguesas && HotDog>Papas && HotDog>Pollo){
            System.out.println("La comida que mas se vende es el hot dog");
        }
    }
    
}
