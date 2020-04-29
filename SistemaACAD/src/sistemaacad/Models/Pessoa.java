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
public abstract class Pessoa {
    private String Nome;
    private String Telefone;
    private String Endereco;

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
    
    public boolean ValidarCpf(String cpf) {
    	long valid  = 0; 
       cpf = cpf.replace("-","");
       cpf = cpf.replace(".","");
       cpf = cpf.replace(" ","");
        
        try {
        	
        	if(cpf.length() > 11) {
            	return false;
            }
        	
        	valid = Long.parseLong(cpf);
            return valid!=0;
		} catch (Exception e) {
			return false;
		}
        
    }
    public boolean ValidarNome(String nome) {
    	String nomevalido = "Jordan Eduardo Etc";
    	return nome.equals(nomevalido);
    }
    
}
