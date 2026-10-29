import java.util.Scanner;

public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Masukan nilai n = ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n minimal 1. Masukan kembali");
                continue;
            }
            break;
        }
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}
