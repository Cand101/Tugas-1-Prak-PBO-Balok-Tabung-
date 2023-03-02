/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloktabung;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang{
    double Tinggi;

    public Balok(double Tinggi, double Panjang, double Lebar) {
        super(Panjang, Lebar);
        this.Tinggi = Tinggi;
    }
     public double LuasPermukaan() {
       double LuasPermukaan = 2*(Panjang*Lebar+Lebar*Tinggi+Panjang*Tinggi);
       return LuasPermukaan;
    }
    
     public double Volume() {
       double Volume = super.Luas()*Tinggi;
       return Volume;
    }
}
