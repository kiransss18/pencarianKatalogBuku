package com.company;
import java.util.Date;

// Anggota Perpustakaan
class Anggota {

    String nama;
    int npm;
    Buku book;
    Lokasi l;

    void cariBuku(Buku book) {
        this.book = book;
    }

    void cariRak(Lokasi l) {
        this.l = l;
    }

    Anggota(String nama, int npm) {
        this.nama = nama;
        this.npm = npm;

    }

    void detailAnggota() {
        System.out.println("Nama Anggota : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("------");
        System.out.println(" ");
        book.detailBuku();

    }
}

// Mencari Buku
class Buku{
    String jenisBuku;
    String namaBuku;
    int kodeBuku;
    String namaPengarang;
    String penerbit;
    int jumlahBuku;

    Buku(String namaBuku, int kodeBuku, String jenisBuku, String namaPengarang, String penerbit, int jumlahBuku){
        this.namaBuku = namaBuku;
        this.kodeBuku = kodeBuku;
        this.jenisBuku = jenisBuku;
        this.namaPengarang = namaPengarang;
        this.penerbit = penerbit;
        this.jumlahBuku = jumlahBuku;

    }

    void detailBuku(){
        System.out.println("Nama Buku : " + namaBuku);
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Jenis Buku : " + jenisBuku);
        System.out.println("Nama pengarang Buku : " + namaPengarang);
        System.out.println("Penerbit Buku : " + penerbit);
        System.out.println("Jumlah Buku yang Tersedia : " + jumlahBuku);

    }
}

// Letak Buku
class Lokasi{
    String lokasiRak;
    int nomorRak;

    Lokasi(String lokasiRak, int nomorRak){
        this.lokasiRak = lokasiRak;
        this.nomorRak = nomorRak;

    }

    void detailRak(){
        System.out.println("Lokasi Rak Buku : " + lokasiRak);
        System.out.println("Nomor Rak : " + nomorRak);

    }
}

public class Main {
    public static void main(String[] args) {
        Anggota mahasiswa = new Anggota("Selma", 2015061066);
        Buku cari = new Buku("Life 3.0", 00056, "Buku Motivasi", "Max Tegmark", "Allen Lane", 3);
        Lokasi buku = new Lokasi("Gedung 1, lantai 3", 10318);
        mahasiswa.cariBuku(cari);
        mahasiswa.cariRak(buku);
        mahasiswa.detailAnggota();

    }
}