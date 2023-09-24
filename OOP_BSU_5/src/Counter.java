import java.util.Objects;

public abstract class Counter {
    private int maxValue;
    private int minValue;
    private int currentValue;

    public Counter() {
        this.minValue = 0;
        this.maxValue = Integer.MAX_VALUE;
        this.currentValue = minValue;
    }

    public Counter(int minValue, int maxValue) {
        if (minValue >= maxValue) {
            throw new IllegalArgumentException("Неверно заданный диапазон");
        }

        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = minValue;
    }

    public void increment() {
        if (currentValue == maxValue) {
            throw new IllegalStateException("Достигнут максимальный предел");
        }
        currentValue++;
    }

    public void decrement() {
        if (currentValue == minValue) {
            throw new IllegalStateException("Достигнут минимальный предел");
        }
        currentValue--;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Counter counter = (Counter) obj;
        return minValue == counter.minValue &&
                maxValue == counter.maxValue &&
                currentValue == counter.currentValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue, maxValue, currentValue);
    }

    @Override
    public String toString() {
        return "Counter { " +
                "minValue = " + minValue +
                ", maxValue = " + maxValue +
                ", currentValue = " + currentValue +
                " }";
    }
}

