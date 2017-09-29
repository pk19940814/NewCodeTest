package SchoolRecruit2016.NetEase.TheWordYiLiked;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            boolean flag = true;
            if (!word.equals(word.toUpperCase())) {
                flag = false;
            }
            if (flag && true) {
                //TODO
            }
            if (flag && true) {
                //TODO
            }
            if (flag) {
                System.out.println("Likes");
            } else {
                System.out.println("DisLikes");
            }
        }
    }
}
