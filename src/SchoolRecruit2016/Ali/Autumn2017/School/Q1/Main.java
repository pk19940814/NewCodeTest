package SchoolRecruit2016.Ali.Autumn2017.School.Q1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    private static int process() {
        return boxMinNum;
    }

    private static Model boxTemplate = new Model();
    private static Integer boxMinNum;
    private static Integer CUSTOMS_LIMIT_MONEY_PER_BOX = 2000;
    private static Model[] items;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()) {
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            items = new Model[itemNum];
            for (int i = 0; i < itemNum; i++) {
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            boxMinNum = Integer.MAX_VALUE;
            System.out.println(process());

        }
    }

}

class Model {
    public Integer length;
    public Integer width;
    public Integer height;
    public Integer price;

    public Model() {
    }
}
