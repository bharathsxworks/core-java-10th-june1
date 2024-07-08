class Refrigerator{
	public static void main(String[] refrigerator){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "Samsung";
		int price = 43000;
		int capacity = 363;
		String configuration = "Freezer-on-Top";
		int energyStar = 3;
		String coolingType = "Frost Free";

		System.out.println("The Brand of Refrigerator is "+brand);
		System.out.println("The Price is "+price);
		System.out.println("The capacity is "+capacity+" liters");
		System.out.println("The configuration of the refrigerator is "+configuration);
		System.out.println("The Energy Star is "+energyStar);
		System.out.println("The cooling type is "+coolingType);

		
		System.out.println("Product Features method ended");
	return;
	}
}