package br.com.alura.leilao;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
	
	void getInstance() {
	}
	
	@BeforeClass
	@Test
	public void hello() {
		WebDriver browser = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		browser.navigate().to("http://localhost:8080/leiloes");
		browser.quit();
	}

}
