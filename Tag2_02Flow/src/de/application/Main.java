package de.application;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

import de.processors.MyProcessor;
import de.subscriber.EndSubscriber;

public class Main {

	public static void main(String[] args) throws Exception{
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		List<String> liste = List.of("1","2","drei","4","f�nf","1","2","drei","4","f�nf");
		
		EndSubscriber<Integer> endSubscriber = new EndSubscriber<>();
		MyProcessor processor = new MyProcessor(String::length);
		processor.subscribe(endSubscriber);
		
		
		SubmissionPublisher<String> publisher ;
		
		publisher = new SubmissionPublisher<String>(service, 100);
		
		
		publisher.subscribe(processor);
		
		liste.forEach(publisher::submit);
		
		publisher.close();	
		
		//service = (ExecutorService) publisher.getExecutor();
		service.shutdown();
		service.awaitTermination(1000, TimeUnit.DAYS);
		
		System.out.println("Ende");
		
	}

}
