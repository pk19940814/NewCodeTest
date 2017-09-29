package SchoolRecruit2016.CreditCard51.SortString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] lowarray = new int[26];
        int[] uparray = new int[26];
        while (in.hasNext()) {
            String str = in.next();
            StringBuilder alphabet = new StringBuilder();
            StringBuilder characters = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                Character c = str.charAt(i);
                if (c <= 'z' && c >= 'a') {
                    int index = c - 'a';
                    lowarray[index]++;
                } else if (c <= 'Z' && c >= 'A') {
                    int index = c - 'A';
                    uparray[index]++;
                } else {
                    characters.append(c);
                }
            }
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < lowarray[i]; j++) {
                    alphabet.append((char) ('a' + i));
                }
                for (int j = 0; j < uparray[i]; j++) {
                    alphabet.append((char) ('A' + i));
                }
            }

            System.out.println(alphabet.append(characters));
        }
    }
}
