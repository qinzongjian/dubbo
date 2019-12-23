package org.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qinzj.service.ProviderService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:consumer.xml");
    	
    	ctx.start();
    	
    	ProviderService ps = (ProviderService) ctx.getBean("providerService");
    	
    	String rs = ps.sayHello();
    	
    	System.out.println(rs);
    	
    	ctx.close();
    	
    }
}
