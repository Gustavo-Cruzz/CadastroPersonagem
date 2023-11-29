package jogador;

import java.util.Comparator;

import personagem.Personagem;

public class Sort {
	
	//Função que retorna a ordem por nome (reutilizável)
	static int name(Personagem a, Personagem b) {
		if(a.getNome().charAt(0)>b.getNome().charAt(0)) {
			//Primeira letra da palavra A vem depois da primeira letra da palavra B
			return 1;
		}else if(a.getNome().charAt(0)==b.getNome().charAt(0)) {
			//Palavras começam com a mesma letra
			if(a.getNome().charAt(1)>b.getNome().charAt(1)) {
				//Segunda letra da palavra A vem depois da segunda letra da palavra B
				return 1;
			}else {
				//Segunda letra da palavra A vem antes da segunda letra da palavra B
				return -1;
			}
		}else {
			//Primeira letra da palavra A vem antes da primeira letra da palavra B
			return -1;
		}
	}
	
	//Função que ordena, propriamente dito, por Nome
	static Comparator<Personagem>pNome=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			return name(a,b);
		}
	};
	
	//Por Idade
	static Comparator<Personagem>pIdade=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getIdade()>b.getIdade()) {
				//Idade A maior que B
				return 1;
			}else if(a.getIdade()==b.getIdade()) {
				//Idades Iguais, ordena por nome
				return name(a,b);
			}else {
				//Idade B maior que A
				return -1;
			}
		}
	};
	static Comparator<Personagem>pLevel=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getLevel()>b.getLevel()) {
				//Level A maior que B
				return 1;
			}else if(a.getLevel()==b.getLevel()) {
				//Levels Iguais, ordena por nome
				return name(a,b);
			}else {
				//Level B maior que A
				return -1;
			}
		}
	};
	//Por Força
	static Comparator<Personagem>pForca=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getForca()>b.getForca()) {
				//Força A maior que B
				return 1;
			}else if(a.getForca()==b.getForca()) {
				//Forças Iguais, ordena por nome
				return name(a,b);
			}else {
				//Força B maior que A
				return -1;
			}
		}
	};
	
	//Por Inteligência
	static Comparator<Personagem>pInteligencia=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getInteligencia()>b.getInteligencia()) {
				//Inteligência A maior que B
				return 1;
			}else if(a.getInteligencia()==b.getInteligencia()) {
				//Inteligencias iguais, ordena por nome
				return name(a,b);
			}else {
				//Inteligência A menor que B
				return -1;
			}
		}
	};
	
	//Por Carisma
	static Comparator<Personagem>pCarisma=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getCarisma()>b.getCarisma()) {
				//Carisma A maior que B
				return 1;
			}else if(a.getCarisma()==b.getCarisma()) {
				//Carismas Iguais, ordena por nome
				return name(a,b);
			}else {
				//Carisma B maior que A
				return -1;
			}
		}
	};
	
	//Por Constituição
	static Comparator<Personagem>pconstituicao=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getConstituicao()>b.getConstituicao()) {
				//Constituição A maior que B
				return 1;
			}else if(a.getConstituicao()==b.getConstituicao()) {
				//Constituições iguais, ordena por nome
				return name(a,b);
			}else {
				//Constituição B maior que A
				return -1;
			}
		}
	};
	
	//Por Sabedoria
	static Comparator<Personagem>pSabedoria=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getSabedoria()>b.getSabedoria()) {
				//Sabedoria A maior que B
				return 1;
			}else if(a.getSabedoria()==b.getSabedoria()) {
				//Sabedorias iguais, ordena por nome
				return name(a,b);
			}else {
				//Sabedoria B maior que A  
				return -1;
			}
		}
	};
}
