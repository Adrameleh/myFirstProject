package lesson5;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {1, 45, 764, 345, 234, 467, 34534, 74, 574, 2342, 54355, 5, 11};
        boolean easy = true;
        for(int i =0; i<array.length;i++){
            easy = true;
            for(int j=array[i]-1;j>1;j--){
                if(array[i]%j==0){
                    easy=false;
                    break;
                }
            }
            if(easy){
                System.out.println(array[i]);
            }
        }
    }

}
