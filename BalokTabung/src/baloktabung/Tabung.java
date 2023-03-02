/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloktabung;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran {
    double Tinggi;
    
    public Tabung(double Tinggi, double Jari) {
        super(Jari);
        this.Tinggi = Tinggi;
    }
    
    public double LuasPermukaan() {
       double LuasPermukaan = super.Keliling()*(Jari+Tinggi);
       return LuasPermukaan;
    }
    
     public double Volume() {
       double Volume = super.Luas()*Tinggi;
       return Volume;
    }
}
