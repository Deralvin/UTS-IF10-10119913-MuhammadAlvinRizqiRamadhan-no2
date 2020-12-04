/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10.pkg10119913.muhammadalvinrizqiramadhan.no2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class UTSIF1010119913MuhammadAlvinRizqiRamadhanNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input_nilai = new Scanner(System.in);

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tabungan = new Tabungan(input_nilai.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = input_nilai.nextInt();
        System.out.println("Saldo anda sekarang : "+tabungan.ambilUang(jumlah));
    }
    
}
