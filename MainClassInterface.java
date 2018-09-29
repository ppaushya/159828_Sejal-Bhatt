package Assignments;

public class MainClassInterface {

	public static void main(String[] args)
	{
		RectangleArea rect=new RectangleArea();
		CircleArea cr=new CircleArea();

		System.out.println("Area of the rectangle= "+rect.calcArea(10,20));
		System.out.println("Area of the circle= "+cr.calcArea(10,0));
	}
	
}
