public class Anggota {
    String nama;
    String nomorAnggota;

    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
    }

    // Method anggota untuk meminjam buku
    public void aksiPinjamBuku(buku b) {
        System.out.println(">> Anggota [" + nama + "] mencoba meminjam buku: " + b.judul);
        b.pinjambuku();
    }

    // Method anggota untuk mengembalikan buku
    public void aksiKembalikanBuku(buku b) {
        System.out.println(">> Anggota [" + nama + "] mencoba mengembalikan buku: " + b.judul);
        b.kembalikanbuku();
    }
}