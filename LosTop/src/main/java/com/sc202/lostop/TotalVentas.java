
package com.sc202.lostop;

import ComidaPorDia.ComidaPorDia;

public class TotalVentas {
    public static int Hamburguesas=3400;
    public static int TotalHamburguesas=0;
    public static int Papas=2000;
    public static int TotalPapa=0;
    public static int Pollo=3000;
    public static int TotalPollo=0;
    public static int HotDog=2500;
    public static int TotalHotDog=0;
    public static int TotaldeVentas;
    
    public void totalventas(){
        TotalHamburguesas=ComidaPorDia.Hamburguesas*Hamburguesas;
        TotalPapa=ComidaPorDia.Papas*Papas;
        TotalPollo=ComidaPorDia.Pollo*Pollo;
        TotalHotDog=ComidaPorDia.HotDog*HotDog;
        
        TotaldeVentas=TotalHamburguesas+TotalPapa+TotalPollo+TotalHotDog;
        System.out.print("El total de ventas es "+TotaldeVentas +"\n");
    }
}
