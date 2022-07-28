public class DoIGetBonus {
    
    public static String bonusTime(final int salary, final boolean bonus) {
        if(bonus == true) {
            int newSal = salary * 10;
            return "\u00A3" + newSal;
        }

        return "\u00A3" + salary;
    }
}
