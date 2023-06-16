public abstract class MataKuliah {
    private String namaMataKuliah;
    private String idMataKuliah;
    private String namaDosen;

    public MataKuliah(String namaMataKuliah, String idMataKuliah, String namaDosen) {
        this.namaMataKuliah = namaMataKuliah;
        this.idMataKuliah = idMataKuliah;
        this.namaDosen = namaDosen;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public String getIdMataKuliah() {
        return idMataKuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public abstract void displayInfo();
}
