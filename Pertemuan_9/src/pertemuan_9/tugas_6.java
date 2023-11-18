package pertemuan_9;

/**
 *
 * @author computer 37
 */
public class tugas_6 {
    public static void main(String[] args){
        int array[]={20, 20, 40};
        int num1=15, num2=10;
        int result=10;
        try {
            result = num1/num2;
            System.out.println("The result is" + result);
            for(int i=5; i>=0; i--){
                System.out.println("the value of array is" + array[i]);
            }
        }
        catch (Exception e) {
            System.out.println("Exception occoured : " + e);
        }
    }
}
