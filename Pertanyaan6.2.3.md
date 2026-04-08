1.	Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
2.	Jelaskan fungsi break pada kode program di bawah ini! 
 if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
3.	Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
4.	Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
5.	Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
jawaban
1. Method tampilPosisi menampilkan posisi indeks data yang ditemukan, sedangkan tampilDataSearch menampilkan informasi lengkap mahasiswa yang ditemukan.
2. break berfungsi untuk menghentikan perulangan ketika data yang dicari sudah ditemukan.
3. Variabel pos berfungsi untuk menyimpan indeks atau posisi data yang ditemukan dalam array.
4. Sequential search tersebut akan menampilkan data pertama yang ditemukan karena pencarian berhenti setelah kondisi terpenuhi.
5. Jika break dihapus maka perulangan akan terus berjalan sampai akhir array sehingga posisi yang tersimpan bisa menjadi data terakhir yang memiliki nilai sama.