public class App {
    public static void main(String[] args) throws Exception {
        float running6mph = 10f;
        float basketball = 8f;
        float sleeping = 1f;
        final float MET_CONVERSION_MULTIPLIER = 0.0175f;
        float total;
        float personKilograms = 150/2.2f;
        total = MET_CONVERSION_MULTIPLIER * running6mph * personKilograms * 30;     
        total += MET_CONVERSION_MULTIPLIER * basketball * personKilograms * 30;     
        total += MET_CONVERSION_MULTIPLIER * sleeping * personKilograms * 360;
        System.out.println("Here is the total amount of calories burned: " + total);

    }
}
