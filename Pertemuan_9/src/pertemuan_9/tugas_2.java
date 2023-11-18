/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_9;

/**
 *
 * @author computer 37
 */
class Animal extends Exception {
}
class Mammel extends Animal{    
}
public class tugas_2 {
    public static void main(String[] args){
        try{
            throw new Mammel();
        }
        catch (Mammel m) {
            System.out.println("It is mammel");
        }
    }
}
