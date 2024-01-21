public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Ehsan",32);
        Person p2 = new Person(2,"Ali",32);
        AgeComparator ageComparator = new AgeComparator();
        int compare = ageComparator.compare(p1, p2);
        System.out.println(compare);

    }
}
