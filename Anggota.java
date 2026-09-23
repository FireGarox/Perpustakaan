public class Anggota {
    String nama;
    String nomorAnggota;

    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
    }

    public void aksiPinjamBuku(buku b) {
        System.out.println(">> Anggota [" + nama + "] mencoba meminjam buku: " + b.judul);
        b.pinjambuku();
    }

    public void aksiKembalikanBuku(buku b) {
        System.out.println(">> Anggota [" + nama + "] mencoba mengembalikan buku: " + b.judul);
        b.kembalikanbuku();
    }
}
