package DogsYay;

public class DogsYay {
    public static void main(String[] args) {
       // part1();
//        part2();
        Dog dan = new Poodle();
        Poodle pym = new Poodle();
        pym.bark(pym);
    }

    public static void part1() {
        Dog fido1 = new Dog();
        fido1.walk();

        Beagle fido2 = new Beagle();
        fido2.walk();

//        Beagle fido3 = new Dog();
//        fido3.walk();

        Dog fido4 = new Beagle();
        fido4.walk();
    }

    public static void part2() {
        Dog dan = new Poodle();
        Poodle pym = new Poodle();

//        dan.play(dan);
//        dan.play(pym);
//
//        pym.play(dan);
//        pym.play(pym);
//
//        pym.bark(dan);
//        pym.bark(pym);
//
//        dan.bark(dan);
//        dan.bark(pym);
    }
}
