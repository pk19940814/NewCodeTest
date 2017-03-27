package SwordToOffer.ExchangeWithoutTemp;

/**
 * Created by apple on 2017/3/26.
 */
public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]=AB[0]^AB[1];
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return AB;
    }
}
