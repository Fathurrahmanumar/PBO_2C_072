package TugasTugas_PBO;
import java.util.Scanner;

class Modul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        String tigaDigitNIM = "101";

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin" + tigaDigitNIM) && password.equals("Password" + tigaDigitNIM)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password yang dimasukkan salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            String namaValid = "fathurrahman umar";
            String nimValid = "202410370110072";

            if (nama.equals(namaValid) && nim.equals(nimValid)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login ditolak! Nama atau NIM yang dimasukkan salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}