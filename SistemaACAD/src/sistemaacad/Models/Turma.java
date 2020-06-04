/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author 11621095
 */
@DatabaseTable(tableName = "Turma")
public class Turma {
	@DatabaseField(columnName ="CodigoTurma", generatedId = true)
	private Integer CodigoTurma;
	@DatabaseField(canBeNull = false)
	private Date Ano;
	@DatabaseField(canBeNull = false)
	private EnumTurno Turno;
	@ForeignCollectionField(eager =false)
	private ForeignCollection<Aluno> AlunoForeignCollection;
	@DatabaseField(canBeNull = true)
	private int Vagas;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "turma_id")
	private Disciplina TurmaRelationship;
	private Collection<Aluno>Aluno;
	public Collection<Aluno> getAluno() {
		return Aluno;
	}

	public void setAluno(Collection<Aluno> aluno) {
		Aluno = aluno;
	}

	/**
	 * @return the CodigoTurma
	 */
	public Integer getCodigoTurma() {
		return CodigoTurma;
	}

	/**
	 * @param CodigoTurma
	 *            the CodigoTurma to set
	 */
	public void setCodigoTurma(Integer CodigoTurma) {
		this.CodigoTurma = CodigoTurma;
	}

	/**
	 * @return the Ano
	 */
	public Date getAno() {
		return Ano;
	}

	/**
	 * @param Ano
	 *            the Ano to set
	 */
	public void setAno(Date Ano) {
		this.Ano = Ano;
	}

	/**
	 * @return the Turno
	 */
	public EnumTurno getTurno() {
		return Turno;
	}

	/**
	 * @param Turno
	 *            the Turno to set
	 */
	public void setTurno(EnumTurno Turno) {
		this.Turno = Turno;
	}

	public boolean ConsultarTurmaExistenciaTurma(Turma turma) {
		Collection<Turma> turmas = new ArrayList<Turma>();
		return turmas.contains(turma);
	}

	public Collection<Aluno> getAlunoForeignCollection() {
		return AlunoForeignCollection;
	}

	public void setAlunoForeignCollection(ForeignCollection<Aluno> aluno) {
		AlunoForeignCollection = aluno;
	}

	public int getVagas() {
		return Vagas;
	}

	public void setVagas(int vagas) {
		Vagas = vagas;
	}

	public boolean VerificarDisponibilidadeVagasTurma() {
		return this.Aluno.size() < this.Vagas;
	}

	public boolean VerificarAlunoCadastradoTurma(Aluno aluno, String property) {
		boolean retorno = false;
		if (property.equals("Nome")) {
			for (Aluno item : this.Aluno) {
				if (item.getNome().equals(aluno.getNome())) {
					retorno = true;
				}
			}
		} else if (property.equals(("telefone"))) {
			for (Aluno item : this.Aluno) {
				if (item.getTelefone().equals(aluno.getTelefone())) {
					retorno = true;
				}
			}
		} else if (property.equals("endereco")) {
			for (Aluno item : this.Aluno) {
				if (item.getEndereco().equals(aluno.getEndereco())) {
					retorno = true;
				}
			}
		}
		return retorno;

	}

}