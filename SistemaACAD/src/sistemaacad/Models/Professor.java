/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author 11621095
 */
public class Professor extends Pessoa{
    private String Titulacao;
    private Collection<Curso> Curso;
    /**
     * @return the Titulacao
     */
    public String getTitulacao() {
        return Titulacao;
    }

    /**
     * @param Titulacao the Titulacao to set
     */
    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }

    /**
     * @return the Curso
     */
    public Collection<Curso> getCurso() {
        return Curso;
    }

    /**
     * @param Curso the Curso to set
     */
    public void setCurso(Collection<Curso> Curso) {
        this.Curso = Curso;
    }
    
    public boolean VerificarProfessorVinculadoCurso(int id_Curso) {
    	for(Curso curso:this.Curso) {
    		if(curso.getCodCurso() == id_Curso) {
    			return true;
    		}   		
    	}
    	return false;
    }    
}
