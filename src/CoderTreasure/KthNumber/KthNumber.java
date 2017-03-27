package CoderTreasure.KthNumber;

/**
 * Created by apple on 2017/3/25.
 */
public class KthNumber {
    public int findKth(int k) {
        // write code here
        if (k<1)return 0;
        if (k==1) return 3;
        if (k==2) return 5;
        if (k==3) return 7;

        int[] numbers=new int[k+1];
        numbers[0]=3;numbers[1]=5;numbers[2]=7;


        for (int i=3;i<k;i++){
            int min=0,temp=0,min3=0,min5=0,min7=0;

            for (int j=0;j<i;j++){
                temp=numbers[j]*3;
                if (temp>numbers[i-1]){
                    min3=temp;
                    break;
                }
            }
            for (int j=0;j<i;j++){
                temp=numbers[j]*5;
                if (temp>numbers[i-1]){
                    min5=temp;
                    break;
                }
            }

            for (int j=0;j<i;j++){
                temp=numbers[j]*7;
                if (temp>numbers[i-1]){
                    min7=temp;
                    break;
                }
            }

            min=min3>min7?min7:min3;
            min=min>min5?min5:min;

            numbers[i]=min;

        }


        return numbers[k-1];
    }
}
