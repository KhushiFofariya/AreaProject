public class Area 
{
	private double length;
	private double breadth;
	
	public void setDim(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea() 
	{
		return length*breadth;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Area a1 = new Area();
		a1.setDim(10, 10);
		System.out.println("Area of Rectangle is:"+a1.getArea());
		
	}

}
