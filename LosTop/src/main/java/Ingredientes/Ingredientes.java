
package Ingredientes;

import javax.swing.JOptionPane;
public class Ingredientes {
    //La cantidad de paquetes o kilos que se compran
    public static int PanDeHamburguesa=0;
    public static int TortaDeCarne=0;
    public static int Tomate=0;
    public static int lechuga=0;
    public static int Queso=0;
    
    public static int Papas=0;
    
    public static int Pollo=0;
    public static int Empanizador=0;
    
    public static int PanDeHotDogs=0;
    public static int Salchichas=0;
    public static int Repollo=0;
    public static int Papitas=0;
    
    public static int SalsaDeTomate=0;
    public static int SalsaMayonesa=0;
    
    public void CantidadIngredientes(){
        
    PanDeHamburguesa=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de pan para hamburguesa compro"));
    TortaDeCarne=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de torta de carne compro"));
    Tomate=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos kilos de tomate compro"));
    lechuga=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos kilos de lechuga compro"));
    Queso=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de queso compro"));
    
    Papas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de papas compro"));
    
    Pollo=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos kilos de pollo compro"));
    Empanizador=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de empanizador compro"));
    
    PanDeHotDogs=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de pan para hot dogs compro"));
    Salchichas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de salchichas compro"));
    Repollo=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos kilos de repollo compro"));
    Papitas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de papitas compro"));
    
    SalsaDeTomate=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de salsa de tomate compro"));
    SalsaMayonesa=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos paquetes de mayonesa compro"));
       
    }
           
}
