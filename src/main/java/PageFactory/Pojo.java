package PageFactory;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.internal.util.Stopwatch;

public class Pojo {
	private WebDriver webDriver = null;
	private WebDriverWait webDriverWait;
	private Properties objconfig;
	private Hashtable<String, String> datapoolHashTable;
   //private CustomReport objReporter;
	private String runningScript = "";
	private String strTestDataFilePath = "";
	private String testCaseID = null;
	private int runID;
	private int afterClickwait = 0;
	private int scriptTimeoutWait = 0;
	private boolean executionFlag;
	private Connection conn = null;
	private Statement stmt = null;
	private String execeptionFlag = "";
	private int testDataRow;
	private String portalURL = "";
	private Hashtable<String, String> objHashTable = new Hashtable<String, String>();
	private String TCID;
	private static String reportPath = System.getProperty("user.dir");
	private String downlodePath = "";
	// private XSSFWoorkbook dataValidator;
	private String step;
	private Stopwatch stopwatch;
	private String executionTimeStamp = "";

	private Properties objConfig;
	private XSSFWorkbook workbook;
	private String downloadPath;
	private XSSFWorkbook dataValidator;
	private String exceptionFlag;
	private Utilities objUtilities;
	private WrapperFunctions objWrapperFunctions;

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param scriptTimeoutWait
	 */
	public int getScriptTimeoutWait() {
		return this.scriptTimeoutWait;
	}

	public void setScriptTimeoutwait(int scriptTimeoutWait) {
		this.scriptTimeoutWait = scriptTimeoutWait;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param afterClickwait
	 */
	public Integer getAfterClickwait() {
		return this.afterClickwait;
	}

	public void setAfterClickwait(Integer afterClickwait) {
		this.afterClickwait = afterClickwait;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param webDriver
	 */
	public void setDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriver getDriver() {
		return this.webDriver;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param StrTestDataFilePath
	 */
	public String getStrTestDataFilePath() {
		return this.strTestDataFilePath;
	}

	public String setStrTestDataFilePath(String strTestDataFilePath) {
		return this.strTestDataFilePath = strTestDataFilePath;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param webDriverWait
	 */
	public void setWebDriverWait(WebDriverWait webDriverWait) {
		this.webDriverWait = webDriverWait;
	}

	public WebDriverWait getWebDriverWait() {
		return this.webDriverWait;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param Properties
	 */
	public void setobjConfig(Properties objConfig) {
		this.objConfig = objConfig;
	}

	public Properties getobjConfig() {
		return this.objConfig;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param datapoolHashTable
	 */
	public void setDataPoolHashTable(Hashtable<String, String> DataPoolHashtable) {
		this.datapoolHashTable = datapoolHashTable;
	}

	public Hashtable<String, String> getDataPoolHashTable() {
		return this.datapoolHashTable;
	}

	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param runningScript
	 */
	public void setRunningScriptName(String scriptName) {
		this.runningScript = scriptName;
	}

	public String getRunningScriptName() {
		return this.runningScript;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param downloadPath
	 */
	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param dataValidator
	 */
	public XSSFWorkbook getDataValidator() {
		return dataValidator;
	}

	public void setDataValidator(XSSFWorkbook dataValidator) {
		this.dataValidator = dataValidator;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param TestFailStep
	 */
	void setTestFailedStep(String step) {
		this.step = step;
	}

	public String getTestFailedStep() {
		return step;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param StopWatch
	 */
	public Stopwatch getStopwatch() {
		return stopwatch;
	}

	public void setStopwatch(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param TimeStamp
	 */
	public String getExecutionTimeStamp() {
		return executionTimeStamp;
	}

	public void setExecutionTimeStamp(String executionTimeStamp) {
		this.executionTimeStamp = executionTimeStamp;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param portalURL
	 */
	public void setPortalURL(String portalURL) {
		this.portalURL = portalURL;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param TestCaseId
	 */
	public void setRunningTestName(String methodName) {
		TCID = methodName;
	}

	public String getRunninTestName() {
		return TCID;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param Workbook
	 */
	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param HashTable
	 */
	public Hashtable<String, String> getObjHashTable() {
		return objHashTable;
	}

	public void setObjHashTable(Hashtable<String, String> objHashTable) {
		this.objHashTable = objHashTable;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param downloadPath
	 */
	public String getDownloadPath() {
		return downloadPath;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param DataBase Connection
	 */
	public Connection getDataBaseConnection() {
		return conn;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param DataBase Connection
	 */
	public void setDataBaseConnection(Connection conn) {
		this.conn = conn;
	}

	public Statement getDataBaseStatament() {
		return stmt;
	}

	public void setDataBaseStatement(Statement stmt) {
		this.stmt = stmt;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param exceptionFlag
	 */
	public String getCustomException() {
		return exceptionFlag;
	}

	public void setCustomException(String exceptionFlag) {
		this.exceptionFlag = exceptionFlag;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param testDataRow
	 */
	public int getTestDataRow() {
		return testDataRow;
	}

	public void setTestDataRow(int testDataRow) {
		this.testDataRow = testDataRow;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param portalURL
	 */
	public String getPortalURL() {
		return portalURL;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param Utilities
	 */
	public void setObjUtilities(Utilities objUtilities) {
		this.objUtilities = objUtilities;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param WrapperFunctions
	 */
	public void setObjWrapperFunctions(WrapperFunctions objWrapperFunctions) {
		this.objWrapperFunctions = objWrapperFunctions;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param testCaseID
	 */
	public String getTestCaseID() {
		return this.testCaseID;
	}

	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param executionFlag
	 */
	public boolean getExecutionFlag() {
		return this.executionFlag;
	}

	public void setExecutionFlag(boolean executionFlag) {
		this.executionFlag = executionFlag;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param runID
	 */
	public int getRunID() {
		return this.runID;
	}

	public void setRunID(int runID) {
		this.runID = runID;
	}
	/**
	 * @author Vikash Chandra thakur
	 * @date 12-03-2020
	 * @param scriptTimeoutWait
	 */
	public void setScriptTimeoutWait(int scriptTimeoutWait) {
		this.scriptTimeoutWait = scriptTimeoutWait;
	}

}
