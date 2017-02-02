package N67;

import java.util.Stack;

/**
 * Created by terence on 2/2/17.
 */
public class Solution {
    public String strReverseWithReverseLoop(String string){
        if(string.length()==0)return string;
        StringBuilder sb = new StringBuilder();
        for(int i = string.length()-1;i>=0;i--){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
    public String addBinary(String a, String b) {
        Stack<Integer> res = new Stack<>();
        if(a.length()<b.length()){
            String t = a;
            a=b;
            b=t;
        }
        a=strReverseWithReverseLoop(a);
        b=strReverseWithReverseLoop(b);
        int addingup=0;
        for (int i = 0; i < b.length(); i++) {
            int r =a.charAt(i)-'0'+b.charAt(i)-'0'+addingup;
            if(r<2) {
                res.push(r);
                addingup=0;
            }
            else {
                res.push(r%2);
                addingup=1;
            }
        }
        for (int i = b.length(); i < a.length(); i++) {
            int r = a.charAt(i)-'0'+addingup;
            if(r<2) {
                res.push(r);
                addingup=0;
            }
            else {
                res.push(r%2);
                addingup=1;
            }
        }
        if(addingup==1){
            res.push(1);
        }
        String result="";
        while(!res.empty()){
            result=result+Integer.toString(res.pop());
        }
//        for (int i = 0; i < res.size(); i++) {
//            System.out.print(res.peek());
//            result=result+Integer.toString(res.pop());
//        }
        return result;
    }
}
