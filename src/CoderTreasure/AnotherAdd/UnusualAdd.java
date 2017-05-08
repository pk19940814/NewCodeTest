package CoderTreasure.AnotherAdd;

/**
 * Created by apple on 2017/4/3.
 */
public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        int jw=A&B;
        int jg=A^B;
        while (jw!=0){
            int tw=jw<<1;
            int tg=jg;
            jw=tw&tg;
            jg=tw^tg;

        }
        return jg;

    }
}