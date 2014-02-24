package me.zeph.blackjack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class BlackJackController {

	public static final String INDEX = "index";

	@RequestMapping(value = INDEX, method = GET)
	public String view() {
		return INDEX;
	}
}
