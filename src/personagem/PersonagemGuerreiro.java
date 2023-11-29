package personagem;
import skills.*;
import java.util.ArrayList;

public class PersonagemGuerreiro extends Personagem{
	private ArrayList<SkillFisica> habilidadesFisicas;

	public PersonagemGuerreiro() {
			super(); // Chama o construtor da classe pai (Personagem)
			habilidadesFisicas = new ArrayList<>();
			this.setClasse(ClassePersonagem.GUERREIRO);
		}
		

	public PersonagemGuerreiro(String nome, Integer idade, Integer level,  Integer forca, Integer inteligencia,
                Integer carisma, Integer constituicao, Integer sabedoria) {
			super(nome, idade, level, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.GUERREIRO);
			habilidadesFisicas = new ArrayList<>();
		}
		
	public void adicionarHabilidadeFisica(SkillFisica habilidade) {
        habilidadesFisicas.add(habilidade);
    }
	
    public ArrayList<SkillFisica> obterHabilidadesFisicas() {
        return habilidadesFisicas;
    }
    @Override
    public void toStringSimplificada() {
    	System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nClasse: " + getClasse() + "\nLevel: " + getLevel() + "\nData de Criacao: "+ getDataCriacao() + "\nForca: " + getForca() + "\nInteligencia: " + getInteligencia() + "\nCarisma: " + getCarisma() + "\nConstituicao: " + getConstituicao() + "\nSabedoria: " + getSabedoria() + "\nHabilidades: \n ");
    	for (SkillFisica c : habilidadesFisicas){
			  System.out.println("- "+c.getNome());
	    }
    }
    @Override
    public String toString() {
    	return "Nome: " + getNome() + "\nIdade: " + getIdade()+ "\nClasse: " + getClasse() + "\nLevel: " + getLevel() + "\nData de Criacao: "+ getDataCriacao()+ "\nForca: " + getForca() + "\nInteligencia: " + getInteligencia() + "\nCarisma: " + getCarisma() + "\nConstituicao: " + getConstituicao() + "\nSabedoria: " + getSabedoria() + "\nHabilidades: \n " + habilidadesFisicas;
    }
}
