package homework.lesson13;

public class Main {
    public static void main(String[] args) {
        IMatrixImpl matrix1 = new IMatrixImpl(5,5);
        IMatrixImpl matrix2 = new IMatrixImpl(5,5);
        IMatrixImpl matrix3 = new IMatrixImpl(2,4);
        matrix3.setValueAt(0,1, 5);
        matrix3.setValueAt(1,0,3);
        matrix3.setValueAt(1,3,6);

        for(int i =0; i<matrix1.getRows();i++){
            for(int j =0; j<matrix1.getColumns();j++){
                matrix1.setValueAt(i,j,2);
                matrix2.setValueAt(i,j,2);
            }
        }
        matrix1.setValueAt(0,0,5);
        matrix1.mul(matrix2).printToConsole();
        System.out.println();
        matrix1.mul(5).printToConsole();
        System.out.println();
        matrix3.printToConsole();
        System.out.println();
        matrix3.transpose().printToConsole();
    }
}
