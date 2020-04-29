package br.newton.ModelsTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sistemaacad.Models.Aluno;
import sistemaacad.Models.EnumTurno;
import sistemaacad.Models.MockUtils;
import sistemaacad.Models.Turma;

public class ModelTurmaTeste {

	@Test 
	public void VerificarAlunoCadastradoTurmaSucesso() {
		Turma turma = new Turma();
		turma.setCodigoTurma(2020);
		turma.setTurno(EnumTurno.DIA);
		turma.setAluno(MockUtils.ObterMockAlunos());
		Aluno aluno = new Aluno();
		aluno.setNome("Jordan Eduardo Etc");
		assertEquals(true,turma.VerificarAlunoCadastradoTurma(aluno, "Nome"));

	}
	@Test 
	public void VerificarAlunoDisponivelParaCadastro() {
		Turma turma = new Turma();
		turma.setCodigoTurma(2020);
		turma.setTurno(EnumTurno.DIA);
		turma.setAluno(MockUtils.ObterMockAlunos());
		Aluno aluno = new Aluno();
		aluno.setNome("Victor Almeida Santos");
		assertEquals(false,turma.VerificarAlunoCadastradoTurma(aluno, "Nome"));

	}
	@Test 
	public void VerificarDisponibilidadeVagasTurmaLotadaSucesso() {
		Turma turma = new Turma();
		turma.setAluno(MockUtils.ObterMockAlunos());
		turma.setVagas(1);
		assertEquals(false,turma.VerificarDisponibilidadeVagasTurma());		
	}
	@Test 
	public void VerificarDisponibilidadeVagasTurmaDisponibilidade() {
		Turma turma = new Turma();
		turma.setAluno(MockUtils.ObterMockAlunos());
		turma.setVagas(30);
		assertEquals(true,turma.VerificarDisponibilidadeVagasTurma());		
	}
}
