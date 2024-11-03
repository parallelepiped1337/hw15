public class Main {
    public static void main(String[] args) {

        WeeklyAdviser adviser = new WeeklyAdviser();

        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            adviser.advise(day);

        }

    }

}