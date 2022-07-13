package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Ingresso;

public class IngressoDao {
    private Connection conn;
    private final String Table = "ingresso";

    public IngressoDao(){
        this.conn = DataBase.getInstance().initDb();
    }

    public boolean insert(Ingresso ingresso) {
        PreparedStatement stmt = null;
        //int tipoEstudante = (cliente instanceof Estudante) ? 1 : 0;
        try {
            // Passagem de parametros
            stmt = this.conn.prepareStatement(
                    "INSERT INTO " + this.Table 
                            + "(clienteCpf,preco,status,idSessao) VALUES(?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, ingresso.getCliente().getCpf());
             stmt.setFloat(2, ingresso.getSessao().getFilme().getPreco()); 
              stmt.setString(3, ingresso.getStatus()); 
               stmt.setInt(4, ingresso.getSessao().getNumeroSessaoId());   

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
