public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(86, 170);
        System.out.println(" По формуле Кетле Ваш ИМТ равен: " + index);

    }
}