/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Asus
 */
import Model.HewanTernak;
import java.util.ArrayList;

public class HTService {
    private final ArrayList<HewanTernak> daftarTernak = new ArrayList<>();

    public void tambahTernak(HewanTernak hewan) {
        daftarTernak.add(hewan);
        System.out.println("YAY!! Data berhasil ditambahkan!");
    }
    
    public void tambahTernak(String jenis, int umur, int jumlah) {
        daftarTernak.add(new HewanTernak(jenis, umur, jumlah) {
            @Override
            public String getDeskripsi() {
                return "Hewan Ternak - " + getJenis() +
                       " | Umur: " + getUmur() + " bulan | Jumlah: " + getJumlah();
            }
        });
        System.out.println("Data hewan umum berhasil ditambahkan!");
    }

    public void lihatTernak() {
        if (daftarTernak.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < daftarTernak.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTernak.get(i).getDeskripsi());
            }
        }
    }

    public void updateTernak(int index, int umurBaru, int jumlahBaru) {
        if (index >= 0 && index < daftarTernak.size()) {
            HewanTernak h = daftarTernak.get(index);
            h.setUmur(umurBaru);
            h.setJumlah(jumlahBaru);
            System.out.println("YAY!! Data berhasil diperbarui!");
        } else {
            System.out.println("NOO!! Nomor tidak valid.");
        }
    }

    public void hapusTernak(int index) {
        if (index >= 0 && index < daftarTernak.size()) {
            daftarTernak.remove(index);
            System.out.println("YAY!! Data berhasil dihapus!");
        } else {
            System.out.println("NOO!! Nomor tidak valid.");
        }
    }

    public void cariTernak(String keyword) {
        boolean ditemukan = false;
        for (HewanTernak ht : daftarTernak) {
            if (ht.getJenis().trim().equalsIgnoreCase(keyword.trim())) {
                System.out.println("Data ditemukan!");
                System.out.println(ht.getDeskripsi());
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public void totalTernak() {
        int total = 0;
        for (HewanTernak h : daftarTernak) {
            total += h.getJumlah();
        }
        System.out.println("Total semua hewan ternak: " + total);
    }
}
