import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {
        int number1 = getNumber();
        char operation = getOperation();
        int number2 = getNumber();
        int result = calc(number1, number2, operation);
        System.out.println("Результат:" + result);
    }
    public static int getNumber() {
        System.out.println("Введите целое число");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Вы ввели число неправильно. Попробуте еще раз");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
    public static char getOperation() {
        System.out.println("Введите операцию: +, -, *, /");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы ввели операцию неверно. Попробуйте еще раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int number1, int number2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Операция невыполнима. Попробуйте снова");
                result = calc(number1, number2, getOperation());
        }
        return result;
    }

}
