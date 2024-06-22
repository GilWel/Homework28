import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> numbers;

    private final static int CONVERSION_TO_PERCENTAGE = 100;

    public Calculator(int amout, double rate, int period) {

        numbers = new ArrayList<>();
    }

    public Result addNumber(int number) {
        numbers.add(number);

        int amout = 0;
        double rate = 0;
        int period = 0;
        double min = 0;
        double sum = 0;

        double profit = calculateProfit(amout, rate, period);
        double favorRate = 0;
        double averageProfit = 0;

        Result result = new Result(profit, favorRate, averageProfit);
        return result;
    }


    private double calculateProfit(int amout, double rate, int period) {

        double profit = 0;
        for (int j = 1; j <= period; j++) {
            amout += profit;
            profit = (amout * rate * j) / CONVERSION_TO_PERCENTAGE;
                    }
        return ++profit;
    }


}
