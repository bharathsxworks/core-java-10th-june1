class Cctv{
	public static void main(String[] camera){
		System.out.println("Start of Main");
		
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "CP PLUS";
		int price = 1400;
		String modelName = "Wireless";
		String controllerType = "Android";
		String powerSource = "Corded Electric";
		String connectivity = "Wi-Fi";
		
		System.out.println("The brand of the CCTV is "+brand);
		System.out.println("The price of the CCTV is "+price);
		System.out.println("The Model Name of the CCTV is "+modelName);
		System.out.println("The Controller Type of the CCTV is "+controllerType);
		System.out.println("The power source to the CCTV is "+powerSource);
		System.out.println("The connectivity of the CCTV is "+connectivity);
		
		System.out.println("Product Features method ended");
	return;
	}
}