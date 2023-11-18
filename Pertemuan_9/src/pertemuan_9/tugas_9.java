/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_9;

/**
 *
 * @author computer 37
 */
public class tugas_9 {
    public static void main (String args[]){
        try{
            throw new Exception("Throwing an exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
