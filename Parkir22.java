import java.util.Scanner;
public class Parkir22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenisKendaraan;
        int TARIF_MOBIL = 3000;
        int TARIF_MOTOR = 2000;
        int TARIF_MAKSIMAL = 12500;
        while (true) {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenisKendaraan = input.nextInt();

            if (jenisKendaraan == 0) {
                System.out.println("Program selesai.");
                break;
            }
            System.out.print("Masukkan lama parkir (jam): ");
            int lamaParkir = input.nextInt();
            int totalBayar = 0;
            if (lamaParkir > 5) {
                totalBayar = TARIF_MAKSIMAL;
            } else {
                if (jenisKendaraan == 1) {
                    totalBayar = lamaParkir * TARIF_MOBIL;
                } else if (jenisKendaraan == 2) {
                    totalBayar = lamaParkir * TARIF_MOTOR;
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }
            System.out.println("Total bayar: Rp " + totalBayar);
            System.out.println("-----------------------------");
        }
        input.close();
    }
}
