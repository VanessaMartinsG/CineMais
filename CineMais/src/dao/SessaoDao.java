package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Filme;
import model.Sala;
import model.Sessao;

public class SessaoDao {
    private Connection conn;
    private final String Table = "sessao";

    public SessaoDao(){
        this.conn = DataBase.getInstance().initDb();
    }

    public List<Sessao> select() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Sessao> sessoes = new ArrayList<>();

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Sessao sessao = new Sessao();

                sessao.setNumeroSessaoId(rs.getInt("numero"));
                sessao.setHorario(rs.getString("horario"));
                

                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("filmeId"));
                FilmeDao fDao = new FilmeDao();
                sessao.setFilme(fDao.select(filme));

                // IngressoDao iDao = new IngressoDao();
                // sessao.setIngressos(iDao.select(sessao));
                // sessoes.add(sessao);
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return sessoes;
    }

    public List<Sessao> select(String data, int idCinema){
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Sessao> sessoes = new ArrayList<>();

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table + " WHERE data=? and cinemaId=?");
            stmt.setString(1, data);
            stmt.setInt(2, idCinema);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Sessao sessao = new Sessao();

                sessao.setNumeroSessaoId(rs.getInt("numero"));
                sessao.setHorario(rs.getString("horario"));
                sessao.setData(rs.getString("data"));
                sessao.setCinemaId(rs.getInt("cinemaId"));

                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("filmeId"));
                FilmeDao fDao = new FilmeDao();
                sessao.setFilme(fDao.select(filme));

                Sala sala = new Sala();
                sala.setIdSala(rs.getInt("salaId"));
                SalaDao fSalaDao = new SalaDao();
                sessao.setSala(fSalaDao.select(sala));

                sessoes.add(sessao);
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return sessoes;
    }

    public List<Sessao> select(Sala sala) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Sessao> sessoes = new ArrayList<>();

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table + " WHERE numero=?");
            stmt.setInt(1, sala.getNumero());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Sessao sessao = new Sessao();

                sessao.setNumeroSessaoId(rs.getInt("numero"));
                sessao.setHorario(rs.getString("horario"));
                

                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("filmeId"));
                FilmeDao fDao = new FilmeDao();
                sessao.setFilme(fDao.select(filme));

            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return sessoes;
    }

}
