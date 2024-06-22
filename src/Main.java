import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество вкладов");
        String numberOfString = scanner.nextLine();
        int number = Integer.parseInt(numberOfString);

        System.out.println("Введите сумму, процент вклада и срок");
        for (int i = 0; i <= number; i++) {
            String string = scanner.nextLine();
            String[] numbers = string.split(" ");
            int amout = Integer.parseInt(numbers[0]);
            double rate = Double.parseDouble(numbers[1]);
            int period = Integer.parseInt(numbers[2]);

            Calculator calculator = new Calculator(amout, rate, period);
              Result result = calculator.addNumber(number);



                System.out.println("Доход с каждого вклада " + result.getProfit());


            }
        }
    }








