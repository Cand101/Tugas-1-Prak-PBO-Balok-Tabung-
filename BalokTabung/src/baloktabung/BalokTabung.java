/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baloktabung;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BalokTabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int Pilih;
        int Ulang;
        int Panjang,Lebar,Tinggi,Jari;
        
        do {
            System.out.println("Pilih Menu\n1.Hitung Balok\n2. Hitung Tabung\n3. Exit\n");
            System.out.print("Pilih : ");
            Pilih = input.nextInt();
            if(Pilih==1){
                System.out.print("Masukan Panjang = ");
                Panjang = input.nextInt();
                System.out.print("Masukan Lebar = ");
                Lebar = input.nextInt();
                System.out.print("Masukan Tinggi = ");
                Tinggi = input.nextInt();
                Balok Bl = new Balok(Tinggi,Panjang,Lebar);
                System.out.println("Luas Persegi Panjang = " + Bl.Luas());
                System.out.println("Keliling Persegi Panjang = " + Bl.Keliling());
                System.out.println("Luas Permukaan Balok = " + Bl.LuasPermukaan());
                System.out.println("Volume Balok = " + Bl.Volume());
            }else if(Pilih==2){
                System.out.print("Masukan Jari-jari = ");
                Jari = input.nextInt();
                System.out.print("Masukan Tinggi = ");
                Tinggi = input.nextInt();
                Tabung Tb = new Tabung(Tinggi,Jari);
                System.out.println("Luas Lingkaran = " + Tb.Luas());
                System.out.println("Keliling Lingkaran = " + Tb.Keliling());
                System.out.println("Luas Tabung = " + Tb.LuasPermukaan());
                System.out.println("Volume Tabung = " + Tb.Volume());
            }else{
                System.exit(0);
            }
            System.out.print("Apakah anda mengulang program (1/0)? ");
            Ulang = input.nextInt();
        } while (Ulang!=0);
            
        
 

    }
    
}
