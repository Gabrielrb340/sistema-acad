package br.newton.ModelsTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sistemaacad.Models.Aluno;
import sistemaacad.Models.MockUtils;
import sistemaacad.Models.Pessoa;
import sistemaacad.Models.Professor;


public class ModelPessoaTest {
	
	@Test
	public void ValidarNomeSucesso() {
		
		Pessoa pessoa = new Professor();
		
		assertEquals(true, pessoa.ValidarNome("Jordan Eduardo Etc"));	
	}
	
	@Test
	public void ValidarNomeFalha() {
		
		Pessoa pessoa = new Professor();
		
		assertEquals(false, pessoa.ValidarNome("Jordan"));	
	}
	
	@Test
	public void ValidarCpfSucesso() {
		Pessoa pessoa = new Professor();
		
		assertTrue(pessoa.ValidarCpf("12345678954"));
	}
	
	@Test
	public void ValidarCpfFalha() {
		Pessoa pessoa = new Professor();
		
		assertFalse(pessoa.ValidarCpf("1234c678954"));
	}

}
