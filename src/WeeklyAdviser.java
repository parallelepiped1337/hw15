public class WeeklyAdviser implements Adviser {

    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада: Будьте продуктивними на роботі!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендуємо відвідати: парк, музей, або кав'ярню!");
                break;

        }

    }

}