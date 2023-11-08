// Class representing a City
class City {
    // Method to simulate the functioning of the city
    void runCity() {
        System.out.println("The city is bustling with life.");
    }
}

// Class representing Buildings
class Building {
    // Method representing the construction of a building
    void construct() {
        System.out.println("Building construction in progress.");
    }
}

// Class representing Streets
class Street {
    // Method representing the traffic on the streets
    void traffic() {
        System.out.println("Traffic is moving smoothly on the streets.");
    }
}

// Class representing People
class People {
    // Method representing people living and working in the city
    void live() {
        System.out.println("People are living and working in the city.");
    }
}

// Main class to simulate a city
public class CitySimulation {
    public static void main(String[] args) {
        // Creating instances of different classes
        City city = new City();
        Building building = new Building();
        Street street = new Street();
        People people = new People();

        // Calling methods to simulate city activities
        city.runCity();
        building.construct();
        street.traffic();
        people.live();
    }
}
