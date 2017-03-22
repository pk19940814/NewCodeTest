package SwordToOffer.Power;

/**
 * Created by apple on 2017/3/17.
 */
public class Solution {
    public double Power(double base, int exponent) {
    double result=1;
    boolean flag=false;

    if(exponent<0){
        exponent=-exponent;
        flag=true;
    }
    while (exponent!=0){
        result*=base;
        exponent--;
    }
    if(flag) result=1.0/result;
    return  result;
    }
}
