package pertemuan11;

import javax.swing.*;
import java.awt.*;
class cekBok extends JFrame {
    Checkbox unta = new Checkbox("nama kamu siapa");
    Checkbox kuda = new Checkbox("nama kamu haykal");
    Checkbox kuda2 = new Checkbox("nama kamu ilyasa");
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    cekBok(){
        super("PROGRAM MENGHITUNG ZAKAT");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(kuda2);
        unta.setBounds(30,90,150,20);
        kuda.setBounds(30,120,150,20);
        kuda2.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String args[]){
        cekBok ZZ=new cekBok();
        ZZ.objek();
    }
}

