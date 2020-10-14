
/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box.
Create an object of the Box class and test the functionalities. */


class Box {

	Box(int width,int height,int depth) {
		width = 0;
		height = 0;
		depth = 0;
		System.out.println("Paramterirized contructor is executed");
		System.out.println("Width: "+width+"\tHeight: "+height+"\tDepth: "+depth);
	}
	
	public int Volume(int width,int height,int depth) {
		return width*height*depth;
	}
	
	
	public static void main(String[] args) {
		
		int width = 2;
		int height = 3;
		int depth = 6;
		
		Box b1 = new Box(width,height,depth);
		int vol = b1.Volume(width,height,depth);
		
		System.out.println("Actual method called: ");
		System.out.println("Width: "+width+"\tHeight: "+height+"\tDepth: "+depth);
		System.out.println("1Volume is:"+vol);
	}

}
