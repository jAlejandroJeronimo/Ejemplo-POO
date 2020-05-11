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
public class Alumnos extends Persona{
    private String matricula;
    
    public Alumnos(String nombre, String fechaNacimiento, int edad) {
        super(nombre, fechaNacimiento, edad);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "ALUMNO \n NOMBRE: " + getNombre() + 
                "FECHA DE NACIMIENTO: " + getFechaNacimiento() + "MATRICULA: " + getMatricula());
    }
    
}
