/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class HewanAir extends HewanTernak{
    private String habitat;
    
    public HewanAir(String jenis, int umur, int jumlah, String habitat) {
        super(jenis, umur, jumlah);
        this.habitat = habitat;
    }
    
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    @Override
    public String getDeskripsi() {
        return "Hewan Air - " + getJenis() +
               " | Umur: " + getUmur() + " bulan | Jumlah: " + getJumlah() +
               " | Habitat: " + habitat;
    }
}
