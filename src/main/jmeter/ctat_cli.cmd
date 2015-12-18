@echo off
setlocal enabledelayedexpansion

cd %~dp0target\test_reports
for /F "delims=" %%i in ('dir /b') do (
rmdir "%%i" /s/q || del "%%i" /s/q
)

cd %~dp0target\test_results
for /F "delims=" %%i in ('dir /b') do (
rmdir "%%i" /s/q || del "%%i" /s/q
)
cd %~dp0
echo %%~dp0

For /F "tokens=1* delims==" %%x IN (executor.properties) DO (
   echo Executing test case - %%~x
   echo FileName - %%~nx
   
   
java -jar -Xms512m -Xmx512m target/jmeter/bin/ApacheJmeter.jar -n -t AFW.jmx -l target/test_results/%%~nx.jtl -j target/jmeter/logs/%%~nx.log -L DEBUG -J JMETER_LOG_FILE_NAME="target/jmeter/logs/%%~nx.log" -q resources/report.properties -q resources/user_save_service.properties -J xmlScriptFileName="%%~nx" -G includecontroller="%~dp0"/src/test/jmeter/ -G ctat_basedir="%~dp0"/src/test/jmeter/

echo Generating the Report
echo ==========================   
   java -jar -Xms512m -Xmx512m target/jmeter/bin/ApacheJmeter.jar -n -t test_report_new.jmx -JXML_FILE=target/test_results/%%~nx.jtl -JHTML_FILE=target/test_reports/%%~nx.html -JTAG_NAMES=TESTCASE_DESCRIPTION,STEP_DESCRIPTION,STEP_SEVERITY,VALIDATIONS,VALIDATION,NAME,DESCRIPTION,EXPECTED_RESULT,ACTUAL_RESULT,VALIDATION_RESULT,TESTCASE_SEVERITY,DEVELOPER_LOGS
   echo report generated.....
)











