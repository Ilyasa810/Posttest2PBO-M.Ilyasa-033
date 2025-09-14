package com.mycompany.daftargamefavorit_m.ilyasa_033.main;

import Model.Game;
import Service.GameService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            GameService service = new GameService();
            int pilihan;
            
            do {
                System.out.println("\n=== Manajemen Daftar Game Favorit ===");
                System.out.println("1. Tambah Game");
                System.out.println("2. Lihat Daftar Game");
                System.out.println("3. Ubah Game");
                System.out.println("4. Hapus Game");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama game: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan genre game: ");
                        String genre = input.nextLine();
                        System.out.print("Masukkan tahun rilis: ");
                        int tahun = input.nextInt();
                        input.nextLine();
                        
                        service.tambah(new Game(nama, genre, tahun));
                    }
                    case 2 -> service.tampilkan();
                    case 3 -> {
                        service.tampilkan();
                        System.out.print("Pilih nomor game yang ingin diubah: ");
                        int ubahIndex = input.nextInt() - 1;
                        input.nextLine();
                        
                        System.out.print("Masukkan nama game baru: ");
                        String namaBaru = input.nextLine();
                        System.out.print("Masukkan genre baru: ");
                        String genreBaru = input.nextLine();
                        System.out.print("Masukkan tahun rilis baru: ");
                        int tahunBaru = input.nextInt();
                        input.nextLine();
                        
                        service.ubah(ubahIndex, new Game(namaBaru, genreBaru, tahunBaru));
                    }
                    case 4 -> {
                        service.tampilkan();
                        System.out.print("Pilih nomor game yang ingin dihapus: ");
                        int hapusIndex = input.nextInt() - 1;
                        input.nextLine();
                        service.hapus(hapusIndex);
                    }
                    case 5 -> System.out.println("Terima kasih! Program selesai.");
                    default -> System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } while (pilihan != 5);
        }
    }
}