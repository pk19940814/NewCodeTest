package CoderTreasure.Render;

/**
 * Created by apple on 2017/3/25.
 */
import java.util.*;

public class Render {
    public int[] renderPixel(int[] screen, int x, int y) {
        // write code here

        int start=x/8;
        int end=y/8;
        if (start==end) {
            int num=(1<<(y%8+1))-(1<<(x%8));
            screen[start]=num|screen[start];
            return screen;
        }
        for (int i=start+1;i<end;i++)
            screen[i]=255;
        screen[start]=(256-(1<<(x%8)))|screen[start];
        screen[end]=((1<<(y%8+1))-1)|screen[end];



        return screen;
    }
}
