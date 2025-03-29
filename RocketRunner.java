class RocketRunner {
    public static void main(String[] args) 
	{
        Rocket rocket1 = new Rocket("Falcon 9", "SpaceX", 70.0, 3.7, 549054, 22800, 2, "RP-1/LOX", 7607, 162, true, "Cape Canaveral", "2022-06-01", "Satellite Deployment", false, 9, 27000, true, "LEO", "ISS");
        
		rocket1.display();

        Rocket rocket2 = new Rocket("Saturn V", "NASA", 110.6, 10.1, 2970000, 140000, 3, "RP-1/LOX & LH2", 34000, 150, false, "Kennedy Space Center", "1969-07-16", "Moon Mission", true, 5, 39750, true, "TLI", "Moon");
        
		rocket2.display();
		
		Rocket rocket3 = new Rocket("GSLV Mk III", "ISRO", 43.43, 640, 8600, 10000, 200000, 3, "UH25/N2O4", 10000,36000, "Satish Dhawan Space Center", false, "Orbital", 0, false, false, "2014-12-18", 10, "India");
        
		rocket3.display();
    }
}