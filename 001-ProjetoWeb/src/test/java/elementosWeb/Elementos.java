package elementosWeb;

import org.openqa.selenium.By;

public class Elementos {
	
	
	// Products Elements
	
	public static By campoBusca = By.xpath("//*[@id='search_product']");
	public static By btnBusca = By.xpath("//*[@id='submit_search']");
	public static By btnCart = By.xpath("//button[normalize-space()='Add to cart']");
	public static By btnContinue = By.xpath("//*[@id='cartModal']/div/div/div[3]/button");
	public static By btnView = By.xpath("//a[normalize-space()='View Product']");
	public static By campoQuantidade = By.xpath("//*[@id='quantity']");
	public static By textoVisual = By.xpath("//*[text()='+ Add to cart +']");
	
	// Tab Elements
	
	public static By abaProducts = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a");
	public static By abaCart = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[3]/a");
	public static By abaUsuario = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");
	public static By abaDelete = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]");
	
	// Register Elements
	
	public static By name = By.xpath("//input[@placeholder='Name']");
	public static By email = By.xpath("//input[@data-qa='signup-email']");
	public static By btnSingUp = By.xpath("//button[normalize-space()='Signup']");
	public static By password = By.xpath("//input[@id='password']");
	public static By firstName = By.xpath("//input[@id='first_name']");
	public static By lastName = By.xpath("//input[@id='last_name']");
	public static By adress = By.xpath("//input[@id='address1']");
	public static By state = By.xpath("//input[@id='state']");
	public static By city = By.xpath("//input[@id='city']");
	public static By zipcode = By.xpath("//input[@id='zipcode']");
	public static By mobileNumber = By.xpath("//input[@id='mobile_number']");
	public static By country = By.xpath("");
	public static By btnCreateAccount = By.xpath("//button[normalize-space()='Create Account']");
	public static By msgSucess = By.xpath("//b[normalize-space()='Account Created!']");
	public static By btnContinue2= By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	
	

}
