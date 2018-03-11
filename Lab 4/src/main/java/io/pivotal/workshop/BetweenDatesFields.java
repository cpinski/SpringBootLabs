package io.pivotal.workshop;

public class BetweenDatesFields {

    public final String firstDate;
    public final String secondDate;

    public BetweenDatesFields(String firstDate, String secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }

    // Make jackson happy when parsing JSON into this class
    private BetweenDatesFields() {
        this(null, null);
    }
}
