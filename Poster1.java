class Poster1 {
    double width;
    double length;
    String content;
    String material;

    public Poster(double width, double length, String content, String material) {
        this.width = width;
        this.length = length;
        this.content = content;
        this.material = material;
    }

    public void info() {
        System.out.println("Poster Width: " + width + " inches");
        System.out.println("Poster Length: " + length + " inches");
        System.out.println("Content: " + content);
        System.out.println("Material: " + material);
    }
}

