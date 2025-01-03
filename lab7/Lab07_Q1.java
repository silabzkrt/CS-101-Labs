package lab7;

import java.util.Random;

public class Lab07_Q1 {
    // number of rows come from matrix 1, columns come from matrix 2
    /* multiplying a matrix means combining the numbers in a row of the first matrix with the
    numbers in a column of the second matrix to calculate a new value*/ 

    public static void printMatrix (int[][] matrix) {
        for (int [] row: matrix) { // search each row of matrix, finish then search the next row
            for (int element : row) { // search each elemt in the current row
                System.out.print(element + " "); // print each element
            }
            System.out.println(); // move to the new line after each row so we don't print them next to each other
        }
    }
    public static int column (int [][] matrix) {
        int result = matrix[0].length;
        return result;
    }
    public static int row (int [][] matrix) {
        int result = matrix.length;
        return result;
    }

    public static boolean checkForEligible (int [][] matrixOne, int [][] matrixTwo) {
        // we check if the entered values are eligible for multiplication
        boolean eligible = false;
        if (matrixOne[0].length == matrixTwo.length) {
            eligible = true;
        }
        return eligible;
    }

    public static int [][] multiplyMatrices (int [][] matrixOne, int [][] matrixTwo) {
        int rowOne =row(matrixOne);
        int rowTwo = row(matrixTwo);
        int columnOne = column(matrixOne);
        int columnTwo = column(matrixTwo);
        int [][] result = new int [rowOne][columnTwo]; // our results will appear as 0 as default
            
        if (checkForEligible(matrixOne, matrixTwo)) {
           for (int i = 0; i < rowOne ; i++) { // find the values on the i th row of matrix one
            for (int j = 0; j < columnTwo; j++){ // find the values on the j th column of matrix two
                result [i][j] = 0;
                for (int k = 0; k < columnOne; k++) { // find the values on the kth column of matrix one and the kth row of matrix two
                    result [i][j] += matrixOne[i][k] * matrixTwo [k][j];
                }
            }
           }
        }
        return result;
    }

    public static String checkRectangular (int [][] matrix) {
        String checkResult = "";
        int row = row(matrix);
        int column = column(matrix);
        for (int i = 0; i < row ; i++) {
            for (int j = i + 1 ; j < column; j++) {
                if (matrix [i][j] != 0) {
                    for (int k = 0; k < row ;k++) {
                        for (int l = i - 1 ; l < column; l++) {
                            if (matrix [k][l] != 0) {
                                checkResult = "Neither";
                            }
                            else {
                                checkResult = "Upper Triangular";
                            }
                        }
                    }
                }
                else {
                    checkResult = "Lower Triangular";
                }
            }
        }
        
        return checkResult;
    }
    public static boolean checkForSize (int [][] large, int [][] small) {
        int rowLarge = row(large);
        int rowSmall = row(small);
        int columnLarge = column(large);
        int columnSmall = column(small);
        boolean check = true;
        if (rowLarge < rowSmall && columnLarge < columnSmall) {
            check = false;
        }
        return check;
    }
    
    public static boolean isSubset (int [][] parent, int [][] child) {
        boolean isSubset = true;
        int rowParent = row(parent);
        int rowChild = row(child);
        int columnParent = column(parent);
        int columnChild = column(child);

        for (int startRow = 0; startRow <= rowParent - rowChild; startRow++) {
            for (int startColumn = 0; startColumn <= columnParent - columnChild; startColumn++) {
                for ( int i = 0; i < rowChild - 1; i++) {
                    for (int j = 0; j < columnChild - 1; j++) {
                        if (child[i][j] != parent[i + startRow][j + startColumn] ) {
                            isSubset = false;
                            break;
                        }
                    }
                    if (!isSubset) {break;}
                }
                if (isSubset) { isSubset = true;}
            }
        }
        return isSubset;
    }
    public static void main (String [] args) {
        Random random = new Random();
        int [][] matrixOne = {
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)} , 
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)}
        };
        int [][] matrixTwo = {
            {random.nextInt(1,10),random.nextInt(1,10)},
            {random.nextInt(1,10),random.nextInt(1,10)},
            {random.nextInt(1,10),random.nextInt(1,10)}
        };
        int [][] matrixSquare = {
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)} , 
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)} , 
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)} 
        };
        int [][] childMatrix = {
            {random.nextInt(1,10),random.nextInt(1,10)}, 
            {random.nextInt(1,10),random.nextInt(1,10)}
        };
        int [][] parentMatrix = {
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)},
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)},
            {random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10),random.nextInt(1,10)},
        };

        System.out.println("Matrix One: ");
        printMatrix(matrixOne);
        System.out.println("Matrix Two: ");
        printMatrix(matrixTwo);

        System.out.println("Multiplication Result: ");
        int [][] result = multiplyMatrices(matrixOne, matrixTwo);
        printMatrix(result);

        System.out.println("Checking if matrix is rectangular:" );
        printMatrix(matrixSquare);
        String rectangularResult = checkRectangular(matrixSquare);
        System.out.println("Result: " + rectangularResult);

        System.out.println("Checking if the child matric is a subset of parent matrix.");
        System.out.println("Parent:");
        printMatrix(parentMatrix);
        System.out.println("Child: ");
        printMatrix(childMatrix);
        boolean isSubsetResult = isSubset(parentMatrix, childMatrix);
        System.out.println("Is child matrix a subset of arent matrix?" + isSubsetResult);
    }
}