package N38;

import java.util.ArrayList;

/**
 * Created by terence on 1/19/17.
 */

public class Solution {
    public static void main(String []args){
        int a=6;
        new Solution().countAndSay(a);

    }
    public class Key{
        private final int x;
        private final int y;

        public Key(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (!(o instanceof Key)) return false;
            Key key = (Key) o;
            return x == key.x && y == key.y;
        }
        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return  this.y;
        }
    }
    public String countAndSay(int n) {
        String result="1";
        if(n==1) return result;
        for (int i = 1; i < n; i++) {
            ArrayList<Key> a =new ArrayList<>();
            int previous=result.charAt(0)-'0';
            int count=1;
            for (int j = 1; j < result.length(); j++) {
                int jj=result.charAt(j)-'0';
                if(jj==previous){
                    count++;
                }else{
                    a.add(new Key(count,previous));
                    previous=jj;
                    count=1;
                }
            }
            a.add(new Key(count,previous));
            result="";
            for (int j = 0; j < a.size(); j++) {
                result+=Integer.toString(a.get(j).getX())+Integer.toString(a.get(j).getY());
            }
            System.out.println(result);
        }
        return result;

    }
}
