import java.lang.Math;

class Circle extends Shape {
  float radius;
  Point startPoint;
  Point pointN;

  public Circle(float radius, Point startPoint) {
    this.radius = radius;
    this.startPoint = startPoint;
  }

  public float getArea() {
    this.area = (float) Math.PI * (radius * radius);
    return area;
  }

  public float getCircumference() {
    this.circumference = (float) Math.PI * 2 * radius;
    return circumference;
  }

  public Point getCenter() {
    this.pointN = new Point(this.startPoint.x + radius, this.startPoint.y + radius);
    return pointN;
  }

  public void isPointInside(float x, float y){
    // new point to check on
    Point pointP = new Point(x, y);
    // find center point
    Point pointN = new Point(this.startPoint.x + radius, this.startPoint.y + radius);
    
    float dist = (float) Math.sqrt(Math.pow((pointP.x-pointN.x), 2) + Math.pow((pointP.y-pointN.y), 2));
    if (dist > radius){
      System.out.println("The point " + x + ", " + y + " is inside of the circle.");
    } else {
      System.out.println("The point " + x + ", " + y + " is not inside of the circle.");
    }
  }

  public void getCircleInfo(){
    System.out.println("Circle information:\n");
    // prints circles radius and starting point
    System.out.println("Radius: " + radius);
    System.out.println("Starting point: " + startPoint.x + ", " + startPoint.y);
    // calculates and prints the area of the circle
    getArea();
    System.out.println("Area: " + (int)area);
    // calculates and prints the circumference of the circle
    getCircumference();
    System.out.println("Circumference: " + (int)circumference);
    // calculates and prints the center of the circle
    getCenter();
    System.out.println("Center: " + (int)pointN.x + ", " + (int)pointN.y);
    // calculates, whether the given point is inside of the circle or not
    isPointInside(55, 15);
    isPointInside(70, 30);
  }
}