class Induction{
	public static void main(String[] induction){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price = 3000;
		String brand = "philips";
		String colour = "Black";
		String feature = "Auto Shut Off";
		String material = "Glass";
		String dimensions = "34D-10W-43H";
		
		System.out.println("The brand of Induction is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The colour is "+colour);
		System.out.println("The special feature is "+feature);
		System.out.println("The material used is "+material);
		System.out.println("The product dimensions are "+dimensions);
		
		System.out.println("Product Features method ended");
	return;
	}
}