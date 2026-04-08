class Mobil {
    String merk;
    int tahun;

    // Ini adalah Constructor
    public Mobil(String merkMobil, int tahunMobil) {
        merk = merkMobil;
        tahun = tahunMobil;
    }

    // Metode untuk menampilkan informasi
    void tampilkanInfo() {
        System.out.println("Mobil ini bermerk: " + merk);
        System.out.println("Tahun keluaran: " + tahun);
    }

    public static void main(String[] args) {
        // Membuat objek baru sekaligus memanggil constructor
        Mobil mobilSaya = new Mobil("Toyota", 2022);
        
        // Memanggil metode untuk melihat hasilnya
        mobilSaya.tampilkanInfo();
    }
}
