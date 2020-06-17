/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad;

import sistemaacad.DAO.DbConnection;

/**
 *
 * @author 11621095
 */
public class SistemaACAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
    	DbConnection con = new DbConnection();
    	
    	con.getConnection();
    }
    
}
