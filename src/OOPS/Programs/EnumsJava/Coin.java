package OOPS.Programs.EnumsJava;

public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10);

    private final int value;

    // Storing the value of a variable of an enum class based on the selected value of Enum
    Coin(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
