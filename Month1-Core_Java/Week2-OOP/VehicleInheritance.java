class Vehicle
{
String brand;
int wheels;

Vehicle(String b,int w)
{
    this.brand=b;
    this.wheels=w;

}

void displayInfo()
{
System.out.println("The Brand of Vehicle is "+brand);
System.out.println("The Number of Wheels of Vehicle has "+wheels);

}
}

class Car extends Vehicle{

int doors;
Car(String b,int w,int d)
{
super(b,w);
this.doors=d;


}
void displayCarInfo()
{
    super.displayInfo();
    System.out.println("The Number of Doors Car has"+doors);
}
}
class Bike extends Vehicle{

    boolean hasGear;
    Bike(String b,int w,boolean g)
    {

super(b,w);
this.hasGear=g;


    }
    void displayBikeInfo()
{
    super.displayInfo();
    System.out.println("The Bike has Gear"+hasGear);
}

}
public class VehicleInheritance
{
public static void main(String arg[])
{
Car car=new Car("Toyota",4,4);
car.displayCarInfo();
Bike bike =new Bike("Honda", 2, true);
bike.displayBikeInfo();
}

}