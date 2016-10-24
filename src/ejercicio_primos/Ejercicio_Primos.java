/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_primos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class Ejercicio_Primos {

    public static boolean Verprimo(int num1){
      boolean bandera; 
      bandera=false;
      for (int i=2;i<num1;i++){
          if ((num1%i)==0){
            bandera=true;
            i=num1;
          }   
      }  
      return bandera;
      
}
    
    public static int Siguienteprimo(int num1){
        
        boolean bandera=true;
        int i,j = 0;
        for (i=(num1+1);bandera==true;i++){
            if (Verprimo(i)==false){
                bandera=false;  
                j=i;
            }
        }
        return j;
    }
            
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num;
        boolean bandera;
        
        bandera=true;
        while (bandera){
            System.out.println("Dame un numero y te dire si es primo");
            num=leer.nextInt();
        
        
        if (num!=0){
            if (Verprimo(num)){
                System.out.println("El numero "+num+" no es primo"); 
                }else{
                System.out.println("El numero "+num+" es primo");
                }
          
            System.out.println("Y el siguiente numero primo es: "+Siguienteprimo(num));
        }
        if (num==0){
            bandera=false;
        }
        }
            
        
        
        
        
    }
    
}
