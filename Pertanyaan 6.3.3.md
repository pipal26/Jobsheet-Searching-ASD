6.3.3.	Pertanyaan
1.	Tunjukkan pada kode program yang mana proses divide dijalankan!
2.	Tunjukkan pada kode program yang mana proses conquer dijalankan!
3.	Apa fungsi left, right, dan mid?
4.	Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
5.	Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
6.	Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
7.	Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
jawaban
1. Proses divide terjadi ketika program menghitung nilai tengah dengan mid = (left + right) / 2
2. Proses conquer terjadi saat program membandingkan nilai yang dicari dengan listMhs[mid].ipk.
3. left menunjukkan batas kiri pencarian, right batas kanan pencarian, dan mid adalah indeks tengah yang diperiksa.
4. Jika data IPK tidak urut maka binary search tidak akan bekerja dengan benar karena algoritma ini membutuhkan data yang sudah terurut.
5. Jika data diurutkan dari terbesar ke terkecil maka hasil binary search bisa tidak sesuai karena algoritma standar mengasumsikan data terurut naik.
6. Binary search menentukan data tidak ditemukan ketika nilai left sudah lebih besar dari right sehingga pencarian dihentikan.