class PlanetRunner {
	
    public static void main(String[] args) 
	{
        Planet planet1 = new Planet("Earth", 5.972, 12742, 9.81, 365.25, 24.0, false, 1, "78% Nitrogen, 21% Oxygen", true, 1.0, "15°C", "Blue", "Ancient", "Unknown", "Terrestrial", true, 23.5, true, false);
        
		planet1.display();

        Planet planet2 = new Planet("Mars", 0.641, 6779, 3.71, 687.0, 24.6, false, 2, "95% Carbon Dioxide, 3% Nitrogen", false, 1.52, "-63°C", "Red", "Ancient", "Unknown", "Terrestrial", true, 25.2, true, false);
        
		planet2.display();
		
		Planet planet3 = new Planet("Jupiter", "Gas Giant", 139820, 1898, 24.8, 4333, 778.5, true, true, 79, false,"Gas", 9.9, 3.1, false, true, -145, "Ancient", false, "Milky Way");
        
		planet3.display();
    }
}