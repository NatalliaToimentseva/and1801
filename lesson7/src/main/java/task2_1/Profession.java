package task2_1;

public enum Profession {
    DIRECTOR (1.5), WORKER (1.25), HR (1.0);
    private double rate;

    Profession(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
