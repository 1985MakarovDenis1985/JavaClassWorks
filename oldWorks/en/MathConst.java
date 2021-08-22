package en;

public enum MathConst {
    PI(3.1415926), EXP(2.718281828), G(6.67E-11);

    public double getValue() {
        return value;
    }

    private double value;

    private MathConst(double value) {
        this.value = value;
    }
}
