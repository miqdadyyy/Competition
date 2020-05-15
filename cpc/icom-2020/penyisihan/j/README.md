# Berjoget Kuproy
Mahasiswa angkatan 2019 Fakultas Ilmu Komputer terbagi atas kelas A dan kelas B, yang masing-masing terdiri atas N
mahasiswa. Mahasiswa ke-i di kelas A memiliki jogetan kuproy selama A[i] detik, dan murid ke-i di kelas B memiliki
jogetan kuproy selama B[i] detik.
Pada acara friendship, setiap mahasiswa di kelas A akan berbalas jogetan kuproy dengan setiap mahasiswa di kelas B.
Untuk sepasang mahasiswa ke-i di kelas A dan mahasiswa ke-j di kelas B, total waktu yang dibutuhkan mereka untuk berjoget kuproy adalah A[i] + B[j].
Panggung friendship hanya dapat menampilkan sepasang mahasiswa untuk berjoget kuproy dalam satu waktu.
Tentukan total waktu yang dibutuhkan seluruh kemungkinan pasang mahasiswa kelas A dan B untuk berjoget kuproy pada panggung.

Batasan : 
```
1 ≤ A[i], B[i] ≤ 100
1 ≤ N ≤ 100000
``` 

## Format Input  
- Bilangan bulat T yang menunjukan banyaknya kasus
- T baris berikutnya merupakan bilangan bulat `N` yang menunjukan jumlah mahasiswa pada setiap kelas
- Baris berikutnya yaitu urutan durasi joget kuproy setiap mahasiswa di kelas A (`A[1] A[2] .. A[N]`)
- Baris berikutnya yaitu urutan durasi joget kuproy setiap mahasiswa di kelas B (`B[1] B[2] .. B[N]`)

## Format Output
- Keluarkan total durasi untuk setiap perlombaan yang dilupakan Kuproy diawali dengan format
`CASE #<No Kasus>:`

## Contoh
#### Input
```
2
1
3
5
2
1 2
3 4
```
### Output
```
CASE #1: 8
CASE #2: 20
```
---
#### Input
```
5
1
3
5
2
1 2
3 4
2
37 75
20 92
9
61 2 23 73 64 23 4 92 98
13 79 10 44 95 92 6 31 51
8
15 33 94 75 35 35 47 10
41 89 30 91 29 28 92 32
```
### Output
```
CASE #1: 8
CASE #2: 20
CASE #3: 448
CASE #4: 7749
CASE #5: 6208
```