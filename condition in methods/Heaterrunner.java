  class Heaterrunner{

 public static void main(String[] args) {
	 System.out.println("Start of main method");
        Heater.turnOn();
        Heater.turnOff();
        Heater.turnOn();
        Heater.turnOff();
		System.out.println("end of main method");
}

}