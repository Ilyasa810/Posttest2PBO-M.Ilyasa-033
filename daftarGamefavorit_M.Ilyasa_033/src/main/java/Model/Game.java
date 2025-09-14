package Model;

public class Game {
    private String nama;
    private String genre;
    private int tahunRilis;

    // Constructor lengkap
    public Game(String nama, String genre, int tahunRilis) {
        this.nama = nama;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    @Override
    public String toString() {
        return nama + " | " + genre + " | " + tahunRilis;
    }
}

