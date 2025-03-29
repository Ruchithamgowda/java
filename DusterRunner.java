class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster("Camlin", "Foam", "White", 10, 5, 50, true, 100, "Rectangle", "Ergonomic", true, 3, "Whiteboard", true, 6, "Soft", 2, "All surfaces", true, "India");
        
		duster1.display();

        Duster duster2 = new Duster("Faber-Castell", "Microfiber", "Blue", 12, 6, 60, true, 120, "Oval", "Non-Slip", false, 4, "Blackboard", true, 8, "Rough", 3, "Wood, Metal", false, "Germany");
        
		duster2.display();
		
		Duster duster3 = new Duster("O-Cedar", "Electrostatic", "Plastic", "Red", 28, 10, 220, false, true,"Office Cleaning", 6, 250, "Ergonomic", false, false, 2, true, "Germany", true, "Oval");
        
		duster3.display();
    }
}