package br.newton.ModelsTeste;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sistemaacad.Models.MockUtils;
import sistemaacad.Models.Professor;
public class ModelProfessorTeste {
	
	@Test
	public void VerificarProfessorVinculadoCursoSucesso() {
		
		Professor pes = new Professor();
		
		pes.setCurso(MockUtils.ObterCursosMock());
		assertTrue(pes.VerificarProfessorVinculadoCurso(MockUtils.ObterCursoMock("SI",0).getCodCurso()));
	}
	
	@Test
	public void VerificarProfessorVinculadoCursoFalha() {
		
		Professor pes = new Professor();
		
		pes.setCurso(MockUtils.ObterCursosMock());
		assertFalse(pes.VerificarProfessorVinculadoCurso(MockUtils.ObterCursoMock("SI",200).getCodCurso()));
	}
	
}
