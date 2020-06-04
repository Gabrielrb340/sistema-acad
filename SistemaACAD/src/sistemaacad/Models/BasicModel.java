package sistemaacad.Models;

import com.j256.ormlite.field.DatabaseField;

public class BasicModel {
    @DatabaseField(id=true)
	private Integer Id;
    @DatabaseField(canBeNull=false)
    private String Nome;
}
