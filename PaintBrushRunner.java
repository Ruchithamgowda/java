class PaintBrushRunner {
    public static void main(String[] args) {
        
		PaintBrush brush1 = new PaintBrush("Camel", "Flat", "Synthetic", 10, "Black", true, true, "Wood", 150, 3, "Painting",true, true, false, 30, 5, true, "India", 1, true);
       
	    brush1.display();

        PaintBrush brush2 = new PaintBrush("Brustro", "Round", "Natural", 12, "Brown", false, true, "Plastic", 200, 5, "Fine Art",true, false, true, 25, 4, true, "Germany", 2, false);
        
		brush2.display();
    }
}