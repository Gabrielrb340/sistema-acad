/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author 11621095
 */
@DatabaseTable(tableName = "Disciplina")
public class Disciplina {
	@DatabaseField(columnName ="CodigoDisciplina", generatedId = true)
	private Integer CodigoDisciplina;
	@DatabaseField(canBeNull = false)
	private Date CargaHoraria;
	@ForeignCollectionField(eager = false)
	private ForeignCollection<DisciplinaPreRequisitos> PreRequisitos;
	@ForeignCollectionField(eager = false)
	private ForeignCollection<Turma> Turma;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "curso_id")
	private Curso CursoRelationship;

	/**
	 * @return the CodigoDisciplina
	 */
	public Integer getCodigoDisciplina() {
		return CodigoDisciplina;
	}

	/**
	 * @param CodigoDisciplina
	 *            the CodigoDisciplina to set
	 */
	public void setCodigoDisciplina(Integer CodigoDisciplina) {
		this.CodigoDisciplina = CodigoDisciplina;
	}

	/**
	 * @return the CargaHoraria
	 */
	public Date getCargaHoraria() {
		return CargaHoraria;
	}

	/**
	 * @param CargaHoraria
	 *            the CargaHoraria to set
	 */
	public void setCargaHoraria(Date CargaHoraria) {
		this.CargaHoraria = CargaHoraria;
	}

	/**
	 * @return the PreRequisitos
	 */
	public Collection<DisciplinaPreRequisitos> getPreRequisitos() {
		return PreRequisitos;
	}

	/**
	 * @param PreRequisitos
	 *            the PreRequisitos to set
	 */
	public void setPreRequisitos(ForeignCollection<DisciplinaPreRequisitos> PreRequisitos) {
		this.PreRequisitos = PreRequisitos;
	}

	/**
	 * @return the Turma
	 */
	public Collection<Turma> getTurma() {
		return Turma;
	}

	/**
	 * @param Turma
	 *            the Turma to set
	 */
	public void setTurma(ForeignCollection<Turma> Turma) {
		this.Turma = Turma;
	}

}
