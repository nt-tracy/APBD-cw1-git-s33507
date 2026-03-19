import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test - to change later");
        System.out.println("--- Your first calculator :> ---");
        System.out.println("Enter your operation: ");
        String op = scanner.nextLine();

        String[] parts = op.split("(?<=[-+*/])|(?=[-+*/])");

        double num1 = Double.parseDouble(parts[0].trim());
        char operator = parts[1].trim().charAt(0);
        double num2 = Double.parseDouble(parts[2].trim());
        double result;

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

        System.out.println("Wynik: " + num1 + " " + operator  + " " + num2 + " = " + result);
        scanner.close();
    }
    public static double CalculateAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
    
    public static int CalculateMax(int[] values) {
        int max = values[0];
        for (int v : values) {
            if (v > max) max = v;
        }
        return max;
    }

    public static int CalculateMin(int[] values) {
        int min = values[0];
        for (int v : values) {
            if (v < min) min = v;
        }
        return min;
    }


}
