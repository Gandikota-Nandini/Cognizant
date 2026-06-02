import java.sql.*;

public class TransactionDemo {

    public static void transfer(
            int from,
            int to,
            double amount)
            throws Exception {

        Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bank",
                        "root",
                        "root");

        try {

            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance - ? WHERE id=?");

            debit.setDouble(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance + ? WHERE id=?");

            credit.setDouble(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            con.commit();

        } catch (Exception e) {

            con.rollback();
        }

        con.close();
    }
}