public class Main {
    public static void main(String[] args) {
        int cur_balance = 2_000_000_000;
        int transfer = 500_000_000;
        long overall = cur_balance + transfer;
        System.out.println("Общий баланс: " + overall);
    }
}
