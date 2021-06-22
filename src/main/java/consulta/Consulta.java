package consulta;

import connection.ConnectionDb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Consulta {
    private Statement statement;
    private ResultSet rs;
    Connection conexion;

    public ArrayList consultaActor(String columna) {
        ArrayList<String> first_name = new ArrayList<>();
        ArrayList<Short> actor_id = new ArrayList<>();
        ArrayList<String> last_name = new ArrayList<>();
        try {
            statement = conexion.createStatement();
            statement.setQueryTimeout(30);
            rs = statement.executeQuery("SELECT * from actor");
            while (rs.next()) {

                actor_id.add(rs.getShort("actor_id"));
                first_name.add(rs.getString("first_name"));
                last_name.add(rs.getString("last_name"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        switch (columna) {
            case "actor-id":
                return actor_id;
            case "first_name":
                return first_name;
            case "last_name":
                return last_name;
            default:
                return null;

        }
    }

    public ArrayList consultaAddress(String columna) {
        ArrayList<String> address = new ArrayList<>();
        ArrayList<String> district = new ArrayList<>();
        ArrayList<Integer> city_id = new ArrayList<>();
        ArrayList<Long> postal_code = new ArrayList<>();
        ArrayList<Integer> phone = new ArrayList<>();
        ArrayList<String> location = new ArrayList<>();
        try {
            statement = conexion.createStatement();
            statement.setQueryTimeout(30);
            rs = statement.executeQuery("SELECT * from address");
            while (rs.next()) {
                address.add(rs.getString("address"));
                district.add(rs.getString("district"));
                city_id.add(rs.getInt("city_id"));
                postal_code.add(rs.getLong("postal_code"));
                phone.add(rs.getInt("phone"));
                location.add(rs.getString("location"));


            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        switch (columna) {
            case "address":
                return address;
            case "district":
                return district;
            case "city_id":
                return city_id;
            case "postal_code":
                return postal_code;
            case "phone":
                return phone;
            case "location":
                return location;
            default:
                return null;
        }
    }

    public ArrayList consultarCategory(String columna){

            ArrayList<Short> category_id = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
        try {
            statement = conexion.createStatement();
            statement.setQueryTimeout(30);
            rs = statement.executeQuery("SELECT * from category");
            while(rs.next()){
              category_id.add(rs.getShort("category_id"));
              name.add(rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        switch (columna){
            case "category_id":
                return category_id;
            case "name":
                return name;
            default:
                return null;
        }

    }

}
