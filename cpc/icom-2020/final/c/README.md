# Membalik Pancake
Tahun lalu, Kuproy memperkenalkan jenis pancake baru. Memiliki wajah bahagia yang terbuat dari keping cokelat di satu sisi ("sisi bahagia"), dan tidak ada di sisi lain ("sisi sedih").

Pancake dimasak dalam satu baris di atas permukaan yang panas. Kuproy baru-baru ini memberi Anda spatula pancake besar yang membalik pancake berturut-turut K pancake. Yaitu, dalam rentang pancake `K`, itu mengubah setiap pancake sisi bahagia menjadi pancake sisi sedih, dan sebaliknya. Spatula itu juga tidak mengubah urutan pancake dari kiri ke kanan.

Anda tidak dapat membalik lebih sedikit dari `K` pancake sekaligus dengan spatula dan tidak bisa membalik pancake yang melebihi batas penggorengan. Misalnya, Anda dapat membalik pancake K pertama, tetapi bukan pancake K - 1 pertama.

Tugas anda yaitu membuat semua pancake yang ada di penggorengan ke sisi bahagia. Mengingat kondisi pancake saat ini, hitung jumlah minimum penggunaan spatula yang dibutuhkan untuk membuat semua pancake bahagia, atau nyatakan bahwa tidak ada cara untuk melakukannya.

## Format Input
- Sebuah bilangan bulat `T` yang menunjukan banyaknya kasus yang ada
- T baris berikutnya merupakan sebuah String `S` barisan pancake yang ada dan bilangan bulat `K` yang merupakan panjang spatula

## Format Output
- Keluarkan banyaknya penggunaan spatula untuk membalik semua pancake menjadi senang, jika tidak memungkinkan keluarkan angka `-1` diawali dengan format `CASE #<No Kasus>:`

## Contoh 
#### Input
```
3
---+-++- 3
+++++ 4
-+-+- 4
```
### Output
```
CASE #1: 3
CASE #2: 0
CASE #3: -1
```

## Hint
Pada kasus pertama anda bisa membuat semua pancake ke sisi bahagia dengan cara membalik 3 pancake paling kiri, sampai menjadi ++++-++-, kemudian 3 paling kanan, sampai menjadi ++++---+, dan akhirnya 3 pancake yang tetap kosong menghadap ke atas. Ada cara lain untuk melakukannya dengan 3 membalik atau lebih, tetapi tidak ada yang kurang dari 3 membalik.

Pada kasus kedua semua panekuk sudah bahagia, jadi tidak perlu membalik mereka.

Pada Kasus ketiga tidak ada cara untuk membuat pancake bahagia.