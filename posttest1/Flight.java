package posttest1;

import java.util.*;

class Penerbangan {
    int nomorPenerbangan;
    String bandaraKeberangkatan;
    String bandaraTujuan;
    String waktuKeberangkatan;
    String waktuSampai;
    int kursiTersedia;

    public Penerbangan(int nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuSampai, int kursiTersedia) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuSampai = waktuSampai;
        this.kursiTersedia = kursiTersedia;
    }

    public Object getNomorPenerbangan() {
        return nomorPenerbangan;
    }
}

class SistemPenerbangan {
    ArrayList<Penerbangan> penerbangans = new ArrayList<>();
    App apps = new App();

    public void createPenerbangan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nomor Penerbangan: ");
        int nomorPenerbangan = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Bandara Keberangkatan: ");
        String bandaraKeberangkatan = input.nextLine();
        System.out.print("Masukkan Bandara Tujuan: ");
        String bandaraTujuan = input.nextLine();
        System.out.print("Masukkan Waktu Keberangkatan: ");
        String waktuKeberangkatan = input.nextLine();
        System.out.print("Masukkan Waktu Sampai: ");
        String waktuSampai = input.nextLine();
        System.out.print("Masukkan Jumlah Kursi: ");
        int kursiTersedia = input.nextInt();
        input.nextLine();
        App.clearScreen();

        Penerbangan newPenerbangan = new Penerbangan(nomorPenerbangan, bandaraKeberangkatan, bandaraTujuan, waktuKeberangkatan, waktuSampai, kursiTersedia);
        penerbangans.add(newPenerbangan);
        System.out.println("Jadwal Berhasil Ditambah!");
    }

    public void readPenerbangan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nomor Penerbangan: ");
        int nomorPenerbangan = input.nextInt();
        input.nextLine();
        App.clearScreen();
        System.out.println("======== JADWAL PENERBANGAN ========");
        for (Penerbangan penerbangan : penerbangans) {
            if (penerbangan.nomorPenerbangan == nomorPenerbangan) {
                System.out.println("Nomor Penerbangan       : " + penerbangan.nomorPenerbangan);
                System.out.println("Bandara Keberangkatan   : " + penerbangan.bandaraKeberangkatan);
                System.out.println("Bandara Tujuan          : " + penerbangan.bandaraTujuan);
                System.out.println("Waktu Keberangkatan     : " + penerbangan.waktuKeberangkatan);
                System.out.println("Waktu Sampai            : " + penerbangan.waktuSampai);
                System.out.println("Kursi Tersedia          : " + penerbangan.kursiTersedia);
                return;
            }
        }
        System.out.println("Penerbangan Tidak Ditemukan");
    } 

    public void updatePenerbangan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nomor Penerbangan: ");
        int nomorPenerbangan = input.nextInt();
        input.nextLine();
        for (Penerbangan penerbangan : penerbangans) {
            if (penerbangan.nomorPenerbangan == nomorPenerbangan) {
                System.out.print("Masukkan Bandara Keberangkatan Baru (Tekan Enter Untuk Skip): ");
                String bandaraKeberangkatanNew = input.nextLine();
                if (!bandaraKeberangkatanNew.isEmpty()) {
                    penerbangan.bandaraKeberangkatan = bandaraKeberangkatanNew;
                }

                System.out.print("Masukkan Bandara Tujuan Baru (Tekan Enter Untuk Skip): ");
                String bandaraTujuanNew = input.nextLine();
                if (!bandaraTujuanNew.isEmpty()) {
                    penerbangan.bandaraTujuan = bandaraTujuanNew;
                }

                System.out.print("Masukkan Waktu Keberangkatan Baru (Tekan Enter Untuk Skip): ");
                String waktuKeberangkatanNew = input.nextLine();
                if (!waktuKeberangkatanNew.isEmpty()) {
                    penerbangan.waktuKeberangkatan = waktuKeberangkatanNew;
                }

                System.out.print("Masukkan Waktu Sampai Baru (Tekan Enter Untuk Skip): ");
                String waktuSampaiNew = input.nextLine();
                if (!waktuSampaiNew.isEmpty()) {
                    penerbangan.waktuSampai = waktuSampaiNew;
                }

                System.out.print("Masukkan Jumlah Kursi Baru (Tekan 0 Untuk Skip): ");
                int kursiTersediaNew = input.nextInt();
                if (kursiTersediaNew != 0) {
                    penerbangan.kursiTersedia = kursiTersediaNew;
                }
                
                System.out.println("Jadwal Berhasil Di Update");
                return;
            }
        }
        System.out.println("Penerbangan Tidak Ditemukan!.");
    }

    public void deletePenerbangan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nomor Penerbangan: ");
        int nomorPenerbangan = input.nextInt();
        input.nextLine();
        for (int i = 0; i < penerbangans.size(); i++) {
            if (penerbangans.get(i).nomorPenerbangan == nomorPenerbangan) {
                penerbangans.remove(i);
                System.out.println("Jadwal Berhasil Dihapus.");
                return;
            }
        }
        System.out.println("Jadwal Tidak Ditemukan.");
    }
}