class TeaPointRunner{
	
	public static void main(String[] chai){
		System.out.println("Main started");

		boolean teaAdded = TeaPoint.addTeaNames("Green tea");
		System.out.println("Tea name added");

		teaAdded = TeaPoint.addTeaNames("Ginger tea");
		System.out.println("Tea name added");

		teaAdded = TeaPoint.addTeaNames("Amurut tea");
		System.out.println("Tea name added");

		teaAdded = TeaPoint.addTeaNames("Elachi tea");
		System.out.println("Tea name added");
		TeaPoint.addTeaNames("Green tea");

		TeaPoint.addTeaNames("Ginger tea");

		TeaPoint.addTeaNames("Amurut tea");

		TeaPoint.addTeaNames("Elachi tea");

		TeaPoint.addTeaNames("Normal tea");

		TeaPoint.addTeaNames("Lemon tea");

		TeaPoint.addTeaNames("tea");

		TeaPoint.readTeaNames();

		teaAdded = TeaPoint.addTeaNames("Normal tea");
		System.out.println("Tea name added");
		TeaPoint.updateTeaName("Masala Tea", "Normal tea");

		teaAdded = TeaPoint.addTeaNames("Lemon tea");
		System.out.println("The name added");
		TeaPoint.readTeaNames();

		teaAdded = TeaPoint.addTeaNames(" tea");
		System.out.println("The name added");
		TeaPoint.deleteTeaName("Normal tea");

		TeaPoint.readTeaNames();

		System.out.println("Main ended");
	}
}