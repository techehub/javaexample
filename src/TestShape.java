public class TestShape {

    public static void displayArea(Shape s){
        System.out.println("Inside Shape displayArea");

        double a= s.area();
        System.out.println(a);
    }

    /*

    public static void  displayArea(Circle c){
        System.out.println("Inside Circle displayArea");

        double a= c.area();
        System.out.println(a);
    }

    public static void  displayArea(Rectangle r){
        System.out.println("Inside Rectangle displayArea");
        double a= r.area();
        System.out.println(a);
    }
    */

    public static void main(String[] args) {

        Circle c = new Circle();
        c.r =20;

        Rectangle r = new Rectangle();
        r.w=20;
        r.h=30;

        displayArea(c);
        displayArea(r);
    }

}
