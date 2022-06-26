package br.com.katho.taxi.service.impl;

import br.com.katho.taxi.service.Taxi;
import org.springframework.stereotype.Service;

@Service
public class TaxiImpl implements Taxi {

    @Override
    public void reservar() {
        System.out.println("Taxi reservado: ");
    }
}
