package br.newton.ModelsTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import sistemaacad.DAO.DBConnectionOrmLiteConnectionSource;
import sistemaacad.Models.Aluno;
import sistemaacad.Models.MockUtils;
import sistemaacad.Models.Pessoa;
import sistemaacad.Models.Professor;


public class ModelPessoaTest {
	
	@Test
	public void ValidarNomeSucesso() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Pessoa pessoa = AlunoDao.queryForId("1");
		assertEquals(true, pessoa.ValidarNome("Gabriel"));	
	}
	
	@Test
	public void ValidarNomeFalha() throws SQLException {
		
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Pessoa pessoa = AlunoDao.queryForId("1");
		assertEquals(false, pessoa.ValidarNome("Jordan"));	
	}
	
	@Test
	public void ValidarCpfSucesso() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Pessoa pessoa = AlunoDao.queryForId("1");		
		assertTrue(pessoa.ValidarCpf("12345678954"));
	}
	
	@Test
	public void ValidarCpfFalha() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Pessoa pessoa = AlunoDao.queryForId("1");		
		assertFalse(pessoa.ValidarCpf("1234c678954"));
	}

}
