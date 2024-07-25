package org.kadircali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml") ;
        UserManager userManager = (UserManager) context.getBean("userManager");
        userManager.add();







    }
}
