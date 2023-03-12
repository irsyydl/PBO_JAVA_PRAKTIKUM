package posttest2;

import java.util.*;

class Penerbangan {
    private int nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuSampai;
    private int kursiTersedia;

    public Penerbangan(int nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuSampai, int kursiTersedia) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuSampai = waktuSampai;
        this.kursiTersedia = kursiTersedia;
    }

    public int getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public void setNomorPenerbangan(int nomorPenerbangan) {
        this.nomorPenerbangan = nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public void setBandaraKeberangkatan(String bandaraKeberangkatan) {
        this.bandaraKeberangkatan = bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public void setBandaraTujuan(String bandaraTujuan) {
        this.bandaraTujuan = bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public void setWaktuKeberangkatan(String waktuKeberangkatan) {
        this.waktuKeberangkatan = waktuKeberangkatan;
    }

    public String getWaktuSampai() {
        return waktuSampai;
    }

    public void setWaktuSampai(String waktuSampai) {
        this.waktuSampai = waktuSampai;
    }

    public int getKursiTersedia() {
        return kursiTersedia;
    }

    public void setKursiTersedia(int kursiTersedia) {
        this.kursiTersedia = kursiTersedia;
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
            if (penerbangan.getNomorPenerbangan() == nomorPenerbangan) {
                System.out.println("Nomor Penerbangan       : " + penerbangan.getNomorPenerbangan());
                System.out.println("Bandara Keberangkatan   : " + penerbangan.getBandaraKeberangkatan());
                System.out.println("Bandara Tujuan          : " + penerbangan.getBandaraTujuan());
                System.out.println("Waktu Keberangkatan     : " + penerbangan.getWaktuKeberangkatan());
                System.out.println("Waktu Sampai            : " + penerbangan.getWaktuSampai());
                System.out.println("Kursi Tersedia          : " + penerbangan.getKursiTersedia());
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
            if (penerbangan.getNomorPenerbangan() == nomorPenerbangan) {
                System.out.print("Masukkan Bandara Keberangkatan Baru (Tekan Enter Untuk Skip): ");
                String bandaraKeberangkatanNew = input.nextLine();
                if (!bandaraKeberangkatanNew.isEmpty()) {
                    penerbangan.setBandaraKeberangkatan(bandaraKeberangkatanNew);
                }

                System.out.print("Masukkan Bandara Tujuan Baru (Tekan Enter Untuk Skip): ");
                String bandaraTujuanNew = input.nextLine();
                if (!bandaraTujuanNew.isEmpty()) {
                    penerbangan.setBandaraTujuan(bandaraTujuanNew);
                }

                System.out.print("Masukkan Waktu Keberangkatan Baru (Tekan Enter Untuk Skip): ");
                String waktuKeberangkatanNew = input.nextLine();
                if (!waktuKeberangkatanNew.isEmpty()) {
                    penerbangan.setWaktuKeberangkatan(waktuKeberangkatanNew);
                }

                System.out.print("Masukkan Waktu Sampai Baru (Tekan Enter Untuk Skip): ");
                String waktuSampaiNew = input.nextLine();
                if (!waktuSampaiNew.isEmpty()) {
                    penerbangan.setWaktuSampai(waktuSampaiNew);
                }

                System.out.print("Masukkan Jumlah Kursi Baru (Tekan 0 Untuk Skip): ");
                int kursiTersediaNew = input.nextInt();
                if (kursiTersediaNew != 0) {
                    penerbangan.setKursiTersedia(kursiTersediaNew);
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
            if (penerbangans.get(i).getNomorPenerbangan() == nomorPenerbangan) {
                penerbangans.remove(i);
                System.out.println("Jadwal Berhasil Dihapus.");
                return;
            }
        }
        System.out.println("Jadwal Tidak Ditemukan.");
    }
}