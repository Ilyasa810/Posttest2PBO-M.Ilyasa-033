package Service;

import Model.Game;
import java.util.ArrayList;

public class GameService {
    private final ArrayList<Game> daftarGame = new ArrayList<>();

    // CREATE
    public void tambah(Game game) {
        daftarGame.add(game);
        System.out.println("Game ditambahkan!");
    }

    // READ
    public void tampilkan() {
        if (daftarGame.isEmpty()) {
            System.out.println("Daftar kosong.");
        } else {
            for (int i = 0; i < daftarGame.size(); i++) {
                System.out.println((i + 1) + ". " + daftarGame.get(i));
            }
        }
    }

    // UPDATE
    public void ubah(int index, Game gameBaru) {
        if (index >= 0 && index < daftarGame.size()) {
            daftarGame.set(index, gameBaru);
            System.out.println("Game diubah!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // DELETE
    public void hapus(int index) {
        if (index >= 0 && index < daftarGame.size()) {
            daftarGame.remove(index);
            System.out.println("Game dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
