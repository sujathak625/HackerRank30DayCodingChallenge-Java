public class Circle extends Shape{

    public String currentShape(){
        return round();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        String result =circle.currentShape();
        System.out.println(result);
    }
}
