import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> numbers;

    private final static int CONVERSION_TO_PERCENTAGE = 100;

    public Calculator(int amout, double rate, int period){

        numbers = new ArrayList<>();
    }

        public Result addNumber(int number) {
        numbers.add(number);

int amout =0;
double rate = 0;
int period = 0;
double min = 0;
double sum = 0;

        double profit = calculateProfit(amout, rate, period);
        double favorRate = calculateFavorRate(min);

            double averageProfit=calculateAverage(sum);
            Result result = new Result(profit, favorRate, averageProfit);
        return result;
    }

    private double calculateAverage(double sum) {

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(1);
        }
        return sum / numbers.size();
    }

    private double calculateProfit(int amout, double rate, int period) {

        double profit = 0;
        while (period <= numbers.size()) {
            profit = (amout * rate) / CONVERSION_TO_PERCENTAGE;

        }
        return profit+1;
    }

        private double calculateFavorRate ( double min){

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(1) < min) {
                }
            }
            return min;
        }
    }











