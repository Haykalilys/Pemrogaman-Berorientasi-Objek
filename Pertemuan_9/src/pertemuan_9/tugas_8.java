package pertemuan_9;

public class tugas_8 {
    double method(int i) throws Exception {
        return i / 0;
    }
    boolean method(boolean b) {
        return !b;
    }
    static double method(int x, double y) throws Exception {
        return x + y;
    }
    static double method(double x, double y) { // Perbaikan: "douuble" menjadi "double"
        return x + y - 3;
    }
    public static void main(String[] args) {
        tugas_8 mn = new tugas_8();
        try {
            System.out.println(mn.method(10, 20.0)); // Perbaikan: Memanggil metode dari objek mn
            System.out.println(mn.method(10.0, 20));
            System.out.println(mn.method(10.0, 20.0));
            System.out.println(mn.method(10));
        } catch (Exception ex) {
            System.out.println("exception occurred: " + ex); // Perbaikan: Pesan kesalahan yang lebih jelas
        }
    }
}
