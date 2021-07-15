package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Aplication {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        MagazinesDAO magazinesDAO = new MagazinesDAO(ConnectionUtils.openConection());

        magazinesDAO.insert(new Magazines("ego",19,12));
        magazinesDAO.insert(new Magazines("megan",19,12));

        magazinesDAO.readAll().forEach(System.out::println);

    }
}
