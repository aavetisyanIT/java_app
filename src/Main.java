public class Main {
    public static void main(String[] args) {
        int result = 1;
        int currentValue = 5;

        while (currentValue > 1) {
            result *= currentValue;
            currentValue--;
        }

        System.out.println(result);
    }
}