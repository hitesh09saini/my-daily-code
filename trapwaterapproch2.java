public class trapwaterapproch2 {
   public static int trap(int a[]) {
    
    int rs =0,l=0,r=a.length-1;
    int lmax = a[0],rmax = a[r];
    while(l<r){
    if(lmax>rmax){
        r--;
        rmax = Math.max(lmax, a[r]);
        rs+=rmax-a[r];

    }else{
        l++;
        lmax = Math.max(lmax, a[l]);
        rs+=lmax-a[l];
    }
    
   }
   return rs;

}
    public static void main(String[] args) {
        int a[]={4,2,0,3,2,5};
        System.out.println(trap(a));
    }
}
