    import java.util.ArrayList;

    public class KartuRencanaStudi implements MataKuliahInterface {
        private static final String angkatan = "2023";
        private String namaMahasiswa;
        private String nim;
        private ArrayList<MataKuliah> daftarMataKuliah;

        public KartuRencanaStudi(String namaMahasiswa, String nim) {
            this.namaMahasiswa = namaMahasiswa;
            this.nim = nim;
            this.daftarMataKuliah = new ArrayList<>();
        }
        public KartuRencanaStudi(String namaMahasiswa) {
            this.namaMahasiswa = namaMahasiswa;
            this.daftarMataKuliah = new ArrayList<>();
        }

        public void tambahMataKuliah(MataKuliah mataKuliah) {
            daftarMataKuliah.add(mataKuliah);
        }

        public void hapusMataKuliah(MataKuliah mataKuliah) {
            daftarMataKuliah.remove(mataKuliah);
        }

        public ArrayList<MataKuliah> getDaftarMataKuliah() {
            return daftarMataKuliah;
        }

        public static void printdatamatkul(KartuRencanaStudi obj){
            System.out.println("\n--------------- KRS ---------------");
            System.out.println("Angkatan : " + angkatan);
            System.out.println("Nama MataKuliah " + obj.getNIM());
            System.out.println("Mahasiswa" + obj.getNamaMHS());
        }
        private String getNamaMHS() {
            return namaMahasiswa;
        }
        private String getNIM() {
            return nim;
        }
        public void tampilkanKartuRencanaStudi() {
            System.out.println("\n--------------- KRS ---------------");
            System.out.println("Angkatan : " + angkatan);
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("NIM: " + nim);
            System.out.println("Pilihan Mata Kuliah:");
            if (daftarMataKuliah.isEmpty()) {
                System.out.println("Tidak ada mata kuliah yang diambil.");
            } else {
                int count = 1;
                for (MataKuliah mataKuliah : daftarMataKuliah) {
                    System.out.println("   " + count + ". ");
                    mataKuliah.displayInfo();
                    count++;
                }
            }
        }

        
        
    }
