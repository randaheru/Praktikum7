import java.util.Arrays;

public class PencarianMhs25 {
    Mahasiswa25 listMHs[] = new Mahasiswa25[5];
    int idx;

    // Penambahan metode untuk mengurutkan data dari terbesar ke terkecil
    public void urutkanData() {
        Arrays.sort(listMHs, 0, idx, (a, b) -> a.nama.compareTo(b.nama));
    }

    public void tambah(Mahasiswa25 m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    public void tampil() {
        for (Mahasiswa25 m : listMHs) {
            if (m != null) {
                m.tampil();
                System.out.println("----------------------");
            }
        }
    }

    public int findBinarySearch(String cari, int left, int right) {
        urutkanData(); // Memastikan data terurut sebelum melakukan binary search
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (listMHs[mid].nama.equalsIgnoreCase(cari)) {
                return mid;
            } else if (listMHs[mid].nama.compareToIgnoreCase(cari) < 0) {
                return findBinarySearch(cari, mid + 1, right); // Perubahan arah pencarian
            } else {
                return findBinarySearch(cari, left, mid - 1); // Perubahan arah pencarian
            }
        }
        return -1;
    }

    public void tampilData(String cari) {
        int pos = findBinarySearch(cari, 0, idx - 1);
        if (pos != -1) {
            System.out.println("Data ditemukan pada indeks " + pos + ":");
            // Menampilkan data dengan nama yang sama
            while (pos > 0 && listMHs[pos - 1].nama.equalsIgnoreCase(cari)) {
                pos--;
            }
            while (pos < idx && listMHs[pos].nama.equalsIgnoreCase(cari)) {
                System.out.println("Nim\t : " + listMHs[pos].nim);
                System.out.println("Nama\t : " + listMHs[pos].nama);
                System.out.println("Umur\t : " + listMHs[pos].umur);
                System.out.println("IPK\t : " + listMHs[pos].ipk);
                System.out.println("----------------------");
                pos++;
            }
        } else {
            System.out.println("Data dengan nama " + cari + " tidak ditemukan");
        }
    }
}
