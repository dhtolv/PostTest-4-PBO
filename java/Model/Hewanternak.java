/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Hewanternak {
     private String jenis;
    private int umur;
    private int jumlah;

    public Hewanternak(String jenis, int umur, int jumlah) {
        this.jenis = jenis;
        this.umur = umur;
        this.jumlah = jumlah;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        }
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if (jumlah > 0) {
            this.jumlah = jumlah;
        }
    }

    @Override
    public String toString() {
        return "Jenis: " + jenis + " | Umur: " + umur + " bulan | Jumlah: " + jumlah;
    }
}
