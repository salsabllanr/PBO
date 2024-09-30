/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pendataansc;

/**
 *
 * @author adindasalsabillanaura
 */
public class StudyClub {

    private String clubName;
    private String leaderName;
    private int memberCount;
    private String jadwalSc;

    // Constructor
    public StudyClub(String clubName, String leaderName, int memberCount, String jadwalSc) {
        this.clubName = clubName;
        this.leaderName = leaderName;
        this.memberCount = memberCount;
        this.jadwalSc = jadwalSc;
    }

    // Getter and Setter for clubName
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    // Getter and Setter for leaderName
    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    // Getter and Setter for memberCount
    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    // Getter and Setter for jadwalSc
    public String getJadwalSc() {
        return jadwalSc;
    }

    public void setJadwalSc(String jadwalSc) {
        this.jadwalSc = jadwalSc;
    }

    // Method untuk menampilkan informasi Study Club
    public void displayInfo() {
        System.out.println("Nama Study Club: " + clubName);
        System.out.println("Nama Penanggung Jawab: " + leaderName);
        System.out.println("Jumlah Anggota: " + memberCount);
        System.out.println("Jadwal Study Club: " + jadwalSc);
        System.out.println("-----------------------------------");
    }
}