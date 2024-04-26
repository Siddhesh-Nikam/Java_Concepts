import java.sql.*;

public class Main{

    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="Satara@123";

    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }

        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        //Display

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "select * from students";
            ResultSet resultset = statement.executeQuery(query);
            while(resultset.next())
            {
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                int age = resultset.getInt("age");
                double marks = resultset.getDouble("marks");
                System.out.println("id:"+id+" name:"+name+" age:"+age +" marks:"+marks);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

        //Insert

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO students(name,age,marks) VALUES ('%s',%o,%f)","Rahul",23,92.87);
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0)
            {
                System.out.println("Data inserted sucessfully");
            }

            else
            {
                System.out.println("Data not inserted");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

        //Update

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = String.format("UPDATE students SET marks = %f WHERE id= %d" , 89.5,2 );
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0)
            {
                System.out.println("Data updated sucessfully");
            }

            else
            {
                System.out.println("Data not updated");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

        //Delete

        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "DELETE FROM students WHERE ID=3";
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0)
            {
                System.out.println("Data deleted sucessfully");
            }

            else
            {
                System.out.println("Data not deleted");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}