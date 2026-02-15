import java.io.IOException;

class ThrowsThrow {
    static void checkAge(int age) throws IOException {
        if (age < 18) {
            throw new IOException("age must be 18 or above");
        }
        System.out.println("access granted");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IOException e) {
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}
