package SchoolRecruit2016.NetEase.Clock;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                Set<String> map = new HashSet<>();
                String time = in.next();
                String[] list = time.split(":");
                Integer hour = Integer.valueOf(list[0]);
                Integer minute = Integer.valueOf(list[1]);
                Integer second = Integer.valueOf(list[2]);
                String hourStr = "";
                String minStr = "";
                String secStr = "";
                if (hour >= 24) {
                    hour = 10 + hour % 10;
                }
                hourStr = String.valueOf(hour);
                if (minute >= 60) {
                    minute = minute % 10;
                }
                minStr = String.valueOf(minute);
                if (minStr.length() < 2) {
                    minStr = "0" + minStr;
                }
                if (second >= 60) {
                    second = second % 10;
                }
                secStr = String.valueOf(second);
                if (secStr.length() < 2) {
                    secStr = "0" + secStr;
                }
                System.out.println(hourStr + ":" + minStr + ":" + secStr);
            }
        }
    }
}
