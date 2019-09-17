package br.ufc.crateus.aula9;

public class UserModel {

    String nome;
    String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserModel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
