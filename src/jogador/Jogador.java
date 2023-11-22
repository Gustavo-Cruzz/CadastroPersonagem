package jogador;
import java.util.ArrayList;
import java.util.Collections;

import personagem.*;

public class Jogador {
	private String nomeJogador;
	private ArrayList<Personagem> personagens = new ArrayList<Personagem>();
	
	public Jogador() {
	}
	public Jogador(String nomeJogador) {
		this.nomeJogador=nomeJogador;
	}
	
	public void addPersonagem(Personagem personagem) {
		personagens.add(personagem);
	}
	public boolean remPersonagem(Personagem personagem) {
		return personagens.remove(personagem);
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	
	@Override
	public String toString() {
		String ts=new String();
		ts="Nome: "+nomeJogador+"\n";
		for(Personagem p:personagens) {
			ts=ts+p+"\n";
		}
		return ts;
	}
	public boolean sortBy(SortBy sb) {
		switch (sb) {
		case nome:
			Collections.sort(personagens,Sort.pNome);
			break;
		case idade:
			Collections.sort(personagens,Sort.pIdade);
			break;
		case forca:
			Collections.sort(personagens,Sort.pForca);
			break;
		case inteligencia:
			Collections.sort(personagens,Sort.pInteligencia);
			break;
		case carisma:
			Collections.sort(personagens,Sort.pCarisma);
			break;
		case constituicao:
			Collections.sort(personagens,Sort.pconstituicao);
			break;
		case sabedoria:
			Collections.sort(personagens,Sort.pSabedoria);
			break;
		default:
			return false;
		}
		return true;
	}
}
