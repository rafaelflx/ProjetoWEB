package configuracaoAmbiente;

import java.io.File;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driversConexao.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Ambiente extends Drivers {

	static String ambiente = "https://automationexercise.com";

	public static void configurarAmbiente() {

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./Extensions/AdBlock.crx"));
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window();
		driver.get(ambiente);
	}

	public static void encerrarAmbiente() {
		
		driver.quit();
	}

}
