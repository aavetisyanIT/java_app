import java.util.Scanner;

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
        } else if (args.length == 1 && args[0].equals("interactive")) {
            handleUserInputs();
        } else if (args.length == 3) {
            handleCommandLineArgs(args);
        } else {
            System.out.println("Please, provide 3 arguments");
        }

    }

    static void handleUserInputs() {
        System.out.println("Enter operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] inputArr = inputStr.split(" ");
        performOperation(inputArr);
    }

    static char symbolFromOpCode(char opCode) {
        char[] opCodesArr = {'a', 's', 'm', 'd'};
        char[] symbolsArr = {'+', '-', '*', '/'};
        char result = ' ';
        for (int i = 0; i < opCodesArr.length; i++) {
            if (opCode == opCodesArr[i]) {
                result = symbolsArr[i];
                break;
            }
        }
        return result;
    }

    private static void performOperation(String[] inputArr) {
        char opCode = opCodeFromString(inputArr[0]);
        double valueOne = valueFromWord(inputArr[1]);
        double valueTwo = valueFromWord(inputArr[2]);
        double result = execute(opCode, valueOne, valueTwo);
        displayResult(opCode, valueOne, valueTwo, result);
    }

    private static void displayResult(char opCode, double valueOne, double valueTwo, double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuffer outputBuffer = new StringBuffer(20);
        outputBuffer.append(valueOne);
        outputBuffer.append(' ');
        outputBuffer.append(symbol);
        outputBuffer.append(' ');
        outputBuffer.append(valueTwo);
        outputBuffer.append(" = ");
        outputBuffer.append(result);
        String output = outputBuffer.toString();
        System.out.println(output);
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

    static char opCodeFromString(String input) {
        return input.charAt(0);
    }

    static double valueFromWord(String inputWord) {
        String[] wordsArray = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        };
        double result = 0d;
        for (int i = 0; i < wordsArray.length; i++) {
            if (inputWord.equals(wordsArray[i])) {
                result = i;
                break;
            }
        }
        return result;
    }
}