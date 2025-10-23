import java.util.Scanner;

public class bioskop22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int HARGA_TIKET = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0.0;
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            int jumlahTiket;
            try {
                jumlahTiket = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine(); 
                continue;
            }
            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan coba lagi.");
                continue;
            }
            double hargaAwal = jumlahTiket * HARGA_TIKET;
            double diskon = 0.0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double hargaSetelahDiskon = hargaAwal * (1 - diskon);
            totalTiket += jumlahTiket;
            totalPenjualan += hargaSetelahDiskon;
            System.out.printf("Total harga untuk pelanggan ini: Rp %,d\n\n", (int) hargaSetelahDiskon);
        }
        System.out.println("\n--- Ringkasan Penjualan Hari Ini ---");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.printf("Total penjualan: Rp %,d\n", (int) totalPenjualan);
        scanner.close();
    }
}

