package N42;

/**
 * Created by terence on 1/20/17.
 */
public class Solution {
    public static void main(String[] args){
        int []a={2,0,2};
        System.out.print(new Solution().trap(a));
    }
    public int total=0;
    public int min(int[] height){
        int result=999999;
        for(int i=0;i<height.length;i++){
            if(height[i]<result && height[i]>0)
                result=height[i];
        }
        return result;
    }
    public int sum(int[] height){
        int result=0;
        for(int i=0;i<height.length;i++){
            result+=height[i];
        }
        return result;
    }
    public void solver(int[] height,int min){
        int start=0;
        int end=height.length-1;
        if (sum(height)==0) return;

        while(height[start]==0) start++;
        while(height[end]==0) end--;
        // for(int i=0;i<height.length;i++){
        // 	System.out.print(height[i]+" ");
        // }
        // System.out.println();
        total+=(end-start+1)*min;
        if(end==start) return;
        for (int i=0;i<height.length; i++) {
            if(height[i]==0) {continue;}
            height[i]-=min;
        }
        if (sum(height)==0) return;

        int minm=min(height);
        solver(height,minm);
    }

    public int trap(int[] height){
        int sums=sum(height);
        if(sums==0) return 0;
        int start=0;
        int end=height.length-1;
        while(end>=start){
            int shortest=Math.min(height[end],height[start]);
            if(height[end]>height[start]) {
                while (start<=end&&shortest>=height[start]){
                    total+=shortest;
                    start++;
                }

            }else {
                while (start<=end&&shortest>=height[end]){
                    total+=shortest;
                    end--;
                }
            }
        }
        return total-sums;
    }
}
