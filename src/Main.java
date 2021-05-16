public class Main {
    public static void main(String[] args) {
        double balance = 100.00;
        double payment = 11568.67;
        int limit = 1000;
        int bonus = 100;
        int totalBonus;
        double totalBаlance = balance + payment;

        if (payment > limit) {
            totalBonus = (int) payment / bonus;

        } else {
            totalBonus = 0;

        }

        System.out.println("Баланс: " + (totalBаlance + totalBonus));
        System.out.println("Количество бонусных рублей: " + totalBonus);

    }
}