public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        //Здесь расчитан ИМТ при моем росте и весе
        double myBmi = service.calculate(73, 1.92);
        System.out.println("ИМТ равен = " + myBmi + ", при весе 73 кг и росте 1.92 м");

        //Здесь расчитан ИМТ когда рост и вес одинакогого значения
        double bmiForTheSameWeightAndHeight = service.calculate(80, 0.8);
        System.out.println("ИМТ равен = " + bmiForTheSameWeightAndHeight + ", при весе 80 кг и росте 80 см");

        //Здесь расчитан ИМТ когда числовое значение веса больше числового значения роста
        double bmiWhenWeightMoreThanHeight = service.calculate(100, 0.8);
        System.out.println("ИМТ равен = " + bmiWhenWeightMoreThanHeight + ", при весе 100 кг и росте 80 см");
    }
}
