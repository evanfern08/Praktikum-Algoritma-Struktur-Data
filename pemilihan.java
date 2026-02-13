import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai tugas (0-100): ");
        double tugas = sc.nextDouble();

        System.out.print("Masukan nilai quiz (0-100): ");
        double quiz = sc.nextDouble();

        System.out.print("Masukan nilai UTS (0-100): ");
        double uts = sc.nextDouble();

        System.out.print("Masukan nilai UAS (0-100): ");
        double uas = sc.nextDouble();

        if (tugas < 0 || tugas > 100 ||
            quiz < 0 || quiz > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("Nilai tidak valid");

        } else {

            double nilaiAkhir = (0.2 * tugas) +
                                (0.2 * quiz) +
                                (0.3 * uts) +
                                (0.3 * uas);

            String nilaiHuruf;
            String keterangan;

            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
                keterangan = "MAAF ANDA TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                keterangan = "MAAF ANDA TIDAK LULUS";
            }

            System.out.println("\nNilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("Keterangan  : " + keterangan);
        }

        sc.close();
    }
}
