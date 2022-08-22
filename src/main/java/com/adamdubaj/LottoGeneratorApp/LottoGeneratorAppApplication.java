package com.adamdubaj.LottoGeneratorApp;

import com.adamdubaj.LottoGeneratorApp.games.Lotto;
import com.adamdubaj.LottoGeneratorApp.games.controllers.LottoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LottoGeneratorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LottoGeneratorAppApplication.class, args);
		System.out.println("Hello world!");
		String url = "https://megalotto.pl/wyniki/lotto/losowania-od-2-Sierpnia-2022-do-18-Sierpnia-2022";
		LottoController lottoController = new LottoController();
		lottoController.scrap(url, 3000);
		List<Lotto> list = lottoController.scrap(url, 3000);
		for (Lotto lotto: list) {
			System.out.println(lotto);
		}
	}
}
