public class MahasiswaBerprestasi13 {
    Mahasiswa13[] listMhs = new Mahasiswa13[5];
    int idx;

    void tambah(Mahasiswa13 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
    }

    void tampil() {
        for (Mahasiswa13 m : listMhs) {
            m.tampilInformasi();
            System.out.println();
        }
    }

    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            listMhs[pos].tampilInformasi();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}