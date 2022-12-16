public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    public int lamaSewa;
    public int total;

    public void hitungHarga() {
        total = lamaSewa * harga;
    }

    public void PeminjamanInfo() {
        System.out.println("id : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
        System.out.println("Lama Sewa   : " + lamaSewa);
        System.out.println("Total Harga : " + total);
    }
}
