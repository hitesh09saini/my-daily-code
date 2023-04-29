public class gfg {
   
    public static void main(String[] args) {
        long N =  5601792144l;
        //int n = (int) N;
         int  a[]= {9,1,3,5,7};
             long ans =0, i=1;
             while(N>0){
                 long in = N%5;
                 ans = a[(int)in]*i+ans;
                 
                 if(N%5==0){
                    N=N/5-1;
                     
                 }else{

                     N = N/5;
                  
                 } i = i*10;
             }
         
         System.out.println(ans);       
    }

   
}
