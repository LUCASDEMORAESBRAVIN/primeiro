
package br.com.equivalencia.dao;
import com.sun.source.tree.TryTree;
import java.sql.*;
public class ModuloConexao {
   
public static Connection conector(){    
    //metodo responsavel por estabelecer a conexao com o banco de dados 
   java.sql.Connection conexao = null;
   
    //a liha abaixo chama o driver importado de conexao 
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/equivalencia";
    String user = "root";
    String password = "123456";
    
    //estabelecendo a conexão com o banco
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,user,password);
        return conexao;
    } catch (Exception e) {
        return null;
    }
}


    


}
