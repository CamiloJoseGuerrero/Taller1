/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_1;
import java.util.*;
/**
 *
 * @author Camilo Jurado
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Libro libro = new Libro("La llamada de cthulhu", "Howard Phillips Lovecraft", "240");
        System.out.println(libro);
        CuentaBancaria cuenta = new CuentaBancaria("21365489856", "10000000", "Cuenta de Ahorro");
        System.out.println(cuenta);
        Estudiante Et = new Estudiante("Juan", "1A", "16");
        System.out.println(Et);
        
        
        System.out.println("--------------------------------");
        System.out.println("Digite el autor del libro: ");
        String autor =scan.nextLine();
        System.out.println("Nombre del titulo: ");
        String titulo =scan.nextLine();
       System.out.println("numero de paginas: ");
        String paginas =scan.nextLine();
        
        
        Libro Lb = new Libro();
        Lb.autor=autor;
        Lb.titulo=titulo;
        Lb.numeroPaginas=paginas;
        Libro Libro = new Libro(titulo, autor, paginas);
        System.out.println(Libro);
        System.out.println("--------------------------------");
        
        
        
        System.out.println("Digite su numero de cuenta: ");
        String numero =scan.nextLine();
        System.out.println("Digite su saldo: ");
        String saldo =scan.nextLine();
       System.out.println("Digite su tipo de cuenta: ");
        String acount =scan.nextLine();
        
        CuentaBancaria Acount = new CuentaBancaria();
        Acount.numeroCuenta=numero;
        Acount.saldo=saldo;
        Acount.tipoCuenta=acount;
        CuentaBancaria Acounts = new CuentaBancaria(numero, saldo, acount);
        System.out.println(Acounts);
        System.out.println("--------------------------------");
        
        
        System.out.println("Digite el nombre del estudiante: ");
        String nombre =scan.nextLine();
        System.out.println("Digite el curso del estudiante: ");
        String Curso =scan.nextLine();
       System.out.println("Digite la edad del estudiante: ");
        String edad =scan.nextLine();
        
        Estudiante Ed = new Estudiante();
        Ed.nombre=nombre;
        Ed.curso=Curso;
        Ed.edad=edad;
        Estudiante ed = new Estudiante(nombre, Curso, edad);
        System.out.println(ed);
        System.out.println("--------------------------------");
    }
}
