class Floor {
    int length;
    int breadth;
    String material;
    boolean isTiled;
}

class Terrace {
    int area;
    String type;
    boolean isOpen;
    int height;
}

class Bed {
    String size;
    String material;
    int weight;
    boolean hasHeadboard;
}

class Shirt {
    String color;
    String size;
    String brand;
    double price;
}

class Hanger {
    String material;
    int capacity;
    boolean isFoldable;
    String color;
}

class Anchor {
    double weight;
    String material;
    boolean isRustProof;
    int length;
}

class Jamoon {
    String color;
    double weight;
    boolean isSweet;
    int quantity;
}

class Hair {
    String type;
    String color;
    int length;
    boolean isCurly;
}

class IronBox {
    String brand;
    double power;
    boolean isAutomatic;
    double weight;
}

class Siren {
    int volume;
    String type;
    boolean isActive;
    int frequency;
}

class Patient {
    String name;
    int age;
    String disease;
    boolean isAdmitted;
}

class Crane {
    double capacity;
    String type;
    int height;
    boolean isOperational;
}


class Dustbin{
	string shape;
	public Dustbin() 
	{
		s.o.p("running explicit const of Dustbin");
	}
	public void open() 
	{
		string shape="Square";
		s.o.p("running open in Dustbin");
		shape="Round";
		this.shape="rectangle";
	}
	
}


class Dustbinrunner{
	public static void main(String[] values) 
	{
		Dustbin dustbin1=new Dustbin();
		dustbin1.open();
		s.o.p("nin makka:"+dustbin.shape);
		
		Dustbin dustbin1=new Dustbin();
		dustbin1.open();
		s.o.p("dustbin1:"+dustbin1.shape);
		
		Dustbin dustbin2=new Dustbin();
		dustbin2.open();
		s.o.p("double2 nin makka:"+dustbin2.shape);
	}
}





















