class Member {
    int kd_member;
    String nama;
    String alamat;

    Member(int kd_member, String nama, String alamat) {
        this.kd_member = kd_member;
        this.nama = nama;
        this.alamat = alamat;
    }

    void display() {
        System.out.println("Kode Member: " + kd_member);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}

class Dosen extends Member {
    String kd_dosen;

    Dosen(int kd_member, String nama, String alamat, String kd_dosen) {
        super(kd_member, nama, alamat);
        this.kd_dosen = kd_dosen;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Kode Dosen: " + kd_dosen);
    }
}

class Mahasiswa extends Member {
    int nim;

    Mahasiswa(int kd_member, String nama, String alamat, int nim) {
        super(kd_member, nama, alamat);
        this.nim = nim;
    }

    @Override
    void display() {
        super.display();
        System.out.println("NIM: " + nim);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen(1, "Rahmat Setyo",
                "Jl. Jend. Sudirman No. 1", "D001");
        dosen.display();

        Mahasiswa mahasiswa = new Mahasiswa(2, "Farhan Malik",
                "Jl. Gatot Subroto No. 2", 1749265232);
        mahasiswa.display();
    }
}
