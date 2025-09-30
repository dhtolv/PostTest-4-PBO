/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

/**
 *
 * @author Asus
 */
import Service.HTService;
import Model.HewanTernak;
import Model.HewanAir;
import Model.Unggas;
import java.util.Scanner;


public class MJMHewanTernak {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            HTService service = new HTService();
            
            int pilihan;
            do {
                System.out.println("\n=== Menu Manajemen Hewan Ternak ===");
                System.out.println("1. Tambah Hewan Ternak");
                System.out.println("2. Lihat Daftar Hewan Ternak");
                System.out.println("3. Update Data Hewan Ternak");
                System.out.println("4. Hapus Hewan Ternak");
                System.out.println("5. Cari Hewan Ternak");
                System.out.println("6. Cek Total Hewan Ternak");
                System.out.println("7. Keluar");
                System.out.println("===================================");
                System.out.print("Pilih menu: ");
                while (!input.hasNextInt()) {
                    System.out.println("Input harus berupa angka!");
                    input.next();
                }
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.println("Pilih kategori hewan:");
                        System.out.println("1. Hewan Ternak Umum");
                        System.out.println("2. Unggas");
                        System.out.println("3. Hewan Air");
                        System.out.print("Pilihan: ");
                        int kategori = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("Masukkan jenis hewan: ");
                        String jenis = input.nextLine();
                        System.out.print("Masukkan umur (bulan): ");
                        int umur = input.nextInt();
                        System.out.print("Masukkan jumlah: ");
                        int jumlah = input.nextInt();
                        input.nextLine();
                        
                        if (umur >= 0 && jumlah > 0) {
                            switch (kategori) {
                                case 1 -> {
                                    service.tambahTernak(jenis, umur, jumlah);
                                }
                                case 2 -> {
                                    service.tambahTernak(new Unggas(jenis, umur, jumlah));
                                }
                                case 3 -> {
                                    System.out.print("Masukkan habitat: ");
                                    String habitat = input.nextLine();
                                    service.tambahTernak(new HewanAir(jenis, umur, jumlah, habitat));
                                }
                                default -> System.out.println("Kategori tidak valid.");
                            }
                        } else {
                            System.out.println("Data tidak valid.");
                        }
                    }

                    case 2 -> service.lihatTernak();
                    case 3 -> {
                        service.lihatTernak();
                        System.out.print("Masukkan nomor data yang ingin diupdate: ");
                        int index = input.nextInt() - 1;
                        System.out.print("Masukkan umur baru: ");
                        int umur = input.nextInt();
                        System.out.print("Masukkan jumlah baru: ");
                        int jumlah = input.nextInt();
                        input.nextLine();
                        service.updateTernak(index, umur, jumlah);
                    }
                    case 4 -> {
                        service.lihatTernak();
                        System.out.print("Masukkan nomor data yang ingin dihapus: ");
                        int index = input.nextInt() - 1;
                        input.nextLine();
                        service.hapusTernak(index);
                    }
                    case 5 -> {
                        System.out.print("Masukkan jenis hewan yang dicari: ");
                        String keyword = input.nextLine();
                        service.cariTernak(keyword);
                    }
                    case 6 -> service.totalTernak();
                    case 7 -> System.out.println("Program selesai. Terima kasih!");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 7);
        }
    }

    public MJMHewanTernak() {
    }
}
