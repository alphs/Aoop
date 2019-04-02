public class Assignment_1_2 {
    private static double[][] create_matrix(int r, int c){
        if(r > 0 && c > 0) {
            double[][] m = new double[r][c];
            for(int i = 0; i < c; i++) {
                for(int j = 0; j < r; j++) {
                    m[j][i] = 0;
                }
            }
            return m;
        }
        System.out.println("size out of range");
        double[][] x = new double[0][0];
        return x;
    }

    private static void print_matrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] set_matrix(double[][] matrix, int r, int c, double input) {
        matrix[r][c] = input;
        return matrix;
    }

    private static double get_matrix(double[][] matrix, int r, int c) {
        return matrix[r][c];
    }

    private static double[][] add_matrix(double[][] matrix1, double[][] matrix2){
        int row = matrix1[0].length;
        int column = matrix1.length;
        double[][] matrix3 = new double[row][column];

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < column; c++) {
                matrix3[r][c] = matrix1[r][c] + matrix2[r][c];
            }
        }

        return matrix3;
    }

    private static double[][] multiply_matrix(double[][] matrix1, double[][] matrix2){
        int r1 = matrix1[0].length;
        int r2 = matrix2[0].length;
        int c1 = matrix1.length;
        int c2 = matrix2.length;

        double[][] matrix3 = new double[c1][r2];

        if(c1 == r2) {
            for(int i = 0; i < c1; i++) {
                for(int j = 0; j < r1; j++) {
                    for(int k = 0; k < c2; k++) {
                        matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        return matrix3;
    }

    private static double[][] random_input(double[][] matrix, int range){
        int column = matrix.length;
        int row = matrix[0].length;
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                boolean negative;
                double input;
                if(Math.random() < 0.5) {
                    negative = true;
                }
                else {
                    negative = false;
                }
                if(negative) {
                    input = (-1*(double)((Math.random()*range)+1));
                }
                else {
                    input = ((double)((Math.random()*range)+1));
                }
                set_matrix(matrix, i, j, input);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        double[][] matix = new double[2][2];
        matix = create_matrix(2, 2);
        System.out.println("Created matrix:");
        print_matrix(matix);
        System.out.println("");

        double x = get_matrix(matix, 1, 0);
        System.out.println("Value from get_matrix(): " + x);

        matix = set_matrix(matix, 0, 0, 1);
        System.out.println("Matrix updated.");

        x = get_matrix(matix, 0, 0);
        System.out.println("Value from get_matrix(): " + x);
        System.out.println("");

        matix = set_matrix(matix, 0, 1, 2);
        matix = set_matrix(matix, 1, 0, 2);
        matix = set_matrix(matix, 1, 1, 1);

        System.out.println("Matrix#1:");
        print_matrix(matix);
        System.out.println("");

        double[][] matix1 = new double[2][2];
        matix1 = create_matrix(2, 2);

        matix1 = set_matrix(matix1, 0, 0, 2);
        matix1 = set_matrix(matix1, 1, 0, 4);
        matix1 = set_matrix(matix1, 0, 1, 3);
        matix1 = set_matrix(matix1, 1, 1, 5);

        System.out.println("Matrix#2:");
        print_matrix(matix1);
        System.out.println("");

        System.out.println("Matrix#1 + Matrix#2:");
        print_matrix(add_matrix(matix, matix1));
        System.out.println("");

        System.out.println("Matrix#1 * Matrix#2:");
        print_matrix(multiply_matrix(matix, matix1));
        System.out.println("Everything is just like predicted.");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");

        double[][] matrix = new double[4][2];
        random_input(matrix, 10);
        System.out.println("Matrix#3:");
        print_matrix(matrix);
        System.out.println("");
        double[][] matrix1 = new double[2][3];
        random_input(matrix1, 10);
        System.out.println("Matrix#4:");
        print_matrix(matrix1);
        System.out.println("");
        System.out.println("Matrix#3 * Matrix#4:");
        double[][] matrix3 = multiply_matrix(matrix, matrix1);
        print_matrix(matrix3);
        get_matrix(matrix3, 0, 0);
    }
}
