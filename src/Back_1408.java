import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currentTime = br.readLine();
        String[] currentTimeArr = currentTime.split(":");
        int currentHour = Integer.parseInt(currentTimeArr[0]);
        int currentMinute = Integer.parseInt(currentTimeArr[1]);
        int currentSecond = Integer.parseInt(currentTimeArr[2]);

        String startTime = br.readLine();
        String[] startTimeArr = startTime.split(":");
        int startHour = Integer.parseInt(startTimeArr[0]);
        int startMinute = Integer.parseInt(startTimeArr[1]);
        int startSecond = Integer.parseInt(startTimeArr[2]);

        int currentTotalSecond = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int startTotalSecond = startHour * 3600 + startMinute * 60 + startSecond;

        System.out.println(getTime(startTotalSecond - currentTotalSecond));

    }

    private static String getTime(int i) {
        int hour = i / 3600;
        int minute = (i % 3600) / 60;
        int second = i % 60;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
