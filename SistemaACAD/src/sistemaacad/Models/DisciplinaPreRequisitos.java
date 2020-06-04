package sistemaacad.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DisiciplinaPreRequisito")

public class DisciplinaPreRequisitos {
	@DatabaseField(columnName ="PreRequisitoId", generatedId = true)
	private int PreRequisitoId;
	@DatabaseField(canBeNull = false)
	private int RequisitoDescricao;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "disciplina_id")
	private Disciplina DisciplinaRelationship;

	public int getId() {
		return PreRequisitoId;
	}

	public void setId(int id) {
		PreRequisitoId = id;
	}

	public int getRequisitoDescricao() {
		return RequisitoDescricao;
	}

	public void setRequisitoDescricao(int requisitoDescricao) {
		RequisitoDescricao = requisitoDescricao;
	}

}
