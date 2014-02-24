package me.zeph.blackjack.controller;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BlackJackControllerTest {
	@Test
	public void shouldReturnIndex() throws Exception {
		BlackJackController blackJackController = new BlackJackController();
		assertThat(blackJackController.view(), is("index"));
	}
}
