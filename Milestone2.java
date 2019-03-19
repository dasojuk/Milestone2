import java.util.Scanner;


public class Milestone2 {
	public static void main(String  [] args) {
		int fenceAmount;
		int fenceType;
		double length;
		double width;
		double base;
		double height;
		double radius;
		double perimeter;
		String cont = ("yes");
		
		Scanner input = new Scanner(System.in);
		while(!cont.equals("quit")){
		System.out.print("How many fences would you like to create: ");
		fenceAmount = input.nextInt();
		
		int count = 1;
		
		while(count <= fenceAmount){
		System.out.print("What type of fence would you like to create? Please enter 1 for rectangle, 2 for right triangle, or 3 for circle: ");
		fenceType = input.nextInt();
		
		if(fenceType == 1){
			input.nextLine();
			System.out.print("Enter the length of the rectangle fence.");                                                                                                                                         b
			length = input.nextInt();
			
			System.out.print("Enter the width of the rectangle fence.");
			width = input.nextInt();
			
			calcRectanglePerimeter(length, width);	
		}
		
		else if(fenceType == 2){
			System.out.print("Enter the base of the right triangle fence.");
			base = input.nextInt();
			
			System.out.print("Enter the height of the right triangle fence.");
			height = input.nextInt();
			
			calcTrianglePerimeter(base, height);	
		}
		else if(fenceType == 3){
			
			System.out.print("Enter the radius of the circular fence.");
			radius = input.nextInt();
			calcCirclePerimeter(radius);
			System.out.println();
		}
			count++;
		}
			
		input.nextLine();
		System.out.println("Would you like to continue: ");
		cont = input.nextLine();
			
		}
	}
	
	public static double calcRectanglePerimeter(double length, double width){
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	public static double calcTrianglePerimeter(double base, double height){
		double hypotenuse; 
		hypotenuse = Math.sqrt((Math.pow(base, 2) + Math.pow(height, 2))); 
		double perimeter = hypotenuse + base + height;
		return perimeter;
	}

	public static double calcCirclePerimeter(double radius){
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}


		
	
}

			
			