class CustomException extends Exception {

    public CustomException(String error) {
        super(error);
    }
}

public class CustomExceptions {

    public static void main(String[] args) {
        int i = 13;
        int j = 0;
        try {
            j = j + 1;
            throw new CustomException("There is a problem...");
        } catch (CustomException e) {
            System.out.println(e);
        }
        System.out.println("Program end!");
    }
}
