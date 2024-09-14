package com.example.server_java_maven_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTests {

    @Test
	void deveCriarUmaContacomsaldoZero() {
		//Give(dado que - preparação - instanciação)
Conta conta = new Conta();
//When (quando acontecer algo - ação - método)
double saldo = conta.getSaldo();
//then (Então faça isso - afirmação)
assertEquals(0, saldo, 0.001);


	}
    
}
