# PostTest-4-PBO

## Deskripsi Singkat

Program ini adalah aplikasi sederhana untuk mengelola data hewan ternak menggunakan Java. Di dalamnya tersedia menu untuk menambah, melihat, mengubah, menghapus, mencari, hingga menghitung total hewan ternak. Data hewan dibagi ke dalam beberapa kategori, yaitu hewan ternak umum, hewan ternak unggas, dan hewan ternak air. Setiap hewan memiliki informasi berupa jenis, umur, dan jumlah, ditambah keterangan khusus seperti jenis unggas atau habitat untuk hewan air. Program ini dibuat agar pengguna bisa lebih mudah mencatat dan memantau data hewan ternak dengan tampilan menu interaktif. Selain itu, program juga menerapkan konsep Object-Oriented Programming (OOP) seperti abstraction melalui penggunaan abstract class, serta polymorphism melalui overloading dan overriding method.

## Pengembangan Program

Program ini telah menerapkan konsep abstraction dan polymorphism untuk membuat kode lebih terstruktur dan fleksibel. Abstraction digunakan melalui class abstrak HewanTernak yang mendefinisikan atribut serta metode dasar tanpa menampilkan detail implementasi. Sementara itu, polymorphism diterapkan dengan metode getDeskripsi() yang dioverride pada setiap turunan, sehingga setiap jenis hewan dapat menampilkan informasi sesuai karakteristiknya meskipun dipanggil dengan cara yang sama.
