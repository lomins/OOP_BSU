public class Main {
    public static void main(String[] args) {
        var hexCounter = new HexadecimalCounter();
        System.out.println("Min значение: " + hexCounter.getMinValue());
        System.out.println("Current значение: " + hexCounter.getCurrentValue());
        System.out.println("Max значение: " + hexCounter.getMaxValue());
        System.out.println("Hash-code: " + hexCounter.hashCode());
        System.out.println("ToString:\n" + hexCounter.toString());

        for (int i = 0; i < 15; i++){
            hexCounter.increment();
        }

        var hexCounter1 = new HexadecimalCounter();

        System.out.println("Данные для сравнения: " + "\nhexCounter = " + hexCounter.toString() +
                "\nhexCounter1 = " + hexCounter1.toString());
        System.out.println("equals :" + hexCounter.equals(hexCounter1));

        for (int i = 0; i < 15; i++){
            hexCounter1.increment();
        }

        System.out.println("Данные для сравнения: " + "\nhexCounter = " + hexCounter.toString() +
                "\nhexCounter1 = " + hexCounter1.toString());
        System.out.println("equals :" + hexCounter.equals(hexCounter1));
    }
}