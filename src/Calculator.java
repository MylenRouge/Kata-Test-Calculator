import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int number1, number2;
    static char operation;
    static int result;

    public static void main(String[] args) {
        System.out.println("Введите выражение 2х целых чисел 1 до 10 с пробелами: ");
        String expression = scanner.nextLine();
        char[] numbers = new char[10];

        for (int index = 0; index < expression.length(); index++) {
            numbers[index] = expression.charAt(index);
            if (numbers[index] == '+') {
                operation = '+';
            } else if (numbers[index] == '-') {
                operation = '-';
            } else if (numbers[index] == '*') {
                operation = '*';
            } else if (numbers[index] == '/') {
                operation = '/';
            }
        }
        String numbersString = String.valueOf(numbers);
        String[] cleanNumbers = numbersString.split("[+-/*]");
        String stable00 = cleanNumbers[0];
        String stable01 = cleanNumbers[1];
        String stable02 = stable01.trim();
        number1 = Roman.valueOf(stable00).toInt(); //ENUM CONVERTION
        number2 = Roman.valueOf(stable02).toInt();
        if (number1 < 0 && number2 < 0) {
            result = 0;
        } else {
            result = calculated(number1, number2, operation);
            System.out.println("Ответ в римских цифрах: ");
            int roman = result;
            String resultRoman = Roman.name(roman); //Чекпоинт на конвертацию в римские цифры
            System.out.println(stable00 + " " + operation + " " + stable02 + " = " + resultRoman);
        }
        number1 = Integer.parseInt(stable00);
        number2 = Integer.parseInt(stable02);
        result = calculated(number1, number2, operation);
        System.out.println("Ответ в арабских цифрах: ");
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }

//        private static String convertNumToRoman (int numArabian) {
//        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
//        final String s = roman[numArabian];
//        return s;
    }
//    private static int romanToNumber(String roman) {
//        try {
//            switch (roman) {
//                case "I" -> {
//                    return 1;
//                }
//                case "II" -> {
//                    return 2;
//                }
//                case "III" -> {
//                    return 3;
//                }
//                case "IV" -> {
//                    return 4;
//                }
//                case "V" -> {
//                    return 5;
//                }
//                case "VI" -> {
//                    return 6;
//                }
//                case "VII" -> {
//                    return 7;
//                }
//                case "VIII" -> {
//                    return 8;
//                }
//                case "IX" -> {
//                    return 9;
//                }
//                case "X" -> {
//                    return 10;
//                }
//            }
//        } catch (InputMismatchException e) {
//            throw new InputMismatchException("Неверный формат данных");
//        }
//        return -1;
//    }

    public static int calculated(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Исключение : " + e);
                    System.out.println("Только целые числа больше нуля");
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}





        //Calculation calculation1 = new Calculation();
        //calculation1

//        String[] numbers = expression.split(" ");
//        int number1 = Integer.parseInt(numbers[0]);
//        int number2 = Integer.parseInt(numbers[2]);
//        switch (roman) {
//            case I:
//                numbers[0] = String.valueOf(1);
//                break;
//            case II:
//                System.out.println("2");
//                break;
//        }
//
//        if(expression.indexOf('+')>0) {
//            numbers = expression.split("[+]");
//            result = (int) (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
//        } else if(expression.indexOf('-')>0) {
//            numbers = expression.split("[-]");
//            result = (int) (Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));
//        } else if(expression.indexOf('/')>0) {
//            numbers = expression.split("[/]");
//            result = (int) (Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]));
//        } else if(expression.indexOf('*')>0) {
//            numbers = expression.split("[*]");
//            result = (int) (Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));
//        } else {
//        }
//        System.out.println(result);
//    }
//}