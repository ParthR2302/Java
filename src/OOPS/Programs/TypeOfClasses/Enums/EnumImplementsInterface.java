package OOPS.Programs.TypeOfClasses.Enums;

public enum EnumImplementsInterface implements EnumInterface {

    MONDAY,
    TUESDAY,
    WEDNESDAY{
        @Override
        public String toLowerCase() {
            return this.name().toUpperCase();
        }
    };

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
