class IqooNeo{
	public static void main(String[] mobile){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String os = "FuntouchOS";
		int price = 29000;
		String processor = "Snapdragon 8+";
		String celluarTechnology = "5G, 4G";
		String storage = "8GB RAM & 128GB Storage";
		String color = "orange";
		
		System.out.println("The Operating System used is "+os);
		System.out.println("The price is "+price);
		System.out.println("The processor used is "+processor);
		System.out.println("The celluar technology for connectivity is "+celluarTechnology);
		System.out.println("The storage is "+storage);
		System.out.println("The color is "+color);
		
		System.out.println("Product Features method ended");
	return;
	}
}