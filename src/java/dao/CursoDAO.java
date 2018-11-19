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
import java.util.ArrayList;
import java.util.List;
import vo.Curso;
import vo.Persona;

/**
 *
 * @author Labing
 */
public class CursoDAO implements IBaseDatos<Curso>{
    
    public Curso find(int cod) throws SQLException{
       Curso resultado = null;
       String query="Select * from Persona Where codigoCurso ="+ cod;
       Connection connection = Conexion.getConnection();
        try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0,codProfe=0;
	    String nombre = null;
	    if (rs.next()){
                resultado = new Curso();
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
    public List<Curso> findAll() throws SQLException {
        	List<Curso> cursos= null;
	    String query = "SELECT * FROM Curso";
	    Connection connection = Conexion.getConnection();
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0,codProfe=0;
	    String nombre = null;
	    while (rs.next()){
	    	if(cursos == null){
	    		cursos= new ArrayList<Curso>();
	    	}
	      
	        Curso registro= new Curso();
	        id = rs.getInt("codigoCurso");
	        registro.setCod(id);
	        nombre = rs.getString("nombreCurso");
	        registro.setNombre(nombre); 
	        codProfe = rs.getInt("codigoProfesor");
                registro.setCodProfe(codProfe);
                cursos.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Cursos");
			e.printStackTrace();
		}
	    
	    return cursos;
    }

    @Override
    public boolean insert(Curso t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Curso t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Curso t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
