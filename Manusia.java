package Inheritance;

class Manusia {
    private String nama; // Deklarasi field
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) { // Constructor kelas manusia
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() { // Mendapatkan nama
        return nama;
    }

    public void setNama(String nama) { // Mengatur nama
        this.nama = nama;
    }

    public boolean isJenisKelamin() { // Mendapat jenis kelamin(boolean)
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) { // Mengatur jenis kelamin
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() { // Mendapatkan NIK
        return nik;
    }

    public void setNik(String nik) { // Mengatur NIK
        this.nik = nik;
    }

    public boolean isMenikah() { // Mendapatkan status pernikahan(boolean)
        return menikah;
    }

    public void setMenikah(boolean menikah) { // Mengatur status pernikahan
        this.menikah = menikah;
    }

    public double getTunjangan() { // Mendapatkan jumlah tunjangan
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() { // Mendapatkan jumlah pendapatan 
        return getTunjangan();
    }

    public String toString() { // Menampilkan informasi lengkap di objek Manusia
        String jenis = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "nama\t\t : " + nama + "\nnik\t\t : " + nik + "\njenisKelamin\t : " + jenis + "\npendapatan\t : " + getPendapatan() ;
    }
}