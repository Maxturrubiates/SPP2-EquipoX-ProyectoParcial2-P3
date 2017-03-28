/*
Maximiliano Turrubiates González
Ana Silvia Aldape Felizardo
Juan Pablo Castillo Luna
Roxana Reyes Cordova
*/
package spp2.equipox.proyectoparcial2.p3;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2EquipoXProyectoParcial2P3 {
    public static void main(String[] args) {
         arreglo();
     }
     
     public static void caracteres(){
         char c='*';
     }
     
     public static void arreglo(){
        int m,n;
        
        System.out.println("Introduzca el tamaño (x,y) de las matrices");
        m=asignarTamaño("x = filas");
        n=asignarTamaño("y = columnas");
        System.out.println("Valores de la matriz: ");
        int[][]A=asignarValores(m,n);
         System.out.println("    El contenido del arreglo es: ");
        mostrarArray(A);
         System.out.println("En '*': ");
        for (int i = 0; i < A.length; i++){
            
            for (int j = 0; j < A[i].length; j++){
                for(int k=1;k<=A[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(A[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
        }
     public static int solicitaDatos(){
        Scanner kb=new Scanner(System.in);
        boolean flag;
        int num=0;
        do{      
            try{ 
                num = kb.nextInt(); 
                flag = true;
            }catch (Exception ex) { 
                flag = false;
                System.out.println("Este valor no es un entero, introduzca un entero:\n" +ex);
                kb.nextLine();   
            }
            
        }while(flag==false); 
        return num;
     }
    public static void mostrarArray(int [][]matrix){ 
            for(int i=0; i<matrix.length; i++){
                for (int j=0; j<matrix[i].length; j++){
                    System.out.print("["+matrix[i][j]+"]");
                    if (j+2>matrix[i].length){
                        System.out.println("\t");
                    }  
                }
            }
        }
    public static int[][] asignarValores(int m, int n){
            int[][] arreglo = new int [m][n];
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    System.out.println("Introduzca valores para la posición "+i+", "+j);
                    arreglo [i][j]=solicitaDatos();
                }    
            }

            return arreglo;
        }
    
    
    public static int asignarTamaño(String dimension){
            int x;
            boolean flag;
            System.out.println("Valor de "+dimension);
            do{
                x=solicitaDatos();
                flag=true;
                if(x<1){
                    System.out.println("Error, introduce un numero positivo:");
                    flag=false;
                }

            }while(flag==false);
            return x; 
    }
    
}
