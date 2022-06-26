package br.com.katho.taxi;

import br.com.katho.taxi.service.Taxi;
import br.com.katho.taxi.service.impl.TaxiImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxiApplication.class, args);

		Taxi taxi = new Taxi() {
			@Override
			public void reservar() {
				System.out.println("Interface: Implementação da classe de forma anônima");
			}
		};
		taxi.reservar();
	}

}
