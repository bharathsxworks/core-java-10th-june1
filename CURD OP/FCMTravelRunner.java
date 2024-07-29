class FCMTravelRunner{
	
	public static void main(String[] place){
		System.out.println("Main started");

		boolean addPlace = FCMTravel.addPlaceName("coorg");
		FCMTravel.addPlaceName("coorg");

		addPlace = FCMTravel.addPlaceName("chikmagaluru");
		FCMTravel.addPlaceName("chikmagaluru");

		addPlace = FCMTravel.addPlaceName("mysore");
		FCMTravel.addPlaceName("mysore");

		addPlace = FCMTravel.addPlaceName("nandi hills");
		FCMTravel.addPlaceName("nandi hills");

		addPlace = FCMTravel.addPlaceName("mangalore");
		FCMTravel.addPlaceName("mangalore");

		addPlace = FCMTravel.addPlaceName("hampi");
		FCMTravel.addPlaceName("hampi");

		addPlace = FCMTravel.addPlaceName("murudeshwar");
		FCMTravel.addPlaceName("murudeshwar");

		addPlace = FCMTravel.addPlaceName("sakleshpur");
		FCMTravel.addPlaceName("sakleshpur");

		addPlace = FCMTravel.addPlaceName("bidar");
		FCMTravel.addPlaceName("bidar");

		addPlace = FCMTravel.addPlaceName("hoskote");
		FCMTravel.addPlaceName("hoskote");

		addPlace = FCMTravel.addPlaceName("belgaum");
		FCMTravel.addPlaceName("belgaum");

		FCMTravel.readtouristPlaceNames();

		FCMTravel.updatePlaceName("joga" , "bidar");

		FCMTravel.readtouristPlaceNames();

		FCMTravel.deletePlaceName("belgaum");

		FCMTravel.readtouristPlaceNames();

		System.out.println("Main ended");
	}
}