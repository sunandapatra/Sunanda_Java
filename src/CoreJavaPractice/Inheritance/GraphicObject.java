package CoreJavaPractice.Inheritance;

 public abstract class GraphicObject {
    int x, y;
    void moveTo(int newX, int newY) {
    	System.out.println("AAAA");
    }
    
    abstract void draw();
    abstract void resize();
    public static void main(String args[]) {
    	Circle circle = new Circle();
    	Rectangle rect = new Rectangle();
    	circle.draw();
    	circle.resize();
    	rect.draw();
    	rect.resize();
    }
}
//Each nonabstract subclass of GraphicObject, such as Circle and Rectangle, must provide implementations for the draw and resize methods:

class Circle extends GraphicObject {
    void draw() {
        System.out.println("This is a Circle");
    }
    void resize() {
        System.out.println("Resizing Of Circle");
    }
}
class Rectangle extends GraphicObject {
    void draw() {
    	System.out.println("This is a Rectangle");
    }
    void resize() {
        System.out.println("Resizing Of Rectangle");
    }
}
