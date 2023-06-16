public class StatistikaDasar extends MataKuliah {
    public StatistikaDasar() {
        super("StatistikaDasar", "PTISTS2023", "Riswan Septriayadi Sianturi");
    }

    public void displayInfo() {
        System.out.println("Mata Kuliah: " + getNamaMataKuliah());
        System.out.println("ID Mata Kuliah: " + getIdMataKuliah());
        System.out.println("Nama Dosen: " + getNamaDosen());
    }
}
