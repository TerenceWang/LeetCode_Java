package N55;

/**
 * Created by terence on 1/19/17.
 */
public class N55 {
    public static void main(String [] args){
        int []a={3,2,1,0,4};
        System.out.println(new N55().canJump(a));
    }

    public boolean canJump(int[] nums) {
        int pos=0;
        for (int i = 0; i < nums.length; i++) {
            if(pos>=i)
                pos=Math.max(pos,i+nums[i]);
        }
        return pos>=nums.length-1;
    }
}
