/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1;

/**
 *
 * @author Usuario
 */
public abstract class Conexiones {
    abstract Conn getconn();
    
    public void query()
    {
        Conn conn=getconn();
        conn.connect();
        conn.query();
    }
}
