/*
Universidad Fidelitás
Introduccion ala Pragramacion
Realizado por Grupo 6 
Mecanismo de Automatización para el funcionamiento de un restaurante
 */
package restaurante_pac.man;

import javax.swing.JOptionPane;


public class Restaurante_PacMan {

    
    public static void main(String[] args) {
        InformacionEmpleado informacion = new InformacionEmpleado();
        informacion.Datos();
        JOptionPane.showMessageDialog(null, informacion.LeerDatos());
    
        Salarios salario = new Salarios();
        salario.Salarios();
        JOptionPane.showMessageDialog(null, salario.LeerVector());
    
        TotalVentas ventas=new TotalVentas();
        ventas.totalventas();
    
    }
    
}
