import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество вкладов");
        String numberOfString = scanner.nextLine();
        int number = Integer.parseInt(numberOfString);
        List<Deposit> deposits = new ArrayList<>();

        System.out.println("Введите сумму, процент вклада и срок");
        Deposit deposit = null;
        for (int i = 0; i < number; i++) {
            String string = scanner.nextLine();
            String[] numbers = string.split(" ");
            double amount = Double.parseDouble(numbers[0]);
            double rate = Double.parseDouble(numbers[1]);
            int period = Integer.parseInt(numbers[2]);
            deposit = new Deposit(amount, rate, period);
            deposits.add(deposit);
        }

        Calculator calculator = new Calculator();
        Result result = calculator.calculateInfoAboutDeposits(deposits);
        System.out.println(result);

        List<Double> profits = result.getAllProfits();

        for (Double profit : profits) {
            System.out.println("Вклад заработал: " + profit);
        }
    }
}
















