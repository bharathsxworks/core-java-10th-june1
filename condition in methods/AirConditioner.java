class AirConditioner {

    static boolean isAcOn = false;

    public static void turnOn() {
        System.out.println("Start of turnOn method");

        if (!isAcOn==false) {
            isAcOn = true;
            System.out.println("Air Conditioner is turned on");
        }

        System.out.println("End of turnOn method");
		return;
    }

    public static void turnOff() {
        System.out.println("Start of turnOff method");

        if (isAcOn==true) {
            isAcOn = false;
            System.out.println("Air Conditioner is turned off");
        }

        System.out.println("End of turnOff method");
		return;
    }

   
}
