/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva2;

import java.util.Scanner;

/**
 *
 * @author juanh
 */
public class Prueva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        Scanner leer = new Scanner(System.in);
        
        Alumno[] prom=new Alumno[2];
       
        String name;
        double suma=0,p,nota;
        int c;        
        
        for (int i = 0; i < prom.length; i++) {
            
            System.out.println("ingrese el nombre del alumno");
            name=leer.next();
            System.out.println("ingrese las notas del alumo");

            for (int j = 0; j <=1; j++) {
                nota=leer.nextDouble();
                suma=suma+nota;
            }
            
            p=suma/2;
          
            System.out.println("ingrese el codigo del alumno");
            c = leer.nextInt();

            prom[i]= new Alumno(name,p,c);

            suma=0;
        }
      
        for (int u = 0; u <prom.length ; u++) {
            System.out.println("codigo"+"     nombre"+"   promedio");
            System.out.println(prom[u].getCodigo()+"      "+prom[u].getNombre()+"         "+prom[u].getPromedio());
        }
        
        
    }
    
}
