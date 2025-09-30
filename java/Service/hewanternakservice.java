/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Asus
 */
import Model.Hewanternak;
import java.util.ArrayList;

public class hewanternakservice {
    private final ArrayList<HewanTernak> daftarTernak = new ArrayList<>();

    // CREATE
    public void tambahTernak(HewanTernak hewan) {
        daftarTernak.add(hewan);
        System.out.println("YAY!! Data berhasil ditambahkan!");
    }

    // READ
    public void lihatTernak() {
        if (daftarTernak.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < daftarTernak.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTernak.get(i));
            }
        }
    }

    // UPDATE
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

    // DELETE
    public void hapusTernak(int index) {
        if (index >= 0 && index < daftarTernak.size()) {
            daftarTernak.remove(index);
            System.out.println("YAY!! Data berhasil dihapus!");
        } else {
            System.out.println("NOO!! Nomor tidak valid.");
        }
    }

    // SEARCH
    public void cariTernak(String keyword) {
        boolean ditemukan = false;
        for (HewanTernak h : daftarTernak) {
            if (h.getJenis().equalsIgnoreCase(keyword)) {
                System.out.println(h);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // HITUNG TOTAL
    public void totalTernak() {
        int total = 0;
        for (HewanTernak h : daftarTernak) {
            total += h.getJumlah();
        }
        System.out.println("Total semua hewan ternak: " + total);
    }
}
