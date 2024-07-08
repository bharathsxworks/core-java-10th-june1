class Cameras{
	public static void main(String[] camera){
		System.out.println("Start of Main");
		
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "Sony";
		int price = 188990;
		String compatibleMounting = "Sony-E";
		String sensor = "CMOS";
		String model = "ILCE6100L";
		String displayType = "LCD";
		
		System.out.println("The brand of the camera is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The Compatible Mounting of the camera is "+compatibleMounting);
		System.out.println("The photo sensor technology is "+sensor);
		System.out.println("The model number is "+model);
		System.out.println("The display type is "+displayType);
		
		System.out.println("Product Features method ended");
	return;
	}
}