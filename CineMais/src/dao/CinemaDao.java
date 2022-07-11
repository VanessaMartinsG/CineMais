package dao;

import model.Cinema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CinemaDao {
    private Connection conn;
    private final String Table = "cinema";
    
    public CinemaDao(){
        this.conn = DataBase.getInstance().initDb();
    }


    public List<Cinema> select() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cinema> cinemas = new ArrayList<>();

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cinema cinema = new Cinema();
                cinema.setNome(rs.getString("nomeCinema"));
                cinema.setShopping(rs.getString("nomeShopping"));

                //SalaProjecaoDao sDao = new SalaProjecaoDao();
                //cinema.setSalasProjecao(sDao.select(cinema));

                cinemas.add(cinema);
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cinemas;
    }
}
