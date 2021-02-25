package com.design.patterns.behavioral.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.behavioral.chainofresponsability.DocumentHandler;
import com.design.patterns.behavioral.chainofresponsability.FileExtension;
import com.design.patterns.behavioral.chainofresponsability.SlideShowHandler;
import com.design.patterns.behavioral.chainofresponsability.SpreadSheetHandler;
import com.design.patterns.behavioral.chainofresponsability.TextDocumentHandler;

@SpringBootApplication
public class DesignPatternsApplication {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		///////////////////////////////////////////////////

		// Chain Of Responsibility Design Pattern Sample.

		DocumentHandler chain = new SpreadSheetHandler(new SlideShowHandler(new TextDocumentHandler(null)));
		chain.openDocument(FileExtension.PPT);
		chain.openDocument(FileExtension.TXT);

	}

}
