CMP 129 – Computer Science II
Week 10 – Lab 1: Vehicle Inheritance
Learning Objectives

After completing this lab, students should be able to:

Define a base class and subclasses.
Use the extends keyword.
Inherit attributes and methods from a base class.
Call a superclass constructor using super.
Create methods specific to individual subclasses.
Instantiate and test subclass objects without polymorphism.
Assignment: Vehicle Inheritance System

Create a Java program that models different types of vehicles using inheritance.

The program must contain these four classes:

Vehicle
Car
Truck
VehicleTest

Do not use polymorphism in this assignment. Create and use Car and Truck variables directly.

Part 1: Vehicle Class

Create:

Vehicle.java

The Vehicle class must contain these private attributes:

private String make;
private String model;
private int year;
Constructor

Create a parameterized constructor:

public Vehicle(String make, String model, int year)

Use the this keyword to initialize all three attributes.

Getter and Setter Methods

Create getter and setter methods for every attribute:

getMake()
setMake()
getModel()
setModel()
getYear()
setYear()
The displayInfo() Method

Create:

public void displayInfo()

This method must clearly display the vehicle’s make, model, and year.

Part 2: Car Class

Create:

Car.java

The Car class must inherit from Vehicle:

public class Car extends Vehicle
Constructor

Create:

public Car(String make, String model, int year)

Use super() to pass the values to the Vehicle constructor.

The displayType() Method

Create:

public void displayType()

The method must print:

This is a car.

The Car class should inherit displayInfo() from Vehicle. Do not rewrite or override displayInfo() inside Car.

Part 3: Truck Class

Create:

Truck.java

The Truck class must inherit from Vehicle:

public class Truck extends Vehicle
Constructor

Create:

public Truck(String make, String model, int year)

Use super() to pass the values to the Vehicle constructor.

The displayType() Method

Create:

public void displayType()

The method must print:

This is a truck.

The Truck class should inherit displayInfo() from Vehicle. Do not rewrite or override it.

Part 4: VehicleTest Class

Create:

VehicleTest.java

Place the main() method in this class.

The program must:

Create at least two Car objects.
Create at least two Truck objects.
Use the parameterized constructors to provide each vehicle’s make, model, and year.
Call the inherited displayInfo() method for every object.
Call displayType() for every object.
Use at least one getter method.
Use at least one setter method to update vehicle information.
Display the updated vehicle information.

Create objects using their specific subclass types:

Car car1 = new Car("Toyota", "Camry", 2024);
Truck truck1 = new Truck("Ford", "F-150", 2023);

Do not use a Vehicle reference to store a Car or Truck object.

Example Output
Vehicle Information
-------------------
Make:  Toyota
Model: Camry
Year:  2024
This is a car.

Vehicle Information
-------------------
Make:  Ford
Model: F-150
Year:  2023
This is a truck.

Students may use different vehicle information.

Restrictions

For this assignment, do not use:

Polymorphic references such as:
Vehicle vehicle = new Car(...);
Arrays or collections of Vehicle objects.
Method overriding.
Abstract classes or abstract methods.
Interfaces.

Each Car and Truck object must be declared and used directly.

General Requirements
Keep all Vehicle attributes private.
Use inheritance with the extends keyword.
Use super() in the subclass constructors.
Place every public class in a separate Java file.
Do not place main() in Vehicle, Car, or Truck.
Follow standard Java naming and formatting conventions.
Use meaningful object and variable names.
Include comments explaining inheritance, constructors, and important methods.
Test every constructor, getter, setter, and required method.
Ensure the program compiles and runs without errors.
Be prepared to explain how Car and Truck inherit from Vehicle.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization

Keep these files directly in the repository root:

- `CMP129-Week-10-Lab-01.md`
- `AI-Use-Report.md`
- `Vehicle.java`
- `Car.java`
- `Truck.java`
- `VehicleTest.java`

Do not create or use a `src` folder.


Submission

Students must push:

Vehicle.java
Car.java
Truck.java
VehicleTest.java
Lab-01/AI-Use-Report.md

Suggested commit messages:

Create Vehicle base class
Add Car and Truck subclasses
Complete vehicle inheritance tests
