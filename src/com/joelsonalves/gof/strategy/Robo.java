package com.joelsonalves.gof.strategy;

public class Robo {

    private Comportamento comportamento;

    public Robo(Comportamento comportamento) {

        this.comportamento = comportamento;

    }

    public void setComportamento(Comportamento comportamento) {

        this.comportamento = comportamento;

    }

    public void mover() {

        comportamento.mover();

    }

}
