public class Main {
    public static void main(String[] args) {
        String inputString = "({[]})";
        boolean result = BracketsChekcer.areBracketsBalanced(inputString);
        showResult(result);

        System.out.println();

        inputString = "({{[]}))";
        result = BracketsChekcer.areBracketsBalanced(inputString);
        showResult(result);
    }

    public static void showResult(boolean result) {
        if (result) {
            System.out.println("Скобки расставлены правильно.");
        } else {
            System.out.println("Скобки расставлены неправильно.");
        }
    }
}