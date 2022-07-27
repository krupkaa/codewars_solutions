public class QuarterOfTheYear {
    public static void main(String[] args) {
        System.out.println(quarterOf(5));
        System.out.println(quarterOf(7));
        System.out.println(quarterOf(1));
    }
    public static int quarterOf(int month) {
        int quater = 0;
        switch (month) {
            case 1:
            case 2:
            case 3:
                quater = 1;
                break;
            case 4:
            case 5:
            case 6:
                quater = 2;
                break;
            case 7:
            case 8:
            case 9:
                quater = 3;
                break;
            case 10:
            case 11:
            case 12:
                quater = 4;
                break;
        }
        return quater;

    }
}