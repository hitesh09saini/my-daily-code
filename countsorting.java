public class countsorting {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 3, 5 };
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            large = Math.max(large, a[i]);

        }

        int count[] = new int[large + 1];

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;

        }
        // for (int i = 0; i < count.length; i++) {
        //     System.out.print(count[i] + " ");
        // }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j++;

                count[i]--;
            }
        }
        System.out.println("\n\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }

    }
}
