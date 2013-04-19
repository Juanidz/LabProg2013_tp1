/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1;

/**
 *
 * @author Usuario
 */
public class ConexionMysql extends Conexiones{
        
    @Override
    Conn getconn() {
        return new MysqlConn();
    }
    
}
