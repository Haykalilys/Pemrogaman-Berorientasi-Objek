package pertemuan_9;

public class tugas_7 {
    public static void main (String args[]) throws Exception {
        int n=20,result=0;
        try{
            result=n/0;
            System.out.println("The result" + result);
        }
        catch(ArithmeticException ex){
            System.out.println
            ("Aritmetic exception occured: " + ex);
            try {
                throw new NumberFormatException();
            }
            catch(NumberFormatException ex1) {
                System.out.println
                ("Chained exception throw manually : " + ex1);
                
            }
        }
    }
}
