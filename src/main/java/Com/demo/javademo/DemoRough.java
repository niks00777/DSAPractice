package Com.demo.javademo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoRough {
    public static void main(String[] args) {

         int[] arr = {1,2,2,3,4,5,5,6,7};


        int arri=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arri ){
                arri=arr[i];
                System.out.println("arri"+arri+" ");
            }else{
                System.out.println("array is not sorted");
                break;
            }
        }


       /*
       //second largest element without sorting

       int f=arr[0],s=-1;
        for(int i=1;i<arr.length;i++){
            if (arr[i]>f){
                s=f;
                f=arr[i];

            }else if(arr[i]>s){
                s=arr[i];
            }
        }
        System.out.println("First:"+f);
        System.out.println("Second:"+s);*/


        //System.out.println(subsets(arr));

        // System.out.println(findRangeXOR(1,3));

        //  List<Integer> s = new ArrayList<>();

    }



    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n;
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i <= subsets - 1; i++) {
            List<Integer> l1 = new ArrayList<>();
            for (int j = 0; j <= n - 1; j++) {
                if ((i & (1 << j)) != 0) {
                    l1.add(nums[j]);
                }
            }
            l.add(l1);
        }
        return l;


    }

    /*public static int findRangeXOR(int l, int r) {
        int ans=0;
        for(int i=l;i<=r;i++){
            ans=ans^i;
        }
        return ans;
    }*/

    //public static int[]

}
//===============================================================================================
//check if ith bit is set or not
        /*
        int n= 16, bit=1;

        int c=1<<bit;
        System.out.println("c="+c);
        if((n&(1<<bit))==0){
            System.out.println("Bit is not set");
        }else System.out.println("Bit is set");*/
//===============================================================================================

// set the ith bit
        /*
        int n= 8, bit=1;
        n=n|(1<<bit);
        System.out.println("Ith bit is set:"+n);
        */
//===============================================================================================
//clear the ith bit
        /*int n= 16, bit=4;
        n=~n;
        n=n|1<<bit;
        n=~n;
        System.out.println("Ith bit is cleared:"+n);*/
//===============================================================================================
//toggle the ith bit
        /*int n= 7, bit=1;
        n=n^1<<bit;
        System.out.println("Ith bit is toggled:"+n);
        */
//===============================================================================================
//remove the last set bit(rightmost)
        /*int n= 12;
        n=n&n-1;
        System.out.println("Last set bit is removed:"+n);*/
//===============================================================================================
//count the no of set bits
        /*int n=15,count =0;
        while(n>0){
            if((n&1)==1){
                count+=1;
            }
            n=n>>1;
        }
        System.out.println("no of set bits are:"+count);*/
//===============================================================================================
//check if no is power of 2 or not
        /*int n= 31;
        if((n&n-1)==0){
            System.out.println("no:"+n+" is power of 2");
        }else System.out.println("no:"+n+" is not a power of 2");*/
//===============================================================================================


   /* public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        // for(int i=0;i<=n;i++){
        // ans[i]=Integer.bitCount(i);
        // }
        ans[0]=0;
        helper(ans,1,1);
        return ans;}
    public static void helper(int[] ans, int bit, int i){
        if(i>=ans.length)
            return;
        ans[i]=bit;
        helper(ans, bit, i*2);
        helper(ans, bit+1, i*2+1);
    }*/

    /*public static int singleNumber(int[] nums) {
        int num=nums.length-1;
        for(int i=0;i<0;i++){
            System.out.println("1:"+nums[i]+"2:"+nums[i-1]);
            num=num^nums[i];
        }
        System.out.println("num"+num);
        return num;
    }
*/
    /*public static int[] countBits(int n) {
        int[] arr= new int [n+1];
        arr[0]=0;
        int i=1;
        while(i>0 && i<n+1){
            int a=i;
            while(a>0){
                if((a&1)==1){
                    arr[i]+=1;
                }
                a=a>>1;
            }

            i++;
        }


        return arr;
    }*/

