package jogador;

import java.util.Comparator;

import personagem.Personagem;

public class Sort {
	static Comparator<Personagem>pNome=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getNome().charAt(0)>b.getNome().charAt(0)) {
				return 1;
			}else if(a.getNome().charAt(0)==b.getNome().charAt(0)) {
				return 0;
			}else {
				return -1;
			}
		}
	};
	static Comparator<Personagem>pIdade=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getIdade()>b.getIdade()) {
				return 1;
			}else if(a.getIdade()==b.getIdade()) {
				return 0;
			}else {
				return -1;
			}
		}
	};
	static Comparator<Personagem>pForca=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getForca()>b.getForca()) {
				return 1;
			}else if(a.getForca()==b.getForca()) {
				return 0;
			}else {
				return -1;
			}
		}
	};
	static Comparator<Personagem>pInteligencia=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getInteligencia()>b.getInteligencia()) {
				return 1;
			}else if(a.getInteligencia()==b.getInteligencia()) {
				return 0;
			}else {
				return -1;
			}
		}
	};
	static Comparator<Personagem>pCarisma=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getCarisma()>b.getCarisma()) {
				return 1;
			}else if(a.getCarisma()==b.getCarisma()) {
				return 0;
			}else {
				return -1;
			}
		}
	};
	static Comparator<Personagem>pconstituicao=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getConstituicao()>b.getConstituicao()) {
				return 1;
			}else if(a.getConstituicao()==b.getConstituicao()) {
				return 0;
			}else {
				return -1;
			}
		}
	};
	static Comparator<Personagem>pSabedoria=(Comparator<Personagem>)new Comparator<Personagem>(){
		public int compare (Personagem a, Personagem b) {
			if(a.getSabedoria()>b.getSabedoria()) {
				return 1;
			}else if(a.getSabedoria()==b.getSabedoria()) {
				return 0;
			}else {
				return -1;
			}
		}
	};
}
