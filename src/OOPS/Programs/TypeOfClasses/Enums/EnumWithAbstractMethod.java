package OOPS.Programs.TypeOfClasses.Enums;

public enum EnumWithAbstractMethod {
    MONDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Monday Dummy Method");
        }
    },
    TUESDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Tuesday Dummy Method");
        }
    },
    WEDNESDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Wednesday Dummy Method");
        }
    };

    public abstract void dummyMethod();
}
