package Lec14;
import java.util.*;
public class Trapping_Rain_water {
    public static int trap(int[] height) {
    
    int n= height.length;
        
     int left[]=new int [n];
     int right[]=new int[n];
        
     left[0]=height[0];
    
    for(int i=1; i<n;i++){
        
        left[i]= Math.max(left[i-1], height[i]);
    }
        
    right[n-1]= height[n-1];
        
    for(int i=n-2;i>=0;i--){
        
        right[i]= Math.max(right[i+1], height[i]);
    }
    
    int sum=0;
        
     for(int i=0; i<n;i++){
         
        int currwater= Math.min(left[i], right[i])-height[i];
         sum+=currwater;
     }
    return sum;   
    }
    public static void main(String []args) {
   Scanner s=new Scanner(System.in)	;
   int n=s.nextInt();
   int []arr=new int[n];
   for(int i=0;i<arr.length;i++) {
	   arr[i]=s.nextInt();
   }
   System.out.println(trap(arr));
    }
    
}
