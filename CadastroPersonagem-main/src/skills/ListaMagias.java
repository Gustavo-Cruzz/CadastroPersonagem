package skills;

import java.util.ArrayList;

public class ListaMagias {

	static ArrayList <Magias> magias = new ArrayList<Magias>();
	
	public void listaMagias() {
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
	

public static ArrayList<Magias> getMagias() {
		return magias;
	}


	public void setMagias(ArrayList<Magias> magias) {
		ListaMagias.magias = magias;
	}


public void Mostrar_Magias() {
	System.out.println("-----------------------------Magias-----------------------------");
	for (Skills c : magias){
         System.out.println(c);
    }
}
}
