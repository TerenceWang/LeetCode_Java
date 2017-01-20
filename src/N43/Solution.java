package N43;

import java.util.ArrayList;

/**
 * Created by terence on 1/20/17.
 */
public class Solution {
    public static void main(String[] args){
        String a="1";
        String b="1";
        new Solution().multiply(a,b);
    }
    public String multiply(String num1, String num2) {
        int s1=num1.length();
        int s2=num2.length();
        int k=s1+s2-2;
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < s1+s2; i++) {
            temp.add(0);
        }
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                temp.set(k-i-j,temp.get(k-i-j)+(num1.charAt(i)-'0')*(num2.charAt(j)-'0'));
            }
        }
        int carrybit=0;
        for (int i = 0; i < s1+s2; i++) {
            int a=temp.get(i)+carrybit;
            temp.set(i,a%10);
            carrybit=a/10;
        }
        int i=k+1;
        while(i>=0&&temp.get(i)==0) i--;
        if(i<0) return "0";
        String result="";
//        for (int j = temp.size()-1; j >-1 ; j--) {
//            System.out.println(temp.get(j));
//        }
        for (;i>-1;i--){
            result+=Integer.toString(temp.get(i));
        }

        return result;
    }
}