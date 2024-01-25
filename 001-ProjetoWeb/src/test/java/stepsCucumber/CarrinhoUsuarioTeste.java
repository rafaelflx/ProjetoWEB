package stepsCucumber;

import bibliotecaMetodos.Metodos;
import configuracaoAmbiente.Ambiente;
import driversConexao.Drivers;
import elementosWeb.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CarrinhoUsuarioTeste extends Drivers {
	
	Metodos metodos = new Metodos();
	
	
	@Before
	public void iniciarTeste() {
		Ambiente.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {
		Ambiente.encerrarAmbiente();
	}
	

	@Given("acesse a area de produtos")
	public void acesseAAreaDeProdutos() {
		metodos.clicar(Elementos.abaProducts);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("adicionar a quantidade e os itens desejados ao carrinho")
	public void adicionarAQuantidadeEOsItensDesejadosAoCarrinho() {
		metodos.buscarProduto("Stylish Dress", "3", 2);
		metodos.clicar(Elementos.abaProducts);
		metodos.buscarProduto("Beautiful Peacock Blue Cotton Linen Saree", "2", 2);
		metodos.clicar(Elementos.abaProducts);
		metodos.buscarProduto("Men Tshirt", "1", 2);
	}
	
	@Then("valide os itens dentro do carrinho")
	public void valideOsItensDentroDoCarrinho() {
		metodos.clicar(Elementos.abaCart);
		metodos.validarTexto("Stylish Dress", "Stylish Dress");
		metodos.validarTexto("Beautiful Peacock Blue Cotton Linen Saree", "Beautiful Peacock Blue Cotton Linen Saree");
		metodos.validarTexto("Men Tshirt", "Men Tshirt");
	}
	


	@Given("acesse o campo de cadastro")
	public void acesseOCampoDeCadastro() {
		metodos.clicar(Elementos.abaUsuario);

	}
	


	@When("forneça os dados obrigatorios validos para um cadastro")
	public void forneçaOsDadosObrigatoriosValidosParaUmCadastro() {
		metodos.escrever(Elementos.name, "Rafael");
		metodos.escrever(Elementos.email, "rafael9@gmail.com");
		metodos.clicar(Elementos.btnSingUp);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		metodos.escrever(Elementos.password, "123456789");
		metodos.escrever(Elementos.firstName, "Rafael");
		metodos.escrever(Elementos.lastName, "Felix");
		metodos.escrever(Elementos.adress, "Rua petrolina");
		//metodos.escrever(Elementos.country, null);
		metodos.escrever(Elementos.state, "São Paulo");
		metodos.escrever(Elementos.city, "Barueri");
		metodos.escrever(Elementos.zipcode, "06463200");
		metodos.escrever(Elementos.mobileNumber, "958488376");
		metodos.clicar(Elementos.btnCreateAccount);
	
	}
	
	@Then("valide a mensagem de cadastro")
	public void valideAMensagemDeCadastro() {
		metodos.validarTexto2(Elementos.msgSucess, "ACCOUNT CREATED!");
	
	}



}
