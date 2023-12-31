package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemLadino extends Personagem {
    private ArrayList<SkillFisica> habilidadesFisicas;

    // Construtor padrão
    public PersonagemLadino() {
        super();
        habilidadesFisicas = new ArrayList<>();
        this.setClasse(ClassePersonagem.LADINO);
    }

    // Construtor com parâmetros
    public PersonagemLadino(String nome, Integer idade, Integer level,  Integer forca, Integer inteligencia,
                             Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade,level, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.LADINO);
        habilidadesFisicas = new ArrayList<>();
    }

    // Método para adicionar uma habilidade física ao ladino
    public void adicionarHabilidadeFisica(SkillFisica habilidade) {
        habilidadesFisicas.add(habilidade);
    }

    // Método para obter as habilidades físicas do ladino
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