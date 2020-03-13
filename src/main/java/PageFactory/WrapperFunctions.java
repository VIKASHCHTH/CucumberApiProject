package PageFactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class WrapperFunctions {
//	public boolean click(WebElement element) {
//		try {
//			waitForElementVisibility(element); 
//			element.click(); 
//			waitAfterEachClick(); 
//			return true;
//			} 
//		catch (NoSuchElementException exception) { 
//			objPojo.setCustomException("Timeout 8 NoSuchElement Exception");
//			System.out.println("I got no such " + exception.getMessage());
//			exception.printStackTrace(); return false;
//			catch (TimeoutException exception) {
//				objPojo.setCustomException("Timeout 8 UoSuchElement Exception");
//				System.out.println("I got timeout " + exception.getMessage());
//				exception.printStackTrace(); return false; }
//			catch (NotFoundException exception) 
//			{ 
//				objPojo.setCustomException("HotFound Exception");
//			System.out.println("I got timeout - + exception.getMessage()");
//			exception.printStackTrace(); return false; } catch (ElementUotVisibleException exception) {
//				objPojo.setCustomException("ElementUotVisibleException");
//				System.out.println("I got timeout + exception.getMessage()");
//				exception.printStackTrace(); return false;
//				catch (ElementUotInteractableException exception) {
//					objPojo.setCustomException("ElementNotInteractableException Exception"); 
//					System.out.println("I got timeout + exception.getMessage()"); 
//					exception.printStackTrace(); return false; 
//			}
//		
//		}
//	}
//		
//		return false; )
//catch (Exception exception){
//	objPojo.setCustomException(.NoSuchElement Exception.);
//	exception.printStackTrace();
//	return false; 
//}
//		} 
//@Override protected void load() 
//{ @Override protected void isLoaded() throws Error { } 
//		U ,ustomneportenieirm 
//		@Author : tiMAI,OPAC ftkola - AQM Technologies • 
//		@Description : This method is for getting the text on the alert box. ./ 
//		public String alertGetText() { 
//			Alert alert . objPojo.getOriverd.switchTo().alert(); 
//			return alert.getText(); 
//		}
//
//	public boolean click(WebElement element) {
//			try { 
//				waitforElementVisibility(element); element.click(), 
//			}
//		}
//	break; } 
//else iIndex++; 
//	return blnOptionAvailable; 
//	} catch (NoSuchElementException exception) {
//		objPojo.setCustomException("Timeout & HoSuchElement Exception");
//		System.out.println("I got no such " + exception.getMessage());
//		exception.printStackTrace();
//		return false; 
//		} catch (TimeoutException exception) { 
//			objPojo.setCustomException("Timeout & NoSuchElement Exception");
//			System.out.println("I got timeout " + exception.getMessage());
//			exception.printStackTrace(); return false;
//			catch (NotFoundException exception) { 
//				objPojo.setCustomException("NotFound Exception"); 
//				System.out.println("I got timeout " + exception.getMessage());
//				exception.printStackTrace(); 
//				return false; 
//				catch (ElementNotVisibleException exception)
//				objPojo.setCustomException("ElementUotVisibleException");
//				System.out.println("I got timeout " + exception.getMessage());
//				excepticn.printStackTrace(); return false; } 
//			catch (ElementNotInteractableException exception) {
//				objPojo.setCustomException("ElementNotInteractableExcepticn Exception");
//				System.out.println("I got timeout . + exception.getMessage()");
//				excepticn.printStackTrace(); 
//				return false; }
//			catch (ElementNotSelectableException excepticn) { 
//				objPojo.setCustomException("ElementNotSelectableException Excepticn");
//				System.out.println("I got timeout + excepticn.getMessage()");
//				exception.printStackTrace(); return false;
//				catch (Exception exception) 
//			}
//		}
//		//• fitiethod selectOropDownOption • Description : This is wrapper method select drop down element • @param : locator - By identification of element @param • option - drop down element (user may specify text/value/index) • @param : selectrype - select Aorp, down element by Text/Value/Index " @Author : ?OW, IOW Agay4 - AQM Technologies ./ 
//		public boolean selectDropDownOption(By locator, String option, String... selectType) {
//			try waitForElementPresence(locator); 
//		WebElement webElement objPojo.getOriver().findElement(locator); 
//		waitForElementVisibility(webElement); 
//		Select select DropDown new Select(webElement); 
//		if (selectType.length > e ii !selectType(0].equals(—)) { 
//			if (selectType[0].equalsIgnoreCase("Value")) selectDropDown.selectByValue(option);
//			else if (selectrype(0).equalsIgnoreCase("Text.)) selectDropDown. se lectByVisibleText (option) ; else if (selectrype[0].equalsIgnoreCase("Index")) sltDropDown selectByIndex(Integer .porseint(option)); return true; ) else ListOiebElement, options sltDropDown.getOptions(); boolean blnOptionAvailable false; int iIndex 0; for (WabElement weOptions : options) { if (weOptions.getText().trim().equals(option)) sltDrop0o,n selectByIndex( iIndex); blnOptionAvailable true; break; else 
//		}
//		}
//		•/- 
//		public boolean waitFor(int timeUnitSeconds){
//			try ( Thread.sieep(TineUnit.MILLISECONDS.convert(timeunitSeconds, TiseUnit.SECONDS)); 
//					return true; 
//					catch (Exception exception) {
//						exception.printStackTrace(); 
//						return false; 
//					}
//		}
//		//. /". I Scroll element to view using javaScript This script is used for scrolling doWn. 
//		 public boolean scrollToVielAkmm(By locator) {
//			 try {
//				 waitForElementPresence(locator);
//				 WebElement webElement= objPojo.getDriver().findElement(locator);
//				 ( ( lava scriptExecutor) objPojo. getDriver( ) ) 
//				 executeScript arguments (0) scro1lIntoView( fa lse) ; return true; }
//			 catch (NoSuchElementException exception) { 
//					 objPojo.setCustomExceptionrTireout NoSuchElewent Exception.); 
//			System.out.println("rI got no such + exception.get.ssage()); 
//			exception.printStackTrace(); 
//			return false; }
//			 catch (TimeoutException exception) {
//				 objPojo.setCustomExceptionCTireout NoSuchElement Exception.);
//			System.out.printlq, got tireout + exception.getMessage()); 
//			e,ccept ion. printStacIcTrace(); 
//			return false;}
//			 catch (NotFoundException exception) {
//				 objPojo.setCustomExceptionrNotFound Exception.); 
//			System.out.printlnrI got tireout + exception.getMessage()); 
//		exception.printStackTrace(); 
//				 }
//			 }
//		 }
//		 public void waitForElementVisibility(WebElement webElement) throws NotFoundException (
//				 objPojo.getWebOriverWait().until(Expectedronditions.visibiLity0f(webElement)); 
//				 //• @Description : This is wrapper method wait for element to be clickable • @param locator - By identification of element • (Author : Kwen,,,gerwej, AQM Technologies! ./ 
//				 public void waitFOrElementTOBeClickeble(By locator) throws NotFOUndException { 
//				 //• (Description : ThiS'i, wrapper method wait for visibility of element located • .ram • locator, - By identification of element • @Author : 440.0,4 - AQm Technologies P:bno'bj;:j%:=1,7e'erliihtirt=i)rx;:rteecrign'd=r.)intvirsci771.77-;;;==eL(locator)); 
//				// • pescription : This is wrapper method to check the web element is displayed • on the page - true locatorif-erlidetntific:ttion of element • 64=1:.  fegnartvParle!eAQM Technologies 
//					 public boolean checkElementDisplayedWithoutWait(By locator) 
//					 return objPojo.getDriver().findElement(locator),IsDisplayed();}
//				 } catch (Exception exception) { 
//					 return false; 
//				 }
//		 
//
//
//
//
}
