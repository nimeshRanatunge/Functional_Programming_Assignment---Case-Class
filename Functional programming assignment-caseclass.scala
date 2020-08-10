//importing from math library
import scala.math.sqrt

object Calculator extends Points {
  val point1 = new Point(7, 4)
  val point2 = new Point(2, 6)
  val point3= point1 + point2
  val point4 = point1.move(7, 1)


  println(point1)
  println(point2)
  println(" ")

  println("Add two points : " + point1 + " + " + point2 + " = " + point3)
  println(" ")
  println("Move point :" + point1 + " to (1,1)" + " = " + point4)
  println(" ")
  println("Distance " + point1 + " , " + point2 + "= " + point1.distance(point2))
  println(" ")
  println("Invert " + point1 + " = " + point1.invert)
  println(" ")

}

case class Point(a: Int, b: Int) {
  def x: Int = a; 
  def y: Int = b;

  def + (p: Point) = Point(this.x + p.x, this.y + p.y)
  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)
  def distance(p: Point) = sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y))
  def invert = Point(this.y, this.x)

}