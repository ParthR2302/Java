package OOPS.Programs.TypeOfClasses.Enums;

public enum CustomValueEnum {
    MONDAY(101, "1st day of week"),
    TUESDAY(102, "2nd day of week"),
    WEDNESDAY(103, "3rd day of week"),
    THURSDAY(104, "4th day of week"),
    FRIDAY(105, "5th day of week"),
    SATURDAY(106, "1st WeekOff"),
    SUNDAY(107, "2nd WeekOff");

    // Wathever variables, methods and Constructors we define in this class are for each enum constants (MONDAY,...,SUNDAY)
    private int val;
    private String comment;

    // This constructor will also be of private type in the ByteCode
    CustomValueEnum(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // This method is for the class and not for each of the members.
    public static CustomValueEnum getEnumFromValue(int value) {
        for(CustomValueEnum customEnum : CustomValueEnum.values()) {
            if(customEnum.val == value) {
                return customEnum;
            }
        }

        return null;
    }
}
