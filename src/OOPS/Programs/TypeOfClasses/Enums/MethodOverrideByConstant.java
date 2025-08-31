package OOPS.Programs.TypeOfClasses.Enums;

public enum MethodOverrideByConstant {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Monday Dummy Method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    // Although this method seems like a common methods for each constant, Each constants have their own instance of this method.
    // We can override this method for each Constants.
    public void dummyMethod() {
        System.out.println("Default Dummy Method");
    }
}
