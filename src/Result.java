import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Result {
    private int indexOfMaxProfitDeposit;

    private double averageProfitByDeposits;

    private List<Double> allProfits;

    public int getIndexOfMaxProfitDeposit() {
        return indexOfMaxProfitDeposit;
    }

    public void setIndexOfMaxProfitDeposit(int indexOfMaxProfitDeposit) {
        this.indexOfMaxProfitDeposit = indexOfMaxProfitDeposit;
    }

    public double getAverageProfitByDeposits() {
        return averageProfitByDeposits;
    }

    public void setAverageProfitByDeposits(double averageProfitByDeposits) {
        this.averageProfitByDeposits = averageProfitByDeposits;
    }

    public List<Double> getAllProfits() {
        return allProfits;
    }

    public void setAllProfits(List<Double> allProfits) {
        this.allProfits = allProfits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return indexOfMaxProfitDeposit == result.indexOfMaxProfitDeposit && Double.compare(averageProfitByDeposits, result.averageProfitByDeposits) == 0 && Objects.equals(allProfits, result.allProfits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexOfMaxProfitDeposit, averageProfitByDeposits, allProfits);
    }

    @Override
    public String toString() {
        return "Result{" +
                "indexOfMaxProfitDeposit=" + indexOfMaxProfitDeposit +
                ", averageProfitByDeposits=" + averageProfitByDeposits +
                ", allProfits=" + allProfits +
                '}';
    }

    public Result(int indexOfMaxProfitDeposit, double averageProfitByDeposits, List<Double> allProfits) {
        this.indexOfMaxProfitDeposit = indexOfMaxProfitDeposit;
        this.averageProfitByDeposits = averageProfitByDeposits;
        this.allProfits = allProfits;

    }
}