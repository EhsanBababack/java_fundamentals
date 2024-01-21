import java.util.Comparator;

public class AgeComparator implements Comparator {

    @Override

    public int compare(Object o1, Object o2) {

        Person person1=(Person) o1;

        Person person2=(Person) o2;

        if(person1.getAge()==person2.getAge())

            return 0;

        if(person1.getAge()>person2.getAge())

            return 1;

        return -1;

    }

}