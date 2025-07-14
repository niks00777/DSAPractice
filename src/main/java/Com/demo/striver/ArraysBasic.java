package Com.demo.striver;

import java.util.HashSet;
import java.util.Set;

public class ArraysBasic {

    public static void main(String[] args) {
        //largest element in an array

        int[] arr = {1, 5, 0, 6, 0, 7, 0, 2};

        /*
        //largest element in an array
        //brute force (Sort the arrays and give n-1 element)
        //optimal O(n)

        int largest=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        System.out.println(largest);*/

        /*//second largest element in an array

        //brute force - Sort the array and traverse from last for the second largest element with n-1 element N log N+N

        //better - first find largest and then traverse again to find second largest-O(2N)

        //optimal-O(N)

        int largest=arr[0];
        int sLargest=-1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            } else if (arr[i]>sLargest && arr[i]!=largest) {
                sLargest=arr[i];
            }
        }

        System.out.println(sLargest);
*/

        /*//second smallest element
        int smallest=arr[0];
        int sSmallest=Integer.MAX_VALUE;

        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<sSmallest && arr[i]!=smallest){
                sSmallest=arr[i];
            }
        }

        System.out.println(sSmallest);*/

       /* //check if array is sorted

        for(int i=1;i<=arr.length-1;i++){
            if(arr[i-1]>arr[i]){
                System.out.println("Array is not sorted");
                break;
            }
        }*/

        /*//remove duplicates from an array
        //brute force N log N+N

        Set<Integer> s= new HashSet<>();

        for (int i = 0; i <arr.length-1 ; i++) {
            s.add((Integer) arr[i]);
        }

        System.out.println(s.size());

        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        System.out.println("Count="+(i+1));

*/
        //int[] arr1 = {1, 2, 3, 4};



        /*//left rotate an array
        for(int j=0;j<2;j++) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
        }
        for (int a:
             arr) {
            System.out.println(a);
        }
*/

        /*//reverse an array

        int left=0;
        int right= 1;


        while(left <=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }

        for (int a:
                arr) {
            System.out.println(a);
        }

*/
        /*//left rotate an array by d places
        //arr={1,5,6,7,2} d=2
        //reverse first d elements in an array----arr={5,1,|6,7,2}
        //then reverse the remaining array-----arr={5,1,|2,7,6}
        //then reverse the whole array------arr={6,7,2,1,5}

        int d=2;

        int n=arr.length;
        d= d%n;


        reverseArray(0,d-1,arr);
        reverseArray(d,n-1,arr);
        reverseArray(0,n-1,arr);

        for (int a:
                arr) {
            System.out.println(a);
        }
        public static int[] reverseArray(int left,int right,int[] arr){
        while(left <=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    return arr;
    }
        */


        //move all non zero elements to left
        //optimal O(N)
        //using two pointers
        int i = -1;
        //this iteration is finding the first zeroth element
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] == 0) {
                i = j;
                break;
            }
        }
        //starting the iteration from first zero to end
        for (int j = i; j <= arr.length - 1; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[i] = temp;
                arr[j] = 0;
                i++;
            }
        }
        for (int a :
                arr) {
            System.out.println(a);
        }
    }
}