package OOPS.Programs.EnumsJava;

/*
 * Used Enums in this file: Coin, Level, Note
 * Coin enum is created with assigning values to enum variables
 */

public class EnumsUse {
    public void print(Coin coin) {
        if(coin == Coin.TEN) {
            System.out.println("Selected value of coin is 10");
        }
        System.out.println("The value of coin is: " + coin.getValue());
    }

    // Enum inside a class
    enum Note {
        TEN,
        TWENTY,
        FIFTY,
        HUNDRED;
    }

    public static void main(String[] args) {
        EnumsUse enumsUse = new EnumsUse();
        enumsUse.print(Coin.TEN);

        System.out.println("\n--------------------------------------------------------------------------------\n");

        // Enum declared in a seperate file
        Level level = Level.HARD;

        switch (level) {
            case EASY:
                System.out.println("Easy Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HARD:
                System.out.println("Hard Level");
                break;
            case EXPERT:
                System.out.println("Expert Level");
                break;
            default:
                break;
        }

        if(level == Level.HARD || level == Level.EXPERT) {
            System.out.println("Be careful! You are playing a tough match.");
        }

        System.out.println("\n--------------------------------------------------------------------------------\n");

        System.out.print("Looping through Level enum: ");
        for(Level myLevel : Level.values()) {
            System.out.print(myLevel + " ");
        }
        System.out.println();

        System.out.println("\n--------------------------------------------------------------------------------\n");

        Note note = Note.FIFTY;

        if(note == Note.HUNDRED) {
            System.out.println("Value of the note is One Hundred");
        }

    }
}
