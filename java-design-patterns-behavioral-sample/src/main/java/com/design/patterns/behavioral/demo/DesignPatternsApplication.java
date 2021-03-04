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
import com.design.patterns.behavioral.command.Broker;
import com.design.patterns.behavioral.command.BuyStock;
import com.design.patterns.behavioral.command.SellStock;
import com.design.patterns.behavioral.command.Stock;
import com.design.patterns.behavioral.interpreter.InterpreterContext;
import com.design.patterns.behavioral.interpreter.ParameterPosition;
import com.design.patterns.behavioral.iterator.Inventory;
import com.design.patterns.behavioral.iterator.Item;
import com.design.patterns.behavioral.iterator.StockIterator;
import com.design.patterns.behavioral.mediator.ChatMediator;
import com.design.patterns.behavioral.mediator.ChatMediatorImpl;
import com.design.patterns.behavioral.mediator.User;
import com.design.patterns.behavioral.mediator.UserImpl;

@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		///////////////////////////////////////////////////

		// Chain Of Responsibility Design Pattern Sample.
		DocumentHandler chain = new SpreadSheetHandler(new SlideShowHandler(new TextDocumentHandler(null)));
		chain.openDocument(FileExtension.PPT);
		chain.openDocument(FileExtension.TXT);

		///////////////////////////////////////////////////

		// Command Design Pattern Sample.
		Stock stock = new Stock("Hola", 10);
		SellStock sellStock = new SellStock(stock);
		BuyStock buyStock = new BuyStock(stock);
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.placeOrder();

		///////////////////////////////////////////////////

		// Interpreter Design Pattern Sample.
		String str1 = "H-1::Param=1";
		InterpreterContext context = new InterpreterContext();
		ParameterPosition parameterPosition = new ParameterPosition(str1);
		String interpretationResult = parameterPosition.interpret(context);
		logger.info("ParamterPosition in this sentense -> H-1::Param=1 is : {}", interpretationResult);

		///////////////////////////////////////////////////

		// Iterator Design Pattern Sample.
		Item pens = new Item("pens", 175);
		Item pencils = new Item("pencils", 0);
		Item paper = new Item("paper", 500);

		Inventory inventory = new Inventory(pens, pencils, paper);
		StockIterator stockIterator = inventory.iterator();

		while (stockIterator.hasNext()) {
			Item item = stockIterator.next();
			logger.info("{}", item);

		}

		///////////////////////////////////////////////////

		// Mediator Design Pattern Sample.
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hi All !");
	}

}
