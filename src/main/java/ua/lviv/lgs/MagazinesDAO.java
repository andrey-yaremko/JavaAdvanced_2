package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MagazinesDAO {
    private static String READ_ALL = "select * from magazines";
    private static String CREATE = "insert into magazines(name,date_of_relese,nomber_of_relese) values (?,?,?)";
    private static String READ_BY_NAME = "select * form magazines where name = ?";
    static String DELETE_BY_NAME = "delete from magazines where name = ?";

    private Connection connection;
    private PreparedStatement preparedStatement;

    public MagazinesDAO(Connection connection){
        this.connection = connection;
    }

    public void insert(Magazines magazines) throws SQLException {
        preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, magazines.getName());
        preparedStatement.setInt(2, magazines.getDate_of_relese());
        preparedStatement.setInt(3, magazines.getNomber_of_relese());
        preparedStatement.executeUpdate();
    }

    public Magazines read(String name) throws SQLException {
        preparedStatement = connection.prepareStatement(READ_BY_NAME);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        return MagazinesMapper.map(resultSet);
    }

    public void delete(String name) throws SQLException {
        preparedStatement = connection.prepareStatement(DELETE_BY_NAME);
        preparedStatement.setString(1,name);
        preparedStatement.executeUpdate();
    }

    public List<Magazines> readAll() throws SQLException {
        List<Magazines> magazinesList = new ArrayList<>();
        preparedStatement = connection.prepareStatement(READ_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            magazinesList.add(MagazinesMapper.map(resultSet));
        }
        return magazinesList;
    }
}
