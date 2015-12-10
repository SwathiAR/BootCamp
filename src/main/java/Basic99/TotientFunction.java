package Basic99;

/**
 * Created by root on 12/9/15.
 *

 Calculate Euler’s totient function phi(m).

 Euler’s so-called totient function phi(m) is defined as the number of positive integers r (1 <= r < m) that are coprime to m.

 For example: m = 10: r = 1,3,7,9; thus phi(m) = 4. Note the special case: phi(1) = 1.
 5.4.1 Example

 1:  System.out.println(phi(10));
 2:   *** Output ***
 3:  4


 */
public class TotientFunction {
    public int phi(int m){
        int num = m;
        int count = 0;

        for(int i = 1 ; i<num ;i++){
            int iOrigin = i;
            while(m>0 && i>0) {
                if (m > i) {
                    m = m - i;
                } else   {
                    i = i - m;
                }

            }

            if((m==0)&&(i==1) || (m==1)&&(i==0)){
                count++;
            }

            m= num;
            i = iOrigin;
        }

     return  count;
    }
}
