import java.util.ArrayList;

public interface MataKuliahInterface {
    void tambahMataKuliah(MataKuliah mataKuliah);

    void hapusMataKuliah(MataKuliah mataKuliah);

    ArrayList<MataKuliah> getDaftarMataKuliah();
}
