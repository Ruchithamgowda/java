class VarScope{
	static double temperature = 36.5; // Static variable
	public static void main(String[] args){
		System.out.println("Inside main\nTemperature: " + temperature); // Accessing static variable

        {
            int heartRate = 72;
            int bloodPressure = 120;
            System.out.println("Inner Scope - Heart Rate: " + heartRate);
            System.out.println("Inner Scope - Blood Pressure: " + bloodPressure);
        }
		
		// System.out.println(heartRate); 
        // System.out.println(bloodPressure); 

        String heartRate = "72 BPM"; 
        System.out.println("New Heart Rate: " + heartRate);
		
	}
}