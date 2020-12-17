/*
 Universidad Fidelitás
Introduccion ala Pragramacion
Realizado por Grupo 6 
Mecanismo de Automatización para el funcionamiento de un restaurante:
clase de calculos de los salarios de los empleados
 */
package restaurante_pac.man;

import javax.swing.JOptionPane;


public class Salarios {
    public static double SalarioNormal=0;
    public static int Hora=1500;
    public static int TotalHoras=0;
    public static int TotalHorasExtra=0;
    public static int HoraExtra=2250;
    public static int calculo1;
    public static int calculo2;
     public static double calculo3;
    public static double CCSS=0.7667;
    public static double SalarioNeto;
            
    
    
    static public int todos[]=new int[5];
    
    
    public void Salarios(){
        // Proceso para sacar el salario 
        for(int i=0; i<todos.length; i++){ 
     
            TotalHoras= Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas horas trabajo "));
            TotalHorasExtra=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas horas extra hizo sino hizo digite 0 "));         
            calculo1=TotalHoras*Hora;
            calculo2=TotalHorasExtra*HoraExtra;
            SalarioNormal=calculo1+calculo2; 
            calculo3 = SalarioNormal - SalarioNormal*CCSS;
            SalarioNeto=SalarioNormal-calculo3;
            JOptionPane.showMessageDialog(null,SalarioNeto +" este es su salario neto");
            todos[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite su salario neto " +i)); 
            System.out.println("Su salario neto es "+todos[i]);
        }
        }
    
     public String LeerVector(){
         String vector="";
         for(int i=0; i<todos.length; i++){
             vector += todos[i] + "\n";
         }
        return vector;
     }
}
