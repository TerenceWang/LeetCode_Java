package N71;

import java.util.ArrayList;

/**
 * Created by terence on 2/3/17.
 */
public class Solution {
    public static void main(String[] args){
        String a="/a/./b/../../c/";
        System.out.println(new Solution().simplifyPath(a));
    }
    public String simplifyPath(String path) {
        ArrayList<String> res=new ArrayList<>();
        String[] strs=path.split("/");
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].equals("")) continue;
            else if(strs[i].equals(".")) continue;
            else if(strs[i].equals("..")){
                if(res.size()==0) continue;
                else res.remove(res.size()-1);
            }else{
                res.add(strs[i]);
            }
        }
        String result="/";
        for (int i = 0; i < res.size()-1; i++) {
            result+=res.get(i)+"/";
        }
        if(res.size()>0){
            result+=res.get(res.size()-1);
        }
        return result;
    }
}
