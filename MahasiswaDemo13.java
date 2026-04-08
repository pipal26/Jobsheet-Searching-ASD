import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa keseluruhan");
        list.tampil();

        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        int posisi = list.sequentialSearch(cari);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}