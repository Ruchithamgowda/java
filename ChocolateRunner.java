class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Cadbury Dairy Milk", "Milk Chocolate", 50, 40, 30, true, false, false, "India", "Classic", "Wrapper", 12, false, false, "None", "2025-02-01", "2026-02-01", true, "Smooth", false);
        
		chocolate1.display();

        Chocolate chocolate2 = new Chocolate("Lindt Excellence", "Dark Chocolate", 100, 250, 85, false, false, false, "Switzerland", "Intense", "Box", 18, true, true, "Limited Edition", "2025-01-15", "2026-07-15", false, "Velvety", true);
        
		chocolate2.display();
		
		Chocolate chocolate3 = new Chocolate("Ferrero Rocher", "Hazelnut Chocolate", "Nutty", "Golden Brown", 200, 500, 50, true, true, "Italy","Gift Box", 24, false, false, false, 220, 4, 14, 22, "Hazelnuts");
        
		chocolate3.display();
    }
}