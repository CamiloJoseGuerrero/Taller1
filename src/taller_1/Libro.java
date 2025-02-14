/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_1;

public class Libro {
String titulo;
String autor;
String numeroPaginas;

    
    
    public Libro(){
        this.titulo="la llamada de cthulhu";
        this.autor="Howard Phillips Lovecraft";
        this.numeroPaginas="244";       
    }

    public Libro(String titulo,String autor, String numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro:" + " titulo: " + titulo + ", autor:" + autor + ", numeroPaginas:" + numeroPaginas;
    }
    
}
