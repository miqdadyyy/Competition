# Kuproyminton
Pada tahun ini Jamet berencana ikut Turnamen Badminton di Kuproy Cup tetapi karena ada pandemi virus corona akhirnya 
Jamet mengikuti lomba di komplek rumahnya. Saat turnamen berlangsung, Jamet bingung menghitung skor dan menentukan siapa
yang menang turnamen tersebut, anda diminta untuk mencari pemenang dari pertandingan badminton Jamet.

Diberikan sebuah string dengan dua karakter yaitu `A` dan `B` dari setiap pertandingan, dan anda diminta untuk menentukan
siapa yang menang di pertandingan tersebut. Penentuan pemenang badminton adalah yang mencapai angka 21 yang pertama kali.
Jika seri maka pemain yang memiliki skor dengan keunggulan 2 skor pertama adalah yang menang.

## Format Input
- Sebuah bilangan bulat T yang menunjukan banyaknya pertandingan yang ada
- T baris berikutnya merupakan String dari pertandingan tersebut

## Format Output
- Keluarkan pemenang dari setiap pertandingan diawali dengan format `CASE #<No Kasus>`

## Contoh 
#### Input
```
2
ABBABBBBBBABBAABBBBBABBBBBB
ABAABBAABABABBABBBBAAAABBAAABABBBAABBABB
```
### Output
```
CASE #1: B
CASE #2: B
```
---
```
3
BBBAABAAABBBABABBBAAABAAABAABABBBBABBAAB
AAABAABBAABABBBBBBABBABAABAAABAAABBAABA
BABAABBBAAABABAABBBABABABBABAABABBAAABBAABBABABABB
```
### Output
```
CASE #1: B
CASE #2: A
CASE #3: B
```