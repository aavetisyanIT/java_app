public class Main {
    public static void main(String[] args) {
        double value1 = 100.0;
        double value2 = 0;
        double result = 0;

        char operator = 'd';

        if (operator == 'a') {
            result = value1 + value2;
        } else if (operator == 's') {
            result = value1 - value2;
        } else if (operator == 'd') {
            if (value2 != 0) {
                result = value1 / value2;
            }
        } else if (operator == 'm') {
            result = value1 * value2;
        } else {
            System.out.println("Wrong Operation");
        }

        System.out.println(result);
    }
}