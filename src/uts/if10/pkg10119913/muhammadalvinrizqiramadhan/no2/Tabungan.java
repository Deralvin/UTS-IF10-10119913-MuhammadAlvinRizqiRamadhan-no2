/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10.pkg10119913.muhammadalvinrizqiramadhan.no2;

/**
  * Nama : Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10K
 * NIM : 10119913
 * Deskripsi : UTS No2
 */
public class Tabungan {
    int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
