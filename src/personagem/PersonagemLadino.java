package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemLadino extends Personagem {
    private ArrayList<SkillFisica> habilidadesFisicas;

    // Construtor padrão
    public PersonagemLadino() {
        super();
        habilidadesFisicas = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PersonagemLadino(String nome, Integer idade, Integer forca, Integer inteligencia,
                             Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.LADINO);
        habilidadesFisicas = new ArrayList<>();
    }

    // Método para adicionar uma habilidade física ao ladino
    public void adicionarHabilidadeFisica(SkillFisica habilidade) {
        habilidadesFisicas.add(habilidade);
    }

    // Método para obter as habilidades físicas do ladino
    public ArrayList<SkillFisica> obterHabilidadesFisicas() {
        return habilidadesFisicas;
    }
    
    @Override
    public String toString() {
        return "PersonagemLadino{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", forca=" + getForca() +
                ", inteligencia=" + getInteligencia() +
                ", carisma=" + getCarisma() +
                ", constituicao=" + getConstituicao() +
                ", sabedoria=" + getSabedoria() +
                ", classe=" + getClasse() +
                ", dataCriacao=" + getDataCriacao() +
                ", habilidadesFisicas=" + habilidadesFisicas +
                '}';
    }
}