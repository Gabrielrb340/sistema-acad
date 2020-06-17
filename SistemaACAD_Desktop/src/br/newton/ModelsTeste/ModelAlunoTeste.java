
package br.newton.ModelsTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sistemaacad.Models.Aluno;

public class ModelAlunoTeste {
	
	@Test
	public void VerificarAlunoCadastradoSucesso() {
		Aluno aluno = new Aluno();
		aluno.setNome("Jordan Eduardo Etc");
		assertEquals(true,aluno.ConsultarAluno(aluno, "Nome"));
	}
	
	@Test
	public void VerificarAlunoCadastradoFalha() {
		Aluno aluno = new Aluno();
		aluno.setNome("Jordan Etc");
		assertEquals(false,aluno.ConsultarAluno(aluno, "Nome"));
	}
	
}
