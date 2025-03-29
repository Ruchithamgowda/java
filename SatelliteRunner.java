class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite("Hubble", "Telescope", 11110, 547, "1990-04-24", "USA", "NASA", true, 28000,"Low Earth Orbit", 30, "Hydrazine", true, 2200, false, 2, "Astronomical Observation", true, 500, true);
        
		satellite1.display();

        Satellite satellite2 = new Satellite("GPS III", "Navigation", 3880, 20200, "2020-06-30", "USA", "US Space Force", true, 14000,"Medium Earth Orbit", 15, "Solid Fuel", true, 1575, false, 1, "Global Positioning", false, 250, false);
        
		satellite2.display();
		
		Satellite satellite3 = new Satellite("INSAT-3D", "India", "Meteorological", 2060, 36000, 12,"2013-07-26", "Ariane 5", false, true, "Radio",1700, 250, "Chemical Propulsion", true, false, 5, "Weather Monitoring", false, "ISRO");
        
		satellite3.display();
    }
}