package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDao {
    private Connection conn;
    private final String Table = "cliente";

    public ClienteDao(){
        this.conn = DataBase.getInstance().initDb();
    }

    public Boolean selectAndLogin(String nome, String senha){
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table + "WHERE cpf = ? and nome = ?");
            stmt.setString(1, nome);
            stmt.setString(1, senha);
            rs = stmt.executeQuery();


            this.conn.close();
            stmt.close();
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean insert(Cliente cliente) {
        PreparedStatement stmt = null;
        //int tipoEstudante = (cliente instanceof Estudante) ? 1 : 0;
        try {
            // Passagem de parametros
            stmt = this.conn.prepareStatement(
                    "INSERT INTO " + this.Table
                            + "(cpf,nome,estudante,idade) VALUES(?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setBoolean(3, cliente.isEstudante());
            stmt.setInt(4, cliente.getIdade());

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
