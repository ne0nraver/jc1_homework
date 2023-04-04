package lesson8;

public class Main {
    public static void main(String[] args) {
        ImmutableMan man = new ImmutableMan("vadik", 18, new MutableAddress("minsk","lenina, 1"));
        ImmutableMan man2 = new ImmutableMan("nikita", 11, new MutableAddress("Leningrad", "Stroiteley, 5"));

        System.out.println(man.getName() + " " + man.getHairLength() + " " + man.getAddress);
        man.getAddress().setCity("Leningrad");
        man.getAddress().setStreet("Stroieley, 5");
        System.out.println(man.getName() + " " + man.getHairLength() + " " + man.getAddress);
    }
}
