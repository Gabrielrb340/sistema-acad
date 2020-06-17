
package br.newton.ModelsTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import sistemaacad.Models.Aluno;

public class ModelAlunoTeste {
	
	@Test
	public void VerificarAlunoCadastradoSucesso() throws SQLException {
		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel");
		assertEquals(true,aluno.ConsultarAluno(aluno, "Nome"));
	}
	
	@Test
	public void VerificarAlunoCadastradoFalha() throws SQLException {
		Aluno aluno = new Aluno();
		aluno.setNome("Jordan Não existe");
		assertEquals(false,aluno.ConsultarAluno(aluno, "Nome"));
		
	}
	
}
