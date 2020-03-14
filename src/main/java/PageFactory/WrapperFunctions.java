package PageFactory;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;

//public class WrapperFunctions {
	public class WrapperFunctions extends LoadableComponent<WrapperFunctions> {
		private Pojo objpojo;
		Boolean Flag = false;
		public WrapperFunctions(Pojo pojo){
			this.objpojo=pojo;
	}

		public void waittForElementPresence(By locator) {
			objpojo.getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(locator));
		}

		public void waitForElementVisibilityLocated(By locator) throws NotFoundException {
			objpojo.getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

		public void waitForElementVisibility(WebElement webElement) throws NotFoundException {
			objpojo.getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
		}

		public void waitFOrElementTOBeClickeble(By locator) throws NotFoundException {
			objpojo.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
		}

		public void waitForElementinVisibilityLocated(By locator) throws NotFoundException {
			objpojo.getWebDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(locator));
		}
		public boolean checkElementDisplayedWithoutWait(By locator){
			 try{
		 return objpojo.getDriver().findElement(locator).isDisplayed();
	 }catch(Exception exception)
		{
			return false;
		}
	}
	public boolean openNewWindow(){
			 try{
				 JavascriptExecutor  js =(JavascriptExecutor) objpojo.getDriver();
				 //js executeScript("window.open('',_blank');");
				 return true;
			 }catch(Exception e){
		e.printStackTrace();
		return false;
	}
	}

	public void waitAfterEachClick() {
		waitFor(objpojo.getAfterClickwait());
	}

	public boolean waitFor(int timeUnitSeconds){
	try {
	Thread.sleep(TimeUnit.MILLISECONDS.convert(timeUnitSeconds, TimeUnit.SECONDS)); 
	return true; }
	catch (Exception exception) {
	exception.printStackTrace(); 
	return false; }}
	public boolean scrollToViewDown(By locator) {
		try {
		waitForElementPresence(locator);
	WebElement webElement= objpojo.getDriver().findElement(locator);
	//((javascriptExecutor) objpojo.getDriver()).executeScript("arguments[0].scrollIntoView(false);",webElement);

	return true;}
		catch(NoSuchElementException exception){
	objpojo.setCustomException("Timeout & NoSuchElewent Exception");
	System.out.println("I got no such "+ exception.getMessage());
	exception.printStackTrace();
	return false;}
		catch(TimeoutException exception){
	objpojo.setCustomException("Timeout & NoSuchElement Exception");
	System.out.println("I got timeout" + exception.getMessage());
	exception.printStackTrace();
	return false;}
		catch(NotFoundException exception){
	objpojo.setCustomException("NotFound Exception");
	System.out.println("I got timeout" +exception.getMessage());
	exception.printStackTrace();
	return false;}
		catch(ElementNotVisibleException exception){
			objpojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout" +exception.getMessage());
			exception.printStackTrace();
			return false;}
		catch(ElementNotInteractableException exception){
			objpojo.setCustomException("ElementNotInteractableException");
			System.out.println("I got timeout" +exception.getMessage());
			exception.printStackTrace();
			return false;}
		catch(Exception exception){
			objpojo.setCustomException("NoSuchElement Exception");
			exception.printStackTrace();
			return false;}
	}
public void elementHighlight(By locator){
	WebElement element = objpojo.getDriver().findElement(locator);
	for(int i=0;i<2;i++){
		JavascriptExecutor  js =(JavascriptExecutor) objpojo.getDriver();
		 //js executeScript("argument[0].setAttribute('style',argument[1]);",element,
				// "color: yellow;border: 3pxsolid yellow;");	
		 waitFor(1);
		 //js executeScript("argument[0].setAttribute('style',argument[1]);",element,"");
	}		 
	}
public boolean selectDropDownOption(By locator, String option, String... selectType) {
	try {
		waitForElementPresence(locator); 
WebElement webElement =objpojo.getDriver().findElement(locator); 
waitForElementVisibility(webElement); 
Select sltDropDown= new Select(webElement); 
if (selectType.length > 0 && !selectType[0].equals("")) { 
	if (selectType[0].equalsIgnoreCase("Value")) 
		sltDropDown.selectByValue(option);
	else if (selectType[0].equalsIgnoreCase("Text"))
		sltDropDown. selectByVisibleText (option) ; 
	else if (selectType[0].equalsIgnoreCase("Index"))
		sltDropDown.selectByIndex(Integer.parseInt(option));
	return true; }
else {
	List<WebElement> options =sltDropDown.getOptions();
}
boolean blnOptionAvailable=false;
int iIndex= 0;
//for (WebElement weOptions : options) {
//	if (weOptions.getText().trim().equals(option)){
//		sltDropDown.selectByIndex(iIndex); 
//		blnOptionAvailable=true; 
//		break;}
//	else 
//		iIndex++;
//	}
return blnOptionAvailable;
}
	catch (NoSuchElementException exception) { 
		objpojo.setCustomException("Timeout 8 NoSuchElement Exception");
		System.out.println("I got no such " + exception.getMessage());
		exception.printStackTrace(); 
		return false;}
		catch (TimeoutException exception) {
			objpojo.setCustomException("Timeout 8 UoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace(); 
			return false; }
		catch (NotFoundException exception) 
		{ 
			objpojo.setCustomException("NotFound Exception");
		System.out.println("I got timeout " + exception.getMessage());
		exception.printStackTrace(); 
		return false; } 
		catch (ElementNotVisibleException exception) {
			objpojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout" + exception.getMessage());
			exception.printStackTrace(); 
			return false;}
			catch (ElementNotInteractableException exception) {
				objpojo.setCustomException("ElementNotInteractableException Exception"); 
				System.out.println("I got timeout" + exception.getMessage());
				exception.printStackTrace();
				return false; 
		}
			catch(ElementNotSelectableException exception){
				objpojo.setCustomException("ElementNotSelectableException exception");
				System.out.println("I got timeout" + exception.getMessage());
				exception.printStackTrace();
				return false;}
				catch (Exception exception){
					objpojo.setCustomException("NoSuchElement Exception");
					exception.printStackTrace();
					return false; 
				}
			}

private void waitForElementPresence(By locator) {
	// TODO Auto-generated method stub
	
}

@Override
protected void isLoaded() throws Error {
}
@Override
protected void load() {
}
public String alertGetText() { 
	Alert alert = objpojo.getDriver().switchTo().alert(); 
	return alert.getText(); 
}
public boolean click(WebElement element) {
	try {
		waitForElementVisibility(element); 
		element.click(); 
		waitAfterEachClick(); 
		return true;
		} catch(NoSuchElementException exception){
			objpojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such "+exception.getMessage());
			exception.printStackTrace();
			return false;}
	catch(TimeoutException exception){
		objpojo.setCustomException("Timeout & NoSuchElement Exception");
		System.out.println("I got timeout "+exception.getMessage());
		exception.printStackTrace();
		return false;}
	catch(NotFoundException exception){
		objpojo.setCustomException("NotFound Exception");
		System.out.println("I got timeout "+exception.getMessage());
		exception.printStackTrace();
		return false;}
	catch(ElementNotVisibleException exception){
	objpojo.setCustomException("ElementNotVisibleException");
	System.out.println("I got timeout "+exception.getMessage());
	exception.printStackTrace();
	return false;}
catch(ElementNotInteractableException exception){
	objpojo.setCustomException("ElementNotInteractableExcepticn Exception");
	System.out.println("I got timeout " + exception.getMessage());
	exception.printStackTrace();
	return false;}
	
}
}