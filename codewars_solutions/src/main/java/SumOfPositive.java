public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{3,4,-1,2,-5}));
        System.out.println(sum(new int[]{2,4,1,-3,-8,0,4}));

    }

    public static int sum(int[] arr){
        int sum = 0;
        if(arr.length == 0) {
            return 0;
        } else {
            for (int j : arr) {
                if (j > 0) {
                    sum += j;
                }
            }
            return sum;
        }

    }

}
