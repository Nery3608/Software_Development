public class TryCatchDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = 0;
            System.out.println("Result is %s".formatted(result));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This runs no matter what(resources, ");
        }
        }
    }
