import java.sql.*;

class Jdbc{
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/jdbc_flexi";
        String username = "sayantan";
        String password = "sayantan";
        String query = "select * from students";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            String name = rs.getString("name");
            System.out.println(name);
        }

        st.close();
        con.close();
        System.out.println("Connection closed");
    }
}