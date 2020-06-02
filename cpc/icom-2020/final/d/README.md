# Kuproysweeper II
Kemarin Kuproy sudah bermain permainan Kuproysweeper dan menebak jumlah bom yang ada di setiap cell. Sekarang kuproy ingin bermain permainan ini lagi tapi bukan menebak jumlah bom lagi melainkan menebak bagaimana posisi papan permainan setelah Kuproy memilih salah satu cell.

Dalam permainin Kuproysweeper ini mirip seperti permainan Minesweeper yang ada di windows yaitu saat pemain membuka salah satu cell jika cell yang dipilih tidak ada bom di sekitarnya sama sekali maka akan membuka cell yang disekitarnya pula hingga cell yang dibuka terdapat bom di sekitarnya. Jika di sekitarnya ada lebih atau sama dengan satu bom maka hanya menampilkan angka bom yang ada di sekitarnya. Tetapi jika pemain membuka cell yang terdapat bomnya maka akan mengeluarkan `You Ded!!!`
Untuk lebih jelasnya silahkan lihat video berikut : https://www.youtube.com/watch?v=MPKXNLkDz10

**X dan Y dimulai dari 0**

## Format Input
- Sebuah bilangan bulat T yang menunjukan banyaknya kasus yang ada
- T baris berikutnya adalah bilangan `n` yang merupakan jumlah baris dan kolom pada papan tersebut
- Berikutnya adalah kondisi papan permainan yang ada
- Dan yang terakhir merupakan posisi `X` dan `Y` pemain akan membuka cell pertama kalinya

## Format Output
- Keluarkan posisi papan setelah dibuka oleh pemain pada posisi `X` dan `Y`, tetapi jika kalah keluarkan `You Ded!!!` dengan format `CASE #<No Kasus>`

## Contoh 
#### Input
```
3
7
*.....*
.......
.......
.......
....*..
....*..
*..*...
3 1
7
...*...
.......
.......
....**.
*......
......*
..*..*.
3 4
3
**.
...
..*
0 0
```
### Output
```
CASE #1: 
*10001*
1100011
0000000
0001110
0002*20
1113*20
*..*.10
CASE #2: 
...*...
.......
.......
....**.
*..1...
......*
..*..*.
CASE #3: You Ded!!!
```

### Hint
Pada kasus pertama pemain membuka di posisi 3,1 dimana pada posisi tersebut tidak ada bom sama sekali di sekitarnya, lalu akan membuka pada 8 arah disekitarnya hingga terdapat bom di sampingnya

Pada kasus dua membuka di posisi 3,4 ada bom di sebelah kanan atas maka akan menampilkan jawaban tersebut

Pada kasus ketiga pemain membuka cell pada posisi 0,0 dimana posisi tersebut terdapat bom tepat maka mengeluarkan `You Ded!!!`
