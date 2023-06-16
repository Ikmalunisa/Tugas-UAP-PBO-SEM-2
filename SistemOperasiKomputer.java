public class SistemOperasiKomputer extends MataKuliah {
    public SistemOperasiKomputer() {
        super("SistemOperasiKomputer", "PTISOK2023", "Wibisono Sukmo Wardhono");
    }

    public void displayInfo() {
        System.out.println("Mata Kuliah: " + getNamaMataKuliah());
        System.out.println("ID Mata Kuliah: " + getIdMataKuliah());
        System.out.println("Nama Dosen: " + getNamaDosen());
    }
}
