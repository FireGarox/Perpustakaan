public class main {
    public static void main(String[] args) {

        buku buku1 = new buku("Hidup Jokowi", "wowok", 2016);
        buku buku2 = new buku("Orang Desa Tidak Pakai Rupiah", "wowo", 2026);
        buku buku3 = new buku("Kelapa sawit", "Rakyat biasa", 2005);
        buku buku4 = new buku("Nyawit ni orang", "Gembul", 1980);

        Anggota anggota1 = new Anggota("Budi", "A-001");
        Anggota anggota2 = new Anggota("Siti", "A-002");

        System.out.println("Seorang Anggota meminjam lebih dari satu Buku");
        anggota1.aksiPinjamBuku(buku1);
        anggota1.aksiPinjamBuku(buku3);

        System.out.println("Status Buku Setelah Dipinjam");
        buku1.tampilkanDetail();
        buku3.tampilkanDetail();

        System.out.println("Anggota mencoba meminjam Buku yang sudah dipinjam");
        anggota2.aksiPinjamBuku(buku1); 

        System.out.println(" Pengembalian dan Peminjaman Normal");
        anggota1.aksiKembalikanBuku(buku1);
        
        anggota2.aksiPinjamBuku(buku1);
        anggota2.aksiPinjamBuku(buku4);
    }
}