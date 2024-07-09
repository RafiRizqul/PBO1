public class Main {
    public static void main(String[] args) {
       /* String variabelString; */

        Pengguna pengguna = new Pengguna();
        pengguna.login();
        pengguna.lupaPassword();
        pengguna.daftar();

        /* Latihan 4 Buat object Buku pada class Main, sebagaimana object Pengguna */
        Buku buku = new Buku();
        buku.setid(1);
        buku.setjudul("Melangkah");
        buku.setpenulis("J.S. Khairen");
        buku.setjumlah_halaman(200);
        buku.setharga(150000);
        buku.printDetails();
        buku.gantiJudul();
        buku.deleteBuku();
        buku.naikkanHarga();
        buku.naikkanHarga(15000);

        Komik komik = new Komik();
        komik.naikkanHarga();
        System.out.println("Volume Komik: " + komik.getvolume());
        
        Majalah majalah = new Majalah();
        majalah.setid(1);
        majalah.setjudul("Naruto");
        majalah.setpenulis("Rafi Rizqul");
        majalah.sethalaman(303);
        majalah.setharga(250000);
        majalah.printDetails();
        majalah.naikkanHarga();
        majalah.naikkanHarga(20000);

    }
}