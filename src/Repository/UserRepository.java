package Repository;

import Entities.User;
import Repository.Query.Query;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

public class UserRepository implements IUserRepository, Query {

    private Connection connection;
    public UserRepository(Connection connection){
        this.connection = connection;
    }
    @Override
    public boolean saveUser(User user) {
        String query = Query.insertUser;
        try{
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setInt(3,user.getMobNumber());

            int affectedRows = statement.executeUpdate();
            if(affectedRows > 0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<User> getUser(String email) {
        return null;
    }
}
