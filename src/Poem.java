import java.util.Scanner;

public class Poem {
    private String authorName;
     private int stringCount;
     private boolean isHaveRhyme;
     public int N = 20;
     public int X[] = new int[N];

     public String getAuthorName(){ return authorName;  }
     public int getStringCount() {  return stringCount; }
     public boolean getHaveRhyme(){ return isHaveRhyme; }

    public void setAuthorName(String newName){authorName = newName;}
    public void setStringCount(int count){stringCount = count;}
    public void setHaveRhyme(boolean haveRhyme){isHaveRhyme = haveRhyme;}

    public Poem(){
         authorName = "None";
         stringCount = 0;
         isHaveRhyme = false;
    }

    public Poem(String authorName){
         this.authorName = authorName;
    }

    public Poem(String authorName, int stringCount){
         this.authorName = authorName;
         this.stringCount = stringCount;
    }

    public Poem(String authorName, int stringCount, boolean isHaveRhyme){
        this.authorName = authorName;
        this.stringCount = stringCount;
        this.isHaveRhyme = isHaveRhyme;
    }

    public void toConsole(){
         System.out.println("Имя автора: " + authorName);
         System.out.println("Количество строк:" + stringCount);
         System.out.println("Наличие рифмы: " + (isHaveRhyme? "Да": "Нет"));
    }

    public void inputX(){
        Scanner in = new Scanner(System.in);

         for(int i = 0; i<N; i++){
             System.out.println("Введите X[" + (i + 1) + "] = ");
             X[i] = in.nextInt();
         }
    }
}
