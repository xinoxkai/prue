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
        // TODO code application logic here
   
        
        Scanner leer = new Scanner(System.in);
        
        Alumno prom[]=new Alumno[2];
       
        String name;
        double suma=0,p,nota;
        int c;
        for (int i = 0; i <= 1; i++) {
            
            System.out.println("ingrese el nombre del alumno");
            name=leer.next();
              prom[i].setNombre(name);
              
            System.out.println("ingrese las notas del alumo");

            for (int j = 0; j <=1; j++) {
                nota=leer.nextDouble();
                suma=suma+nota;
  
            }
            
            p=suma/2;
            prom[i].setPromedio(p);
            
            System.out.println("ingrese el codigo del alumno");
            c = leer.nextInt();
            
            prom[i].setCodigo(c);
          //  prom[i]= new Alumno(name, p,c);

          suma=0;
        }
      
        for (int u = 0; u <=1 ; u++) {
            
            System.out.println("codigo"+"     nombre"+"   nota");
            System.out.println(prom[u].getNombre()+"        "+prom[u].getPromedio());
        }
        
        
    }
    
}
