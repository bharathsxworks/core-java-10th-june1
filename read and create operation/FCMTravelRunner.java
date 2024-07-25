class FCMTravelRunner{
	
	public static void main(String[] place){
		System.out.println("Main started");
	
		boolean addPlace = FCMTravel.addPlaceName("coorg");
		 
		addPlace = FCMTravel.addPlaceName("chikmagaluru");
		 
		addPlace = FCMTravel.addPlaceName("mysore");
		 
		addPlace = FCMTravel.addPlaceName("nandi hills");
		 
		addPlace = FCMTravel.addPlaceName("mangalore");
		 
		addPlace = FCMTravel.addPlaceName("hampi");
		 
		addPlace = FCMTravel.addPlaceName("murudeshwar");
		 
		addPlace = FCMTravel.addPlaceName("sakleshpur");
		 
		addPlace = FCMTravel.addPlaceName("bidar");
		 
		addPlace = FCMTravel.addPlaceName("hoskote");
		 
		addPlace = FCMTravel.addPlaceName("belgaum");
		 
		FCMTravel.readtouristPlaceNames();
		
		System.out.println("Main ended");
	}
}