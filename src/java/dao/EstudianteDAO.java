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
import vo.Estudiante;

/**
 *
 * @author Labing
 */
public class EstudianteDAO implements IBaseDatos<Estudiante> {

    public Estudiante find(int cod) throws SQLException {
        Estudiante resultado = null;
        String query = "Select * from Persona Where codigoEstudiante =" + cod;
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int codEstu = 0, codEscuela = 0;
            String nombre = null, beca = null;
            if (rs.next()) {
                resultado = new Estudiante();
                codEstu = rs.getInt("codigoEstudiante");
                resultado.setCodEst(codEstu);
                nombre = rs.getString("nombreEstudiante");
                resultado.setNombre(nombre);
                codEscuela = rs.getInt("codigoEscuela");
                resultado.setCodEscu(codEscuela);
                beca = rs.getString("beca");
                resultado.setBeca(beca);
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Problemas al obtener Estudiante");
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public List<Estudiante> findAll() throws SQLException {
        	List<Estudiante> estudiantes= null;
	    String query = "SELECT * FROM Estudiante";
	    Connection connection = Conexion.getConnection();
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int codEstu = 0, codEscuela = 0;
            String nombre = null, beca = null;
	    while (rs.next()){
	    	if(estudiantes == null){
	    		estudiantes= new ArrayList<Estudiante>();
	    	}
	      
	        Estudiante registro= new Estudiante();
	        codEstu = rs.getInt("codigoEstudiante");
                registro.setCodEst(codEstu);
                nombre = rs.getString("nombreEstudiante");
                registro.setNombre(nombre);
                codEscuela = rs.getInt("codigoEscuela");
                registro.setCodEscu(codEscuela);
                beca = rs.getString("beca");
                registro.setBeca(beca);
                estudiantes.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Estudiantes");
			e.printStackTrace();
		}
	    
	    return estudiantes;
    }

    @Override
    public boolean insert(Estudiante t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Estudiante t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Estudiante t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
