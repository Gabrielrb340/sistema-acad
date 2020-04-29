/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.util.ArrayList;
import java.util.Collection;

import javax.print.DocFlavor.STRING;

/**
 *
 * @author 11621095
 */
public class Aluno extends Pessoa {
    private String Nome;
    private String Endereco;
    private String Telefone;
    private Curso Curso; 
    private boolean Ativo;
    public boolean isAtivo() {
		return Ativo;
	}

	public void setAtivo(boolean ativo) {
		Ativo = ativo;
	}

	/**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Curso
     */
    public Curso getCurso() {
        return Curso;
    }

    /**
     * @param Curso the Curso to set
     */
    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }
    
    public Boolean ConsultarAluno(Aluno aluno, String property) {
    	Collection<Aluno> alunos = new ArrayList<Aluno>();
    	alunos = MockUtils.ObterMockAlunos();
    	boolean retorno = false;
    	if(property.equals("Nome")) {
    		for(Aluno item :alunos) {
    			if(item.getNome().equals(aluno.getNome())) {
    				retorno = true;
    			}
    		}
    	}else if(property.equals(("telefone"))) {
    		for(Aluno item :alunos) {
    			if(item.getTelefone().equals(aluno.getTelefone())) {
    				retorno = true;
}
    		}
    	}
    	else if(property.equals("endereco")) {
    		for(Aluno item :alunos) {
    			if(item.getEndereco().equals(aluno.getEndereco())) {
    				retorno = true;
    			}
    		}
    	}
    	return retorno;
    }

}
