package SchoolRecruit2016.NetEase.TheWordYiLiked;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            try {
                checkUpperCase(word);

                System.out.println("Likes");
            } catch (Exception e) {
                System.out.println("Dislikes");
            }
        }
    }


    private static void checkUpperCase(String str) throws Exception {
        if (str == null || str.equals("")) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c < 'A' || c > 'Z') {
                throw new Exception("");
            }
            if (i > 0) {
                if (c == str.charAt(i - 1)) {
                    throw new Exception("");
                }
            }
        }

    }
}
