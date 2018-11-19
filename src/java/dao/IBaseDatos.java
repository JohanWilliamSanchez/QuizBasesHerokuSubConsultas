package dao;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDatos<T> {
	List<T> findAll() throws SQLException;
    boolean insert(T t) throws SQLException;
    boolean update(T t) throws SQLException ;
    boolean delete(T t) throws SQLException;
    
}
