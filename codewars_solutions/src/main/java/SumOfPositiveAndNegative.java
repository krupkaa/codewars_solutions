public class SumOfPositiveAndNegative {
    public static int[] countPositivesSumNegatives(int[] input) {
        if(input.length == 0 || input == null) {
            return new int[] {};

        } else {
            int sumPositive = 0;
            int sumNegative = 0;
            for (int i : input ) {
                if(i > 0) {
                    sumPositive++;
                } else {
                    sumNegative += i;
                }
            }
            return new int[] {sumPositive, sumNegative};
        }
    }
}
