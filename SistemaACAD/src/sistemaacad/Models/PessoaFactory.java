/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

/**
 *
 * @author 11621095
 */
public class PessoaFactory implements IPessoaFactory<Pessoa> {

	@Override
	public Pessoa InstanciaTipoPessoa(String TipoPessoa) {
		switch (TipoPessoa) {
		case "Professor":
			return new Professor();
		case "Aluno":
			return new Aluno();
		case "Secretaria":
			return new Secretaria();
		default:
			throw new NullPointerException("Este tipo pessoa não existe");
		}
	}

}
