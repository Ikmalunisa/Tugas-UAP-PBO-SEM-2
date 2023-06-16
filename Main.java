import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<MataKuliah> daftarMataKuliahTersedia = new ArrayList<>();
        daftarMataKuliahTersedia.add(new SistemOperasiKomputer());
        daftarMataKuliahTersedia.add(new StatistikaDasar());
        daftarMataKuliahTersedia.add(new PemrogramanBerorientasiObjek());

        System.out.println("List Mata Kuliah yang Tersedia:");
        System.out.println("No - Matakuliah - ID Mata kuliah - Nama Dosen");
        int count = 1;
        for (MataKuliah mataKuliah : daftarMataKuliahTersedia) {
            System.out.print(count + ". ");
            mataKuliah.displayInfo();
            count++;
        }

        System.out.print("\nNama Mahasiswa: ");
        String namaMahasiswa = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        KartuRencanaStudi krs = new KartuRencanaStudi(namaMahasiswa, nim);

        System.out.print("Jumlah Mata Kuliah yang Diambil: ");
        int jumlahMataKuliah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMataKuliah; i++) {
            boolean validIdMataKuliah = false;
            while (!validIdMataKuliah) {
                System.out.print("Masukkan ID Mata Kuliah: ");
                String idMataKuliah = input.nextLine();
                for (MataKuliah mataKuliah : daftarMataKuliahTersedia) {
                    if (mataKuliah.getIdMataKuliah().equalsIgnoreCase(idMataKuliah)) {
                        krs.tambahMataKuliah(mataKuliah);
                        validIdMataKuliah = true;
                        break;
                    }
                }
                if (!validIdMataKuliah) {
                    System.out.println("ID Mata Kuliah tidak valid. Silakan coba lagi.");
                }
            }
        }

        krs.tampilkanKartuRencanaStudi();

        System.out.print("\nApakah data yang diinputkan sudah benar? (ya/tidak): ");
        String konfirmasiAwal = input.nextLine();

        if (konfirmasiAwal.equalsIgnoreCase("ya")) {
            
            System.out.println("\nData berhasil tersimpan!");
        } else if (konfirmasiAwal.equalsIgnoreCase("tidak")) {
            boolean gantiMataKuliah = true;
            while (gantiMataKuliah) {
                System.out.print("List Mata Kuliah yang Diambil: ");
                count = 1;
                for (MataKuliah mataKuliah : krs.getDaftarMataKuliah()) {
                    System.out.print(count + ". ");
                    mataKuliah.displayInfo();
                    count++;
                }

                System.out.print("Apakah ada mata kuliah yang ingin diganti? (ya/tidak): ");
                String ganti = input.nextLine();

                if (ganti.equalsIgnoreCase("ya")) {
                    System.out.print("Masukkan ID Mata Kuliah yang Ingin Diganti: ");
                    String idMataKuliahGanti = input.nextLine();
                    boolean mataKuliahDitemukan = false;
                    for (MataKuliah mataKuliah : krs.getDaftarMataKuliah()) {
                        if (mataKuliah.getIdMataKuliah().equalsIgnoreCase(idMataKuliahGanti)) {
                            krs.hapusMataKuliah(mataKuliah);
                            mataKuliahDitemukan = true;
                            break;
                        }
                    }
                    if (mataKuliahDitemukan) {
                        boolean validIdMataKuliahBaru = false;
                        while (!validIdMataKuliahBaru) {
                            System.out.print("Masukkan ID Mata Kuliah Baru: ");
                            String idMataKuliahBaru = input.nextLine();
                            for (MataKuliah mataKuliah : daftarMataKuliahTersedia) {
                                if (mataKuliah.getIdMataKuliah().equalsIgnoreCase(idMataKuliahBaru)) {
                                    krs.tambahMataKuliah(mataKuliah);
                                    validIdMataKuliahBaru = true;
                                    break;
                                }
                            }
                            if (!validIdMataKuliahBaru) {
                                System.out.println("ID Mata Kuliah tidak valid. Silakan coba lagi.");
                            }
                        }
                    } else {
                        System.out.println("ID Mata Kuliah tidak ditemukan.");
                    }
                } else if (ganti.equalsIgnoreCase("tidak")) {
                    gantiMataKuliah = false;
                } else {
                    System.out.println("Input tidak valid. Silakan coba lagi.");
                }
            }

            krs.tampilkanKartuRencanaStudi();

            System.out.print("\nApakah data yang diinputkan sudah benar? (ya/tidak): ");
            String konfirmasiAkhir = input.nextLine();

            if (konfirmasiAkhir.equalsIgnoreCase("ya")) {
                
                System.out.println("\nData berhasil tersimpan! Silahkan konfirmasi ke DPA!");
            } else if (konfirmasiAkhir.equalsIgnoreCase("tidak")) {
                System.out.println("Proses pengubahan data dibatalkan.");
            } else {
                System.out.println("Input tidak valid. Proses pengubahan data dibatalkan.");
            }
        } else {
            System.out.println("Input tidak valid. Proses penyimpanan data dibatalkan.");
        }

        input.close();
    }
}
