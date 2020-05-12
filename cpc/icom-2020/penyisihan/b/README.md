# Kuproy Berurutan
Jamet sedang melakukan reuni dengan teman-teman kuproynya. Saat di tempat reuni, jamet dan teman temannya disuruh berbaris
secara acak untuk melakukan absen. Karena Jamet sedang gabut, maka dia ingin menghitung **Jumlah maksimal Kuproyers dengan 
tinggi bertingkat**.
 
Seperti contoh, pada satu barisan terdapat 5 orang yang memiliki tinggi 1,2,3,2,4. Maka jumlah maksimal
tinggi bertingkat dari barisan tersebut adalah 3 yaitu `1,2,3`. Karena kuproyer satu memiliki tinggi lebih rendah daripada
kuproyer nomor dua dan kuproyer nomor dua memiliki tinggi lebih kecil daripada nomor 3, tetapi nomor 4 memiliki tinggi lebih
rendah daripada kuproyer nomor 3 sehingga barisannya berjumlah 3 orang. Lalu setelah itu sisa 2 barisan lagi yaitu nomor 4 
dan 5 yang memiliki tinggi `2,4` dan berjumlah 2 orang. Maka jumlah maksimalnya adalah 3 yaitu `1,2,3` 

## Format Input
- Sebuah bilangan bulat T yang menunjukan banyaknya kasus yang ada
- Setiap Kasus memiliki sebuah bilangan `N` yaitu jumlah kuproy yang sedang berbaris
- `N` baris berikutnya adalah bilangan bulat tinggi kuproy yang sedang berbaris

## Format Output
- Keluarkan urutan maksimal kuproy diawali dengan format `CASE #<No Kasus>:`

## Contoh 
#### Input
```
2
3
1
2
3
5
1
2
3
4
3
```
### Output
```
CASE #1: 3
CASE #2: 4
```
---
#### Input
```
3
3
1
3
2
6
1
3
2
3
4
5
4
4
3
2
1
```
### Output
```
CASE #1: 2
CASE #2: 4
CASE #3: 1
```