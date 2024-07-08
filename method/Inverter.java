class Inverter{
	public static void main(String[] inverter){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price = 23000;
		String brand = "Genus";
		String colour = "White";
		String powerSource = "Battery power";
		String batteryCapacity = "220 Amp Hours";
		String model = "GTT250";
		
		System.out.println("The brand of Induction is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The colour is "+colour);
		System.out.println("The power source is supplied from "+powerSource);
		System.out.println("The battery capacity is "+batteryCapacity);
		System.out.println("The model is "+model);
		
		System.out.println("Product Features method ended");
	return;
	}
}