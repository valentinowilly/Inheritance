package Inheritance;

public class Main {
    public static void main(String[] args) {
        // 1. Manusia
        Manusia a = new Manusia("Joko", "3323080904320002", true, true);
        Manusia b = new Manusia("Dewi", "3323080554323214", false, true);
        Manusia c = new Manusia("Willy", "3783080904325556", true, false);
        System.out.println(a + "\n");
        System.out.println(b + "\n");
        System.out.println(c + "\n");

        // 2. MahasiswaFILKOM
        MahasiswaFILKOM d = new MahasiswaFILKOM("235150401111001", 2.5, "Wahyu", "3323040576513861", true, false);
        MahasiswaFILKOM e = new MahasiswaFILKOM("235150400111045", 3.2, "Rizki", "3302456765876789", true, false);
        MahasiswaFILKOM f = new MahasiswaFILKOM("235150407111063", 3.9, "Tio", "3321161762647574", true, false);
        System.out.println(d + "\n");
        System.out.println(e + "\n");
        System.out.println(f + "\n");

        // 3. Pekerja
        Pekerja g = new Pekerja(1000, 2022, 4, 20, 2, "Toni", "3323040576513865", true, true);
        Pekerja h = new Pekerja(1000, 2015, 2, 1, 0, "Messi", "3324530576513861", true, false);
        Pekerja i = new Pekerja(1000, 2004, 1, 30, 10, "Irfan", "3323040576513777", true, true);
        System.out.println(g + "\n");
        System.out.println(h + "\n");
        System.out.println(i + "\n");

        // 4. Manager
        Manager j = new Manager("HRD", 7500, 2009, 2, 1, 0, "Jaya", "3302456765876000", true, true);
        System.out.println(j + "\n");
    }
}