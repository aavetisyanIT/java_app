public class Main {
    public static void main(String[] args) {
        double[] left = {100.0d, 20.3d, 50.0d, 9.0d};
        double[] right = {20.0d, 20.0d, 30.0d, 3.0d};
        char[] operatorArr = {'d', 'm', 's', 'a'};

        double[] resultArr = new double[operatorArr.length];

        if (args.length == 0) {
            for (int i = 0; i < operatorArr.length; i++) {
                resultArr[i] = execute(operatorArr[i], left[i], right[i]);
            }

            for (double result : resultArr)
                System.out.println(result);
        } else if (args.length == 3) {
            handleCommandLineArgs(args);
        } else {
            System.out.println("Please, provide 3 arguments");
        }

    }

    static void handleCommandLineArgs(String[] args) {
        char code = args[0].charAt(0);
        double left = Double.parseDouble(args[1]);
        double right = Double.parseDouble(args[2]);
        double result = execute(code, left, right);
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