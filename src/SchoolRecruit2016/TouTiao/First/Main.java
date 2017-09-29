package SchoolRecruit2016.TouTiao.First;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int max_x_index = 0;
            int max_y_index = 0;
            List<Point> list = new ArrayList<>();
            List<Point> finalList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Point point = new Point();
                point.x = in.nextInt();

                point.y = in.nextInt();
                if (list.size() > 0) {
                    if (point.y > list.get(max_y_index).y) {
                        max_y_index = i;
                    }
                    if (point.x > list.get(max_x_index).x) {
                        max_x_index = i;
                    }
                }
                list.add(point);
            }
            if (max_x_index == max_y_index) {
                Point point = new Point(list.get(max_x_index).x, list.get(max_x_index).y);
                finalList.add(point);
            } else {
                Point A = list.get(max_x_index);
                Point B = list.get(max_y_index);
                double k = (B.y - A.y) / (B.x - A.x);
                list.forEach(p -> {
                    if (!(p.y + k * (p.x - B.x) < B.y)) {
                        finalList.add(p);
                    }
                });
                for (int i = 0; i < finalList.size() - 1; ) {
                    int j = i + 1;
                    for (; j < finalList.size(); j++) {
                        Point p1 = finalList.get(i);
                        Point p2 = finalList.get(j);
                        if (p1.x < p2.x && p1.y < p2.y) {
                            finalList.remove(i);
                            j--;
                            break;
                        }

                    }
                    if (j >= finalList.size() - 1) {
                        i++;
                    }
                }
            }

            finalList.forEach(p -> {
                System.out.println(p.x + " " + p.y);
            });
        }
    }

    static class Point {
        public int x;
        public int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
