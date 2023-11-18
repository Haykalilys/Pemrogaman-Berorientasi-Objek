package pertemuan_9;

public class tugas_14 {
    static class WrongInputException extends Exception {
        WrongInputException(String s) {
            super(s);
        }
    }

    static class Input {
        void method() throws WrongInputException {
            throw new WrongInputException("Wrong Input");
        }
    }

    public static void main(String[] args) throws WrongInputException {
        try {
            new Input().method();
        } catch (WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }
}
