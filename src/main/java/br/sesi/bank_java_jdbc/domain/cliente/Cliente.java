package br.sesi.bank_java_jdbc.domain.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome;
        this.email = dados.email;
        this.cpf = dados.cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }

}
