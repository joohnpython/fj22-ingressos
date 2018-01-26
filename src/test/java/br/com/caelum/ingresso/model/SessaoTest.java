package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import junit.framework.Assert;

import org.junit.Test;

public class SessaoTest {

	@Test
	public void oprecodasessaodeveserigualasomadoprecodasalamaisoprecodofilme(){
		Sala sala = new Sala("Eldorado -Imax" , new BigDecimal("22.5"));
		Filme filme = new Filme("Rogue one" , Duration.ofMinutes(120),"SCI-FI", new BigDecimal("12.0"));
		
		BigDecimal somadosprecosdasalaefilme = sala.getPreco().add(filme.getPreco());
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme,sala);
		Assert.assertEquals(somadosprecosdasalaefilme, sessao.getPreco());
	}
	
}
