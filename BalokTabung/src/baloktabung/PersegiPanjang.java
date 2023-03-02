/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloktabung;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements BangunDatar {
    double Panjang;
    double Lebar;
    
    public PersegiPanjang(double Panjang, double Lebar) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }


    @Override
    public double Luas() {
        double LKotak = Panjang*Lebar;
        return LKotak;
    }

    @Override
    public double Keliling() {
        double KKotak = 2*(Panjang+Lebar);
        return KKotak;
    }

   
}
