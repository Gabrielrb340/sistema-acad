/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import java.util.Collection;
import java.util.List;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemaacad.DAO.DBConnectionOrmLiteConnectionSource;

/**
 *
 * @author 11621095
 */
@DatabaseTable(tableName = "Professor")
public class Professor extends Pessoa {
	@DatabaseField(canBeNull = true)
	private String Titulacao;
	@ForeignCollectionField(eager = false)
	private ForeignCollection<Curso> CursoForeignCollection;
	private List<Curso> Curso;

	public List<Curso> getCurso() {
		return Curso;
	}

	public void setCurso(List<Curso> curso) {
		Curso = curso;
	}

	/**
	 * @return the Titulacao
	 */
	public String getTitulacao() {
		return Titulacao;
	}

	/**
	 * @param Titulacao
	 *            the Titulacao to set
	 */
	public void setTitulacao(String Titulacao) {
		this.Titulacao = Titulacao;
	}

	/**
	 * @return the Curso
	 */
	public Collection<Curso> CursoForeignCollection() {
		return CursoForeignCollection;
	}

	/**
	 * @param Curso
	 *            the Curso to set
	 */
	public void CursoForeignCollection(ForeignCollection<Curso> Curso) {
		this.CursoForeignCollection = Curso;
	}

	public boolean VerificarProfessorVinculadoCurso(int id_Curso) {
		for (Curso curso : this.Curso) {
			if (curso.getCodCurso() == id_Curso) {
				return true;
			}
		}
		return false;
	}
      public void SalvarProf(){
          Dao<Professor, String> ProfessorDao;
            try {
                ProfessorDao = DaoManager.createDao(DBConnectionOrmLiteConnectionSource.getConnectionSource(), Professor.class);
            ProfessorDao.create(this);
            } catch (SQLException ex) {
                Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
      }
}
