public class PemrogramanBerorientasiObjek extends MataKuliah {
    public PemrogramanBerorientasiObjek() {
        super("PemrogramanBerorientasiObjek", "PTIPBO2023", "Aryo Pinandito");
    }

    public void displayInfo() {
        System.out.println("Mata Kuliah: " + getNamaMataKuliah());
        System.out.println("ID Mata Kuliah: " + getIdMataKuliah());
        System.out.println("Nama Dosen: " + getNamaDosen());
    }
}
