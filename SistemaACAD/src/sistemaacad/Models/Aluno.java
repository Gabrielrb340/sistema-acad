/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import javax.print.DocFlavor.STRING;


import sistemaacad.DAO.DbConnection;;

/**
 *
 * @author 11621095
 */
@DatabaseTable(tableName = "Pessoa")
public class Aluno extends Pessoa {
    @DatabaseField(foreign=true, canBeNull=false)
    private boolean PessoaId;
    @DatabaseField(canBeNull=false)
	private String Nome;
    private Curso Curso; 
    @DatabaseField(canBeNull=false)
    private boolean Ativo;
    @DatabaseField(id=true)
	private int Id;

    public boolean isPessoaId() {
		return PessoaId;
	}

	public int getId() {
		return Id;
	}
    public Aluno() {
		super();
	}

	public Aluno(int id,String nome, String endereco, String telefone, sistemaacad.Models.Curso curso, boolean ativo) {
		super(nome,telefone,endereco);
		Nome = nome;
		Curso = curso;
		Ativo = ativo;
		Id= id;
	}

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
//    public ArrayList<Aluno> ObterTodosAlunos(){
//    	Collection<Aluno> alunos = new ArrayList<Aluno>();
//    	try {
//    	      Statement st =  Dao.getConnection().createStatement();
//    	      ResultSet rs = st.executeQuery("SELECT * FROM ALUNO ");
//    	      
//    	      while(rs.next()) {
//    	 //   	  alunos.add(new Aluno(rs.getString("No")))
//    	      }
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally {
//			
//		}
//    	
//    }

}
