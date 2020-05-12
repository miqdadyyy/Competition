# Kuproysweeper
Suatu hari jamet ingin bermain permainan klasik di komputernya yaitu Kuproysweeper. Permainan itu adalah permainan dimana 
Jamet harus menghindari bom bom yang ada dari angka yang ada. Contohnya pada suatu cell terdapat angka 3 maka di sekelilingnya
ada 3 bom harus dihindari. Kuproy sudah menemukan letak bom yang ada, tapi dia ingin menghitung jumlah bom pada setiap cell
tersebut. Tolong bantu Kuproy untuk menghitung bom di sekeliling setiap cell 

## Format Input  
- Bilangan bulat T mendefinisikan jumlah kasus yang ada
- `N` yang mendefinisikan jumlah baris dan kolom pada setiap kasus
- Grid yang mendefinisikan Kuproysweeper pada setiap kasus sesuai jumlah baris dan kolom yang ada

## Format Output
- Baris pertama dengan format `CASE #<No Kasus>: `
- Baris kedua berisi grid yang baru yang telah dihitung banyaknya bom disekeliling setiap cell

## Contoh 
#### Input
```
5
3
*..
..*
*.*
5
*....
.**..
**...
.*...
*...*
6
......
....*.
*..**.
.*....
..**..
.*.*..
6
*.....
*.....
.*...*
.**.*.
*.....
..*...
4
*...
....
....
..*.
```
### Output
```
CASE #1:
*21
24*
*3*
CASE #2:
*3210
4**10
**410
4*211
*211*
CASE #3:
000111
1113*2
*22**2
2*4431
23**20
1*4*20
CASE #4:
*20000
*31011
3*322*
3**2*2
*43311
12*100
CASE #5:
*100
1100
0111
01*1
```