package DB;

import Classes.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class Enseignantdb {


    public static void main(String[] args) {

        String dburl = "jdbc:mysql://localhost:3306/test-db1";
        String username = "root";
        String password = "";

        try {
            Connection cx = DriverManager.getConnection(dburl, username, password);
            System.out.println("connect success");

        } catch (SQLException ex) {
            System.out.println("une erreur");
        }

    }

    public static void createTable(Connection cx) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS Enseignant(\n" +
                "                                       name varchar(255),\n" +
                "                                       prenom varchar\n" +
                "                                       email varhcar(100),\n" +
                "                                       grade  varhcar(100),\n" +
                "                                       departement  varhcar(100),\n" +
                ");";

        Statement st = cx.createStatement();

        st.execute(query);
    }
    public static List<Enseignant> showEnseignant(Connection cx) throws SQLException {
        String query = "SELECT * from Enseignant";
        List<Enseignant> enseignants = new ArrayList<>();

        Statement st = cx.createStatement();

        ResultSet r = st.executeQuery(query);

        while (r.next()) {
            enseignants.add(
                    new Enseignant(r.getString("name"),
                            r.getString("prenom"),
                            r.getString("email"),
                            r.getString("grade"),
                            (Departement) r.getObject("departement")


                    )
            );
        }

        return enseignants;


    }

    public static void addEnseignant(Enseignant enseignant, Connection cx) throws SQLException {
        String query = "INSERT INTO Enseignant (name, prenom,email,grade,departement) values (?,?,?,?,?)";

        PreparedStatement ps = cx.prepareStatement(query);

        ps.setString(1, enseignant.getnom());
        ps.setString(2, enseignant.getprenom());
        ps.setString(3,enseignant.getemail());
        ps.setString(4,enseignant.getgrade());
        ps.setObject(5,enseignant.getdepartement());
        ps.executeUpdate();
    }


    public static void deleteEnseignant(int id, Connection cx) throws SQLException {
        String query = "DELETE  from test_db.products where id = ?";
        PreparedStatement ps = cx.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();


    }
    public static void modifierEnseignant(int id,Enseignant enseignant,Connection cx) throws SQLException{
        String query = "UPDATE Enseignant SET nom=?,prenom=?,email=?,grade=?,departement=?  where id=?";
        PreparedStatement ps = cx.prepareStatement(query);

        ps.setString(1, enseignant.getnom());
        ps.setString(2, enseignant.getprenom());
        ps.setString(3,enseignant.getemail());
        ps.setString(4,enseignant.getgrade());
        ps.setObject(5,enseignant.getdepartement());
        ps.executeUpdate();



    }

}




