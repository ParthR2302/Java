package OOPS.Programs.TypeOfClasses.Enums;

/*
 * Methods used:
 * - Values()
 * - ordinal() -> Default Values that are automatically assigned to each entries.
 * - name()
 */

public class EnumMain {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------- Normal Enum Class iteration
        for(NormalEnumClass sample : NormalEnumClass.values()) {
            System.out.println(sample.ordinal() + " " + sample);
        }

        NormalEnumClass enumSampleValue = NormalEnumClass.valueOf("FRIDAY");
        System.out.println(enumSampleValue.name() + " " + enumSampleValue.ordinal());

        NormalEnumClass normalMondayEnum = NormalEnumClass.MONDAY;
        System.out.println(normalMondayEnum.name() + " " + normalMondayEnum.ordinal());

        // ---------------------------------------------------------------------- Custom Value Enum
        System.out.println("\n----------------------------------------------------------------------\n");
        for(CustomValueEnum sample : CustomValueEnum.values()) {
            System.out.println(sample.ordinal() + " | " + sample + " | " + sample.getVal() + " | " + sample.getComment());
        }
        System.out.println();

        int value = 103;
        CustomValueEnum dayOfTheWeek = CustomValueEnum.getEnumFromValue(value);
        System.out.println(dayOfTheWeek.ordinal() + " | " + dayOfTheWeek + " | " + dayOfTheWeek.getVal() + " | " + dayOfTheWeek.getComment());

        // ---------------------------------------------------------------------- Method Override by Constant
        System.out.println("\n----------------------------------------------------------------------\n");

        MethodOverrideByConstant fridaySample = MethodOverrideByConstant.FRIDAY;
        fridaySample.dummyMethod();
        MethodOverrideByConstant mondaySample = MethodOverrideByConstant.MONDAY;
        mondaySample.dummyMethod();

        // ---------------------------------------------------------------------- Enum with abstract method
        System.out.println("\n----------------------------------------------------------------------\n");

        EnumWithAbstractMethod mondayWithAbstractMethod = EnumWithAbstractMethod.MONDAY;
        mondayWithAbstractMethod.dummyMethod();
        EnumWithAbstractMethod tuesdayWithAbstractMethod = EnumWithAbstractMethod.TUESDAY;
        tuesdayWithAbstractMethod.dummyMethod();

        // ---------------------------------------------------------------------- Enum implements interface
        System.out.println("\n----------------------------------------------------------------------\n");
        EnumImplementsInterface mondayImplementsInterface = EnumImplementsInterface.MONDAY;
        System.out.println(mondayImplementsInterface.toLowerCase());
        EnumImplementsInterface tuesdayImplementsInterface = EnumImplementsInterface.TUESDAY;
        System.out.println(tuesdayImplementsInterface.toLowerCase());
        EnumImplementsInterface wednesdayImplementsInterface = EnumImplementsInterface.WEDNESDAY;
        System.out.println(wednesdayImplementsInterface.toLowerCase());
    }
}
