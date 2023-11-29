package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemBruxo extends Personagem {
    private ArrayList<Magias> magias;

    // Construtor padrão
    public PersonagemBruxo() {
        super();
        magias = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PersonagemBruxo(String nome, Integer idade,Integer level, Integer forca, Integer inteligencia,
                             Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, level, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.BRUXO);
        magias = new ArrayList<>();
    }

    // Método para adicionar uma habilidade física ao bruxo
    public void adicionarMagias(Magias magia) {
        magias.add(magia);
    }

    // Método para obter as habilidades físicas do bruxo
    public ArrayList<Magias> obterMagias() {
        return magias;
    }
    @Override
    public void toStringSimplificada() {
    	System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nClasse: " + getClasse() + "\nLevel: " + getLevel() + "\nData de Criacao: "+ getDataCriacao() + "\nForca: " + getForca() + "\nInteligencia: " + getInteligencia() + "\nCarisma: " + getCarisma() + "\nConstituicao: " + getConstituicao() + "\nSabedoria: " + getSabedoria() + "\nMagias: \n ");
    	for (Magias c : magias){
			  System.out.println("- "+c.getNome());
	    }
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nClasse: " + getClasse() + "\nLevel: " + getLevel() + "\nData de Criacao: "+ getDataCriacao() + "\nForca: " + getForca() + "\nInteligencia: " + getInteligencia() + "\nCarisma: " + getCarisma() + "\nConstituicao: " + getConstituicao() + "\nSabedoria: " + getSabedoria() + "\nMagias: \n " + magias;
    }
}