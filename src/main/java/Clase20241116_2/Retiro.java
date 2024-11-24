/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_2;

/**
 *
 * @author rober
 */
public class Retiro extends Cajero_Automatico{
    
    private String SaldoRetirado;

    public Retiro(String SaldoRetirado, String Banco, String Monto, String Metodo) {
        super(Banco, Monto, Metodo);
        this.SaldoRetirado = SaldoRetirado;
    }

    public String getSaldoRetirado() {
        return SaldoRetirado;
    }

    public void setSaldoRetirado(String SaldoRetirado) {
        this.SaldoRetirado = SaldoRetirado;
    }
    
}
