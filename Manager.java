package Inheritance;

class Manager extends Pekerja { // Deklarasi inheritance
    private String departemen; // Deklarasi field

    public Manager(String departemen, double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) { // Constructor
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah); // Constructor superclass Pekerja
        this.departemen = departemen;
    }

    // Setter getter Departemen
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getPendapatan(){ // Mendapatkan tunjangan termasuk dari superclass dan tambahan tunjangan manager
        return super.getTunjangan()+getGaji()*10/100; // Tunjangan dari superclass ditambah 10% dari gaji
    } 

    public String toString() { // Method toString()
        return super.toString() + "\ndepartemen\t : " + departemen;
    }
}