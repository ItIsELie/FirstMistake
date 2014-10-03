//Decomposition.
public class DrawFigures1 {
    public static void main(String[] args) {
		
		drawDiamond();
		drawX();
		drawRocket();
	}
	
	public static void drawDiamond() {
		drawTriangle();
		drawCone();
		System.out.println();
	}
	
	public static void drawX() {
		drawCone();
		drawTriangle();
		System.out.println();
	}
	
	public static void drawRocket() {
		drawTriangle();
		drawSquare();
		
		System.out.println("|United|");
		System.out.println("|States|");
		
		drawSquare();
		drawTriangle();
	}
	
	public static void drawTriangle() {
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
	}
	
	public static void drawCone() {
		System.out.println(" \\    /");
		System.out.println("  \\  /");
		System.out.println("   \\/");
	}
	
	public static void drawSquare() {
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
}
