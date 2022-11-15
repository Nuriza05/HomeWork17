public class Main {
    public static void main(String[] args) {
        Square square=new Square(4,4,4,4);
        Triangle triangle= new Triangle(6,5,6);
        Rectangle rectangle=new Rectangle(5,4,5,4);
        Rhombs rhombs=new Rhombs(3,3,3,3);

        System.out.println(square);
        System.out.println("Perimetr of square: "+square.getPerimetr());
        System.out.println(triangle);
        System.out.println("Perimetr of triangle: "+triangle.getPerimetr());
        System.out.println(rectangle);
        System.out.println("Perimetr of rectangle: "+rectangle.getPerimetr());
        System.out.println(rhombs);
        System.out.println("Perimetr of rhombs: "+rhombs.getPerimetr());
    }
}