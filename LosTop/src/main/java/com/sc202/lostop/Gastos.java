
package com.sc202.lostop;

import Ingredientes.Ingredientes;
public class Gastos {
    //Ese es el precio del paquete o del kilo
    public static int PanDeHamburguesa=2500;
    public static int TortaDeCarne=3000;
    public static int Tomate=2400;
    public static int lechuga=2300;
    public static int Queso=3500;
    
    public static int Papas=4000;
    
    public static int Pollo=2600;
    public static int Empanizador=700;
    
    public static int PanDeHotDogs=2500;
    public static int Salchichas=3000;
    public static int Repollo=2300;
    public static int Papitas=1200;
    
    public static int SalsaDeTomate=4500;
    public static int SalsaDeMayonesa=4500;
    
    public static int PanHamburguesa, TortaCarne, TotalTomate, Totallechuga, TotalQueso, TotalPapas, TotalPollo, TotalEmpanizador, PanHotDog;
    public static int TotalSalchichas, TotalRepollo, TotalPapitas, SalsaTomate, SalsaMayonesa;
    
    int TotalGastos;
    
    public void TotalDeGastos(){
        
    PanHamburguesa=Ingredientes.PanDeHamburguesa*PanDeHamburguesa;
    TortaCarne=Ingredientes.TortaDeCarne*TortaDeCarne;
    TotalTomate=Ingredientes.Tomate*Tomate;
    Totallechuga=Ingredientes.lechuga*lechuga;
    TotalQueso=Ingredientes.Queso*Queso;
    
    TotalPapas=Ingredientes.Papas*Papas;
    
    TotalPollo=Ingredientes.Pollo*Pollo;
    TotalEmpanizador=Ingredientes.Empanizador*Empanizador;
    
    PanHotDog=Ingredientes.PanDeHotDogs*PanDeHotDogs;
    TotalSalchichas=Ingredientes.Salchichas*Salchichas;
    TotalRepollo=Ingredientes.Repollo*Repollo;
    TotalPapitas=Ingredientes.Papitas*Papitas;
    
    SalsaTomate=Ingredientes.SalsaDeTomate*SalsaDeTomate;
    SalsaMayonesa=Ingredientes.SalsaMayonesa*SalsaMayonesa;
    
    TotalGastos=PanHamburguesa+TortaCarne+TotalTomate+Totallechuga+TotalQueso+TotalPapas+TotalPollo+TotalEmpanizador+PanHotDog+TotalSalchichas+TotalRepollo+TotalPapitas+SalsaTomate+SalsaMayonesa;
    
    System.out.print("El total de gastos es "+TotalGastos);
    
    }
    
}

