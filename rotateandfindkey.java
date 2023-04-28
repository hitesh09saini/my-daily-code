import java.util.Arrays;

public class rotateandfindkey {
    public static int output(int a[],int k) {
        int s=0;
        int n= a.length;
        int e = n ;
        Arrays.sort(a);
        rotate(a);
        // rotate array
        for(int i=0;i<e;i++){
            System.out.print(a[i]+" ");
        }System.out.println();
       
        int mid =0;
        while(s<e){
         mid = (s+e)/2;
         
        if(a[mid]>k){
          e = mid-1;
        }else if(a[mid]==k){
           return mid;
        }else{
           s= mid+1;
        }
         
        }
        return mid;
    }
    public static int[] rotate(int a[]) {
        int e =a.length-1;
        int m = (a.length)/2;
        int s=0;
        for(int i =m;i<=e;i++){
            //swaping
            int t = a[i];
            a[i]=a[s];
            a[s]=t;
            s++;

        }
        return a;

    }
    public static void main(String[] args) {
        int a[]={0,1,2,3,4,5};
        int k = 4;
        System.out.println(output(a, k));
       }
}

