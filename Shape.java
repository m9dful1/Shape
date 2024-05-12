// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate surface area
    abstract double surfaceArea();
    // Abstract method to calculate volume
    abstract double volume();
}

// Class Sphere that extends Shape
class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere with radius " + radius + ": Surface area = " + surfaceArea() + ", Volume = " + volume();
    }
}

// Class Cylinder that extends Shape
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius " + radius + " and height " + height + ": Surface area = " + surfaceArea() + ", Volume = " + volume();
    }
}

// Class Cone that extends Shape
class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    @Override
    public String toString() {
        return "Cone with radius " + radius + " and height " + height + ": Surface area = " + surfaceArea() + ", Volume = " + volume();
    }
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
