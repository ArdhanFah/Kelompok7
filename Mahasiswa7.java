public class Mahasiswa7 {

    public String nama;
    public String nim;
    public String prodi;

    // Constructor
    
    public Mahasiswa7(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilkanMahasiswa() {
        System.out.println(nama + "\t|" + nim + "| \t" + prodi);
    }
}

