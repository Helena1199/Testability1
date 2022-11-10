public class BmiService {
    public int calculate(int weight, int height) {
        //ИМТ = m/h2, где: m — масса тела в килограммах, h — рост в метрах.
        // для перевода роста в метры использовала умножение массы тела на 10_000
        // (сначала пыталась через double, но не смогла связать его с int)
        int index = weight * 10_000 / (height * height);
        return index;

    }
}
