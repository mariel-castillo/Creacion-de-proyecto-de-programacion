/*
 Universidad Fidelitás
Introduccion ala Pragramacion
Realizado por Grupo 6 
Mecanismo de Automatización para el funcionamiento de un restaurante:
Informacion de los empleados de la compañia,arreglo
 */
package restaurante_pac.man;

import javax.swing.JOptionPane;


public class InformacionEmpleado {
     //Son 5 empleados por franquicia 
    String Nombre="";
    String edad="";
    String Telefono="";
    String Cedula="";
    String Ubicacion="";
    static public String datos[][]=new String[5][5];
    static public String data[] = {"Nombre: ","Edad: ","Telefono: ","Cedula: ","Ubicacion: "};
    public void VerDatos(){
    
        String listaDatos="";
        for(int i=0; i<5; i++){
            listaDatos+="Registro #: "+ i + " " ;
            for(int j=0; j<5; j++){
             listaDatos+=data[j]+" " +datos[i][j]+" ";
            }
            listaDatos+="\n";
        }    
        JOptionPane.showMessageDialog(null, "Sigue la lista de datos "+listaDatos);
    }
    public void Datos(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
              datos[i][j]=JOptionPane.showInputDialog("Digite los datos de  "+ data[j]);
            } 
        }
        VerDatos();
    }
    
    public String LeerDatos(){
        String Arreglo="";
        for(int i=0; i<5; i++){
         for(int j=0; j<5; j++){
             Arreglo += datos[i][j] + "\n";
         }   
        }
        return Arreglo;
    }
    
    
}

