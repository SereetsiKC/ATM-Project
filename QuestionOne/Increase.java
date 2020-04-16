package QuestionOne;

public enum Increase{
    percentage(10);

    public final int value;
    private Increase(final int value) {
        this.value = value;
    }
}