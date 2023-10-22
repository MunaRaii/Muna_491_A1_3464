import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numberOfTriangles = 3;
            Triangle[] triangles = new Triangle[numberOfTriangles];

            for (int i = 0; i < numberOfTriangles; i++){
                Point[] vertices = new Point[3];
                System.out.println("Enter coordinates of a triangle " + (i+1) + ":");

                for(int j = 0; j < 3; j++){
                    System.out.println("Enter x coordinate " + (j+1) + ": ");
                    double x = scanner.nextDouble();
                    System.out.println("Enter y coordinate " + (j+1) + ": ");
                    double y = scanner.nextDouble();

                    vertices[j] = new Point(x, y);
                }
                triangles[i] = new Triangle(vertices);
            }

            System.out.println("Triangle Information: ");
            for (int i = 0; i < numberOfTriangles; i++){
                System.out.println("Triangle " + (i+1) + ":");
                System.out.println("Perimeter " + triangles[i].calculatePerimeter());
                System.out.println("Type " + triangles[i].displayTriangleType());

                System.out.println("Enter a point to check if it's inside the triangle: ");
                double pointX = scanner.nextDouble();
                double pointY = scanner.nextDouble();

                Point pointCheck = new Point(pointX, pointY);

                if(triangles[i].isInsidePoint(pointCheck)){
                    System.out.println("Inside the triangle.");
                }else {
                    System.out.println("Outside the triangle.");
                }
            }
        }
    }
