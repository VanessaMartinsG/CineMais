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
                            + "(nome,estudante,idade,email,senha) VALUES(?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cliente.getNome());
            stmt.setBoolean(2, cliente.isEstudante());
            stmt.setInt(3, cliente.getIdade());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getSenha());
            
            

            // Execução da SQL
            stmt.executeUpdate();

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public Cliente select(Cliente cliente) {

        PreparedStatement stmt = null;
        ResultSet rs = null;


        try {
            stmt = this.conn.prepareStatement("SELECT * FROM " + this.Table + " WHERE email like ?");
            stmt.setString(1, cliente.getEmail());
            rs = stmt.executeQuery();

            while (rs.next()) {
        

                cliente.setNome(rs.getString("nome"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setEstudante(rs.getBoolean("estudante"));

            }

            this.conn.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;
    }
}
