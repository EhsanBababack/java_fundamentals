public class QueryBuilder {
    private StringBuilder query = new StringBuilder();


    public static QueryBuilder build() {
        QueryBuilder queryBuilder = new QueryBuilder();
        return queryBuilder;
    }

    public QueryBuilder select(String attributes) {
        this.query.append("SELECT ").append(attributes);
        return this;
    }

    public QueryBuilder from(String tableName) {
        this.query.append(" FROM ").append(tableName);
        return this;
    }

    public QueryBuilder where(String condition) {
        this.query.append(" WHERE ").append(condition);
        return this;
    }

    public void print() {
        System.out.println(this.query);
    }
}
