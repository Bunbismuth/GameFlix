package com.Bunbismuth.Gameflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Essa notação é para explicitar que essa classe é quem irá inicializar a aplicação, a entrada de tudo.
@SpringBootApplication
public class GameflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameflixApplication.class, args);
	}

}
