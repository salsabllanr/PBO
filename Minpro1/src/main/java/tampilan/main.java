/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampilan;
import pendataansc.StudyClub;
import java.util.Scanner;

/**
 *
 * @author adindasalsabillanaura
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Variabel untuk mengontrol loop
        int choice;

        while (running) {
            System.out.println("+=================================+");
            System.out.println("|   Study Club Sistem Informasi   |");
            System.out.println("+=================================+");
            System.out.println("| [1] Tambah Club                 |");
            System.out.println("| [2] Lihat Semua Club            |");
            System.out.println("| [3] Hapus Club                  |");
            System.out.println("| [4] Update Club                 |");
            System.out.println("| [0] Keluar                      |");
            System.out.println("+=================================+");
            System.out.print("Masukkan Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama study club: ");
                    String clubName = scanner.nextLine();
                    System.out.print("Masukkan nama penanggung jawab: ");
                    String leaderName = scanner.nextLine();
                    System.out.print("Masukkan jumlah anggota: ");
                    int memberCount = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan jadwal SC: ");
                    String jadwalSc = scanner.nextLine();

                    StudyClub newClub = new StudyClub(clubName, leaderName, memberCount, jadwalSc);
                    awal.addClub(newClub);
                    System.out.println("Club berhasil ditambahkan.");
                    break;

                case 2:
                    awal.displayClubs();
                    break;

                case 3:
                    System.out.print("Masukkan nama club yang akan dihapus: ");
                    String deleteClubName = scanner.nextLine();
                    awal.deleteClub(deleteClubName);
                    System.out.println("Club berhasil dihapus.");
                    break;

                case 4:
                    System.out.print("Masukkan nama club yang akan diupdate: ");
                    String updateClubName = scanner.nextLine();
                    System.out.print("Masukkan nama ketua baru: ");
                    String newLeaderName = scanner.nextLine();
                    System.out.print("Masukkan jumlah anggota baru: ");
                    int newMemberCount = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan jadwal SC baru: ");
                    String newJadwalSc = scanner.nextLine();

                    awal.updateClub(updateClubName, newLeaderName, newMemberCount, newJadwalSc);
                    System.out.println("Club berhasil diupdate.");
                    break;

                case 0:
                    System.out.println("Keluar dari sistem.");
                    running = false; // Menghentikan loop
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        
        scanner.close();
    }
}
