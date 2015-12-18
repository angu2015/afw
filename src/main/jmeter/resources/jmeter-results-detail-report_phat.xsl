<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0">

	<!-- Licensed to the Apache Software Foundation (ASF) under one or more 
		contributor license agreements. See the NOTICE file distributed with this 
		work for additional information regarding copyright ownership. The ASF licenses 
		this file to You under the Apache License, Version 2.0 (the "License"); you 
		may not use this file except in compliance with the License. You may obtain 
		a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless 
		required by applicable law or agreed to in writing, software distributed 
		under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
		OR CONDITIONS OF ANY KIND, either express or implied. See the License for 
		the specific language governing permissions and limitations under the License. -->

	<!-- Stylesheet for processing 2.1 output format test result files To uses 
		this directly in a browser, add the following to the JTL file as line 2: 
		<?xml-stylesheet type="text/xsl" href="../extras/jmeter-results-detail-report_21.xsl"?> 
		and you can then view the JTL in a browser -->

	<xsl:output method="html" indent="yes" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" />

	<!-- Defined parameters (overrideable) -->
	<xsl:param name="showData" select="'n'" />
	<xsl:param name="titleReport" select="'PrimeHome Sanity Automation Detailed Report'" />
	<xsl:param name="dateReport" select="'date not defined'" />
	<xsl:variable name="testCaseName" select="substring-before(//responseFile[contains(., '.jmx')],'.jmx')" />

	<xsl:template match="testResults">
		<html>
			<head>
				<title>
					<xsl:value-of select="$titleReport" /><!-- &#x20;-&#x20;	<xsl:value-of select="substring-before(//responseFile[contains(., '.jmx')],'.jmx')" /> -->
				</title>
				<style type="text/css">
					body {
						font:normal 68% verdana,arial,helvetica;
						color:#000000;
					}
					table tr td, table tr th {
						font-size: 68%;
					}
					table.details tr th{
						color: #ffffff;
						font-weight: bold;
						text-align:center;
						background:#2674a6;
						white-space: nowrap;
					}
					table.details tr td{
						background:#eeeee0;
						white-space: nowrap;
					}

					table.detailsFull tr th{
						color: #ffffff;
						font-weight: bold;
						text-align:center;
						background:#2674a6;
						white-space: nowrap;
					}

					table.detailsFull tr {
						background:#eeeee0;
						<!-- white-space: nowrap; -->
					}

					td.responseData {
						table-layout: fixed;
						width:70%;
						background:#eeeee0;
						white-space:pre-line;
						<!-- word-wrap:break-word; -->
					}

					td.normal {
						table-layout: fixed;
						width:5%;
						background:#eeeee0;
						<!-- word-wrap:break-word; -->
					}

					td.pass {
						color: #ffffff;
						table-layout: fixed;
						width:25%;
						background:green;
						white-space:pre-line;
						<!-- white-space: nowrap; -->
						<!-- word-wrap:break-word; -->
					}

					td.fail{
						color: #ffffff;
						table-layout: fixed;
						width:25%;
						background:red;
						white-space:pre-line;
						<!-- white-space: nowrap; -->
						<!-- word-wrap:break-word; -->
					}

					h1 {
						margin: 0px 0px 5px; font: 165% verdana,arial,helvetica
					}
					h2 {
						margin-top: 1em; margin-bottom: 0.5em; font: bold 125%
						verdana,arial,helvetica
					}
					h3 {
						margin-bottom: 0.5em; font: bold 115% verdana,arial,helvetica
					}
					.Failure {
						font-weight:bold; color:red;
					}


					img
					{
						border-width: 0px;
					}

					.expand_link
					{
						position=absolute;
						right: 0px;
						width: 27px;
						top: 1px;
						height: 27px;
					}

					.page_details
					{
						display: none;
					}

					.page_details_expanded
					{
						display: block;
						display/* hide this definition from IE5/6 */: table-row;
					}
				</style>
				<script language="JavaScript"><![CDATA[
					function expand(details_id) {
						document.getElementById(details_id).className = "page_details_expanded";
					}

					function collapse(details_id) {
						document.getElementById(details_id).className = "page_details";
					}

					function change(details_id) {
						if(document.getElementById(details_id+"_image").src.match("expand")) {
							document.getElementById(details_id+"_image").src = "collapse.png";
							expand(details_id);
						} else {
							document.getElementById(details_id+"_image").src = "expand.png";
							collapse(details_id);
						} 
					}


					var cX = 0; var cY = 0; var rX = 0; var rY = 0;
					function UpdateCursorPosition(e) { 
						if(document.all) { 
							cX = event.clientX; cY = event.clientY;
						} else { 
							cX = e.pageX; cY = e.pageY;
						}
					}
					
					document.onmousemove = UpdateCursorPosition; 
					
					function setDescriptionDIVPosition(descriptionDIV) {
						if(self.pageYOffset) {
							rX = self.pageXOffset;
							rY = self.pageYOffset;
						} else if(document.documentElement && document.documentElement.scrollTop) {
							rX = document.documentElement.scrollLeft;
							rY = document.documentElement.scrollTop;
						} else if(document.body) {
							rX = document.body.scrollLeft;
							rY = document.body.scrollTop;
						}
						if(document.all) {
							cX += rX; 
							cY += rY;
						}
						descriptionDIV.style.left = (cX+10) + "px";
						descriptionDIV.style.top = (cY+10) + "px";
					}
					function HideDescription(id) {
						if(id.length < 1) { return; }
						document.getElementById(id).style.display = "none";
					}
					function ShowDescription(id) {
						if(id.length < 1) { return; }
						var descriptionDIV = document.getElementById(id);
						setDescriptionDIVPosition(descriptionDIV);
						descriptionDIV.style.display = "block";
						//document.getElementById("DescriptionDynamic").innerHTML = descriptionDIV.innerHTML;
					}

			]]></script>
			</head>
			<body>

				<xsl:call-template name="pageHeader" />

				<xsl:call-template name="summary" />
				<hr size="1" width="95%" align="center" />

				<xsl:call-template name="pagelist" />
				<hr size="1" width="95%" align="center" />

				<xsl:call-template name="Description" />
				
				<!-- <xsl:call-template name="detail" /> -->

				<xsl:call-template name="sampleData" />

				

			</body>
		</html>
	</xsl:template>

	<xsl:template name="pageHeader">
		<h1>
			<xsl:value-of select="$titleReport" /><!-- 	 -->
		</h1>
		
		<xsl:variable name="millisecs" select="//sample[1]/@startTs" />
		<xsl:variable name="timeZone" select="//sample[1]/@timeZone" />
		<table width="100%">
			<tr>
				<td align="left">
					Date report: <b><xsl:value-of select="$millisecs" /></b>
				</td>
				<td align="right"></td>
			</tr>
			<tr>
				<td align="left">
					Time Zone: <b><xsl:value-of select="$timeZone" /></b>
				</td>
				<td align="right"></td>
			</tr>
		</table>
		<hr size="1" />
	</xsl:template>

	<xsl:template name="summary">
		<div id="testCaseDescription"
			style="display:none; 
				  position:absolute; 
				  border-style: solid; 
				  background-color: white; 
				  padding: 5px;  white-space: pre-line;">
			<xsl:value-of select=".//TESTCASE_DESCRIPTION" />
		</div>
		<h2>Summary</h2>
		<table align="center" class="details" border="0" cellpadding="5"
			cellspacing="2" width="95%">
			<tr valign="top">
				<th>Test Name</th>
				<th># Test Steps</th>
				<th>Failures</th>
				<th>Severity</th>
				<th>Success Rate</th>
				<th>Duration</th>
				<th>Start Time</th>
				<th>End Time</th>
				<th>Log</th>
			</tr>
			<xsl:variable name="testCaseSeverity" select=".//TESTCASE_SEVERITY" />
			<xsl:variable name="allCount" select="count(/testResults/*[starts-with(@tn,$testCaseName)][not(attribute::lb='Initializer')])" />
			<xsl:variable name="allFailureCount" select="count(/testResults/*[attribute::s='false'][starts-with(@tn,$testCaseName)][not(attribute::lb='Initializer')])" />
			<xsl:variable name="allSuccessCount" select="count(/testResults/*[attribute::s='true'][starts-with(@tn,$testCaseName)][not(attribute::lb='Initializer')])" />
			<xsl:variable name="allSuccessPercent" select="$allSuccessCount div $allCount" />
			<xsl:variable name="allTotalTime" select="sum(/testResults/*[starts-with(@tn,$testCaseName)]/@t)" />
			<xsl:variable name="startTime" select="//sample[1]/@startTs" />
			<xsl:variable name="endTime" select="//sample[last()]/@endTs" />
			<xsl:variable name="cssClassForHeader" >
				<xsl:choose>
					<xsl:when test="$allFailureCount &gt; 0">Failure</xsl:when>
				</xsl:choose>
			</xsl:variable>
			<tr valign="top">
				<xsl:attribute name="class">
					<xsl:value-of select="$cssClassForHeader" />
				</xsl:attribute>
				<td align="center">
					<a onmouseover="ShowDescription('testCaseDescription'); return true;"
						onmouseout="HideDescription('testCaseDescription'); return true;"
						href="#TestDescriptionDynamic">
						<xsl:attribute name="class">
							<xsl:value-of select="$cssClassForHeader" />
						</xsl:attribute>
						<xsl:value-of select="$testCaseName" /> 
						</a>
				</td>
				<td align="center">
					<xsl:value-of select="$allCount" />
				</td>
				<td align="center">
					<xsl:value-of select="$allFailureCount" />
				</td>
				<td align="center">
					<xsl:value-of select="$testCaseSeverity" />
				</td>
				<td align="center">
					<xsl:call-template name="display-percent">
						<xsl:with-param name="value" select="$allSuccessPercent" />
					</xsl:call-template>
				</td>
				<td align="center">
					<xsl:call-template name="display-time">
						<xsl:with-param name="value" select="$allTotalTime div 1000" />
					</xsl:call-template>
				</td>
				<td align="center">
					<xsl:value-of select="$startTime" />
				</td>
				<td align="center">
					<xsl:value-of select="$endTime" />
				</td>
				<td align="center">
					<a>	
						<xsl:attribute name="href"> <xsl:value-of select="concat('../jmeter/logs/', $testCaseName)" /> </xsl:attribute>	
						<xsl:attribute name="class">
							<xsl:value-of select="$cssClassForHeader" />
						</xsl:attribute>
						Log 
					</a>
				</td>
			</tr>
		</table>
	</xsl:template>

	<xsl:template name="pagelist">
		<h2>Details</h2>
		<table align="center" class="details" border="0" cellpadding="5"
			cellspacing="2" width="95%">
			<tr valign="top">
				<th>Test Step Name</th>
				<th>Status</th>
				<th>Severity</th>
				<th>Start Time</th>
				<th>End Time</th>
				<th>Duration (secs)</th>
				<th>Success/Failure Details</th>
			</tr>
			<xsl:for-each select="/testResults/*[starts-with(@tn,$testCaseName)][not(@lb='Initializer')]">

				<xsl:variable name="testStepName" select="@lb" />
				<xsl:variable name="testStepDescription" select="./responseData/STEP_DESCRIPTION" />
				<xsl:variable name="testStepSeverity" select="./responseData/STEP_SEVERITY" />
				<xsl:variable name="testStepDuration" select="@t div 1000" />
				<xsl:variable name="testStepStatus">
					<xsl:choose>
						<xsl:when test="@s = 'true'">Pass</xsl:when>
						<xsl:otherwise>Fail</xsl:otherwise>
					</xsl:choose>
				</xsl:variable>
				<xsl:variable name="label" select="@lb" />
				<xsl:variable name="cssClassForPageList" >
					<xsl:choose>
						<xsl:when test="@s = 'false'">Failure</xsl:when>
					</xsl:choose>
				</xsl:variable>
				<tr valign="top">
					<xsl:attribute name="class">
						<xsl:value-of select="$cssClassForPageList" />
					</xsl:attribute>
					<td width="20%">
						<a>
							<xsl:attribute name="onmouseover">ShowDescription('testStepDescription_<xsl:value-of select="position()" />'); return true;</xsl:attribute>
							<xsl:attribute name="onmouseout">HideDescription('testStepDescription_<xsl:value-of select="position()" />'); return true;</xsl:attribute>
							<xsl:attribute name="href">#<xsl:value-of select="@lb" />_<xsl:value-of select="position()" /></xsl:attribute>
							<xsl:attribute name="class">
								<xsl:value-of select="$cssClassForPageList" />
							</xsl:attribute>
							<xsl:value-of select="$testStepName" />
						</a>

						<div style="display:none; color:black;
								  position:absolute; 
								  border-style: solid; 
								  background-color: white; 
								  padding: 5px; 
								  white-space: pre-line;">
							<xsl:attribute name="id">testStepDescription_<xsl:value-of select="position()" /></xsl:attribute>

							<xsl:value-of select="$testStepDescription" />
						</div>
					</td>
					<td align="center" width="12%">
						<xsl:value-of select="$testStepStatus" />
					</td>
					<td align="center" width="12%">
						<xsl:value-of select="$testStepSeverity" />
					</td>
					<td align="center" width="16%">
						<xsl:value-of select="@startTs" />
					</td>
					<td align="center" width="16%">
						<xsl:value-of select="@endTs" />
					</td>
					<td align="center" width="12%">
						<xsl:value-of select="$testStepDuration" />
					</td>
					<td align="center" width="12%">
						<a href="">
							<xsl:attribute name="href"><xsl:text />javascript:change('page_details_<xsl:value-of select="position()" />')</xsl:attribute>
							<img src="expand.png" alt="show/hide">
								<xsl:attribute name="id"><xsl:text />page_details_<xsl:value-of select="position()" />_image</xsl:attribute>
								<xsl:attribute name="class">
									<xsl:value-of select="$cssClassForPageList" />
								</xsl:attribute>
							</img>
						</a>
					</td>
				</tr>

				<tr class="page_details">
					<xsl:attribute name="id"><xsl:text />page_details_<xsl:value-of select="position()" /></xsl:attribute>
					<td colspan="7" bgcolor="#FF0000">
						<div align="center">
							<b>
								Details for Test Step "	<xsl:value-of select="$label" />"
							</b>
							<table bordercolor="#000000" bgcolor="#2674A6" border="0" cellpadding="1" cellspacing="1" width="95%">
								<tr>
									<th>Validation</th>
									<th>Details</th>
								</tr>
								<xsl:for-each select="./responseData/VALIDATIONS/VALIDATION">
									<tr>
										<td align="center" width="20%">
											<xsl:value-of select="./NAME" />
										</td>
										<td align="center" width="80%">
											<div align="center">
												<table bordercolor="#000000" bgcolor="#2674A6" border="0" cellpadding="1" cellspacing="1" width="100%">
													<tr>
														<td align="center" width="20%">Description</td>
														<td width="80%" class="responseData" style="white-space: pre-line;">
															<xsl:value-of select="./DESCRIPTION" />
														</td>
													</tr>
													<tr>
														<td align="center" width="20%">Expected Result</td>
														<td width="80%" class="responseData" style="white-space: pre-line;">
															<xsl:value-of select="./EXPECTED_RESULT" />
														</td>
													</tr>
													<tr>
														<td align="center" width="20%">Actual Result</td>
														<td width="80%" class="responseData" style="white-space: pre-line;">
															<xsl:value-of select="./ACTUAL_RESULT" />
														</td>
													</tr>
													<tr>
														<td align="center" width="20%">Validation Result</td>
														<td width="80%" class="responseData" style="white-space: pre-line;">
															<xsl:value-of select="./VALIDATION_RESULT" />
														</td>
													</tr>
												</table>
											</div>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</div>
					</td>
				</tr>

			</xsl:for-each>
		</table>
	</xsl:template>

	<xsl:template name="detail">
		<xsl:variable name="allFailureCount" select="count(/testResults/*[starts-with(@tn,$testCaseName)][attribute::s='false'][not(attribute::lb='Initializer')])" />

		<xsl:if test="$allFailureCount > 0">
			<h2>Failure Detail</h2>

			<xsl:for-each select="/testResults/*[not(@lb = preceding::*/@lb)][starts-with(@tn,$testCaseName)][not(@lb='Initializer')]">

				<xsl:variable name="failureCount" select="count(../*[@lb = current()/@lb][attribute::s='false'][starts-with(@tn,$testCaseName)][not(@lb='Initializer')])" />

				<xsl:if test="$failureCount > 0">
					<h3>
						<xsl:value-of select="@lb" />
						<a>
							<xsl:attribute name="name"><xsl:value-of select="@lb" /></xsl:attribute>
						</a>
					</h3>

					<table align="center" class="details" border="0" cellpadding="5" cellspacing="2" width="95%">
						<tr valign="top">
							<th>Response</th>
							<th>Failure Message</th>
							<xsl:if test="$showData = 'y'">
								<th>Response Data</th>
							</xsl:if>
						</tr>

						<xsl:for-each
							select="/testResults/*[@lb = current()/@lb][attribute::s='false'][starts-with(@tn,$testCaseName)][not(@lb='Initializer')]">
							<tr>
								<td>
									<xsl:value-of select="@rc | @rs" /> - <xsl:value-of select="@rm" />
								</td>
								<td>
									<xsl:value-of select="assertionResult/failureMessage" />
								</td>
								<xsl:if test="$showData = 'y'">
									<td>
										<xsl:value-of select="./binary" />
									</td>
								</xsl:if>
							</tr>
						</xsl:for-each>

					</table>
				</xsl:if>

			</xsl:for-each>
		</xsl:if>
	</xsl:template>

	<xsl:template name="sampleData">
		<h2>Developer Logs: </h2>
		<xsl:for-each select="/testResults/*[starts-with(@tn,$testCaseName)][not(@lb='Initializer')]">
			<h3>
				<a>
					<xsl:attribute name="name"><xsl:value-of select="@lb" />_<xsl:value-of select="position()" /></xsl:attribute>
				</a>
				<xsl:value-of select="@lb" />
			</h3>

			<table align="center" class="detailsFull" border="0" cellpadding="5" cellspacing="2" width="95%">
				<tr valign="top">
					<th>Description</th>
					<!-- <th>Iteration</th> -->
					<th>Response Data</th>
				</tr>
				<!-- <xsl:for-each select="/testResults/*[@lb = current()/@lb]"> -->
					<tr>
						<td>
							<xsl:attribute name="class">
							<xsl:choose>
								<xsl:when test="@s = 'true'">pass</xsl:when>
								<xsl:otherwise>fail</xsl:otherwise>
							</xsl:choose>
						</xsl:attribute>
							<xsl:value-of select="./responseData/STEP_DESCRIPTION" />
							<!-- <xsl:value-of select="@rc | @rs" /> - <xsl:value-of select="@rm" /> -->
						</td>
						<!-- <td class="normal" style="table-layout: fixed; width:50px;">
							<xsl:value-of select="position()" />
						</td> -->
						<td class="responseData">
							<xsl:value-of select="./responseData/DEVELOPER_LOGS" />
						</td>
					</tr>
				<!-- </xsl:for-each> -->
			</table>
		</xsl:for-each>

	</xsl:template>

	<xsl:template name="Description">
		<a name="TestDescriptionDynamic"></a>
		<h3>Testcase Description: </h3>
		
		<table align="center" class="detailsFull" border="0" cellpadding="5" cellspacing="2" width="95%">
			<tr valign="top">
				<th>Description</th>
			</tr>
			<tr>
				<td style="white-space:pre-line;">
					<xsl:value-of select=".//TESTCASE_DESCRIPTION" />
				</td>
			</tr>
		</table>

	</xsl:template>

	<xsl:template name="min">
		<xsl:param name="nodes" select="/.." />
		<xsl:choose>
			<xsl:when test="not($nodes)">
				NaN
			</xsl:when>
			<xsl:otherwise>
				<xsl:for-each select="$nodes">
					<xsl:sort data-type="number" />
					<xsl:if test="position() = 1">
						<xsl:value-of select="number(.)" />
					</xsl:if>
				</xsl:for-each>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="max">
		<xsl:param name="nodes" select="/.." />
		<xsl:choose>
			<xsl:when test="not($nodes)">
				NaN
			</xsl:when>
			<xsl:otherwise>
				<xsl:for-each select="$nodes">
					<xsl:sort data-type="number" order="descending" />
					<xsl:if test="position() = 1">
						<xsl:value-of select="number(.)" />
					</xsl:if>
				</xsl:for-each>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="display-percent">
		<xsl:param name="value" />
		<xsl:value-of select="format-number($value,'0.00%')" />
	</xsl:template>

	<xsl:template name="display-time">
		<xsl:param name="value" />
		<xsl:value-of select="format-number($value,'0 s')" />
	</xsl:template>

</xsl:stylesheet>
