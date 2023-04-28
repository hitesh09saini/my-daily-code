public class pbubble {
    public static void bubble(int a[]) {
       
        for(int i =0;i<a.length-1;i++){   
            
            for(int j=0;j<a.length-1-i;j++){
               if(a[j]>a[j+1]){
                //swaping
                int t =a[j];
                a[j] = a[j+1];
                a[j+1]=t;
                 }
           
             }
         }
    }
    public static void selection(int a[]) {
        for(int i=0;i<a.length-1;i++){
            int min =i;
            for(int j =1+i;j<a.length-1;j++){

                if(a[min]>a[j]){
                    //swap
                  min =j;
              
                }
            }
            // swap
            int t=a[min];
            a[min]=a[i];
            a[i]=t;

        }
    }




    public static void inserstion(int a[]) {
        
       for(int i  =1;i<a.length;i++){
          int cur =a[i];
          int pre = i-1;
          while(pre>=0&&a[pre]<cur){
            a[pre+1]=a[pre];
            
            pre--;
          }
          a[pre+1]=cur;
        
       }
    }
    public static void main(String[] args) {
        int a[]={2,1,4,3,5};
        inserstion(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
