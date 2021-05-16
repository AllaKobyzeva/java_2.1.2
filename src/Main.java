public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1000;
        int limit = 1000;
        int bonus = 100;
        int totalBonus;
        int totalBаlance = balance + payment;

        if (payment > limit) {
            totalBonus = payment / bonus;

        } else {
            totalBonus = 0;

        }

        System.out.println("Баланс: " + (totalBаlance + totalBonus));
        System.out.println("Количество бонусных рублей: " + totalBonus);

    }
}