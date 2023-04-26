

public class graph {
    public static void main(String[] args) {
        int a[] = { 5, 3, 1, 3, 7, 1, 4,8 };
        int max = 0;
            System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
            System.out.print(" "+a[i]+" ");
        }System.out.print("]\n\n\n");
        int price = max + 5;
        int time = a.length+2;
       
        
       
        for (int i = price; i >= 0; i--) {
           int k =0;
           
            for (int j = 0; j <=time; j++) {
                // condition
               
                if (j==k+1&&j>0&&j<=a.length&& i == a[k]) {
                    System.out.print(" * ");
                 
                }else
                if (i > 0 && j > 0) {
                    System.out.print("   ");
                }

                
               
                // graph border lines
                if (j == 0) {

                    System.out.printf("%02d%s", i, "|");

                }

                if (i == 0) {

                    System.out.printf("%02d%s", (j + 1), "|");
                }
             
            }

            System.out.println();
            if ( k < a.length) {
                k++;
               }
            // 
        }

    }

   
}
