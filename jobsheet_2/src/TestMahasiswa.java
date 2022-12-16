public class TestMahasiswa {
    public static void main (String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tmpilBiodata();

        mhs2.nim=102;
        mhs2.nama="Nofita";
        mhs2.alamat="Jl. Merdeka 159";
        mhs2.kelas="1E";
        mhs2.tmpilBiodata();

        mhs3.nim=103;
        mhs3.nama="Andri";
        mhs3.alamat="Jl. A.Yani 123";
        mhs3.kelas="1B";
        mhs3.tmpilBiodata();
    }
}
