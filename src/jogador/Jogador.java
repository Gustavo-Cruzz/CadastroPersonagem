package jogador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
		if(personagem == null) {
			return false;
		}
		personagens.remove(personagem);
		return true;
	}
	
	public boolean alteraPersonagem(Personagem personagem) {
		//Altera um personagem existente
		Scanner sc=new Scanner(System.in);
		for(Personagem p:personagens) {
			//Procura o personagem com base no nome
			if(p==personagem) {
				//Encontrou
				System.out.println("Qual atributo deseja alterar?\nNome; Idade; Level; Forca; Inteligencia; Carisma; Constituicao; Sabedoria?");
				String att = sc.next();
				//Recebe o atributo a ser alterado
				att=att.toLowerCase();
				switch (att) {
					case "nome":
						System.out.println("Qual o novo nome?");
						sc.nextLine();
						p.setNome(sc.nextLine());
						break;
					case "idade":
						System.out.println("Qual a nova idade?");
						p.setIdade(sc.nextInt());
						break;
					case "level":
						System.out.println("Qual o novo level?");
						p.setLevel(sc.nextInt());
						break;
					case "forca":
						System.out.println("Qual a nova forca?");
						p.setForca(sc.nextInt());
						break;
					case "inteligencia":
						System.out.println("Qual a nova inteligencia?");
						p.setInteligencia(sc.nextInt());
						break;
					case "carisma":
						System.out.println("Qual a nova carisma?");
						p.setCarisma(sc.nextInt());
						break;
					case "constituicao":
						System.out.println("Qual a nova constituicao?");
						p.setConstituicao(sc.nextInt());
						break;
					case "sabedoria":
						System.out.println("Qual a nova sabedoria?");
						p.setSabedoria(sc.nextInt());
						break;
					default:
						return false;
						//Atributo inserido nao era uma opcao, nao conseguiu alterar
				}	
				return true;
				//Alteracao feita com sucesso
			}
		}
		return false;
		//O personagem nao existe
	}
	
	public Personagem encontraPersonagem(String nome) {
		//Procura um personagem com base em seu nome
		for (Personagem p:personagens) {
			//Vasculha toda o ArrayList
			if(p.getNome().toLowerCase().matches(nome.toLowerCase())) {
				//Se encontra, retorna true
				return p;
			}
		}
		//Se não encontra, retorna nulo
		return null;
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
		case level:
			//Ordena por nivel
			Collections.sort(personagens,Sort.pLevel);
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
