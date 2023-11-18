package konstruktor;

public class Penjualan{
// DeklarasiVariabel
private String nama;
private int harga, jumlah, total;
// Konstruktor Dengan Parameter
public Penjualan(String _nama, int _harga, int _jumlah){
nama = _nama;
harga = _harga;
jumlah= _jumlah;
}
// Method Untuk Hitung HargaTotal
public int total(){
total = harga * jumlah;
return total;
}
// Method Untuk Menampilkan Rincian
public void tampil(){
System.out.println("Nama Barang : "+ nama);
System.out.println("Harga Barang : "+ harga);
System.out.println("Jumlah yang Dibeli : "+ jumlah);
System.out.println("______________________________");
System.out.println("Total Harga : "+ total());
}
public static void main(String[]args){
// Perintah untuk membuat objek
Penjualan resi = new Penjualan("Roti Kumis", 950, 115);
resi.tampil();
}
}