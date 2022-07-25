import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Error , please repeat");
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете номер операции:" + " 1- прибавить" + " 2-отнять" + " 3-умножить" + " 4-делить");
        int operationNumber = 0;
        if (scanner.hasNextInt()) {
            operationNumber = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не число");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция, повторите ввод");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 != 0.0) {
            return num1 / num2;
        } else {
            System.out.println("На ноль делить нельзя");
            return Double.NaN;
        }
    }

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }

}




