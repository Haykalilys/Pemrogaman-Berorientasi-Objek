package pertemuan11;

import java.awt.*;
import javax.swing.*;

public class Latihan extends JFrame {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new Latihan();
        });
    }
    Latihan() {
        super("Design Tampilan Kalkulator");
        setLayout(new FlowLayout());
        add(new Label("Masukkan Angka Pertama: "));
        add(new TextField(12)); 
        add(new Label("Masukkan Angka Kedua: "));
        add(new TextField(12));
        add(new Label("Masukkan Angka Ketiga: "));
        add(new TextField(12)); 
        add(new Button(" + "));
        add(new Button(" - "));
        add(new Button(" / "));
        add(new Button(" * "));

        setLocation(300, 300);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
