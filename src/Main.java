public class Main {
    public static void main(String[] args) {
        double value1 = 100.0;
        double value2 = 1;
        double result = 0;

        char operator = 'd';

        switch (operator) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            case 'm':
                result = value1 * value2;
                break;
            default:
                System.out.println("Wrong Operator!");
        }

        System.out.println(result);
    }
}