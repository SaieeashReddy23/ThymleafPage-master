package com.example.ThymleafPage;

import com.example.ThymleafPage.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymleafPageApplication implements CommandLineRunner {

	@Autowired
	private PdfService pdfService;

	public static void main(String[] args) {
		SpringApplication.run(ThymleafPageApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println("pdf creating");
		pdfService.create();
		System.out.println("pdf creation done");
	}
}
