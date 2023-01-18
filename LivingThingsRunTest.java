package HomeworkWeek4;

public class LivingThingsRunTest {
    public static void main(String[] args) {

        System.out.println("==================== Nature Basics ====================");
        LivingThings n = new LivingThings();

        n.nutrition();
        n.energy();
        n.excretion();
        n.growth();
        n.reproduction();
        n.sensitivity();
        n.movement();

        System.out.println("==================== Animal Kingdom ====================");
        AnimalKingdom a = new AnimalKingdom();

        a.eat();
        a.sleep();
        a.think();
        a.communicate();
        a.awareness();
        a.intelligence();
        a.sound();
        a.recognition();
        a.movement();
        a.willToLive();

        System.out.println("==================== Humans Kingdom ====================");
        Humans h = new Humans();

        h.eat();
        h.sleep();
        h.think();
        h.communicate();
        h.awareness();
        h.intelligence();
        h.sound();
        h.recognition();
        h.movement();
        h.willToLive();

        System.out.println("==================== Birds Kingdom ====================");
        Birds b = new Birds();

        b.eat();
        b.sleep();
        b.think();
        b.communicate();
        b.awareness();
        b.intelligence();
        b.sound();
        b.recognition();
        b.movement();
        b.willToLive();

    }

}
