class GoPro{
	public static void main(String[] cam){
		System.out.println("Start of Main");
		
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "GoPro HERO 10";
		int price = 27490;
		String memoryType = "Micro SD";
		String sensor = "CMOS";
		String model = "TCW2013W";
		String displayType = "LCD";
		
		System.out.println("The brand of the camera is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The Memory Type of the camera is "+memoryType);
		System.out.println("The photo sensor technology is"+sensor);
		System.out.println("The model number is "+model);
		System.out.println("The display type is "+displayType);
		
		System.out.println("Product Features method ended");
	return;
	}
}