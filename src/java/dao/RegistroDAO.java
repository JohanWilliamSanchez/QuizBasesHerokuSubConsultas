/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import vo.Curso;

/**
 *
 * @author Labing
 */
public class RegistroDAO implements IBaseDatos<RegistroDAO> {

    public RegistroDAO find(int cod) throws SQLException{
       RegistroDAO resultado = null;
       String query="Select * from Persona Where id ="+ cod;
       Connection connection = Conexion.getConnection();
        try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0,codEstu=0,codProfe=0,semestre;
	    double nota = 0;
	    if (rs.next()){
                resultado = new RegistroDAO();
               
	        id = rs.getInt("codigoCurso");
	        resultado.setCod(id);
	        nombre = rs.getString("nombreCurso");
	        resultado.setNombre(nombre); 
	        codProfe = rs.getInt("codigoProfesor");
                resultado.setCodProfe(codProfe);
                
	    }
	    st.close();
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener persona");
			e.printStackTrace();
		}
	    return resultado;
    }
    
    
    @Override
    public List<RegistroDAO> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(RegistroDAO t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(RegistroDAO t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(RegistroDAO t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
