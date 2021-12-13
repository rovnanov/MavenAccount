package ru.learnup.mavenaccount.tax;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHelper {

    private Connection connection;

    public DbHelper(String url, String user, String pass) {
        try {
            this.connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
    public void addPost(Post post){
        try {
            List<Post> result = new ArrayList<>();
            final PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO manager(day, steps) VALUES (?, ?);");
            statement.setInt(1,post.getDay());
            statement.setInt(2,post.getSteps());
            statement.executeQuery();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    public List<Post> getAllPosts() {
        try {
            List<Post> result = new ArrayList<>();
            final Statement statement = (Statement) connection.createStatement();
            final ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM manager ORDER by day ASC;");
            while (resultSet.next()) {
                final int day = resultSet.getInt("day");
                final int steps = resultSet.getInt("steps");
                result.add(
                        new Post(day, steps));
            }
            return result;
        } catch (SQLException err) {
            err.printStackTrace();
            return null;
        }
    }
}
