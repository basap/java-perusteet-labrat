package viikko4.lab;

public class App {
    public static void main(String[] args) {
        System.out.println("== L1 ==");
        Person p1 = new Person("Laura", 25);
        Person p2 = new Person("Pertti", 30);
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old");

        System.out.println("\n== L2 ==");
        Animal dog = new Dog("Koiru");
        Animal cat = new Cat("Kiisu");
        System.out.println(dog.name + " says " + dog.sound());
        System.out.println(cat.name + " says " + cat.sound());

        System.out.println("\n== L3 ==");
        Measurable t1 = new Thermometer(22.5);
        Measurable t2 = new Thermometer(-5.0);
        System.out.println("Thermometer 1: " + t1.measure() + " °C");
        System.out.println("Thermometer 2: " + t2.measure() + " °C");

        System.out.println("\n== L4 ==");
        Vehicle bike = new Bike("Yamaha", 15.0);
        Vehicle car = new Car("Toyota", 100.0);
        System.out.println("Bike 30 km: " + bike.travelTimeHours(30.0) + " h");
        System.out.println("Car 200 km: " + car.travelTimeHours(200.0) + " h");

        System.out.println("\n== L5 ==");
        Vehicle[] vehicles = {bike, car, null};
        double total = TravelUtils.sumTravelTimes(vehicles, 60.0);
        System.out.println("Sum of travel times (60 km): " + total + " h");

        System.out.println("\n== L6 ==");
        Book book = new Book("Nice Book", "Kirja I. Lija", 2008);
        System.out.println("Book label: " + book.label());

        System.out.println("\n== L7, L8, L9 ==");
        StudentRegister reg = new StudentRegister();
        reg.add("Alice", 10);
        reg.add("Bob", 40);
        reg.add("Charlie", 20);
        System.out.println("Search 'bo': " + reg.searchByName("bo").size() + " student(s)");
        System.out.println("Credits < 25: " + reg.searchCreditsLessThan(25).size() + " student(s)");
        System.out.println("Credits >= 20: " + reg.searchCreditsGreaterOrEqual(20).size() + " student(s)");

        System.out.println("\n== L10 ==");
        Phone phone = new Phone("iPhone", 50);
        PowerBank pb = new PowerBank("Silvercrest", 80);

        phone.use(25);
        System.out.println("Phone after 25 min use: " + phone.batteryPercent() + "%");
        phone.recharge(10);
        System.out.println("Phone after 10 min recharge: " + phone.batteryPercent() + "%");

        pb.recharge(15);
        System.out.println("PowerBank after 15 min recharge: " + pb.batteryPercent() + "%");
        pb.discharge(9);
        System.out.println("PowerBank after 9 min discharge: " + pb.batteryPercent() + "%");

        Device[] devices = {phone, pb, null};
        int avg = DeviceUtils.averageBattery(devices);
        System.out.println("Average battery of devices: " + avg + "%");
    }
}
