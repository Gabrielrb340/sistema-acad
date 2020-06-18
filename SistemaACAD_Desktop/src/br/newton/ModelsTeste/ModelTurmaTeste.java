package br.newton.ModelsTeste;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import sistemaacad.DAO.DBConnectionOrmLiteConnectionSource;
import sistemaacad.Models.Aluno;
import sistemaacad.Models.EnumTurno;
import sistemaacad.Models.MockUtils;
import sistemaacad.Models.Turma;

public class ModelTurmaTeste {

	@Test 
	public void VerificarAlunoCadastradoTurmaSucesso() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Dao<Turma,String> TurmaDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Turma.class);
		Turma turma = TurmaDao.queryForId("1");
		turma.setAluno(AlunoDao.queryForEq("turma_id", "1"));
		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel");
		assertEquals(true,turma.VerificarAlunoCadastradoTurma(aluno, "Nome"));
	}
	@Test 
	public void VerificarAlunoDisponivelParaCadastro() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Dao<Turma,String> TurmaDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Turma.class);
		Turma turma = TurmaDao.queryForId("1");
		turma.setAluno(AlunoDao.queryForEq("turma_id", "1"));
		Aluno aluno = new Aluno();
		aluno.setNome("Luiz");
		assertEquals(false,turma.VerificarAlunoCadastradoTurma(aluno, "Nome"));

	}
	@Test 
	public void VerificarDisponibilidadeVagasTurmaLotadaSucesso() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Dao<Turma,String> TurmaDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Turma.class);
		Turma turma = TurmaDao.queryForId("2");
		turma.setAluno(AlunoDao.queryForEq("turma_id", "2"));
		assertEquals(false,turma.VerificarDisponibilidadeVagasTurma());		
	}
	@Test 
	public void VerificarDisponibilidadeVagasTurmaDisponibilidade() throws SQLException {
		Dao<Aluno,String> AlunoDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
		Dao<Turma,String> TurmaDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Turma.class);
		Turma turma = TurmaDao.queryForId("1");
		turma.setAluno(AlunoDao.queryForEq("turma_id", "1"));

		assertEquals(true,turma.VerificarDisponibilidadeVagasTurma());		
	}
}
