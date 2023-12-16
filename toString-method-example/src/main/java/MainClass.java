public class MainClass {
    public static void main(String[] args) {
        System.out.println("BEFORE TOSTRING METHOD :");
        Person person = new Person();
        System.out.println(person);
        System.out.println("AFTER TOSTRING METHOD :");
        Person2 person1 = new Person2("Ehsan", "Bababack", 31);
        System.out.println(person1);
        System.out.println("ARRAY :");
        Person2 person2 = new Person2("Ali", "Rezaei", 28);
        Person2 person3 = new Person2("Majid", "Kazemi", 41);
        Person2[] people = {person1 , person2 , person3} ;
        for (int i = 0 ;i<people.length  ; i++){
            System.out.println(people[i].toString());
        }
    }
}
