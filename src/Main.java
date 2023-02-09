import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 150;
        int repl = 900;
        int bonus;

        if (repl > 1000) {
            bonus = repl / 100;
            System.out.println("На вашем счете: " + (balance + repl + bonus) + " рублей");
            System.out.println("Размер бонуса: " + bonus + " рублей");
        } else {
            System.out.println("На вашем счете: " + (balance + repl) + " рублей");
            System.out.println("Вы не получаете бонус, так как сумма вашего пополнения была меньше 1000 рублей");
        }


    }
}