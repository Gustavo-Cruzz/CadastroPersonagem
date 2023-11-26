package skills;

public abstract class Skills {
private Integer level;
private String descricao, nome;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getLevel() {
	return level;
}
public void setLevel(Integer level) {
	this.level = level;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

 public Skills(Integer level, String nome, String descricao) {
	this.level = level;
	this.descricao = descricao;
	this.nome = nome;
}
 
public String toString(){
	 return "Skill: " + nome + "\nLevel: " + level + "\nDescrição: " + descricao+"\n";
 }
}
