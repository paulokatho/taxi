package br.com.katho.taxi.service;

public interface Taxi {

    // PARA UTILIZAR LAMBDA É EXIGIDO QUE A INTERFACE TENHA SOMENTE 1 ÚNICO MÉTODO ABSTRATO
    //void reservar(String origem, String destino);

    double reservar(String origem, String destino);
}
