/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.util.List;

/**
 *
 * @author 11621095
 */
public class Curso {
    private Integer CodCurso;
    private String Descricao;
    private List<Disciplina> Displinas;
    /**
     * @return the CodCurso
     */
    public Integer getCodCurso() {
        return CodCurso;
    }

    /**
     * @param CodCurso the CodCurso to set
     */
    public void setCodCurso(Integer CodCurso) {
        this.CodCurso = CodCurso;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the Displinas
     */
    public List<Disciplina> getDisplinas() {
        return Displinas;
    }

    /**
     * @param Displinas the Displinas to set
     */
    public void setDisplinas(List<Disciplina> Displinas) {
        this.Displinas = Displinas;
    }
    
}
