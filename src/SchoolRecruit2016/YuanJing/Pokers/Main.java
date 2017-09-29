package SchoolRecruit2016.YuanJing.Pokers;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] pokerList = str.split("-");
            String player1 = pokerList[0];
            String player2 = pokerList[1];
            String[] firstPokers = player1.split(" ");
            String[] secondPokers = player2.split(" ");
            if (judgeJokersPair(firstPokers) || judgeJokersPair(secondPokers)) {
                System.out.print("joker JOKER");
            } else if (judgeBomb(secondPokers) != 0 || judgeBomb(firstPokers) != 0) {
                String[] result = judgeBomb(secondPokers) > judgeBomb(firstPokers) ? secondPokers : firstPokers;
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                    if (i != result.length - 1) {
                        System.out.print(" ");
                    }
                }
            } else if (judgeSingle(firstPokers) != 0 && judgeSingle(secondPokers) != 0) {
                String[] result = judgeSingle(secondPokers) > judgeSingle(firstPokers) ? secondPokers : firstPokers;
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                    if (i != result.length - 1) {
                        System.out.print(" ");
                    }
                }

            } else if (judgePair(firstPokers) != 0 && judgePair(secondPokers) != 0) {
                String[] result = judgePair(secondPokers) > judgePair(firstPokers) ? secondPokers : firstPokers;
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                    if (i != result.length - 1) {
                        System.out.print(" ");
                    }
                }
            } else if (judgeTriple(firstPokers) != 0 && judgeTriple(secondPokers) != 0) {
                String[] result = judgeTriple(secondPokers) > judgeTriple(firstPokers) ? secondPokers : firstPokers;
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                    if (i != result.length - 1) {
                        System.out.print(" ");
                    }
                }
            } else if (judgeArray(firstPokers) != 0 && judgeArray(secondPokers) != 0) {
                String[] result = judgeArray(secondPokers) > judgeArray(firstPokers) ? secondPokers : firstPokers;
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                    if (i != result.length - 1) {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.print("ERROR");
            }
            System.out.println();
        }
    }

    private static boolean judgeJokersPair(String str[]) {
        if (str.length == 2 && str[1].toLowerCase().equals("joker") && str[0].toLowerCase().equals("joker")) {
            return true;
        }
        return false;
    }

    private static int judgeBomb(String str[]) {
        if (str.length == 4) {
            for (int i = 1; i < 4; i++) {
                if (!str[i].equals(str[0])) {
                    break;
                }
                if (i == 3) {
                    int[] temp = transformInt(str);
                    return temp[0];

                }
            }
        }
        return 0;
    }

    private static int judgeSingle(String str[]) {
        if (str.length == 1) {
            int[] temp = transformInt(str);
            return temp[0];

        }
        return 0;
    }

    private static int judgePair(String str[]) {
        if (str.length == 2) {
            if (str[0].equals(str[1])) {
                int[] temp = transformInt(str);
                return temp[0];

            }
        }
        return 0;
    }

    private static int judgeTriple(String str[]) {
        if (str.length == 3) {
            if (str[0].equals(str[1]) && str[0].equals(str[2])) {
                int[] temp = transformInt(str);
                return temp[0];

            }
        }
        return 0;
    }

    private static int judgeArray(String str[]) {
        if (str.length == 5) {
            for (int i = 0; i < 4; i++) {
                if (Integer.valueOf(str[i]) + 1 != Integer.valueOf(str[i + 1])) {
                    break;
                }
                if (i == 3) {
                    int[] temp = transformInt(str);

                    if (temp[0] >= 3 && temp[0] <= 10)
                        return temp[0];
                }
            }
        }
        return 0;
    }

    private static int[] transformInt(String[] str) {
        int[] temp = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("J")) {
                temp[i] = 11;
            } else if (str[i].equals("Q")) {
                temp[i] = 12;
            } else if (str[i].equals("K")) {
                temp[i] = 13;
            } else if (str[i].equals("A")) {
                temp[i] = 14;
            } else if (str[0].equals("2")) {
                temp[i] = 15;
            } else {
                temp[i] = Integer.valueOf(str[i]);
            }
        }
        return temp;
    }
}
