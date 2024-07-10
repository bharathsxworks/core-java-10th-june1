 class Television {

    static boolean isTvOn = false;

    public static void turnOn() {
        System.out.println("Start of turnOn method");

        if (isTvOn==false) {
            isTvOn = true;
            System.out.println("Television is turned on");
        }

        System.out.println("End of turnOn method");
		return;
    }

    public static void turnOff() {
        System.out.println("Start of turnOff method");

        if (isTvOn==true) {
            isTvOn = false;
            System.out.println("Television is turned off");
        }

        System.out.println("End of turnOff method");
		return;
    }

   
    
}
