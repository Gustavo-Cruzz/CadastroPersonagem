package jogador;
import java.util.ArrayList;
import java.util.Collections;

import personagem.*;

public class Jogador {
	private String nomeJogador;
	private ArrayList<Personagem> personagens = new ArrayList<Personagem>();
	//Um jogador pode possuir múltiplos personagens
	
	public Jogador() {
		//Inicializador padrão
	}
	public Jogador(String nomeJogador) {
		//Inicializador com nome
		this.nomeJogador=nomeJogador;
	}
	
	public void addPersonagem(Personagem personagem) {
		//Adiciona um novo personagem ao ArrayList
		personagens.add(personagem);
	}
	public boolean remPersonagem(Personagem personagem) {
		//Se possível, retira um personagem do ArrayList,
		//e retorna se a operação foi possível de ser realizada
		return personagens.remove(personagem);
	}
	public String getNomeJogador() {
		//Consegue o nome do jogador
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		//Define o nome do jogador
		this.nomeJogador = nomeJogador;
	}
	
	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}
	public void setPersonagens(ArrayList<Personagem> personagens) {
		this.personagens = personagens;
	}
	@Override
	public String toString() {
		//toString do jogador, utiliza o toString dos personagens
		String ts=new String();
		ts="Nome: "+nomeJogador+"\n";
		for(Personagem p:personagens) {
			ts=ts+p+"\n";
		}
		return ts;
	}
	public void sortBy(SortBy sb) {
		//Recebe como parâmetro qual o atributo que se deseja utilizar para ordenar o ArrayList
		switch (sb) {
		case nome:
			//Ordena por nome
			Collections.sort(personagens,Sort.pNome);
			break;
		case idade:
			//Ordena por idade
			Collections.sort(personagens,Sort.pIdade);
			break;
		case forca:
			//Ordena por força
			Collections.sort(personagens,Sort.pForca);
			break;
		case inteligencia:
			//Ordena por inteligência
			Collections.sort(personagens,Sort.pInteligencia);
			break;
		case carisma:
			//Ordena por carisma
			Collections.sort(personagens,Sort.pCarisma);
			break;
		case constituicao:
			//Ordena por constituição
			Collections.sort(personagens,Sort.pconstituicao);
			break;
		case sabedoria:
			//Ordena por sabedoria
			Collections.sort(personagens,Sort.pSabedoria);
			break;
		 default: 
			 break;
		}
	}
}
