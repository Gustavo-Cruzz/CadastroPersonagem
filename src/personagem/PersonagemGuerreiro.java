package personagem;
import skills.*;
import java.util.ArrayList;

public class PersonagemGuerreiro extends Personagem{
	private ArrayList<SkillFisica> habilidadesFisicas;

	public PersonagemGuerreiro() {
			super(); // Chama o construtor da classe pai (Personagem)
			habilidadesFisicas = new ArrayList<>();
		}
		

	public PersonagemGuerreiro(String nome, Integer idade, Integer forca, Integer inteligencia,
                Integer carisma, Integer constituicao, Integer sabedoria) {
			super(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.GUERREIRO);
			habilidadesFisicas = new ArrayList<>();
		}
		
	public void adicionarHabilidadeFisica(SkillFisica habilidade) {
        habilidadesFisicas.add(habilidade);
    }
	
    public ArrayList<SkillFisica> obterHabilidadesFisicas() {
        return habilidadesFisicas;
    }
    
    @Override
    public String toString() {
        return "PersonagemGuerreiro{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", forca=" + getForca() +
                ", inteligencia=" + getInteligencia() +
                ", carisma=" + getCarisma() +
                ", constituicao=" + getConstituicao() +
                ", sabedoria=" + getSabedoria() +
                ", classe=" + getClasse() +
                ", dataCriacao=" + getDataCriacao() +
                ", habilidadesFisicas=" + habilidadesFisicas +
                '}';
    }
}
