public class MathEquations {
    char opCode;
    double left;
    double right;
    double result;

    void execute() {
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
    }
}
