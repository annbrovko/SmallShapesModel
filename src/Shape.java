import java.lang.Math;

abstract class Shape {

  float area;
  float circumference;
  Point pointN;
  float distInPoints;

  public float getArea(){
    return this.area;
  }

  public float getCircumference(){
    return this.circumference;
  }
  
  public Point getCenter(){
    return this.pointN;
  }
  
  public void isPointInside(float x, float y){
  }

  public float getEuclideanDist(float x1, float y1, float x2, float y2) {
    this.distInPoints = (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    return this.distInPoints;
  }
}