public class Main {
    public static void main(String[] args) {
        double[] left = {100.0d, 20.3d, 50.0d, 9.0d};
        double[] right = {20.0d, 20.0d, 30.0d, 3.0d};
        char[] operatorArr = {'d', 'm', 's', 'a'};

        double[] resultArr = new double[operatorArr.length];

        for (int i = 0; i < operatorArr.length; i++) {
            switch (operatorArr[i]) {
                case 'a':
                    resultArr[i] = left[i] + right[i];
                    break;
                case 's':
                    resultArr[i] = left[i] - right[i];
                    break;
                case 'd':
                    resultArr[i] = right[i] != 0 ? left[i] / right[i] : 0.0d;
                    break;
                case 'm':
                    resultArr[i] = left[i] * right[i];
                    break;
                default:
                    System.out.println("Wrong Operator!");
            }
        }

        for (double result : resultArr)
            System.out.println(result);
    }
}