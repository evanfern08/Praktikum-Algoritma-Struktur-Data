import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukan nim:");
        long nim =  sc.nextLong();

        int n = (int)(nim % 100);      // untuk ambil 2 digit terakhir dari NIM

        if (n < 10) {
            n = n + 10;
        }
         for (int i = 1; i <= n; i++) {

            if (i != 10 && i != 15) {
                if (i % 3 == 0) {
                    System.out.print("# ");
                }
                else if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print("* ");
                }
            }
         }
         sc.close();
    }
}