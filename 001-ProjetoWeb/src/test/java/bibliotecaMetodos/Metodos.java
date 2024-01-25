package bibliotecaMetodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driversConexao.Drivers;
import elementosWeb.Elementos;

public class Metodos extends Drivers {
	
	public void escrever(By locator, String texto) {
		driver.findElement(locator).sendKeys(texto);
	}

	public void clicar(By locator) {
		driver.findElement(locator).click();
	}

	public void submit(By locator) {

		driver.findElement(locator).submit();
	}
	
	public void limparCampo(By locator) {
		driver.findElement(locator).clear();
	}

	public void validarTexto(String texto, String textoEsperado) {

		String textoCapturado = driver.findElement(By.xpath("//*[text()='" + texto + "']")).getText();
		assertEquals(textoEsperado, textoCapturado);
	}
	
	public void validarTexto2(By locator, String textoEsperado) {

		String textoCapturado = driver.findElement(locator).getText();
		System.out.println(textoCapturado);
		assertEquals(textoEsperado, textoCapturado);
	}
	
	public void buscarProduto(String textoProduto, String textoQuantidade, int tempo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Elementos.campoBusca));
		driver.findElement(Elementos.campoBusca).click();
		driver.findElement(Elementos.campoBusca).sendKeys(textoProduto);
		driver.findElement(Elementos.btnBusca).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(Elementos.btnView));
		driver.findElement(Elementos.btnView).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(Elementos.campoQuantidade));
		driver.findElement(Elementos.campoQuantidade).click();
		driver.findElement(Elementos.campoQuantidade).clear();
		driver.findElement(Elementos.campoQuantidade).sendKeys(textoQuantidade);
		driver.findElement(Elementos.btnCart).click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement elemen4t = wait4.until(ExpectedConditions.elementToBeClickable(Elementos.btnContinue));
		driver.findElement(Elementos.btnContinue).click();
		
	}
	
	public void esperarElementoSerClicavel(By elemento, int tempo) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		driver.findElement(elemento).click();
	}
	
	public void mouseOver(By elemento) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
}
