import java.io.*;
import java.util.*;

class Result {

    static int month, day, year, dy;
    static String days[] = { " ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    public static String dayInString(int dy) {
        String we = "sunday";

        for (int i = 1; i < days.length; i++) {
            if (i == dy) {
                we = days[i];
            }
        }

        return we;
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance(Locale.US);

        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);

        dy = calendar.get(Calendar.DAY_OF_WEEK);

        return dayInString(dy);

    }

}

public class calendr {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
