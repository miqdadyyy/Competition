# Pemilihan Ketua Jamet
Pada akhir tahun terdapat pemilihan untuk Ketua Jamet yang baru, tetapi pemilihan ini sangat unik, karena pemilihan ketua tidak berdasarkan jumlah suara terbanyak tetapi berdasarkan jumlah `K` suara berturut-turut yang memiliki pola secara horizontal, vertical atau diagonal. 

Tetapi jika tidak ada yang memenuhi `K` suara secara berturut-turut maka keluarkan `Semua Kalah` namun sebaliknya jika kedua kandidat memnuhi `K` suara secara berturut-turut maka keluarkan `Semua Menang`   

## Format Input
- Sebuah bilangan bulat T yang menunjukan banyaknya pemilihan yang ada
- T baris berikutnya merupakan dua bilangan yang terdiri atas `N` yang menunjukan jumlah baris dan kolom, dan `K` yang menunjukan jumlah suara berturut-turut yang diperlukan untuk memenangkan suara.
- N baris berikutnya merupakan grid dari pemilihan suara

## Format Output
- Keluarkan pemenang dari setiap pemilihan diawali dengan format `CASE #<No Kasus>:`

## Contoh 
#### Input
```
3
5 5
AABAB
BAAAA
ABABB
BBBBB
BBAAB
5 3
AABBA
ABABA
AAAAB
BAAAB
BAABA
5 4
ABABB
ABBAB
AAAAB
AABAA
BBBAA
```
### Output
```
CASE #1: B Menang
CASE #2: Semua Menang
CASE #3: A Menang
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
---
### Hint
Contoh 1 :  
dengan K = 5
```
AABAB
BAAAA
ABABB
BBBBB
BBAAB
```
maka B menang karena pada baris ke 4 terdapat 5 suara B berturut secara horizontal.  

Contoh 2 :  
dengan K = 3
```
AABBA
ABABA
AAAAB
BAAAB
BAABA
```
maka A dan B menang karena A mendapatkan 3 suara berturut-turut di baris ketiga secara horizontal dan B juga mendapatkan 3 suara berturut-turut di baris pertama diagonal