public interface EntertainmentCompany {

    void display();
}

class SuperStudio extends DisneyParent implements EntertainmentCompany {

    public void superStudioOverview() {
        System.out.println("DisneyParent is a major entertainment company that owns Super Studio.");
        System.out.println("Super Studio initiated a franchise based on comic books known as Super Universe.");
    }

}

class DisneyParent {

    public void display() {
        // Method implementation for the display
    }
}

class SuperUniverse extends SuperStudio {

    public void highlightSuperUniverse() {
        System.out.println("Super Universe is known for producing blockbusters like Superhero Chronicles, etc.");
    }
}

class GalacticHeroMovie {

    public void galacticHeroOverview() {
        System.out.println("Galactic Hero and Star Captain are crucial to this remarkable theatrical release.");
    }
}

 class Now {

    public static void main(String[] args) {

        SuperStudio superChild = new SuperStudio();
        SuperUniverse superUniverseChild = new SuperUniverse();
        GalacticHeroMovie galacticHeroMovie = new GalacticHeroMovie();

        superChild.superStudioOverview();
        superUniverseChild.highlightSuperUniverse();
        galacticHeroMovie.galacticHeroOverview();

        System.out.println(); // Add a newline for clarity
        System.out.println("WHAT!!! HUH"); // Output message
    }
}
