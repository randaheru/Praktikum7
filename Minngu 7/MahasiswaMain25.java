import java.util.Scanner;

public class MahasiswaMain25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs25 data = new PencarianMhs25();
        int jumMhs = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa25 m = new Mahasiswa25(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: "); // Changed prompt to ask for name
        System.out.print("Nama : ");
        String cariNama = sl.nextLine(); // Changed variable name to cariNama for clarity
        System.out.println("menggunakan binary Search");

        // Memanggil metode findBinarySearch() untuk mencari nama mahasiswa
        data.urutkanData(); // Memastikan data terurut sebelum melakukan pencarian
        int posisi = data.findBinarySearch(cariNama, 0, jumMhs - 1);

        // Memanggil metode tampilData() setelah pencarian data dilakukan
        data.tampilData(cariNama);

        System.out.println("-----------------------");
    }
}
