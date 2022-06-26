package br.com.katho.taxi;

import br.com.katho.taxi.service.Taxi;
import br.com.katho.taxi.service.impl.TaxiImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxiApplication.class, args);

		/**
		 * NÃO EXISTE EXPRESSÕES LAMBDA SEM INTERFACES FUNCIONAIS
		 */

		// () não tem parâmetros e por isso só abre e fecha parênteses
		// o que está entre {} é chamado de body
		// lambda exige que tenha 1 único e somente 1 método abstrado
		Taxi taxi = (origem, destino) -> {
			System.out.println("");
			System.out.println("Taxi reservado. Origem: " + origem + " => Destino: " + destino);
			System.out.println("");
				return 3900.00;
		};
		double valorReserva = taxi.reservar("Cafelânida", "Lisboa");

		System.out.println("Valor da reserva: " + valorReserva);
	}

}
