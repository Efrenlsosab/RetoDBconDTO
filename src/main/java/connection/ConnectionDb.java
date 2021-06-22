package connection;

import java.sql.*;

public class ConnectionDb {
    private Connection conexion = null;


    public void conectarBD(){
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/efrenSosa?user=sofka_training&password=BZenX643bQHw&serverTimezone=UTC");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
    public void cerrarBD(){
        try {
            if(conexion != null){
                conexion.close();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
