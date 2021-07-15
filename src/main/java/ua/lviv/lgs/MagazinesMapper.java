package ua.lviv.lgs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MagazinesMapper {

    public static Magazines map(ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name");
        int date_of_relese = resultSet.getInt("date_of_relese");
        int nomber_of_relese = resultSet.getInt("nomber_of_relese");

        return new Magazines(name,date_of_relese,nomber_of_relese);

    }

}
