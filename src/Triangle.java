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
}
