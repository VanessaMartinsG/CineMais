package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Ingresso;
import model.Sessao;

public class IngressoDao {
    private Connection conn;
    private final String Table = "ingresso";

    public IngressoDao(){
        this.conn = DataBase.getInstance().initDb();
    }

    public List<Ingresso> select(Sessao sessao){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Ingresso> ingressosLista = new ArrayList<>();
        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table + " WHERE idSessao like ?");
            stmt.setInt(1, sessao.getNumeroSessaoId());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Ingresso ingresso = new Ingresso();
                ingresso.setClienteEmail(rs.getString("clienteEmail"));
                ingresso.setPreco(rs.getDouble("preco"));
                ingresso.setStatus(rs.getString("status"));
                ingresso.setIdSessao(rs.getInt("idSessao"));

                ingressosLista.add(ingresso);
            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return ingressosLista;
    }

    public boolean insert(Ingresso ingresso) {
        PreparedStatement stmt = null;
        //int tipoEstudante = (cliente instanceof Estudante) ? 1 : 0;
        try {
            // Passagem de parametros
            stmt = this.conn.prepareStatement(
                    "INSERT INTO " + this.Table 
                            + "(clienteEmail, preco, status, idSessao) VALUES(?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, ingresso.getClienteEmail());
            stmt.setDouble(2, ingresso.getPreco());
            stmt.setString(3, ingresso.getStatus());
            stmt.setInt(4, ingresso.getIdSessao());
               

            // Execução da SQL
            stmt.executeUpdate();

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

   
}
