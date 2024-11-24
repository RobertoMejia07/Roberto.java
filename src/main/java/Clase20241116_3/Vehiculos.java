/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_3;

/**
 *
 * @author rober
 */
public class Vehiculos {
    
    private String Color;
    private String Ruedas;
    private String Retrovisores;
    private String Motor;
    private String Marca;

    public Vehiculos(String Color, String Ruedas, String Retrovisores, String Motor, String Marca) {
        this.Color = Color;
        this.Ruedas = Ruedas;
        this.Retrovisores = Retrovisores;
        this.Motor = Motor;
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getRuedas() {
        return Ruedas;
    }

    public void setRuedas(String Ruedas) {
        this.Ruedas = Ruedas;
    }

    public String getRetrovisores() {
        return Retrovisores;
    }

    public void setRetrovisores(String Retrovisores) {
        this.Retrovisores = Retrovisores;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
}
