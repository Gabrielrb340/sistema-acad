/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import sistemaacad.DAO.DBConnectionOrmLiteConnectionSource;
import sistemaacad.DAO.DbConnection;;

/**
 *
 * @author 11621095
 */
@DatabaseTable(tableName = "Aluno")
public class Aluno extends Pessoa {

	@ForeignCollectionField(eager = false)
	private ForeignCollection<Curso> Curso;
	@DatabaseField(canBeNull = false)
	private boolean Ativo;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "Curso_id")
	private Curso CursoObject;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "turma_id")
	private Turma TurmaRelationship;

	public Aluno() {
		super();
	}

	public Aluno(int id, String nome, String endereco, String telefone, ForeignCollection<Curso> curso, boolean ativo) {
		super(nome, telefone, endereco);
		Curso = curso;
		Ativo = ativo;
	}

	public boolean isAtivo() {
		return Ativo;
	}

	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}

	/**
	 * @return the Curso
	 */
	public Collection<Curso> getCurso() {
		return Curso;
	}

	/**
	 * @param Curso
	 *            the Curso to set
	 */
	public void setCurso(ForeignCollection<Curso> Curso) {
		this.Curso = Curso;
	}

	public Boolean ConsultarAluno(Aluno aluno, String property) throws SQLException {
		Dao<Aluno, String> AlunoDao= DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
        Collection<Aluno> alunos= AlunoDao.queryForAll() ;	
		boolean retorno = false;
		if (property.equals("Nome")) {
			for (Aluno item : alunos) {
				if (item.getNome().equals(aluno.getNome())) {
					retorno = true;
				}
			}
		} else if (property.equals(("telefone"))) {
			for (Aluno item : alunos) {
				if (item.getTelefone().equals(aluno.getTelefone())) {
					retorno = true;
				}
			}
		} else if (property.equals("endereco")) {
			for (Aluno item : alunos) {
				if (item.getEndereco().equals(aluno.getEndereco())) {
					retorno = true;
				}
			}
		}
		return retorno;
	}
        
        public void Salvar() throws SQLException{
            Dao<Aluno, String> AlunoDao= DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Aluno.class);
            AlunoDao.create(this);
        }

}
