package dao;

import model.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDao {
    private Connection conn;
    private final String Table = "filme";

    public FilmeDao(){
        this.conn = DataBase.getInstance().initDb();
    }

    public List<Filme> select() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filme> filmes = new ArrayList<>();

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("id"));
                filme.setNomeFilme(rs.getString("titulo"));
                filme.setDiretor(rs.getString("diretor"));
                filme.setAtor(rs.getString("atorPrincipal"));
                filme.setDuracao(rs.getString("duracao"));
                filme.setFaixaEtaria(rs.getInt("faixaEtaria"));
                filme.setCategoria(rs.getString("categoria"));

                filmes.add(filme);
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return filmes;
    }

    public Filme select(Filme filme) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table + " WHERE idfilme = ?");
            stmt.setInt(1, filme.getIdFilme());
            rs = stmt.executeQuery();

            while (rs.next()) {
                filme.setIdFilme(rs.getInt("idfilme"));
                filme.setNomeFilme(rs.getString("titulo"));
                filme.setDiretor(rs.getString("diretor"));
                filme.setAtor(rs.getString("atorPrincipal"));
                filme.setDuracao(rs.getString("duracao"));
                filme.setFaixaEtaria(rs.getInt("faixaEtaria"));
                filme.setCategoria(rs.getString("categoria"));
                filme.setPreco(rs.getFloat("preco"));
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return filme;
    }

}
