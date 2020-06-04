package br.newton.ModelsTeste;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.Collection;

import org.junit.Test;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.ForeignCollection;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sistemaacad.DAO.DBConnectionOrmLiteConnectionSource;
import sistemaacad.Models.Aluno;
import sistemaacad.Models.Curso;
import sistemaacad.Models.MockUtils;
import sistemaacad.Models.Professor;
public class ModelProfessorTeste {
	
	@Test
	public void VerificarProfessorVinculadoCursoSucesso()  {
		try {
	        Dao<Professor, String> ProfessorDao =  DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Professor.class);
	        Dao<Curso,String>CursoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(),Curso.class);
            Professor pes = ProfessorDao.queryForId("1");
            pes.setCurso(CursoDao.queryForEq("professor_id", pes.getId()));
    		assertTrue(pes.VerificarProfessorVinculadoCurso(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
      
		
	}
	
	@Test
	public void VerificarProfessorVinculadoCursoFalha() {	
		try {
	        Dao<Professor, String> ProfessorDao =  DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Professor.class);
	        Dao<Curso,String>CursoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(),Curso.class);
            Professor pes = ProfessorDao.queryForId("1");
            pes.setCurso(CursoDao.queryForEq("professor_id", pes.getId()));
    		assertFalse(pes.VerificarProfessorVinculadoCurso(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
