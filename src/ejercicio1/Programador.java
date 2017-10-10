/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado{
    protected String lenguaje;

    public Programador(String nombre, int id, double salario, String lenguaje) {
        super(nombre, id, salario);
        this.lenguaje = lenguaje;
    }
    
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    @Override
    public double calcularSalario() {
        if(this.lenguaje.equals("java"))
            return (this.salario + (this.salario*0.1));
        else
            return this.salario;
    }

    @Override
    public String toString() {
        return "Programador{" + "lenguaje=" + lenguaje + '}' + super.toString();
    }
    
    

}
