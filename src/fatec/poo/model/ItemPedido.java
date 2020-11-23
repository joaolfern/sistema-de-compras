package fatec.poo.model;

public class ItemPedido {

    private int sequencia;
    private double qtdeVendida;
    private Produto produto;

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
        
       produto.setQtdeEstoque(produto.getQtdeEstoque()- qtdeVendida);//acrescentei isso
       
    }

    public void setQtdeVendida(double qtdeVendida) {
        produto.setQtdeEstoque((produto.getQtdeEstoque() + this.qtdeVendida) - qtdeVendida);//acrescentei isso
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
        
    }

    public Produto getProduto() {
        return produto;
    }

}
