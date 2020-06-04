package sistemaacad.Models;

import java.util.ArrayList;
import java.util.Collection;

public class MockUtils {

//	public static Collection<Aluno> ObterMockAlunos() {
//		Collection<Aluno> alunos = new ArrayList<Aluno>();
//		Aluno gabriel = new Aluno();
//		gabriel.setAtivo(false);
//		gabriel.setNome("Gabriel Ribeiro de souza");
//		gabriel.setTelefone("31 975163935");
//		gabriel.setCurso(ObterCursoMock("S.I", 0));
//
//		Aluno jordan = new Aluno();
//		jordan.setAtivo(true);
//		jordan.setNome("jordan Eduardo Etc");
//		jordan.setTelefone("31 911111111");
//		jordan.setCurso(ObterCursoMock("S.I", 0));
//
//		Aluno luiz = new Aluno();
//		luiz.setAtivo(false);
//		luiz.setNome("Jordan Eduardo Etc");
//		luiz.setTelefone("31 911111111");
//		luiz.setCurso(ObterCursoMock("S.I", 0));
//		alunos.add(luiz);
//		alunos.add(gabriel);
//		alunos.add(jordan);
//		return alunos;
//	}

	public static Curso ObterCursoMock(String curso, int id_Curso) {
		Curso item = new Curso();
		item.setDescricao(curso);
		item.setCodCurso(id_Curso == 0 ? 202020 : id_Curso);
		return item;
	}

	public static Collection<Curso> ObterCursosMock() {
		Collection<Curso> itens = new ArrayList<Curso>();
		Curso item = new Curso();
		item.setDescricao("SI");
		item.setCodCurso(202020);
		Curso item2 = new Curso();
		item2.setDescricao("Odontologia");
		item2.setCodCurso(202021);
		itens.add(item2);
		itens.add(item);

		return itens;
	}

//	public static Turma ObterTurmaMock() {
//		Turma item = new Turma();
//		item.setAluno(ObterMockAlunos());
//		item.setCodigoTurma(2020);
//		item.setTurno(EnumTurno.DIA);
//		item.setVagas(50);
//		return item;
//	}
}
