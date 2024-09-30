/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampilan;
import pendataansc.StudyClub;
import java.util.ArrayList;


/**
 *
 * @author adindasalsabillanaura
 */
public class awal {
    private static ArrayList<StudyClub> clubs = new ArrayList<>();

    // Method untuk menambah data Study Club
    public static void addClub(StudyClub club) {
        clubs.add(club);
    }

    // Method untuk menampilkan semua Study Club
    public static void displayClubs() {
        if (clubs.isEmpty()) {
            System.out.println("Tidak ada data Study Club.");
        } else {
            for (StudyClub club : clubs) {
                club.displayInfo();
            }
        }
    }

    // Method untuk menghapus Study Club berdasarkan nama club
    public static void deleteClub(String clubName) {
        boolean found = false;
        for (StudyClub club : clubs) {
            if (club.getClubName().equalsIgnoreCase(clubName)) {
                clubs.remove(club);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Study Club berhasil dihapus.");
        } else {
            System.out.println("Study Club tidak ditemukan.");
        }
    }

    // Method untuk mengupdate Study Club
    public static void updateClub(String clubName, String newLeader, int newMemberCount, String newJadwalSc) {
        boolean found = false;
        for (StudyClub club : clubs) {
            if (club.getClubName().equalsIgnoreCase(clubName)) {
                club.setLeaderName(newLeader);
                club.setMemberCount(newMemberCount);
                club.setJadwalSc(newJadwalSc);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Study Club berhasil diupdate.");
        } else {
            System.out.println("Study Club tidak ditemukan.");
        }
    }
}