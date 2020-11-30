
package com.sc202.lostop;
import ComidaPorDia.ComidaPorDia;
import javax.swing.JOptionPane;
import Ingredientes.Ingredientes;

public class Pac_Man{

    
    public static void main(String[] args) {
      
        ComidaPorDia dia=new ComidaPorDia();
        dia.CantidadComidas();
        
        TotalVentas ventas=new TotalVentas();
        ventas.totalventas();
        
        ComidaQueVendeMas mas=new ComidaQueVendeMas();
        mas.LaMasVendida();

        Ingredientes ingredientes=new Ingredientes();
        ingredientes.CantidadIngredientes();
        
        Gastos gasto=new Gastos();
        gasto.TotalDeGastos();
       

        InformacionEmpleados informacion = new InformacionEmpleados();
        informacion.Datos();
        JOptionPane.showMessageDialog(null, informacion.LeerDatos());

        Salario salario = new Salario();
        salario.Salarios();
        JOptionPane.showMessageDialog(null, salario.LeerVector());
        
        
        

    }
    
}
