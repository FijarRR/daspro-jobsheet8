
import java.util.Scanner;

public class Tugas3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko, toko, jumlahPelanggan;
        while (true) {
            System.out.print("Masukkan jumlah toko = ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Silakan input kembali.");
                continue;
            }
            break;
        }
        int totalSemuaBarang = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;
        for (toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("====< Toko " + toko + " >=====");
            while (true) {
                System.out.print("Masukkan jumlah pelanggan = ");
                jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Silakan input kembali.");
                    continue;
                }
                break;
            }
            int totalBarangToko = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int barang;
                while (true) {
                    System.out.print("Jumlah barang pelanggan " + pelanggan + " = ");
                    barang = sc.nextInt();

                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif. Silakan input kembali.");
                        continue;
                    }
                    break;
                }
                totalBarangToko += barang;
            }

            System.out.println(
                    "Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalSemuaBarang += totalBarangToko;
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("\n=== REKAP SELURUH TOKO ===");
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
