package homework.lesson13;

public class IMatrixImpl implements IMatrix {
    private double[][] matrix;
    private int columns;
    private int rows;


    public IMatrixImpl() {
        matrix = new double[1][1];
    }

    public IMatrixImpl(int rows, int columns) {
        this.columns = columns;
        this.rows = rows;
        matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrixImpl matrixResult = new IMatrixImpl(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                matrixResult.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return matrixResult;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrixImpl matrixResult = new IMatrixImpl(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                matrixResult.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return matrixResult;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrixImpl matrixResult = new IMatrixImpl(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < matrixResult.getRows(); ++i) {
            for (int j = 0; j < matrixResult.getColumns(); ++j) {
                for (int k = 0; k < otherMatrix.getRows(); ++k) {
                    matrixResult.setValueAt(i, j, matrixResult.getValueAt(i, j) + this.getValueAt(i, k) * otherMatrix.getValueAt(k, j));//matrixResult[i][j] += this[i][k] * otherMatrix[k][j];
                }
            }
        }
        return matrixResult;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrixImpl matrixResult = new IMatrixImpl(this.getRows(), this.getColumns());
        for (int i = 0; i < matrixResult.getRows(); ++i) {
            for (int j = 0; j < matrixResult.getColumns(); ++j) {
                matrixResult.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return matrixResult;
    }

    @Override
    public IMatrix transpose() {
        IMatrixImpl matrixResult = new IMatrixImpl(this.getColumns(), this.getRows());
        for (int i = 0; i < matrixResult.getRows(); ++i) {
            for (int j = 0; j < matrixResult.getColumns(); ++j) {
                matrixResult.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return matrixResult;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); ++i) {
            for (int j = 0; j < this.getColumns(); ++j) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); ++i) {
            for (int j = 0; j < this.getColumns(); ++j) {
                if(this.getValueAt(i,j)!=0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); ++i) {
            for (int j = 0; j < this.getColumns(); ++j) {
                if(i==j){
                    if(this.getValueAt(i,j)!=1){
                        return false;
                    }
                }
                else if(this.getValueAt(i,j)!=0) return false;
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if(this.getColumns()==this.getRows()) return true;
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
