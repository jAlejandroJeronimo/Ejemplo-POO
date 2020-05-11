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
public class Persona {
    private String nombre;
    private String fechaNacimiento;
    private int edad;
    
    public Persona(String nombre, String fechaNacimiento, int edad){
        //JOptionPane.showMessageDialog(null,"Soy el contrtructor");
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int sumaNumeros(int valor1, int valor2){
        return valor1 + valor2;
    }
    public double sumaNumeros(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    
    
    /*public void crearPersona(String nombre, String fechanacimiento, int edad){
        this.nombre = nombre;
        this.fechaNacimiento = fechanacimiento;
        this.edad = edad;
    }*/
    
}
