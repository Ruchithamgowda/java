class PosterRunner {
    public static void main(String... args) {
		int width = 26;
        int length = 38;
        String content = "Motivational Quote";
        String material = "Paper";
        
        
        Poster poster1 = new Poster(); 
        Poster poster2 = new Poster(content); 
        Poster poster3 = new Poster(content, material); 
        Poster poster4 = new Poster(width, length,content, material); 
        
        poster4.displayInfo();
    }
}
