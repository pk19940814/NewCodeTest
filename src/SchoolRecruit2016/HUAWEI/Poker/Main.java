package SchoolRecruit2016.HUAWEI.Poker;

import java.util.Scanner;

public class Main {
    private static String pokers1="";
    private static String polers2="";
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String temp =in.nextLine();
            int index = temp.indexOf("-");
            pokers1=temp.substring(0,index);
            polers2=temp.substring(index+2);

        }
    }
}
