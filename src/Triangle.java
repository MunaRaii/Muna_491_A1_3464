public class Triangle {
    Point[] vertices;
        public Triangle(Point[] vertices){
            if(vertices.length != 3){
                System.out.println("Must have 3 vertices.");
            }
            this.vertices = vertices;
        }

        public double calculatePerimeter(){
            double perimeter = 0;
            for(int i = 0; i < 3; i++){
                perimeter += vertices[i].distanceBetweenTwoPoints(vertices[(i + 1)%3]);
            }
            return perimeter;
        }

        public Point.TriangleType displayTriangleType(){
            double a = vertices[0].distanceBetweenTwoPoints(vertices[1]);
            double b = vertices[1].distanceBetweenTwoPoints(vertices[2]);
            double c = vertices[2].distanceBetweenTwoPoints(vertices[0]);

            if(a == b && b == c){
                return (Point.TriangleType.ISOCELES);
            } else if (a == b || b == c || c == a) {
                return (Point.TriangleType.EQUILATERAL);
            }else {
                return (Point.TriangleType.UNKNOWN);
            }
        }

        public double areaOfTriangle() {
            double s = calculatePerimeter() / 2;
            double a = vertices[0].distanceBetweenTwoPoints(vertices[1]);
            double b = vertices[1].distanceBetweenTwoPoints(vertices[2]);
            double c = vertices[2].distanceBetweenTwoPoints(vertices[0]);
            return Math.sqrt(s * (s-a) * (s-b) * (s-c));
        }
        public boolean isInsidePoint(Point point){
            double area = areaOfTriangle();
            double area1 = new Triangle(new Point[]{point, vertices[0], vertices[1]}).areaOfTriangle();
            double area2 = new Triangle(new Point[]{point, vertices[1], vertices[2]}).areaOfTriangle();
            double area3 = new Triangle(new Point[]{point, vertices[2], vertices[0]}).areaOfTriangle();
            return area == area1 + area2 + area3;
        }


}
