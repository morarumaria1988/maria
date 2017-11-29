
package ex1_book;


public class Circle extends GeometricObject {
  private double radius;
  public Circle(){
      }
  public Circle(double radius){
      this.radius=radius;
  }
 public Circle (double radius, String color, boolean filled) {
  super(color,filled);
     this.radius=radius;
//  setColor(color);
  //setFilled(filled);
   }  
 public double getRadius(){
     return radius;
 }
 public void setRadius(double radius){
     this.radius=radius;
 }
 
 public double getArea(){
     return radius*radius*Math.PI;
 }
 public double getPerimeter(){
     return 2*radius*Math.PI;
 }
 public double getDiameter(){
     return 2*radius;
 }
 public void printCircle(){
     System.out.println("The circle is created "+getDateCreated()+" and the radius is "+getRadius());
 }
  @Override
 public String toString() {
     return super.toString()+"\nradius is "+radius;
 }
}
