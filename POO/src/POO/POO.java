/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Persona objPersona = new Persona();
        objPersona.crearPersona("Alejandro", "01-02-2000", 20);
        System.out.println("Persona Creada");
        System.out.println("Nombre:  "+ objPersona.getNombre());
        System.out.println("Fecha de Nacimiento:  "+ objPersona.getFechaNacimiento());
        System.out.println("Edad:  "+ objPersona.getEdad());*/
        
        //Persona objPersona = new Persona("Alejandro","2000-01-01", 20);
        
        /*JOptionPane.showMessageDialog(null, objPersona.getNombre()+ " " + 
                objPersona.getFechaNacimiento()+ " " + objPersona.getEdad());
        
        Persona objPersona2 = new Persona("Juan Pablo","2002-01-01", 18);
        JOptionPane.showMessageDialog(null, objPersona2.getNombre()+ " " + 
                objPersona2.getFechaNacimiento()+ " " + objPersona2.getEdad()); */
        
        /*JOptionPane.showMessageDialog(null, objPersona.sumaNumeros(15, 15));
        JOptionPane.showMessageDialog(null, objPersona.sumaNumeros(15.25, 15.25)); */
        
        Alumnos objAlumno = new Alumnos("Izabela Ejemplo ","2000-01-01 ",20);
        objAlumno.setMatricula("552244778");
        objAlumno.mostrarDatos();
        
        Profesor objProfesor = new Profesor("Esduardo Del Aguila ","1980-01-01",40);
        objProfesor.setDpi("5248750101");
        objProfesor.mostrarDatos();
    }
}
