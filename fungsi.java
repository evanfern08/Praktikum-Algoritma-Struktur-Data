import java.util.Scanner;
public class fungsi {
    
    // Data Stock Bunga: 4 cabang x 4 jenis bunga
    // Kolom: Aglonema, Keladi, Alocasia, Mawar
    static int[][] stock = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };
    

    static int[] harga = {75000, 50000, 60000, 10000};
    
    // Nama bunga
    static String[] namabunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    
    // Nama cabang
    static String[] namacabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    
    // untuk menampilkan pendapatan setiap cabang
    public static void hitungPendapatanCabang() {
        System.out.println("===== PENDAPATAN SETIAP CABANG =====\n");
        for (int i = 0; i < stock.length; i++) {
            long pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println(namacabang[i] + ": Rp " + String.format("%,d", pendapatan));
        }
        System.out.println();
    }
    
    // untuk menampilkan status setiap cabang
    public static void tampilkanStatusCabang() {
        System.out.println("===== STATUS SETIAP CABANG =====\n");
        for (int i = 0; i < stock.length; i++) {
            long pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            
            String status;
            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }
            
            System.out.println(namacabang[i] + " - Rp " + String.format("%,d", pendapatan) + " - Status: " + status);
        }
        System.out.println();
    }
    
    // untuk menampilkan detail stock setiap cabang
    public static void tampilkanDetailStock() {
        System.out.println("===== DETAIL STOCK BUNGA SETIAP CABANG =====\n");
        System.out.printf("%-20s", "Cabang");
        for (String bunga : namabunga) {
            System.out.printf("%-15s", bunga);
        }
        System.out.println();
        System.out.println("================================================================================");
        
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("%-20s", namacabang[i]);
            for (int j = 0; j < stock[i].length; j++) {
                System.out.printf("%-15d", stock[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("  SISTEM INFORMASI ROYALGARDEN");
        System.out.println("====================================\n");
        
        tampilkanDetailStock();
        hitungPendapatanCabang();
        tampilkanStatusCabang();
    }
}