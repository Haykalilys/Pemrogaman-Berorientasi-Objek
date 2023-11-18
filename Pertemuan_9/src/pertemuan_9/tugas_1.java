package pertemuan_9;

public class tugas_1 {
    public static void main(String[] args) {
        new tugas_1(). doTheWork();
    }
    public void doTheWork(){
        Object o = null;
        for(int i=0; 1<=5; i++){
            try {
                o = makeObj(i);
            }
            catch (IllegalArgumentException e) {
                System.err.println("Error: ("+ e.getMessage()+")." );
                return;
            }
            finally {
                System.err.println("All done");
                if (o==null)
                System.exit(0);
            }
            System.out.println(o);
        }
    }
    public Object makeObj(int type)
    throws IllegalArgumentException {
        if (type == 1){
        throw new IllegalArgumentException 
        ("Dont't like type " + type);
        }
        return new Object();
    }
    public char[] method(int i, double d){
        return null;
    }
    
}
