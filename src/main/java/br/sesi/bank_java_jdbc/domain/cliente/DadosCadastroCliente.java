package br.sesi.bank_java_jdbc.domain.cliente;

public class DadosCadastroCliente {
    public String nome;
    public String email;
    public String cpf;

    public DadosCadastroCliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
