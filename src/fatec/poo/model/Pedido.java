package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {

    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itens;
    private double total;
    
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.itens = new ArrayList<ItemPedido>();
        this.total = 0;
        
        vendedor.addPedido(this);
        cliente.addPedido(this);
    }

    public void addItem(ItemPedido item) {
        double valorItem = item.getProduto().getPreco() * item.getQtdeVendida();
        if(valorItem <= cliente.getLimiteDisp()){
            itens.add(item);
            cliente.setLimiteDisp(cliente.getLimiteDisp() - valorItem);
            total += valorItem;
        }
    }
    
    /*acrescentei isso
    public void addItem(ItemPedido itemPedido){
        itens.add(itemPedido);
        itemPedido.setPedido(this);
        
        if(this.getSituacao()) {
           double limiteAtual = cliente.getLimiteDisp();
           cliente.setLimiteDisp(limiteAtual - itemPedido.getQtdeVendida() * itemPedido.getProduto().getPreco());
        }
        
    }*/
    
    public ArrayList<ItemPedido> listarItens(){
        return itens;
    }
    
    public double getTotal(){
        return total;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
