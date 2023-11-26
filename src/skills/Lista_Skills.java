package skills;
import java.util.*;


public class Lista_Skills {
   
	 ArrayList <Skills> skills = new ArrayList<Skills>();
	 ArrayList <Skills> magias = new ArrayList<Skills>();
	public Lista_Skills() {
		Fisicas aux = new Fisicas(1,"Ataque Duplo","O usuário é capaz de rolar um segundo ataque durante sua ação, causando metade do dano em relação ao primeiro ataque");
		skills.add(aux);
		aux = new Fisicas(1,"Golpe de Escudo","O usuário é capaz de golpear com seu escudo, atordoando caso o alvo falhe no dado");
		skills.add(aux);
		aux = new Fisicas(2,"Avanço", "O usuário pode se mover o dobro da distância original");
		skills.add(aux);
		aux = new Fisicas(3,"Golpe Preciso", "O usuário é caáz de desferir um golpe que penetre e ignora a armadura do alvo");
		skills.add(aux);
		aux = new Fisicas(5,"Ataque Triplo","O usuário é capaz de rolar um segundo ataque causandoo metade do dano em relação ao primeiro ataque além de um terceiro causando um terço do dano em relação ao primeiro ataque");
		skills.add(aux);
		aux = new Fisicas(7,"Aparar","O usuário é capaz de aparar ataques físicos com sua arma/escudo como reação à ação inimiga");
		skills.add(aux);
		aux = new Fisicas(8,"Ataque Sangrento","O usuário é capaz de desferir um golpe capaz de abrir um ferimento no alvo, causando-o também à perder 10% de sua vida atual por turno durante 3 turnos");
		skills.add(aux);
		aux = new Fisicas(10,"Ataque em Cadeia","Ao matar um inimigo, o usuário ganha uma ação extra");
		skills.add(aux);
		aux = new Fisicas(11,"Ùltimo Suspiro", "O usuário é capaz de sobreviver uma ataque letal com 1 ponto de vida restante, ganhando uma ação extra");
		skills.add(aux);
		aux = new Fisicas(12,"Golpe Vertical","O usuário é capaz de desferir um golpe vertical à um inimigo menor ou igual em questão de tamanho, cortando-o pela metade causando morte instantânea");
		skills.add(aux);
		Magias aux2 = new Magias(1,"Míssil Mágico","Três projéteis incapazes de errar, causando 3d4 de dano mágico",10);
		magias.add(aux2);
		aux2 = new Magias(2,"Ataque de ácido", "Um projétiil de ácido corrosivo causando 1d10+8 de dano mágico",15);
		magias.add(aux2);
		aux2 = new Magias(3,"Onda de choque","Uma forte onda sonora capaz de atordoar todos os indivíduos em um raio de 10m",30);
		magias.add(aux2);
		aux2 = new Magias(4,"Brasas","Uma pequena rajada de forgo causando 1d10 de dano mágico e aplicando queimaduras na qual causam 1d5 de dano de fogo a cada turno por 3 turnos",15);
		magias.add(aux2);
		aux2 = new Magias(5,"Estaca de gelo","Um projétil de gelo capaz de causar 2d10+10 de dano em um único alvo",40);
		magias.add(aux2);
		aux2 = new Magias(5,"Bola de Fogo","Uma grande bola de fogo causando 1d15+5 de dano mágico e queimaduras em todos os inimigos em um raio de 2m de sua explosão ao acertar o alvo",40);
		magias.add(aux2);
		aux2 = new Magias(7,"Teleporte","O usuário é capaz de teleportar em um raio de 30m em realção a sua posição inicial",30);
		magias.add(aux2);
		aux2 = new Magias(9,"Barragem arcana","10 mísseis mágicos incapazes de errar, causando 10d5 de dano",20);
		magias.add(aux2);
		aux2 = new Magias(9,"Pilar de fogo","Um pilar flamejante com um raio de 5m capaz de causar 2d20+15 de dano mágico e queimaduras",60);
		magias.add(aux2);
		aux2 = new Magias(10,"Raio azul","Um enorme raio arcano causando 20d10 de dano mágico",150);
		magias.add(aux2);

	}
	public void Mostrar_Skills() {
		System.out.println("-----------------------------Habilidades-----------------------------");
		for (Skills c : skills){
	         System.out.println(c);
	    }
	}
	public void Mostrar_Magias() {
		System.out.println("-----------------------------Magias-----------------------------");
		for (Skills c : magias){
	         System.out.println(c);
	    }
	}
	
}
