package fatec.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos; 

    public Cliente(double limiteCred, String cpf, String nome) {
        super(cpf, nome);
        this.limiteDisp = limiteCred;
        this.limiteCred = limiteCred;
        this.pedidos = new ArrayList<Pedido>();
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

}
