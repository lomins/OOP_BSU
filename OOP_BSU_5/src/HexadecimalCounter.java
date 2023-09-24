public class HexadecimalCounter extends Counter{
    public HexadecimalCounter(){
        super(0, 15);
    }

    public HexadecimalCounter(int minValue, int maxValue){
        super(minValue, maxValue);
    }

    @Override
    public String toString() {
        return "HexadecimalCounter { " +
                "minValue = " + getMinValue() +
                ", maxValue = " + getMaxValue() +
                ", currentValue = " + getCurrentValue() +
                " }";
    }
}
