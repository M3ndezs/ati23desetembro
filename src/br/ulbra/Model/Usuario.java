
package br.ulbra.Model;

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(int id, String nome, String login, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.ativo = ativo;
    }

    
    
    public Usuario(int id, String nome, String login, String senha, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.login = login;

        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString(){
        return "cod: " + id + " Nome: "+ nome + " Login: "+ login + "senha "+ senha + "ativo" + ativo;
    }
}
