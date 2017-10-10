/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador{
    private ArrayList<Programador> programadores;

    public Lider(String nombre, int id, double salario, String lenguaje) {
        super(nombre, id, salario, lenguaje);
        this.programadores = new ArrayList<>();
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }
    
    @Override
    public double calcularSalario() {
        return this.salario + (this.salario*0.1*this.programadores.size());
    }
    
    public boolean addProgramador(Programador programador){
        if(this.programadores.add(programador))
            return true;
        else
            return false;
        
    }

    @Override
    public String toString() {
        String aux = "";
        aux += super.toString() + " a cargo de ";
        for(Programador programador : programadores)
            aux += programador.toString();
        return aux;
    }
    
    
    
}
