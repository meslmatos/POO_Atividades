package model;
public class Categoria{
    private int id;
    private String nome;
    private String descricao;

    public Categoria(String nome){
        this.nome = nome;
    }

    public Categoria(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Categoria(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome; 
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao; 
    }
}