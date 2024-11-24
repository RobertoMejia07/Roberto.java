/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_3;

/**
 *
 * @author rober
 */
public class Barco extends Vehiculos {
    
    private String Bandera;
    private String SistemaDeNavegacion;

    public Barco(String Bandera, String SistemaDeNavegacion, String Color, String Ruedas, String Retrovisores, String Motor, String Marca) {
        super(Color, Ruedas, Retrovisores, Motor, Marca);
        this.Bandera = Bandera;
        this.SistemaDeNavegacion = SistemaDeNavegacion;
    }

    public String getBandera() {
        return Bandera;
    }

    public void setBandera(String Bandera) {
        this.Bandera = Bandera;
    }

    public String getSistemaDeNavegacion() {
        return SistemaDeNavegacion;
    }

    public void setSistemaDeNavegacion(String SistemaDeNavegacion) {
        this.SistemaDeNavegacion = SistemaDeNavegacion;
    }
    
}
