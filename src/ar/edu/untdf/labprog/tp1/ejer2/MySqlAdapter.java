/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;

/**
 *
 * @author Usuario
 */
public class MySqlAdapter implements Conn 
{
    private MsSqlServer ms = new MsSqlServer () ;
    
            public void connect () 
            {
                ms.getConnect() ;

            }
            public void query (){
                ms.ExecuteQuery();
            }
}
                    
