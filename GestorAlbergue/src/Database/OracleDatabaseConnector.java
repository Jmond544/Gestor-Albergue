package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDatabaseConnector {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public OracleDatabaseConnector(String username, String password) {
        this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.username = username;
        this.password = password;
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa a la base de datos Oracle.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos Oracle: " + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Desconexión exitosa de la base de datos Oracle.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión de la base de datos Oracle: " + e.getMessage());
        }
    }
    
    public ResultSet executeQuery(String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        return resultSet;
    }

    public static void main(String[] args) {
        String username = "HR"; // Cambia los valores según tu configuración
        String password = "hr"; // Cambia los valores según tu configuración

        OracleDatabaseConnector connector = new OracleDatabaseConnector(username, password);

        connector.connect();

        // Realiza las operaciones necesarias en la base de datos

        connector.disconnect();
    }
}
