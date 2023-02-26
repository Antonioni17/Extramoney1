public class Main {
    public static void main(String[] args) {
        int recentAmount = 100;
        int payment = 2100;
        int bonus = payment / 100 * 1;
        int finalAmount = recentAmount + bonus + payment;
        int noBonusAmount = recentAmount + payment;
        if (payment >= 1000) {
            System.out.print("Ваш бонус составил : " + bonus +
                    " Ваш итоговый счет : " + finalAmount);
        } else {
            System.out.print("Ваш бонус составил : 0 " +
                    "Ваш итоговый счет составил : " + noBonusAmount);
        }
    }
}