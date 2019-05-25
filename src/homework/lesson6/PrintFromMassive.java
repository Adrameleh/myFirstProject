package homework.lesson6;

public class PrintFromMassive {
    public static void even(int[] massive){
        for (int i=0;i<massive.length;i++){
            if(massive.length==0){
                System.out.println("Not a massive");
            }
            if(massive[i]%2==0){
                System.out.println(massive[i]);
            }
        }
    }
}
