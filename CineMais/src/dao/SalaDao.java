package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Sala;

public class SalaDao {
    private Connection conn;
    private final String Table = "sala";

    public SalaDao(){
        this.conn = DataBase.getInstance().initDb();
    }

    public List<Sala> select() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Sala> salas = new ArrayList<>();

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Sala sala;
                sala = new Sala();
                
                
                sala.setNumero(rs.getInt("id"));
                sala.setCapacidade(rs.getInt("capacidade"));
                sala.setSala3d(rs.getBoolean("sala3d"));
                sala.setDescricao(rs.getString("descricao"));
                sala.setIdSala(rs.getInt("salaId"));

                //SessaoDao sDao = new SessaoDao();
                //sala.setSessoes(sDao.select(sala));

                salas.add(sala);
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return salas;
    }

}
