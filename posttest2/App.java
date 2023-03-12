package posttest2;

import java.util.Scanner;

public class App {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        SistemPenerbangan sistemPenerbangan = new SistemPenerbangan();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===================================");
            System.out.println("| Sistem Manajemen Penerbangan    |"); 
            System.out.println("| [1] Tambah Penerbangan          |");
            System.out.println("| [2] Tampilkan Jadwal            |");
            System.out.println("| [3] Update Jadwal               |");
            System.out.println("| [4] Hapus Jadwal                |");
            System.out.println("| [5] Exit                        |");
            System.out.println("===================================");
            System.out.print("Masukkan Pilihan: ");
            int choice = input.nextInt();
            input.nextLine();
            clearScreen();

            switch (choice) {
                case 1:
                    sistemPenerbangan.createPenerbangan();
                    break;
                case 2:
                    sistemPenerbangan.readPenerbangan();
                    break;
                case 3:
                    sistemPenerbangan.updatePenerbangan();
                    break;
                case 4:
                    sistemPenerbangan.deletePenerbangan();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Input Tidak Valid");
            }
        }
    }
}
