class AkunBank {
    // Modifier 'private' agar data tidak bisa diakses langsung dari luar class
    private String namaPemilik;
    private double saldo;

    // Constructor dengan Keyword 'this' dan modifier 'public'
    public AkunBank(String namaPemilik, double saldo) {
        // 'this' merujuk pada variabel milik class (field)
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method 'public' agar bisa diakses oleh class lain
    public void cetakInformasi() {
        System.out.println("=== Detail Akun ===");
        System.out.println("Pemilik: " + this.namaPemilik);
        System.out.println("Saldo  : Rp" + this.saldo);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        // Membuat objek baru
        AkunBank akunUser = new AkunBank("Budi Santoso", 5000000);
        
        // Memanggil method untuk menampilkan data
        akunUser.cetakInformasi();
    }
}
