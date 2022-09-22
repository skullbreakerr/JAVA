
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class cal_sol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Date(dd)/Month(mm)/Year(yyyy) : ");
        int date = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        show_cal(date, month, year);
        in.close();
    }

    public static void show_cal(int date, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.YEAR, year);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

        System.out.println(dayOfWeek);
    }

}