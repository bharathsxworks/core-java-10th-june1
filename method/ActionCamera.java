class ActionCamera{
	
	public static void main(String[] camera){
		System.out.println("Start of Main");
	
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
	
		String brand = "IZI";
		int price = 9499;
		String memoryType = "Micro SD";
		String sensor = "CMOS";
		String resolution = "5k";
		String lens = "Wide Angle";		
			
		System.out.println("The brand of the camera is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The Memory Type of the camera is "+memoryType);
		System.out.println("The photo sensor technology is"+sensor);
		System.out.println("The vedio capture resolution is"+resolution);
		System.out.println("The lens type is "+lens);
		
		
		System.out.println("Product Features method ended");
	return ;
	}
}