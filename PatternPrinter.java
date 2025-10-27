import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        int n = 5; // You can change this value for different sizes

        System.out.println("1. Increasing Star Triangle:");
        printIncreasingTriangle(n - 1);

        System.out.println("\n2. Decreasing Star Triangle:");
        printDecreasingTriangle(n - 1);

        System.out.println("\n3. Number Triangle:");
        printNumberTriangle(n - 1);

        System.out.println("\n4. Continuous Character Triangle:");
        printCharacterTriangle(n - 1);

        System.out.println("\n5. Diagonal Line (Tilted):");
        printDiagonalLine(n);

        System.out.println("\n6. Right-Aligned Triangle:");
        printRightAlignedTriangle(n);

        System.out.println("\n7. Butterfly Pattern:");
        printButterflyPattern(n);

        System.out.println("\n8. Solid Rhombus:");
        printSolidRhombus(n);

        System.out.println("\n9. Hollow Rhombus:");
        printHollowRhombus(n);

        System.out.println("\n10. Diamond Pattern:");
        printDiamond(n);

        System.out.println("\n11. Hollow Square:");
        printHollowSquare(n);
    }

    static void printIncreasingTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printDecreasingTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printNumberTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printCharacterTriangle(int rows) {
        char c = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    static void printDiagonalLine(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printRightAlignedTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printButterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            printButterflyLine(i, n);
        }
        for (int i = n; i >= 1; i--) {
            printButterflyLine(i, n);
        }
    }

    static void printButterflyLine(int i, int n) {
        for (int j = 1; j <= i; j++) System.out.print("*");
        for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
    }

    static void printSolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= n; j++) System.out.print("* ");
            System.out.println();
        }
    }

    static void printHollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i) - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i) - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void printHollowSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}