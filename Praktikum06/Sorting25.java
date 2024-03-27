public class Sorting25 {
    public static void sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                return; // Keluar dari metode jika data ditemukan
            }
        }
        // Jika sampai di sini berarti data tidak ditemukan
        System.out.println("Data tidak ditemukan");
    }

    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Return -1 jika data tidak ditemukan
    }

    public static void main(String[] args) {
        // Array daftarNilai dan pemanggilan sequentialSearch
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        sequentialSearch(daftarNilai, 5);

        // Pemanggilan binarySearchAsc
        int[] sortedNilai = {5, 5, 10, 20, 30, 40, 50}; // Perhatikan bahwa array sudah diurutkan
        int index = binarySearchAsc(sortedNilai, 5);

        if (index != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
