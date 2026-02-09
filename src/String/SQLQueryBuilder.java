import java.util.ArrayList;
import java.util.List;

public class SQLQueryBuilder {

    private StringBuilder selectClause;
    private StringBuilder fromClause;
    private StringBuilder joinClause;
    private StringBuilder whereClause;
    private StringBuilder orderByClause;
    private StringBuilder limitClause;

    private boolean firstWhere = true;
    private boolean firstOrderBy = true;

    public SQLQueryBuilder(String tableName) {
        selectClause = new StringBuilder("SELECT ");
        fromClause = new StringBuilder(" FROM ").append(tableName);
        joinClause = new StringBuilder();
        whereClause = new StringBuilder();
        orderByClause = new StringBuilder();
        limitClause = new StringBuilder();
    }

    public void addSelectColumn(String column) {
        if (selectClause.toString().equals("SELECT ")) {
            selectClause.append(column);
        } else {
            selectClause.append(", ").append(column);
        }
    }

    public void addWhereCondition(String condition, String operator) {
        if (firstWhere) {
            whereClause.append(" WHERE ").append(condition);
            firstWhere = false;
        } else {
            whereClause.append(" ").append(operator).append(" ").append(condition);
        }
    }

    public void addJoin(String table, String condition) {
        joinClause.append(" JOIN ").append(table).append(" ON ").append(condition);
    }

    public void addOrderBy(String column, String direction) {
        if (firstOrderBy) {
            orderByClause.append(" ORDER BY ").append(column).append(" ").append(direction);
            firstOrderBy = false;
        } else {
            orderByClause.append(", ").append(column).append(" ").append(direction);
        }
    }

    public void setLimit(int limit) {
        limitClause.append(" LIMIT ").append(limit);
    }

    public String build() {
        StringBuilder query = new StringBuilder();
        query.append(selectClause)
                .append(fromClause)
                .append(joinClause)
                .append(whereClause)
                .append(orderByClause)
                .append(limitClause);
        return query.toString();
    }

    public static void main(String[] args) {
        SQLQueryBuilder builder = new SQLQueryBuilder("employees");

        builder.addSelectColumn("id");
        builder.addSelectColumn("name");
        builder.addSelectColumn("department");
        builder.addSelectColumn("salary");
        builder.addSelectColumn("hire_date");

        builder.addJoin("departments d", "employees.department_id = d.id");

        builder.addWhereCondition("salary > 50000", "AND");
        builder.addWhereCondition("department = 'IT'", "OR");
        builder.addWhereCondition("hire_date >= '2020-01-01'", "AND");

        builder.addOrderBy("salary", "DESC");
        builder.addOrderBy("hire_date", "ASC");

        builder.setLimit(10);

        String query = builder.build();
        System.out.println("Final Query:\n" + query);
        System.out.println("Query Length: " + query.length());
    }
}
