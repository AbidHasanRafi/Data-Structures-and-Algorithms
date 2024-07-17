public class EnumExample {

    // Define static final constants for days of the week
    static final int MON = 0;
    static final int TUE = 1;
    static final int WED = 2;
    static final int THU = 3;
    static final int FRI = 4;
    static final int SAT = 5;
    static final int SUN = 6;

    public static void main(String[] args) {
        // Using static final constants
        int today = TUE;
        System.out.println("Using constants: Today is day number " + today);

        // Using enum
        Day dayToday = Day.TUE;
        System.out.println("Using enum: Today is " + dayToday);
    }

    // Enum definition for days of the week
    public enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }
}