import java.util.Scanner;

public class twicnumberinarray {
    public static boolean checktwice(int a[]) {
        boolean b=true ;
        for(int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
              
            if(!(a[i]==a[j]))b=false;
            ;
        }
        
        return b;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        
        System.out.println(checktwice(nums));
  }
}
