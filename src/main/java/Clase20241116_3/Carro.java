/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_3;

/**
 *
 * @author rober
 */
public class Carro extends Vehiculos {
    
    private String Puertas;
    private String Direccionales;
    private String Bomper;

    public Carro(String Puertas, String Direccionales, String Bomper, String Color, String Ruedas, String Retrovisores, String Motor, String Marca) {
        super(Color, Ruedas, Retrovisores, Motor, Marca);
        this.Puertas = Puertas;
        this.Direccionales = Direccionales;
        this.Bomper = Bomper;
    }

    public String getPuertas() {
        return Puertas;
    }

    public void setPuertas(String Puertas) {
        this.Puertas = Puertas;
    }

    public String getDireccionales() {
        return Direccionales;
    }

    public void setDireccionales(String Direccionales) {
        this.Direccionales = Direccionales;
    }

    public String getBomper() {
        return Bomper;
    }

    public void setBomper(String Bomper) {
        this.Bomper = Bomper;
    }
    
}
