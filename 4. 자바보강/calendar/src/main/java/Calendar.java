
    import java.text.DecimalFormat;
    import java.time.LocalDate;
    import java.time.temporal.ChronoField;
    import java.util.Scanner;


    public class Calendar {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("년도를 입력하세요:");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("월을 입력하세요: ");
            int month = Integer.parseInt(sc.nextLine());

            String[] days = {"월","화","수", "목", "금", "토", "일"};

            LocalDate startDate = LocalDate.of(year, month, 1);
            LocalDate endDate = startDate.plusMonths(1).minusDays(1);

            int sDay = startDate.getDayOfMonth();
            int eDay = endDate.getDayOfMonth();
            int startPos = startDate.get(ChronoField.DAY_OF_WEEK) - 1;

            DecimalFormat df = new DecimalFormat("00");

            System.out.printf("%d년 %d월%n", year, month);
            for (String day : days) {
                System.out.print(day + "  ");
            }
            System.out.println();
            for (int i = 1; i <= eDay + startPos ; i++) {
                if (i > startPos) {
                    System.out.print(df.format(i - startPos));
                } else {
                    System.out.print("    ");
                }
                System.out.print("  ");
                if (i % 7 == 0)
                    System.out.println();
            }
        }
    }

