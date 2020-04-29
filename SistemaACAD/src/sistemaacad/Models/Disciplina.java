/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 11621095
 */
public class Disciplina {
    private Integer CodigoDisciplina;
    private Date CargaHoraria;
    private Map<Integer,String> PreRequisitos;
    private List<Turma> Turma;

    /**
     * @return the CodigoDisciplina
     */
    public Integer getCodigoDisciplina() {
        return CodigoDisciplina;
    }

    /**
     * @param CodigoDisciplina the CodigoDisciplina to set
     */
    public void setCodigoDisciplina(Integer CodigoDisciplina) {
        this.CodigoDisciplina = CodigoDisciplina;
    }

    /**
     * @return the CargaHoraria
     */
    public Date getCargaHoraria() {
        return CargaHoraria;
    }

    /**
     * @param CargaHoraria the CargaHoraria to set
     */
    public void setCargaHoraria(Date CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    /**
     * @return the PreRequisitos
     */
    public Map<Integer,String> getPreRequisitos() {
        return PreRequisitos;
    }

    /**
     * @param PreRequisitos the PreRequisitos to set
     */
    public void setPreRequisitos(Map<Integer,String> PreRequisitos) {
        this.PreRequisitos = PreRequisitos;
    }

    /**
     * @return the Turma
     */
    public List<Turma> getTurma() {
        return Turma;
    }

    /**
     * @param Turma the Turma to set
     */
    public void setTurma(List<Turma> Turma) {
        this.Turma = Turma;
    }
    
    
}
