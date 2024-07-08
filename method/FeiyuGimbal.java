class FeiyuGimbal{
	public static void main(String[] gimbal){
		System.out.println("Start of Main");
		
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "Feiyu Tech";
		String model = "M6A";
		int price = 21450;
		String connectivity = "Bluetooth";
		String itemWeight = "1.5 Kg";
		String color = "Black";
		
		System.out.println("The brand of the Gimbal is "+brand);
		System.out.println("The model of the Gimbal is "+model);
		System.out.println("The price of the Gimbal is "+price);
		System.out.println("The connectivity of the Gimbal is "+connectivity);
		System.out.println("The weight of the Gimbal is "+itemWeight);
		System.out.println("The color of the Gimbal is "+color);
		
		System.out.println("Product Features method ended");
	return;
	}
}