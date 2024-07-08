class GoProGimbal{
	public static void main(String[] gimbal){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "hohem";
		String model = "iSteady Pro 4";
		int price = 9450;
		String connectivity = "Bluetooth";
		String modelNo = "HFFR1254F";
		String color = "Black";
		
		System.out.println("The brand of the Gimbal is "+brand);
		System.out.println("The model of the Gimbal is "+model);
		System.out.println("The price of the Gimbal is "+price);
		System.out.println("The connectivity of the Gimbal is "+connectivity);
		System.out.println("The model number is "+modelNo);
		System.out.println("The color is "+color);
		
		System.out.println("Product Features method ended");
	return;
	}
}