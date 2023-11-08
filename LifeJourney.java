// Class representing Life
class Life {
    void birth() {
        System.out.println("Life begins with birth.");
    }
}

// Class representing Childhood
class Childhood extends Life {
    void play() {
        System.out.println("Childhood is a time for play and exploration.");
    }
}

// Class representing Adolescence
class Adolescence extends Childhood {
    void learn() {
        System.out.println("Adolescence is a time for learning and self-discovery.");
    }
}

// Class representing Adulthood
class Adulthood extends Adolescence {
    void work() {
        System.out.println("Adulthood often involves work and responsibility.");
    }
}

// Class representing Old Age
class OldAge extends Adulthood {
    void rest() {
        System.out.println("Old age is a time for rest and reflection.");
    }
}

// Main class representing the journey of life
public class LifeJourney {
    public static void main(String[] args) {
        OldAge oldAge = new OldAge();

        oldAge.birth();
        oldAge.play();
        oldAge.learn();
        oldAge.work();
        oldAge.rest();
    }
}
