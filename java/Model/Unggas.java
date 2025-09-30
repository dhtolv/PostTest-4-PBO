/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Unggas extends HewanTernak {
    private String jenisUnggas;

    public Unggas(String jenis, int umur, int jumlah) {
        super(jenis, umur, jumlah);
    }
    
    public String getJenisUnggas() {
        return jenisUnggas;
    }
    
    public void setJenisUnggas(String jenisUnggas) {
        this.jenisUnggas = jenisUnggas;
    }
    
    @Override
    public String getDeskripsi() {
        return "Unggas - " + getJenis() +
               " | Umur: " + getUmur() + " bulan | Jumlah: " + getJumlah();    
    }
}
