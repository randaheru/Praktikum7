public class Mahasiswa25 {
    int nim;
    String nama;
    int umur;
    double ipk;

    // Konstruktor
    Mahasiswa25(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    // Metode untuk menampilkan informasi mahasiswa
    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

    // Metode sequential search untuk mencari nilai dalam array
    public static void sequentialSearch(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Mahasiswa
        Mahasiswa25 mhs = new Mahasiswa25(123456, "John Doe", 20, 3.75);
        mhs.tampil();

    }
}
