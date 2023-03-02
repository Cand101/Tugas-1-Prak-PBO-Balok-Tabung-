/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloktabung;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements BangunDatar{
    double Jari;
    
    public Lingkaran(double Jari) {
        this.Jari = Jari;
    }
    
    
    @Override
    public double Luas() {
       double L = Math.PI*Jari*Jari;
       return L;
    }

    @Override
    public double Keliling() {
        double K = 2*Math.PI*Jari;
        return K;
    }


    
    
}