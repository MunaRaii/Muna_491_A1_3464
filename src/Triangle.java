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


}
