# Inboker
Inboker adalah salah satu hero di permainan Dora 2. Inboker memiliki tiga orb yaitu Quas, Wex dan Exort. Invoker bisa mengeluarkan skill dengan cara menggabungkan tiga orb tersebut secara kombinasi sesuai dengan jenisnya. Untuk formulanya terdapat dibawah berikut : 
```
EEE : Sunstrike
QEE : Forge Spirit
EWE : Chaos Meteor
QEQ : Ice Wall
WEQ : Deafening Blast
WEW : Alacrity
QQQ : Cold Snap
QQW : Ghost Walk
WQW : Tornado
WWW : EMP
```
Sayangnya Inboker hanya memiliki 10 skill tersebut dan karena skill Inboker bersifat kombinasi maka : QWE = WEQ = EQW = EWQ = WQE dan seterusnya.
Skill tersebut akan dikeluarkan jika invoker mengeluarkan spell `R`.

Anda sebagai pemain Inboker silahkan tebak combo skill apa saja yang dikeluarkan Inboker dari kumpulan string yang ada.

## Format Input
- Sebuah bilangan bulat T yang menunjukan banyaknya kasus yang ada
- T baris berikutnya merupakan String dari combo Inboker

## Format Output
- Keluarkan daftar jurus yang dikeluarkan Inboker secara berurutan diawali dengan format `CASE #<No Kasus>:`

## Contoh 
#### Input
```
3
EQERQWWRQQERWQQREEERQEER
QWWRWQWRWWERWWQRWQWRQQQR
EEERQWWRWWQRQQERQWWREWWR
```
### Output
```
CASE #1: 
Forge Spirit
Tornado
Ice Wall
Ghost Walk
Sunstrike
Forge Spirit
CASE #2: 
Tornado
Tornado
Alacrity
Tornado
Tornado
Cold Snap
CASE #3: 
Sunstrike
Tornado
Tornado
Ice Wall
Tornado
Alacrity
```

### Hint
Pada contoh pertama yaitu
EQE = QEE = EEQ yang artinya invoker akan mengeluarkan skill Forget Spirit
begitu pula skill selanjutnya
