public class Main {
    public static void main(String[] args) {
        double[] left = {100.0d, 20.3d, 50.0d, 9.0d};
        double[] right = {20.0d, 20.0d, 30.0d, 3.0d};
        char[] operatorArr = {'d', 'm', 's', 'a'};

        double[] resultArr = new double[operatorArr.length];

        for (int i = 0; i < operatorArr.length; i++) {
            resultArr[i] = execute(operatorArr[i], left[i], right[i]);
        }

        for (double result : resultArr)
            System.out.println(result);
    }

    static double execute(char opCode, double left, double right) {
        double result = 0;
        switch (opCode) {
            case 'a':
                result = left + right;
                break;
            case 's':
                result = left - right;
                break;
            case 'd':
                result = right != 0 ? left / right : 0.0d;
                break;
            case 'm':
                result = left * right;
                break;
            default:
                System.out.println("Wrong Operator!");
        }
        return result;
    }
}