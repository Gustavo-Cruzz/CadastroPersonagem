package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemPonteiro extends Personagem {
    private ArrayList<SkillFisica> habilidadesFisicas;

    // Construtor padrão
    public PersonagemPonteiro() {
        super();
        habilidadesFisicas = new ArrayList<>();
        this.setClasse(ClassePersonagem.PONTEIRO);
    }

    // Construtor com parâmetros
    public PersonagemPonteiro(String nome, Integer idade, Integer level, Integer forca, Integer inteligencia,
                             Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, level, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.PONTEIRO);
        habilidadesFisicas = new ArrayList<>();
    }

    // Método para adicionar uma habilidade física ao ponteiro
    public void adicionarHabilidadeFisica(SkillFisica habilidade) {
        habilidadesFisicas.add(habilidade);
    }

    // Método para obter as habilidades físicas do ponteiro
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