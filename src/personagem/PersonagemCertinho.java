package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemCertinho extends Personagem {
    private ArrayList<Magias> magias;

    // Construtor padrão
    public PersonagemCertinho() {
        super();
        magias = new ArrayList<>();
        this.setClasse(ClassePersonagem.CERTINHO);
    }

    // Construtor com parâmetros
    public PersonagemCertinho(String nome, Integer idade, Integer level, Integer forca, Integer inteligencia,
                              Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, level , forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.CERTINHO);
        magias = new ArrayList<>();
    }

    // Método para adicionar uma habilidade mágica ao personagem certinho
    public void adicionarMagias(Magias magia) {
        magias.add(magia);
    }	

    // Método para obter as habilidades mágicas do personagem certinho
    public ArrayList<Magias> obtermagias() {
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
        return"Nome: " + getNome() + "\nIdade: " + getIdade()+ "\nClasse: " + getClasse() + "\nLevel: " + getLevel() + "\nData de Criacao: "+ getDataCriacao() + "\nForca: " + getForca() + "\nInteligencia: " + getInteligencia() + "\nCarisma: " + getCarisma() + "\nConstituicao: " + getConstituicao() + "\nSabedoria: " + getSabedoria() + "\nMagias: \n " + magias;
    }
}