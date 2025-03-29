class CabRunner {

    public static void main(String[] args) 
	{
        Cab cab1 = new Cab("Toyota", "Innova", 7, "Diesel", 15.0, 2500, "White", 2000000, "Automatic", true, 3, "SUV", true, 1800, 180, 5, true, "AWD", true, "KA01AB1234");
        
		cab1.display();

        Cab cab2 = new Cab("Maruti", "Swift Dzire", 5, "Petrol", 20.0, 1200, "Silver", 800000, "Manual", true, 2, "Sedan", true, 1000, 160, 4, false, "FWD", true, "KA02CD5678");
        
		cab2.display();
		
		Cab cab3 = new Cab("Tesla", "Model 3", "Electric", 5, "Red", true, true, 15.0, 0, "Automatic", true, true, 200, true, true, "KA03EF9012", "Bob", true, "USA", 5);
       
	   cab3.display();
    }
}