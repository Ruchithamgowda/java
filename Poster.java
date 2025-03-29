class Poster {
	int width;
    int length;
    String content;
    String material;
    
    public Poster() 
	{
        System.out.println("Default Poster created");
    }
 
    public Poster(String content) 
	{
        this.content = content;
    }
  
    public Poster(String content, String material) {
        this.content = content;
        this.material = material;
    }
    
    public Poster(int width, int length,String content, String material)
	{
		this.width = width;
        this.length = length;
        this.content = content;
        this.material = material;
        
    }

    public void displayInfo() {
        System.out.println("Poster Details:");
		System.out.println("Width: " + this.width + " inches");
        System.out.println("Length: " + this.length + " inches");
        System.out.println("Content: " + this.content);
        System.out.println("Material: " + this.material);
        
    }
}