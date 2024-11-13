package lab5;
import java.util.Scanner;

public class Lab05_Q1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner ( System.in);
        int height = 0;
        System.out.print("Please input height: ");
        height = sc.nextInt();
        if (height > 30 || height <= 0) {
            while ( height > 30 || height <= 0 ){
                System.out.print("Invalid input! Please try again!\n");
                System.out.print("Please input height: ");
                height = sc.nextInt();
            }
            }

    for ( int printedLine = 0; printedLine < height; printedLine ++ ) {
        printC ( printedLine, height);
        System.out.print("");
        printBlankSpace(printedLine, height);
        System.out.print("");
        printS ( printedLine, height);
        System.out.println();
    }
    sc.close();
    System.exit(0);
}

public static void printC (int line, int height) {
    if ( line == 0 || line == height - 1) {
    System.out.print("*****");
    } 
    else {
        System.out.print("*    ");
    }
}

public static void printS (int line, int height){
    if ( height % 2 != 0){
        if ( line == 0 || 2 * (line + 1) == (height + 1) || line == height - 1 ) {
            System.out.print("*****");
        }
        else if  ( line < ((height -1 )/2 ) + 1 ){
            System.out.print("*     ");
        }
        else {
            System.out.print("     *");
        }
    }
    else {
        if ( line == 0 || 2 * (line) == height || line == height - 1 ) {
            System.out.print("*****");
        }
        else if  ( line < (height + 1 )/2  ){
            System.out.print("*     ");
        }
        else {
            System.out.print("     *");
        }
    }
}

public static void printBlankSpace ( int line, int height) {
    if ( line == 0 || line == height - 1 || 2 * ( line + 1) == height ){
        System.out.print("      ");
    }
    else {
        System.out.print("      ");
    }
}
}