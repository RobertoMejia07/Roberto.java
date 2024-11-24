/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116_3;

/**
 *
 * @author rober
 */
public class Moto extends Vehiculos {
    
    private String Cilindraje;
    private String Cadena;

    public Moto(String Cilindraje, String Cadena, String Color, String Ruedas, String Retrovisores, String Motor, String Marca) {
        super(Color, Ruedas, Retrovisores, Motor, Marca);
        this.Cilindraje = Cilindraje;
        this.Cadena = Cadena;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }
    
}
