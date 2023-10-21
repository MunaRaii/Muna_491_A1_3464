public class Triangle {
    Point[] vertices;
        public Triangle(Point[] vertices){
            if(vertices.length != 3){
                System.out.println("Must have 3 vertices.");
            }
            this.vertices = vertices;
        }
}
