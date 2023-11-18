public class Kitten 
{ public Kitten (String name) { 
// Constructor ini memiliki satu parameter, name 
//Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance).
System.out.println ("my kitten is:" + name); 
} 
public static void main (String []args) { 
    Kitten mykitten = new Kitten ("teo"); 
}
}