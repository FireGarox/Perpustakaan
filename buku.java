public class buku {
    // Atribut
    String judul;
    String penulis;
    int tahunTerbit;
    boolean isDipinjam;
    // Konstruktor untuk inisialisasi data awal
    // Konstruktor untuk inisialisasi data awal
    public buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false; // Secara default buku tersedia
    }
    // Method untuk meminjam buku
    // Method untuk meminjam buku
    public void pinjambuku() {
        if (!isDipinjam) {
            isDipinjam = true;
            System.out.println("Berhasil meminjam buku: " + judul);
        } else {
            System.out.println("Maaf, buku \"" + judul + "\" sedang dipinjam.");
        }
    }
    // Method untuk mengembalikan buku
    public void kembalikanbuku() {
        if (isDipinjam) {
            isDipinjam = false;
            System.out.println("Berhasil mengembalikan buku: " + judul);
        } else {
            System.out.println("Buku \"" + judul + "\" tidak sedang dalam status dipinjam.");
        }
    }
    // Method untuk menampilkan rincian informasi buku
    public void tampilkanDetail() {
        String status = isDipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("----------------------------------------");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status       : " + status);
        System.out.println("----------------------------------------");
    }
}