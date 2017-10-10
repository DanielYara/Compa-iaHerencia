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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consultor consultor = new Consultor("POO", 1);
        Administrador admin1 = new Administrador("Valeria", 2, 220);
        Programador programador1 = new Programador("Isabel", 3, 500, "java");
        Programador programador2 = new Programador("Fabian", 4, 600, "C++");
        Lider lider1 = new Lider("Hernan", 5, 700, "Phyton");
        lider1.addProgramador(programador1);
        lider1.addProgramador(programador2);
        Compañia compania = new Compañia("MSL");
        compania.addContrato(consultor);
        compania.addContrato(admin1);
        compania.addContrato(programador1);
        compania.addContrato(programador2);
        compania.addContrato(lider1);
        
        double nomina = compania.calcularNomina();
        System.out.println("Valor nomina " + nomina);
        String datos = compania.listarInformacion();
        System.out.println(datos);
        
        //Reporte Nomina
        ArrayList<Contrato> contratos = compania.reporteNomina();
        for(Contrato contrato : contratos){
            if(contrato instanceof Consultor){
                Consultor _consultor = (Consultor)contrato;
                System.out.println("Consultor " + _consultor.getLabor());
            }
            else if(contrato instanceof Administrador){
                Administrador _administrador = (Administrador)contrato;
            }
            else if(contrato instanceof Programador){
                Programador _programador = (Programador)contrato; 
            }
            else if(contrato instanceof Lider){
                Lider _lider = (Lider)contrato;
            }
        }
        
    }
}
