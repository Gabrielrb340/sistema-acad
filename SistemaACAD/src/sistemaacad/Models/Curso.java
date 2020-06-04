/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.util.List;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author 11621095
 */
@DatabaseTable(tableName = "Curso")
public class Curso {
	@DatabaseField(columnName ="CodCurso", generatedId = true)
	private Integer CodCurso;
	@DatabaseField(canBeNull = false)
	private String Descricao;
	@ForeignCollectionField(eager = false)
	private ForeignCollection<Aluno> Curso;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "aluno_id")
	private Aluno AlunoRelationship;
	@ForeignCollectionField(eager = false)
	private ForeignCollection<Disciplina> Displina;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "professor_id")
	private Professor ProfessorRelationship;

	public Aluno getAluno() {
		return AlunoRelationship;
	}

	public void setAluno(Aluno aluno) {
		AlunoRelationship = aluno;
	}

	// @DatabaseField(foreign=true)
	// private List<Disciplina> Displina;
	/**
	 * @return the CodCurso
	 */
	public Integer getCodCurso() {
		return CodCurso;
	}

	/**
	 * @param CodCurso
	 *            the CodCurso to set
	 */
	public void setCodCurso(Integer CodCurso) {
		this.CodCurso = CodCurso;
	}

	/**
	 * @return the Descricao
	 */
	public String getDescricao() {
		return Descricao;
	}

	/**
	 * @param Descricao
	 *            the Descricao to set
	 */
	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}

	/**
	 * @return the Displinas
	 */
	public ForeignCollection<Disciplina> getDisplinas() {
		return Displina;
	}

	/**
	 * @param Displinas
	 *            the Displinas to set
	 */
	public void setDisplinas(ForeignCollection<Disciplina> Displinas) {
		this.Displina = Displinas;
	}

}
