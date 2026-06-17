# project-akhir-oop
# Java CRUD Application

Aplikasi CRUD (Create, Read, Update, Delete) sederhana yang dibuat menggunakan Java Swing dan MySQL. Project ini digunakan untuk mengelola data siswa melalui antarmuka grafis (GUI) dengan fitur tambah, tampil, ubah, dan hapus data.

## Fitur

* Menampilkan data siswa
* Menambahkan data siswa
* Mengubah data siswa
* Menghapus data siswa
* Pencarian data siswa
* Koneksi ke database MySQL menggunakan JDBC

## Teknologi yang Digunakan

* Java
* Java Swing
* JDBC
* MySQL
* Apache Maven
* NetBeans IDE

## Struktur Project

```text
src/
├── main/
│   ├── java/
│   │   ├── javatutorial/
│   │   │   ├── FormSiswa.java
│   │   │   ├── Koneksi.java
│   │   │   └── ...
│   └── resources/
```

## Persyaratan

* JDK 17 atau lebih baru
* MySQL Server
* NetBeans IDE (opsional)
* Maven

## Konfigurasi Database

1. Buat database MySQL:

```sql
CREATE DATABASE db_siswa;
```

2. Buat tabel siswa:

```sql
CREATE TABLE students (
    nis VARCHAR(20) PRIMARY KEY,
    nama VARCHAR(100),
    jenis_kelamin VARCHAR(20),
    alamat TEXT
);
```

3. Sesuaikan konfigurasi koneksi database pada file `Koneksi.java`:

```java
String url = "jdbc:mysql://localhost:3306/tutorialjava";
String user = "root";
String password = "";
```

## Cara Menjalankan

### Menggunakan NetBeans

1. Buka project di NetBeans.
2. Pastikan database MySQL aktif.
3. Jalankan project dengan menekan tombol **Run Project**.

### Menggunakan Maven

```bash
mvn clean compile
mvn exec:java
```
## Kontributor

* Hermansyah

## Lisensi

Project ini dibuat untuk tujuan pembelajaran dan pengembangan aplikasi Java CRUD.
