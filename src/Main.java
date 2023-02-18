public class Main {
    public static void main(String[] args) {
        int recentammount = 100;
        int payment = 900;
        int bonus = payment/100*1;
        int finalammount = recentammount + bonus + payment;
        int nobonusammount = recentammount + payment;
                if (payment >=1000) {
                    System.out.print( "Ваш бонус составил : " + bonus +
                            " Ваш итоговый счет : " + finalammount);
                } else {System.out.print("Ваш бонус составил : 0 " +
                "Ваш итоговый счет составил : " + nobonusammount);}
    }
}