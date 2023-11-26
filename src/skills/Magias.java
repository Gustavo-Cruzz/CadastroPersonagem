package skills;

public class Magias extends Skills{
	private Integer mp;

	public Integer getMp() {
		return mp;
	}

	public void setMp(Integer mp) {
		this.mp = mp;
	}
	
	public Magias(Integer level, String nome, String descricao, Integer mp) {
		super(level, nome, descricao);
		this.mp = mp;
	}

	@Override
public String toString() {
	return super.toString()+ "Mana Gasta: " + mp + "\n";
}
}
