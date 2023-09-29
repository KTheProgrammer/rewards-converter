public class RewardValue {
    double miles;
    double cash;

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * 0.0035;
    }
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) cash / 0.0035;

    }

    public double getCashValue() {
        return this.cash;
    }
    public int getMilesValue() {
        return (int) this.miles;
    }
}
