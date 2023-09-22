
public class Main {
    public static void main(String[] args) {
        Poem p1 = new Poem();
        p1.inputX();

        System.out.print("Исходный массив: \n");
        p1.toConsoleX();
        System.out.println();

        for(int i = 0; i < p1.X.length; i++){
            if(p1.X[i] % 3 == 0){
                System.out.println("i = " + i + "X[" + (i) + "] = " + p1.X[i]);
            }
        }
    }
}

