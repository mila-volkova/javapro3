public class Main {
    public static void main(String[] args) {
        int startingAmount = 200;
        int replenishment = 1200;
        int bonus = replenishment > 1000 ? replenishment / 100 : 0;
        int totalAmount = startingAmount + replenishment + bonus;
        System.out.println("Баланс: " + totalAmount);
        System.out.println("Бонус: " + bonus);


    }
}