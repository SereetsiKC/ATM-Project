package QuestionOne;

public enum Deduction {
    Tax(18), Medical(12.5), CarAllowance(8), UIF(2);

    public final double perceptage;

    private Deduction(final double perceptage) {
        this.perceptage = perceptage;
    }
}

