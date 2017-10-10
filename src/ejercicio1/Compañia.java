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
public class Compañia {
    private String nombre;
    private ArrayList<Contrato> contratos;

    public Compañia(String nombre) {
        this.nombre = nombre;
        this.contratos = new ArrayList<>();
    }
       
    public boolean addContrato(Contrato contrato){
            return this.contratos.add(contrato);
    }
    
    public double calcularNomina(){
        double totalNomina = 0;
        for(Contrato contrato : contratos){
            totalNomina += contrato.calcularSalario();
        }
        return totalNomina;
    }
    
    public String listarInformacion(){
        String aux = "";
        for(Contrato contrato : contratos){
            aux += contrato.toString();
        }
        return aux;
    }
    
    public ArrayList<Contrato> reporteNomina(){
        return this.contratos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }
    
}
