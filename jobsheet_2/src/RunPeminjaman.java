public class RunPeminjaman {
    public static void main(String[] args) {
        Peminjaman pinjam = new Peminjaman();
        
        pinjam.id = 354;
        pinjam.namaMember = "Garnies";
        pinjam.namaGame = "Minecraft";
        pinjam.harga = 5000;
        pinjam.lamaSewa = 5;
        pinjam.hitungHarga();
        pinjam.PeminjamanInfo();
    }
}
