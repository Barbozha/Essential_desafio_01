package com.devsuperior.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import entities.Order;

@SpringBootApplication
@ComponentScan
public class Desafio01Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Entrada dos dados
		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println(order);
		
		
		
		
		sc.close();
		
	}

}
