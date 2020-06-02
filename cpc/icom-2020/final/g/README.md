# Remote Control
Lebaran telah usai dan Kuproy mendapatkan THR yang cukup banyak. Dari THR itu Kuproy akhirnya membeli mainan mobil mobilan yang ada remote controlnya. Saat dimainkan kuproy cukup senang karena remote controlnya berfungsi dengan sempurna tetapi jika mobilnya menabrak maka mobil mobilan tersebut akan berhenti.  
Pada suatu hari Kuproy memiliki arena mobil mobilan berbentuk kotak dengan ukuran `C` x `R` (panjang x lebar). Setelah itu Kuproy memiliki daftar arah berjumlah `N` yang akan dilalui mobil tersebut. Arah tersebut meliputi :
```
R : Kanan
RB : Kanan Bawah
B : Bawah
LB : Kiri Bawah
L : Kiri
LT : Kiri Atas
T : Atas
RT : Kanan Atas
```
Setiap daftar dijalankan maka mobil akan berpindah posisi sesuai arahnya. Tentukan posisi terakhir mobil tersebut.

**Posisi dimulai dari angka 1 bukan 0**

## Format Input
- Sebuah bilangan bulat T yang menunjukan banyaknya kasus yang ada
- T baris berikutnya merupakan angka `N` yang menunjukan jumlah daftar arah, `R` yang menunjukan lebar arena dan `C` yang menunjukan panjang arena.

## Format Output
- Keluarkan posisi terakhir mobil tersebut (X, Y) jika mobil tersebut menabrak sisi arena maka keluarkan `Nabrak!` dengan format `CASE #<No Kasus>`

## Contoh 
#### Input
```
3
9 7 6
RB RT L RT LT B B LB LB 
1 6
9 5 12
L L LB LT LB L RB L LB 
8 1
6 8 14
L T T LB T RT 
10 1
```
### Output
```
CASE #1: Nabrak!
CASE #2: 1 4
CASE #3: Nabrak!
```
