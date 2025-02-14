/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_1;

/**
 *
 * @author Camilo Jurado
 */
public class Estudiante {
    String nombre;
    String curso;
    String edad;

    public Estudiante() {
        this.nombre = "Juan";
        this.curso = "1A";
        this.edad = "16";
    }

    public Estudiante(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, String curso, String edad) {
        this(nombre,edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante: " + "nombre: " + nombre + ", curso: " + curso + ", edad: " + edad;
    }
    
    
}
