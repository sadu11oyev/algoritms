package baxa.uz.task2;

public class Main {
    public static void main(String[] args) {
        String query= """
                DELETE FROM clientbalance cb
                WHERE EXISTS (
                    SELECT 1
                    FROM clientbalance cb2
                    WHERE cb.client_name = cb2.client_name
                      AND cb.client_balance_date = cb2.client_balance_date
                      AND cb.client_balance_value = cb2.client_balance_value
                      AND cb.client_id <> cb2.client_id
                );
                """;
        System.out.println(query);
    }
}
