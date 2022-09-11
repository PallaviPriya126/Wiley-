
public class Circle {
		final double pi = 3.142;
		double radius;
		double area;
		
		public Circle(double radius){
			this.radius = radius;
		}
		
		public double calculateArea() {
			return(pi * radius * radius);
			
		}
		public static void main(String[] args) {
			
			Circle c1 = new Circle(9.55);
			double ans = c1.calculateArea();
			System.out.println("Area = "+ans);
		}

	}


