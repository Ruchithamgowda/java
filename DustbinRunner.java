class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin("CleanMax", "Plastic", 30, "Blue", true, true, true, 60.5, 35.0, 1200, true, false, "Round", 2, "Household", true, false, false, "Pedal", 1200);
		
        dustbin1.display();
        
        Dustbin dustbin2 = new Dustbin("EcoBin", "Steel", 50, "Silver", true, false, false, 75.0, 40.0, 2500, true, true, "Rectangular", 3, "Commercial", false, true, true, "Sensor", 4500);
		
        dustbin2.display();
        
        Dustbin dustbin3 = new Dustbin("GreenEarth", "Biodegradable", 20, "Green", false, false, true, 45.0, 30.0, 800, false, false, "Square", 1, "Garden", true, true, false, "Manual", 900);
		
        dustbin3.display();
    }
}