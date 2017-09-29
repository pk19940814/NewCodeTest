package SchoolRecruit2016.XIAOMI.SeparatedPhoneNum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                String temp = in.next();
                Map<Character, Integer> map = translateIntoNum(temp);
                for (Map.Entry<Character, Integer> t : map.entrySet()) {
                    for (int j = 0; j < t.getValue(); j++) {

                        System.out.print(t.getKey());
                    }
                }
                System.out.println();
            }
        }
    }

    private static Map<Character, Integer> translateIntoNum(String temp) {
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> numMap = new TreeMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            charMap.put(i, 0);
        }
        for (char i = '0'; i <= '9'; i++) {
            numMap.put(i, 0);
        }

        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            charMap.put(c, charMap.get(c) + 1);
        }

        //6
        int six = charMap.get('X');
        charMap.put('X', 0);
        charMap.put('S', charMap.get('S') - six);
        charMap.put('I', charMap.get('I') - six);
        numMap.put('8', numMap.get('8') + six);

        //0
        int zero = charMap.get('Z');
        charMap.put('Z', 0);
        charMap.put('E', charMap.get('E') - zero);
        charMap.put('R', charMap.get('R') - zero);
        charMap.put('O', charMap.get('O') - zero);
        numMap.put('2', numMap.get('2') + zero);

        //8
        int eight = charMap.get('G');
        charMap.put('G', 0);
        charMap.put('E', charMap.get('E') - eight);
        charMap.put('I', charMap.get('I') - eight);
        charMap.put('H', charMap.get('H') - eight);
        charMap.put('T', charMap.get('T') - eight);
        numMap.put('0', numMap.get('0') + eight);

        //2
        int two = charMap.get('W');
        charMap.put('W', 0);
        charMap.put('T', charMap.get('T') - two);
        charMap.put('O', charMap.get('O') - two);
        numMap.put('4', numMap.get('4') + two);

        //3
        int three = charMap.get('H');
        charMap.put('H', 0);
        charMap.put('T', charMap.get('T') - three);
        charMap.put('R', charMap.get('R') - three);
        charMap.put('E', charMap.get('E') - three * 2);
        numMap.put('5', numMap.get('5') + three);

        //4
        int four = charMap.get('R');
        charMap.put('R', 0);
        charMap.put('O', charMap.get('O') - four);
        charMap.put('F', charMap.get('F') - four);
        charMap.put('U', charMap.get('U') - four);
        numMap.put('6', numMap.get('6') + four);

        //5
        int five = charMap.get('F');
        charMap.put('F', 0);
        charMap.put('I', charMap.get('I') - five);
        charMap.put('V', charMap.get('V') - five);
        charMap.put('E', charMap.get('E') - five);
        numMap.put('7', numMap.get('7') + five);

        //7
        int seven = charMap.get('V');
        charMap.put('V', 0);
        charMap.put('S', charMap.get('S') - seven);
        charMap.put('E', charMap.get('E') - seven * 2);
        charMap.put('N', charMap.get('N') - seven);
        numMap.put('9', numMap.get('9') + seven);

        //1
        int one = charMap.get('O');
        charMap.put('O', 0);
        charMap.put('N', charMap.get('N') - one);
        charMap.put('E', charMap.get('E') - one);
        numMap.put('3', numMap.get('3') + one);

        //9
        int nine = charMap.get('I');
        numMap.put('1', numMap.get('1') + nine);

        return numMap;
    }
}
