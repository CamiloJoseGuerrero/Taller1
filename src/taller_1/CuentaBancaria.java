/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_1;

/**
 *
 * @author Camilo Jurado
 */
public class CuentaBancaria {
    
        String numeroCuenta;
        String saldo;
        String tipoCuenta;


public CuentaBancaria(){
        numeroCuenta="21365489856";
        saldo= "10000000";
        tipoCuenta="Cuenta de Ahorro";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, String saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria: " + "numeroCuenta: " + numeroCuenta + ", saldo:" + saldo + ", tipoCuenta:" + tipoCuenta;
    }
    
}

