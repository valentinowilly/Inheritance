package Inheritance;

import java.time.LocalDate; // Fungsi local date / tanggal
import java.time.format.DateTimeFormatter;

class Pekerja extends Manusia { // Deklarasi inheritance
    private double gaji; // Deklarasi field
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) { // Constructor
        super(nama, nik, jenisKelamin, menikah); // Memanggil constructor superclass Manusia
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk); 
        this.jumlahAnak = jumlahAnak;
    }

    // Setter getter tahun masuk
    public LocalDate getTahunMasuk() { 
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) { 
        this.tahunMasuk = tahunMasuk;
    }

    // Setter getter jumlah anak
    public int getJumlahAnak() { 
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) { 
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() { // Mendapatkan bonus berdasarkan lama bekerja
        int tahunBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunBekerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunBekerja <= 10) {
            return 0.1 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getGaji() { // Mendapatkan total gaji termasuk bonus
        return this.gaji + getBonus() + (20*jumlahAnak);
    }

    public String toString() { // Method toString()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy"); // Ubah format tanggal
        return super.toString() + "\ntahun masuk\t : " + tahunMasuk.format(formatter) + "\njumlah anak\t : " + jumlahAnak + "\ngaji\t\t : " + (getGaji() + getPendapatan());
    }
}