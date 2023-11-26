package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemPonteiro extends Personagem {
    private ArrayList<SkillFisica> habilidadesFisicas;

    // Construtor padrão
    public PersonagemPonteiro() {
        super();
        habilidadesFisicas = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PersonagemPonteiro(String nome, Integer idade, Integer forca, Integer inteligencia,
                             Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.PONTEIRO);
        habilidadesFisicas = new ArrayList<>();
    }

    // Método para adicionar uma habilidade física ao ponteiro
    public void adicionarHabilidadeFisica(SkillFisica habilidade) {
        habilidadesFisicas.add(habilidade);
    }

    // Método para obter as habilidades físicas do ponteiro
    public ArrayList<SkillFisica> obterHabilidadesFisicas() {
        return habilidadesFisicas;
    }
    
    @Override
    public String toString() {
        return "PersonagemPonteiro{" +
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