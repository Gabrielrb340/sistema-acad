/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sistemaacad.DAO.DBConnectionOrmLiteConnectionSource;
import sistemaacad.Models.*;
import sistemaacad.Models.BasicModel;

/**
 *
 * @author 11621095
 */
public class SistemaACAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	ConnectionSource c =DBConnectionOrmLiteConnectionSource.getConnectionSource();
    	try {
			TableUtils.createTableIfNotExists(c, Aluno.class);
			TableUtils.createTableIfNotExists(c, Curso.class);
			TableUtils.createTableIfNotExists(c, Disciplina.class);
			TableUtils.createTableIfNotExists(c, DisciplinaPreRequisitos.class);
			TableUtils.createTableIfNotExists(c, Professor.class);
			TableUtils.createTableIfNotExists(c, Secretaria.class);
			TableUtils.createTableIfNotExists(c, Turma.class);
//	        Dao<Aluno, String> AlunoDao =
//	                DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
//	        Collection<Aluno> alunos =  AlunoDao.queryForAll();
//	        	for (Aluno aluno : alunos) {
//					System.out.print("Nome do aluno:"+aluno.getNome());
//				}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}

    }
    
}
