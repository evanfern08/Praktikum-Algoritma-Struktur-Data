import java.util.Scanner;
public class Tugas2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine(); // membersihkan newline

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilSemua(jadwal, n);
                    break;
                case 2:
                    cariBerdasarkanHari(jadwal, n);
                    break;
                case 3:
                    cariBerdasarkanMatkul(jadwal, n);
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }

    // Input data jadwal
    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // Menampilkan semua jadwal dalam bentuk tabel
    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n==========================================================================");
        System.out.printf("%-25s %-20s %-10s %-15s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==========================================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    // Menampilkan jadwal berdasarkan hari
    static void cariBerdasarkanHari(String[][] jadwal, int n) {
        System.out.print("Masukkan hari yang dicari: ");
        String hari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("\nJadwal ditemukan:");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // Menampilkan jadwal berdasarkan nama mata kuliah
    static void cariBerdasarkanMatkul(String[][] jadwal, int n) {
        System.out.print("Masukkan nama mata kuliah: ");
        String matkul = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("\nJadwal ditemukan:");
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
