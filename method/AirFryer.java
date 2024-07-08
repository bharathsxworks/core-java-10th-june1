class AirFryer{
	public static void main(String[] fryer){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price = 3080;
		String brand = "philips";
		String colour = "Black";
		String feature = "Digital";
		String material = "Aluminium";
		String usedFor = "Bake";
		
		System.out.println("The brand of Induction is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The colour is "+colour);
		System.out.println("The special feature is "+feature);
		System.out.println("The material used is "+material);
		System.out.println("The product is used for "+usedFor);
		
		System.out.println("Product Features method ended");
	return ;
	}
}