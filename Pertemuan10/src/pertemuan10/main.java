package pertemuan10;

class MyClass {
    int height;
    MyClass() {
        System.out.println("bricks");
        height = 0;
    }
    MyClass(int i){
        System.out.println("Building new House that is "
        + i + " feet tall");
        height = i;
    }
    void info(){
        System.out.println("House is " + height
        + " feet tall");
    }
    void info(String s){
        System.out.println(s + ": House is "
        + height + " feet tall");
    }
}
public class main {
    public static void main(String[] args){
        MyClass t = new MyClass(0);
        t.info();
        t.info("overloaded method");
        //overloaded constructor:
        new MyClass();
    }
}
