import java.util.Objects;

public class Result {
    private double profit;
    private double favorRate;
    private double averageProfit;

    public Result(double profit, double favorRate, double averageProfit) {
        this.profit = profit;
        this.favorRate = favorRate;
        this.averageProfit = averageProfit;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getFavorRate() {
        return favorRate;
    }

    public void setFavorRate(double favorRate) {
        this.favorRate = favorRate;
    }

    public double getAverageProfit() {
        return averageProfit;
    }

    public void setAverageProfit(double averageProfit) {
        this.averageProfit = averageProfit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(profit, result.profit) == 0 && Double.compare(favorRate, result.favorRate) == 0 && Double.compare(averageProfit, result.averageProfit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profit, favorRate, averageProfit);
    }

    @Override
    public String toString() {
        return "Result{" +
                "profit=" + profit +
                ", favorRate=" + favorRate +
                ", averageProfit=" + averageProfit +
                '}';
    }
}
