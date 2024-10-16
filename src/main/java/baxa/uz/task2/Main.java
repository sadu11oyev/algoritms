package baxa.uz.task2;

public class Main {
    public static void main(String[] args) {
        String query= """
                DELETE FROM ClientBalance
                WHERE ctid NOT IN (
                    SELECT MIN(ctid)
                    FROM ClientBalance
                    GROUP BY client_name, client_balance_date, client_balance_value
                );
                """;
        System.out.println(query);
    }
}
