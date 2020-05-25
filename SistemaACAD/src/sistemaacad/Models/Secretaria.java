/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacad.Models;

import com.j256.ormlite.field.DatabaseField;

/**
 *
 * @author 11621095
 */
public class Secretaria extends Pessoa {
    @DatabaseField(id=true)
    private int CodFuncionario;
    @DatabaseField(foreign=true)
    private int CodPessoa;
	public int getCodPessoa() {
		return CodPessoa;
	}
	public void setCodPessoa(int codPessoa) {
		CodPessoa = codPessoa;
	}
	public int getCodFuncionario() {
		return CodFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		CodFuncionario = codFuncionario;
	}
}
