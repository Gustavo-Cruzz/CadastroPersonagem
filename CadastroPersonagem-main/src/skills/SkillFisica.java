package skills;

public class SkillFisica extends Skills{

	public SkillFisica(Integer level, String nome, String descricao) {
		super(level, nome, descricao);
	}
	
	@Override
	public String toString() {
		 return "Skill: " + super.getNome() + "\nLevel: " + super.getLevel() + "\nDescrição: " + super.getDescricao() +"\n";
	}
}
