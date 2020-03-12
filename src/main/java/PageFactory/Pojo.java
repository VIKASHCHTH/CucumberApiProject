package PageFactory;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.internal.util.Stopwatch;

public class Pojo {
 private WebDriver webDriver=null;
 private WebDriverWait webDriverWait;
 //private properties objconfig;
 private Hashtable<String,String> datapoolHashTable;
 //private CustomReport objReporter;
 private String runningScript="";
 private String strTestDataFilePath="";
 private String  testCaseID=null;
 private int runID;
 private int afterClickwait=0;
 private int scriptTimeoutWait=0;
 private boolean executionFlag;
 private Connection conn =null;
 private Statement stmt=null;
 private String execeptionFlag="";
 private int testDataRow;
 private String portalURL="";
 private Hashtable<String,String> objHashTable=new Hashtable<String,String>();
 //private XSSFWorkbook workbook;
 private String TCID;
 private static String reportPath=System.getProperty("user.dir");
 private String downlodePath="";
// private XSSFWoorkbook dataValidator;
 private String step;
 private Stopwatch stopwatch;
 private String executionTimeStamp="";
 
 
 /**@author Vikash Chandra thakur
  * @date 12-03-2020
  * @param scriptTimeoutWait
  */
 public int getScriptTimeoutWait(){
	 return this.scriptTimeoutWait;
 }

	public void setScriptTimeoutwait(int scriptTimeoutWait){
	 this.scriptTimeoutWait=scriptTimeoutWait;
 }
 /**@author Vikash Chandra thakur
  * @date 12-03-2020
  * @param afterClickwait
  */
 public Integer getAfterClickwait(){
	 return this.afterClickwait;
 }
 public void setAfterClickwait(Integer afterClickwait){
	 this.afterClickwait=afterClickwait;
 }
 /**@author Vikash Chandra thakur
  * @date 12-03-2020
  * @param webDriver
  */
 public void setDriver(WebDriver webDriver){
	 this.webDriver=webDriver;
 }
 public WebDriver getDriver(){
	 return this.webDriver;
 }
	 
 }
 
