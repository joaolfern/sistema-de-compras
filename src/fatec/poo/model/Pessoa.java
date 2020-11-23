package fatec.poo.model;

import java.util.ArrayList;

public class Pessoa {

    private String cpf;
    private String nome;
    private String endereço;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;
    private ArrayList<Pedido> pedidos;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public String listarPedido() {
        String list = "";

        for (int i = 0; i < pedidos.size(); i++) {
            list = list + " " + pedidos.get(i).getNumero();
        }

        return list;
    }

    public static boolean validarCPF(String CPF) {
        int     d1, d2;
        int     digito1, digito2, resto;
        int     digitoCPF;
        String  nDigResult;

        CPF = CPF.replace(".", "");
        CPF = CPF.replace("-", "");
		
	if (CPF.equals("") ||
            CPF.equals("00000000000") || 
            CPF.equals("11111111111") || 
            CPF.equals("22222222222") || 
            CPF.equals("33333333333") || 
            CPF.equals("44444444444") || 
            CPF.equals("55555555555") ||
            CPF.equals("66666666666") || 
            CPF.equals("77777777777") || 
            CPF.equals("88888888888") || 
            CPF.equals("99999999999") ||
            (CPF.length() != 11)) {
            return (false);
        }
		
        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;
        //calculo do digito verificador
        for (int index = 1; index < CPF.length() - 1; index++)
        {
           digitoCPF = Integer.valueOf (CPF.substring(index -1, index)).intValue();
           d1 = d1 + ( index ) * digitoCPF;
        };
        resto = (d1 % 11);
        if (resto == 10)
           digito1 = 0;
        else
           digito1 = resto;
        
       
        //digito 2
         d1=0;
        for (int index = 1; index < CPF.length() -1; index++)
        {
           digitoCPF = Integer.valueOf (CPF.substring(index -1, index)).intValue();
           d1 = d1 + ( 11 - index ) * digitoCPF;
           //d2 = d2 + ( 12 - index ) * digitoCPF;
        };
        d2 += 2 * digito1;
        
        resto = (d1*10)%11;
        
        if (resto == 10)
           digito2 = 0;
        else
           digito2 = resto;
        
        String nDigVerific = CPF.substring (CPF.length()-2, CPF.length());

        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        return nDigVerific.equals(nDigResult);
    }

}
