package skills;

import java.util.ArrayList;

public class ListaSkillsFisicas {
	
	 ArrayList <SkillFisica> skills = new ArrayList<SkillFisica>();
	 
	 public void Lista_Skills() {
		SkillFisica aux = new SkillFisica(1,"Ataque Duplo","O usuário é capaz de rolar um segundo ataque durante sua ação, causando metade do dano em relação ao primeiro ataque");
		skills.add(aux);
		
		aux = new SkillFisica(1,"Golpe de Escudo","O usuário é capaz de golpear com seu escudo, atordoando caso o alvo falhe no dado");
		skills.add(aux);
		
		aux = new SkillFisica(2,"Avanço", "O usuário pode se mover o dobro da distância original");
		skills.add(aux);
		
		aux = new SkillFisica(3,"Golpe Preciso", "O usuário é caáz de desferir um golpe que penetre e ignora a armadura do alvo");
		skills.add(aux);
		
		aux = new SkillFisica(5,"Ataque Triplo","O usuário é capaz de rolar um segundo ataque causandoo metade do dano em relação ao primeiro ataque além de um terceiro causando um terço do dano em relação ao primeiro ataque");
		skills.add(aux);
		
		aux = new SkillFisica(7,"Aparar","O usuário é capaz de aparar ataques físicos com sua arma/escudo como reação à ação inimiga");
		skills.add(aux);
		
		aux = new SkillFisica(8,"Ataque Sangrento","O usuário é capaz de desferir um golpe capaz de abrir um ferimento no alvo, causando-o também à perder 10% de sua vida atual por turno durante 3 turnos");
		skills.add(aux);
		
		aux = new SkillFisica(10,"Ataque em Cadeia","Ao matar um inimigo, o usuário ganha uma ação extra");
		skills.add(aux);
		
		aux = new SkillFisica(11,"Ùltimo Suspiro", "O usuário é capaz de sobreviver uma ataque letal com 1 ponto de vida restante, ganhando uma ação extra");
		skills.add(aux);
		
		aux = new SkillFisica(12,"Golpe Vertical","O usuário é capaz de desferir um golpe vertical à um inimigo menor ou igual em questão de tamanho, cortando-o pela metade causando morte instantânea");
		skills.add(aux);
		
	 }
	 
	 public void Mostrar_Skills() {
			System.out.println("-----------------------------Habilidades-----------------------------");
			for (Skills c : skills){
		         System.out.println(c);
		    }
		}
}
