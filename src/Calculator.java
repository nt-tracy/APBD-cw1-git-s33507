import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("--- Prosty Kalkulator Java ---");

        // Pobranie pierwszej liczby
        System.out.print("Wpisz pierwszą liczbę: ");
        num1 = scanner.nextDouble();

        // Pobranie operatora
        System.out.print("Wybierz operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Pobranie drugiej liczby
        System.out.print("Wpisz drugą liczbę: ");
        num2 = scanner.nextDouble();

        // Obliczenia

        switch (operator) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Błąd: Dzielenie przez zero!");
                    return;
                }
                break;
            default:
                throw new RuntimeException("Invalid operator");
        }

        System.out.println("Wynik: " + num1 + operator + num2 + " = " + result);
        scanner.close();
    }
}
