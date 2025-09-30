/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Hewan extends HewanTernak {
    public Hewan(String jenis, int umur, int jumlah) {
        super(jenis, umur, jumlah);
    }

    @Override
    public String getDeskripsi() {
        return "Hewan Ternak - " + getJenis() +
               " | Umur: " + getUmur() + " bulan" +
               " | Jumlah: " + getJumlah();
    }
}
