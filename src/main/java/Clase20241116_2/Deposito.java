/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_2;

/**
 *
 * @author rober
 */
public class Deposito extends Cajero_Automatico {
    
    private String SaldoDepositado;

    public Deposito(String SaldoDepositado, String Banco, String Monto, String Metodo) {
        super(Banco, Monto, Metodo);
        this.SaldoDepositado = SaldoDepositado;
    }

    public String getSaldoDepositado() {
        return SaldoDepositado;
    }

    public void setSaldoDepositado(String SaldoDepositado) {
        this.SaldoDepositado = SaldoDepositado;
    }
    
    
   
}