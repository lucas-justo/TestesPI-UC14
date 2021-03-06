	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class TestePagContato{
		
		private static final String KEY = "webdriver.gecko.driver";
		private static final String VALUE = "T:\\DIOGOD\\geckodriver.exe";

		FirefoxDriver pagina;
		
		@Before
		public void antes(){
			System.setProperty(KEY, VALUE);
			
			pagina = new FirefoxDriver();
			pagina.get("http://localhost/PI-UC14/contato.php");
		}

		
		@Test
		public void test() {
			WebElement nome = pagina.findElementByName("vSCONNOME");
			nome.sendKeys("Lucas Gay");
			
			WebElement email = pagina.findElementByName("vSCONEMAIL");
			email.sendKeys("dolphintech171@gmail.com");
			
			WebElement telefone = pagina.findElementByName("vSCONTELEFONE");
			telefone.sendKeys("30950643");
			
			WebElement endereco = pagina.findElementByName("vSCONENDERECO");
			endereco.sendKeys("Disney Fucking World N� 13");
			
			WebElement mensagem = pagina.findElementByName("vSCONMENSAGEM");
			mensagem.sendKeys("� us guri pae");
			
			WebElement enviarMensagem = pagina.findElementByName("submit");
			enviarMensagem.click();
			
		}

	}