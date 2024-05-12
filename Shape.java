// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate surface area
    abstract double surfaceArea();
    // Abstract method to calculate volume
    abstract double volume();
}

// Class Sphere that extends Shape
class Sphere extends Shape {
    private double radius; // Radius of the sphere

    public Sphere(double radius) {
        this.radius = radius; // Initialize radius
    }

    @Override
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    } // Calculate surface area

    @Override
    double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    } // Calculate volume

    @Override
    public String toString() {
        return "Sphere with radius " + radius + ": Surface area = " + surfaceArea() + ", Volume = " + volume();
    } // Return sphere data
}

// Class Cylinder that extends Shape
class Cylinder extends Shape {
    private double radius; // Radius of the cylinder
    private double height; // Height of the cylinder

    public Cylinder(double radius, double height) {
        this.radius = radius; // Initialize radius
        this.height = height; // Initialize height
    }

    @Override
    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height); // Calculate surface area
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height; // Calculate volume
    }

    @Override
    public String toString() {
        return "Cylinder with radius " + radius + " and height " + height + ": Surface area = " + surfaceArea() + ", Volume = " + volume();
    } // Return cylinder data
}

// Class Cone that extends Shape
class Cone extends Shape {
    private double radius; // Radius of the cone
    private double height; // Height of the cone

    public Cone(double radius, double height) { 
        this.radius = radius; // Initialize radius
        this.height = height; // Initialize height
    } 

    @Override
    double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    } // Calculate surface area

    @Override
    double volume() {
        return (Math.PI * radius * radius * height) / 3;
    } // Calculate volume

    @Override
    public String toString() {
        return "Cone with radius " + radius + " and height " + height + ": Surface area = " + surfaceArea() + ", Volume = " + volume();
    } // Return cone data
}

// Driver class ShapeArray
class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3]; // Array to store Shape objects
        shapeArray[0] = new Sphere(5); // Instantiate Sphere
        shapeArray[1] = new Cylinder(3, 4); // Instantiate Cylinder
        shapeArray[2] = new Cone(3, 5); // Instantiate Cone

        // Loop through the array and print each object's data using toString method
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        } 
    }
}
