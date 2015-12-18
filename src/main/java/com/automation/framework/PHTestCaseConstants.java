/**
 * 
 */
package com.automation.framework;

/**
 * @author anponnus
 *
 */
public interface PHTestCaseConstants {
	
	public static final String COMPONENT = "component";
	public static final String IF = "if";	
	public static final String LOOP = "loop";	
	
	public static final String COMPONENT_NAME_DB = "db";
	public static final String COMPONENT_ATTRIBUTE_QUERY = "query";
	public static final String COMPONENT_ATTRIBUTE_ROW = "row";
	public static final String COMPONENT_ATTRIBUTE_COLUMN = "column";
	
	public static final String COMPONENT_NAME_TIMER = "timer";
	public static final String COMPONENT_NAME_WAIT = "wait";	
	public static final String COMPONENT_NAME_TEXTBOX = "textbox";
	public static final String COMPONENT_NAME_DATETIME = "datetime";
	public static final String COMPONENT_NAME_TIME_MINUTE = "timeminute";
	public static final String COMPONENT_NAME_SELECT = "select";
	public static final String COMPONENT_NAME_RADIOBUTTON = "radiobutton";
	public static final String COMPONENT_NAME_CHECKBOX = "checkbox";
	public static final String COMPONENT_NAME_NOTIFICATION = "notification";
	
    
	public static final String JMETER_VARIABLE_NOTATION = "$$";
	public static final String JMETER_VARIABLE_OBJ_NOTATION = "JMETEROBJ::";
	public static final String JMETER_PROPERTY_NOTATION = "props::";
	public static final String JMETER_VARIABLE_REPLACE_NOTATION = "JMETERREP::";
	public static final String NOTIFICATION_NOT_PRESENT = "NOT_PRESENT";
	
    
	public static final String COMPONENT_ATTRIBUTE_XPATH = "xpath";
	public static final String COMPONENT_ATTRIBUTE_XPATH1 = "xpath1";
	public static final String COMPONENT_ATTRIBUTE_XPATH_INPUT = "xpathInput";
	public static final String COMPONENT_ATTRIBUTE_NAME = "name";
	public static final String COMPONENT_ATTRIBUTE_TYPE = "type";
	public static final String COMPONENT_ATTRIBUTE_ACTION = "action";
	public static final String COMPONENT_ATTRIBUTE_VALUE = "value";
	public static final String COMPONENT_ATTRIBUTE_CONDITION = "condition";
	public static final String COMPONENT_ATTRIBUTE_COMPAREWITH = "compareWith";
	public static final String COMPONENT_ATTRIBUTE_SAVETO = "saveTo";
	public static final String COMPONENT_ATTRIBUTE_VAL_DESC = "valdesc";
	public static final String COMPONENT_ATTRIBUTE_VAL_KEY = "valkey";
	public static final String COMPONENT_ATTRIBUTE_DURATION = "maxwaittime";
	public static final String COMPONENT_ATTRIBUTE_WAITTIME = "refreshinterval";	
	//edit by jagee on 12/08/15
	public static final String COMPONENT_ATTRIBUTE_COLUMN_INDEX = "columnindex";
	public static final String COMPONENT_ATTRIBUTE_ROW_INDEX = "rowindex";
	public static final String COMPONENT_ATTRIBUTE_DATA_INDEX = "dataindex";
	public static final String COMPONENT_ATTRIBUTE_TABLE_ACTION = "tableaction";
	public static final String COMPONENT_ATTRIBUTE_TABLE_TYPE = "tabletype";
	public static final String COMPONENT_ATTRIBUTE_TABLE_VALUE = "tablevalue";
	public static final String COMPONENT_ATTRIBUTE_TABLE_ELEMENT_TYPE = "elementtype";
	public static final String COMPONENT_ATTRIBUTE_SPLITBY = "splitBy";
	public static final String COMPONENT_ATTRIBUTE_ATTRNAME = "attrName";
	public static final String COMPONENT_ATTRIBUTE_CSV_HEADER_NAME = "headerName";
	public static final String COMPONENT_ATTRIBUTE_CSV_VALUE = "csvvalue";
	public static final String COMPONENT_ATTRIBUTE_HEADER_AVAILABLE = "isHeaderAvailable";
	public static final String COMPONENT_ATTRIBUTE_REMOVE_LAST_ROW = "removeTableLastRow";
	public static final String COMPONENT_ATTRIBUTE_INNER_ELEMENET = "innerElement";
	public static final String COMPONENT_ATTRIBUTE_SAVEAS = "saveAs";
	public static final String COMPONENT_ATTRIBUTE_ELIMINATE_ROW = "eliminaterow";
	public static final String COMPONENT_ATTRIBUTE_FILE_UPLOAD_PATH = "filepath";
	
	public static final String  COMPONENT_ATTRIBUTE_TIME_ZONE_TO_CONVERT= "timezone";
	
	public static final String  COMPONENT_ATTRIBUTE_TIME_FORMAT_TO_CONVERT= "timeformat";
	public static final String  COMPONENT_ATTRIBUTE_SUBSTRING_END_INDEX= "endIndex";
	public static final String  COMPONENT_ATTRIBUTE_SUBSTRING_START_INDEX= "startIndex";
	
	//kavitha
	 
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER = "barmousehoverclick";
	 
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_INDEX_XPATH = "mouseHoverIndexXpath";
	 
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_CHECK_ZERO= "checkZeroValue";
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_CONTENT_XPATH = "mouseHoverContentXpath";
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_ONCLICK_XPATH = "onclickContentXpath";
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_CONTENT_MISMATCH_WAIT_REPEAT = "waitRepeatOnFail";
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_CONTENT_MISMATCH_WAIT = "failWaitTime";
	 public static final String COMPONENT_ACTION_BAR_MOUSE_HOVER_CONTENT_MISMATCH_RETRY_COUNT = "failRepeatCount";
	 public static final String COMPONENT_ACTION_PIE_MOUSE_HOVER = "piemousehoverclick";
	 
	 
	
	public static final String PARAMATER_ATTRIBUTE_NAME = "name";
	public static final String PARAMATER_ATTRIBUTE_VALUE = "value";
	public static final String STEP_ATTRIBUTE_LINKFILE = "linkFile";
	public static final String STEP_ATTRIBUTE_LOOP_CTRL = "loopcontrol";
	//public static final String STEP_ATTRIBUTE_REPEAT="repeat";
			
	public static final String COMPONENT_ACTION_CLICK = "click";
	public static final String COMPONENT_ACTION_MENU_SELECT = "menuselect";
	public static final String COMPONENT_ACTION_ENABLE = "enable";
	public static final String COMPONENT_ACTION_DISABLE = "disable";
	public static final String COMPONENT_ACTION_ENTERVALUE = "entervalue";
	public static final String COMPONENT_ACTION_READVALUE = "readValue";
	public static final String COMPONENT_ACTION_VALIDATE = "validate";
	public static final String COMPONENT_ACTION_VALIDATE_VALUES = "validatevalues";
	public static final String COMPONENT_ACTION_VALIDATE_LIST = "validatelist";
	public static final String COMPONENT_ACTION_EXTRACT = "extract";
	public static final String COMPONENT_ACTION_ASSERT = "assert";
	public static final String COMPONENT_ACTION_WAITVALIDATE = "waitandvalidate";
	//edit by jagee on 30/07/15
	public static final String COMPONENT_ACTION_SAVE = "save";
	public static final String COMPONENT_ACTION_ELEMENT_AVAILABILITY = "element-availability";
	public static final String COMPONENT_ACTION_ATTR_VALUE = "attrval";	
	public static final String COMPONENT_ACTION_HEADERVALIDATE = "headervalidate";
	public static final String COMPONENT_ACTION_COLUMNVALIDATE = "columnvalidate";
	public static final String COMPONENT_ACTION_TABLE_WEBELEMENT_ACTION = "rowaction";
	public static final String COMPONENT_ACTION_TABLE_WEBELEMENT_MULTI_COL_ACTION = "multicolaction";
	public static final String COMPONENT_ACTION_TABLE_DATA = "tabledata";	
	public static final String COMPONENT_ACTION_TABLE_WEBELEMENT_SPECIFIED_ROW_ACTION = "specifedrow";
	public static final String COMPONENT_ACTION_EXPORTED_FILENAME = "exportedfilename";
	public static final String COMPONENT_ACTION_READ_CSV_FILE = "readcsvfile";
	public static final String COMPONENT_ACTION_CONVERT_TO_LIST = "converttolist";
	public static final String COMPONENT_ACTION_ROW_AS_LIST = "rowaslist";		
	public static final String COMPONENT_ACTION_WAIT_UNTIL_ELEM_AVAIL = "waituntilelementvisible";
	public static final String COMPONENT_ACTION_GET_GRAPH_DATA = "getgraphdata";	
	public static final String COMPONENT_ACTION_GET_TEXT = "gettext";
	public static final String COMPONENT_ACTION_GET_LINKTEXT = "getlinktext";
	public static final String COMPONENT_ACTION_GET_ATTR = "getattribute";
	public static final String COMPONENT_ACTION_CHECKBOX = "checkbox";
	public static final String COMPONENT_ACTION_TEXT = "text";
	public static final String COMPONENT_ACTION_ATTR = "attribute";
	public static final String COMPONENT_ACTION_NOELEM = "noelement";
	public static final String COMPONENT_ACTION_LINKTEXT = "linktext";
	public static final String COMPONENT_ACTION_CLICK_PAGE_NAV = "pageNav";
	public static final String COMPONENT_ACTION_STRING = "string";
	public static final String COMPONENT_ACTION_ALERT = "alert";
	public static final String COMPONENT_ACTION_FILEUPLOAD = "fileupload";
	public static final String COMPONENT_ACTION_GET_CHECKBOX_STATUS = "getcheckboxstatus";
	public static final String COMPONENT_ACTION_APPEND_TABLE_COLUMN = "appendtablecolumn";
	public static final String COMPONENT_ACTION_BROWSER_BACK_BUTTON = "browserbackbutton";
	public static final String COMPONENT_ACTION_PARSE_JSON_STR = "parseJSONStr";	
	public static final String COMPONENT_ACTION_VALIDATE_GRAPH = "validategraph";	
	
	
	public static final String COMPONENT_ACTION_CONVERT_DATE = "convertdate";
	public static final String COMPONENT_ACTION_SUBSTRING_CONTENT = "substringcontent";
	public static final String COMPONENT_ACTION_SPLITTED_IP_ADDRESS = "getsplittedipaddress";
	
	public static final String COMPONENT_ACTION_EXTRACT_STRING = "string";
	public static final String COMPONENT_ACTION_EXTRACT_STRINGTOLIST = "stringtolist";
	public static final String COMPONENT_ACTION_EXTRACT_LISTOFSTRING = "listofstring";
	public static final String COMPONENT_ACTION_EXTRACT_LISTELEMENT_SIZE = "elementsize";
	public static final String COMPONENT_ACTION_EXTRACT_PAGNAV_SIZE = "pagnavsize";
	public static final String COMPONENT_ACTION_EXTRACT_PROPERTY = "property";
	public static final String COMPONENT_ACTION_EXTRACT_TABLE = "table";
	public static final String COMPONENT_ACTION_EXTRACT_TABLEROWASLIST = "tablefirstrowaslist";
	public static final String COMPONENT_ACTION_EXTRACT_NOTIFICATION = "notification";
	
	
	public static final String COMPONENT_ACTION_LINE_CHART = "linechart";
	public static final String COMPONENT_ACTION_PIE_CHART = "piechart";
	public static final String COMPONENT_ACTION_PIE_CHART_SIZE = "piechartsize";
	public static final String COMPONENT_ACTION_PIE_CHART_HEADER = "piechartheader";
	
	
    
	public static final String COMPONENT_SELECT_REGULAR = "regular";
	public static final String COMPONENT_SELECT_CUSTOM = "custom";
	public static final String COMPONENT_SELECT_MULTI = "multi";
	public static final String COMPONENT_SELECT_AUTOCOMPLETE = "autocomplete";
    
	public static final String VALIDATE_COND_CONTAINS = "contains";
	public static final String VALIDATE_COND_EQUALS = "equals";
	public static final String VALIDATE_COND_NOT_EQUALS = "not-equals";
	public static final String VALIDATE_COND_NOT_CONTAINS = "not-contains";
	public static final String VALIDATE_COND_INV_CONTAINS = "inv-contains";
	public static final String VALIDATE_COND_GREATER_THAN = "greater-than";
	public static final String VALIDATE_COND_LESSER_THAN = "lesser-than";
	
	//DS

	public static final String COMPONENT_OPERATION_GPV = "gpv";
	public static final String COMPONENT_OPERATION_SPV = "spv";
	public static final String COMPONENT_OPERATION_SENDEVENT = "sendEvent";
	public static final String COMPONENT_OPERATION_CHANGEWRITEABLE = "changeWritable";
	public static final String COMPONENT_ATTRIBUTE_OPERATION = "operation";
	public static final String COMPONENT_ATTRIBUTE_DEVICE_ID = "deviceid";
	
	public static final String XML_SCRIPT_FILE_NAME = "xmlScriptFileName";
	public static final String XML_SCRIPT_FILE_PATH = "xmlScriptFilePath";
	public static final String WEB_DRIVER = "DRIVER";

	public static final String IF_ATTRIBUTE_VALUE1 = "value1";
	public static final String IF_ATTRIBUTE_VALUE2 = "value2";
	public static final String IF_ATTRIBUTE_CONDITION = "condition";
	
	//edited by jagee 02/sep/15
	public static final String LOOP_ATTRIBUTE_VALUE = "value";
	public static final String LOOP_ATTRIBUTE_CONDITION = "condition";
	public static final String LOOP_ATTRIBUTE_CATEGORY = "category";
	public static final String LOOP_ATTRIBUTE_PAGING = "paging";
	public static final String LOOP_ATTRIBUTE_PAGING_ICON = "pagingicon";
	public static final String LOOP_ATTRIBUTE_CHART = "chart";
	
	public static final String COMPONENT_NAME_CALCULATE = "calculate";
	public static final String COMPONENT_ATTRIBUTE_CALCULATION_INPUT = "calcInput";
	public static final String COMPONENT_ACTION_ADD = "add";
	public static final String COMPONENT_ACTION_SUBTRACT = "subtract";
	public static final String COMPONENT_ACTION_MULTIPLY = "multiply";
	
	
	
	public static final String IF_CONDITION_EQUALS = "equals";
	public static final String IF_CONDITION_NOT_EQUALS = "not-equals";
	public static final String IF_CONDITION_CONTAINS = "contains";
	public static final String IF_CONDITION_NOT_CONTAINS = "not-contains";
	
	public static final String COMPONENT_ACTION_DROPDOWN_SELECT = "dropdownselect";
	public static final String COMPONENT_NAME_CURRENT_TIME = "currenttime";
	
	public static final String COMPONENT_NAME_DS_LOG_PARSER = "ds-log-parser";
	public static final String COMPONENT_ACTION_PARSE = "parse";
	public static final String COMPONENT_ATTRIBUTE_INFORM_NAME = "informName";
	public static final String COMPONENT_ATTRIBUTE_INFORM_PARAMETERS = "informParameters";
	public static final String COMPONENT_ATTRIBUTE_INFORM_TIME = "informTime";
	public static final String COMPONENT_ATTRIBUTE_EXPECT_FAULT = "expectFault";
	
	public static final String COMPONENT_INFORMNAME_GPV = "GPV";
	public static final String COMPONENT_INFORMNAME_GPA = "GPA";
	public static final String COMPONENT_INFORMNAME_SPV = "SPV";
	public static final String COMPONENT_INFORMNAME_SPA = "SPA";
	public static final String COMPONENT_INFORMNAME_GPN = "GPN";
	public static final String COMPONENT_INFORMNAME_ADD_OBJECT = "ADD_OBJECT";
	public static final String COMPONENT_INFORMNAME_REBOOT = "REBOOT";
	public static final String COMPONENT_INFORMNAME_RESET = "RESET";
	public static final String COMPONENT_INFORMNAME_DOWNLOAD = "DOWNLOAD";

	public static final String GPV_TAG = "<cwmp:GetParameterValues>";
	public static final String GPA_TAG = "<cwmp:GetParameterAttributes>";
	public static final String SPV_TAG = "<cwmp:SetParameterValues>";
	public static final String SPA_TAG = "<cwmp:SetParameterAttributes>";
	public static final String GPN_TAG = "<cwmp:GetParameterNames>";
	public static final String DOWNLOAD_TAG = "<cwmp:Download>";
	public static final String ADD_OBJECT_TAG = "<cwmp:AddObject>";
	public static final String REBOOT_TAG = "<cwmp:Reboot>";
	public static final String RESET_TAG = "<cwmp:FactoryReset/>";

	public static final String STRING_TAG = "string";
	public static final String NAME_TAG = "Name";
	public static final String PARAMETER_PATH_TAG = "ParameterPath";
	public static final String OBJECT_NAME_TAG = "ObjectName";
	public static final String TARGET_FILE_NAME_TAG = "TargetFileName";
	
	public static final String FAULT_TAG = "<cwmp:Fault>";

	
	public static final String SOAP_START = "<SOAP-ENV:Envelope";
	public static final String SOAP_END = "</SOAP-ENV:Envelope>";
	
}
