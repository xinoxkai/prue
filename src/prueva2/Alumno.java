/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva2;

/**
 *
 * @author juanh
 */
public class Alumno{
    
    double promedio;
    String nombre;
    int codigo;
    
    
    public Alumno(String name, double p,int c){
    
    promedio=p;
    nombre=name;
    codigo=c;
} 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }





    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    
    
    
}
