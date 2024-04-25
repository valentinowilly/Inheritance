package Inheritance;

class MahasiswaFILKOM extends Manusia { // Deklarasi inheritance
    private String nim; // Deklarasi field
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) { // Constructor
        super(nama, nik, jenisKelamin, menikah); // Memanggil constructor superclass
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() { // Mendapatkan NIM
        return nim;
    }

    public void setNim(String nim) { // Mengatur NIM
        this.nim = nim;
    }

    public double getIpk() { // Mendapatkan IPK
        return ipk;
    }

    public void setIpk(double ipk) { // Mengatur IPK
        this.ipk = ipk;
    }

    public String getStatus() { // Method untuk mendapatkan status mahasiswa berdasarkan NIM
        String prodi = "";
        switch (nim.substring(6, 7)) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
        }
    return prodi+", "+20+nim.substring(0, 2);
    }

    public double getBeasiswa() { // Mendapatkan besaran beasiswa berdasarkan IPK
        if (getIpk() >= 3.0 && getIpk() <= 3.5) {
            return  50; // Mengembalikan beasiswa sebesar 50
        } else if (getIpk() > 3.5 && getIpk() <= 4.0) { 
            return  75; // Mengembalikan beasiswa sebesar 75
        }
        return 0; // Mengembalikan 0 jika IPK di bawah 3.0
    }   

    public String toString() { // Method toString()
        return super.toString() + "\nnim\t\t : " + nim + "\nipk\t\t : " + ipk + "\nstatus\t\t : " + getStatus();
    }
}