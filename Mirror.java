class Mirror{
    String brand;
    String type;
    String material;
    String shape;
    String color;
    int height;
    int width;
    int weight;
    int thickness;
    int price;
    int warranty;
    int clarity;
    int durability;
    int reflectionquality;
    int framethickness;
    int frameweight;
    int framecolor;
    int mountingtype;
    int glasstype;
    int bordersize;
	
	public Mirror(String brand,String type,String material,String shape,String color,int height,int width,int weight,
	int thickness,int price,int warranty,int clarity,int durability,int reflectionquality,int framethickness,
	int frameweight,int framecolor,int mountingtype,int glasstype,int bordersize)
	{
		this.brand=brand;
		this.type=type;
		this.material=material;
		this.shape=shape;
		this.color=color;
		this.height=height;
		this.width=width;
		this.thickness=thickness;
		this.price=price;
		this.warranty=warranty;
		this.clarity=clarity;
		this.durability=durability;
		this.reflectionquality=reflectionquality;
		this.framethickness=framethickness;
		this.frameweight=frameweight;
        this.framecolor=framecolor;
        this.mountingtype=mountingtype;
        this.glasstype=glasstype;
		this.bordersize=bordersize;
		}
	public void display()
	{
		System.out.println("The brand name is"+brand);
		System.out.println("The type is "+type);
		System.out.println("The material is"+material);
		System.out.println("The Shape is "+shape);
		System.out.println("The color is "+color);
		System.out.println("The height is"+height);
		System.out.println("The width is"+width);
		System.out.println("The thickness is"+thickness);
		System.out.println("The price is"+price);
		System.out.println("The warranty is"+warranty);
		System.out.println("The clarity is"+clarity);
		System.out.println("The durability is"+durability);
		System.out.println("The reflectionquality is"+reflectionquality);
		System.out.println("The framethickness is"+framethickness);
		System.out.println("The frameweight is"+frameweight);
		System.out.println("the framecolor is"+framecolor);
		System.out.println("the mountingtype is"+mountingtype);
		System.out.println("The glasstype is"+glasstype);
		System.out.println("the bordersize is"+bordersize);
		System.out.println("\n");
	}

}