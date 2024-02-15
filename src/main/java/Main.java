import ru.netology.HomeWorkFreelance.services.AccountMoneyService;

public class Main {
    public static void main(String[] args) {
        AccountMoneyService service = new AccountMoneyService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));
    }


}