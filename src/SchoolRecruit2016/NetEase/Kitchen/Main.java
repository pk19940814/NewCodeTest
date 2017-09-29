package SchoolRecruit2016.NetEase.Kitchen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (in.hasNext()) {
            String resource = in.nextLine();
            String temp =resource;
            while (temp.indexOf(' ')!=-1){
                int index=temp.indexOf(' ');
                String target=temp.substring(0,index);
                temp=temp.substring(index+1);
                set.add(target);
            }
            set.add(temp);
        }
        System.out.println(set.size());
    }
}
