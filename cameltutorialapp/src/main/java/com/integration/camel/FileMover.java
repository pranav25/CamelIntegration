package com.integration.camel;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileMover extends SpringRouteBuilder {
    
    private @Value("${camel.file.input.directory}") String inputDirectory;
    private @Value("${camel.file.output.directory}") String outputDirectory;
 
    @Override
    public void configure() throws Exception {
    	System.out.println(" File copying through Java started..");
        from("file:" + inputDirectory).to("file:" + outputDirectory);
        System.out.println(" File copying through Java Ended..");
    }
 
}