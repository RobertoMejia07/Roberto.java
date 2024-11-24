/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_2;

/**
 *
 * @author rober
 */
public class Cajero_Automatico {
    
    private String Banco;
    private String Monto;
    private String Metodo;

    public Cajero_Automatico(String Banco, String Monto, String Metodo) {
        this.Banco = Banco;
        this.Monto = Monto;
        this.Metodo = Metodo;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }
    
}
