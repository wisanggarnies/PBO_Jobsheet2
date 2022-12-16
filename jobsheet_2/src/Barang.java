public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilkanBarang() {
        System.out.println ("Nama Barang : " + namaBrg);
        System.out.println ("Jenis Barang : " + jenisBrg);
        System.out.println ("Stok " + stok);
    }

    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk){
        stok=brgMasuk + stok;
        return stok;
    }
}
