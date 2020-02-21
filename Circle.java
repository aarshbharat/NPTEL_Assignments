import java.util.Scanner;

 public class Circle extends Point{
	 	  
     public static void main(String[] args) {
    
	 Scanner sc = new Scanner(System.in);
	 Point c=new Point(); //Create a point center
	 c.x=sc.nextDouble();
	 c.y=sc.nextDouble();
	 Point p=new Point();  //Create a point on circumference
	 p.x=sc.nextDouble();
	 p.y=sc.nextDouble(); 
	 Circle c1=new Circle(); //Create an object of class Circle
	 c1.distance(c,p);  //Calcualte radius of the circle
	
  }
 
}
class Point{
    double x,y;
    public double distance(Point a, Point b){
        double dis=(a.x-b.x)*(a.x-b.x)+(a.y-a.y)*(a.y-b.y);
        dis=java.lang.Math.sqrt(dis);
        System.out.println(dis);
        return dis;
    }
}