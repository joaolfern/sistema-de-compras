package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa {

    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;
    
    public Vendedor(String cpf, String nome,double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setVendedor(this);
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return (taxaComissao * 100);
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao/100; //acrecentei o dividio por 100
    }

}
