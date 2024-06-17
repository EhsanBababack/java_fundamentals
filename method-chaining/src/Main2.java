public class Main2 {
    public static void main(String[] args) {
        QueryBuilder queryBuilder = QueryBuilder.build();
        queryBuilder.select("Ehsan").from("Student").where("name='EHSAN'").print();
    }
}
