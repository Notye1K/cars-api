package com.aceleracao.cars.DTO;

public record CarsDTO(
    String modelo,
	String fabricante,
	String dataFabricacao,
	Double valor,
	int anoModelo
) {
    
}
