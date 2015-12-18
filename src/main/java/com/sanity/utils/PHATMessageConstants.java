/**
 * 
 */
package com.sanity.utils;

/**
 * @author anponnus
 *
 */
public interface PHATMessageConstants {
	

	

	// ================================================= KAVITHA =============================================================//
	//General Failure Reasons
	public static String PHAT_ERROR								= "primehome.ui.validation.error.message.1";
	public static String SELENIUM_ELEMENT_LOAD_ERROR			= "primehome.ui.validation.error.message.2";
	public static String SELENIUM_WEB_DRIVER_ERROR				= "primehome.ui.validation.error.message.3";
	public static String SELENIUM_ELEMENT_STALE_ERROR			= "primehome.ui.validation.error.message.4";
	public static String SELENIUM_ELEMENT_NOT_VISIBLE_ERROR		= "primehome.ui.validation.error.message.5";
	public static String SELENIUM_NO_SUCH_ATTRIBUTE_ERROR		= "primehome.ui.validation.error.message.6";
	public static String SELENIUM_TIMEOUT_ERROR 				= "primehome.ui.validation.error.message.7";
	
	public static String DATAMODEL_LOAD_FAILURE					= "datamodel.load.expected.value.error.message";
		
	
	//Module Specific Reasons
	public static String LOGIN_DESC 				= "login.description";
	public static String LOGIN_EXP_MSG 				= "login.expected.message";
	public static String LOGIN_ACTUAL_SUCCESS_MSG	= "login.actual.success.message";
	public static String LOGIN_ACTUAL_FAILURE_MSG 	= "login.actual.failure.message";
	
	
	public static String DISABLE_LDAP_ENABLED_DESC 					= "manage.controlpanel.settings.ldap.ldapenabled.disable.description";
	public static String DISABLE_LDAP_ENABLED_APPEND_MSG 			= "manage.controlpanel.settings.ldap.ldapenabled.disable.append.message";
	public static String DISABLE_LDAP_ENABLED_EXP_MSG_1				= "manage.controlpanel.settings.ldap.ldapenabled.disable.expected.message.1";
	public static String DISABLE_LDAP_ENABLED_EXP_MSG_2 			= "manage.controlpanel.settings.ldap.ldapenabled.disable.expected.message.2";
	public static String DISABLE_LDAP_ENABLED_ACTUAL_SUCCESS_MSG_1	= "manage.controlpanel.settings.ldap.ldapenabled.disable.actual.success.message.1";
	public static String DISABLE_LDAP_ENABLED_ACTUAL_SUCCESS_MSG_2 	= "manage.controlpanel.settings.ldap.ldapenabled.disable.actual.success.message.2";
	public static String DISABLE_LDAP_ENABLED_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.ldap.ldapenabled.disable.actual.failure.message";
	
	
	public static String ENABLE_LDAP_ENABLED_DESC 					= "manage.controlpanel.settings.ldap.ldapenabled.enable.description";
	public static String ENABLE_LDAP_ENABLED_APPEND_MSG	 			= "manage.controlpanel.settings.ldap.ldapenabled.enable.append.message";
	public static String ENABLE_LDAP_ENABLED_EXP_MSG_1 				= "manage.controlpanel.settings.ldap.ldapenabled.enable.expected.message.1";
	public static String ENABLE_LDAP_ENABLED_EXP_MSG_2 				= "manage.controlpanel.settings.ldap.ldapenabled.enable.expected.message.2";
	public static String ENABLE_LDAP_ENABLED_ACTUAL_SUCCESS_MSG_1	= "manage.controlpanel.settings.ldap.ldapenabled.enable.actual.success.message.1";
	public static String ENABLE_LDAP_ENABLED_ACTUAL_SUCCESS_MSG_2 	= "manage.controlpanel.settings.ldap.ldapenabled.enable.actual.success.message.2";
	public static String ENABLE_LDAP_ENABLED_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.ldap.ldapenabled.enable.actual.failure.message";
		
		
	public static String ENABLE_LDAP_REQUIRED_DESC 					= "manage.controlpanel.settings.ldap.ldaprequired.enable.description";
	public static String ENABLE_LDAP_REQUIRED_APPEND_MSG 			= "manage.controlpanel.settings.ldap.ldaprequired.enable.append.message";
	public static String ENABLE_LDAP_REQUIRED_EXP_MSG_1 			= "manage.controlpanel.settings.ldap.ldaprequired.enable.expected.message.1";
	public static String ENABLE_LDAP_REQUIRED_EXP_MSG_2 			= "manage.controlpanel.settings.ldap.ldaprequired.enable.expected.message.2";
	public static String ENABLE_LDAP_REQUIRED_ACTUAL_SUCCESS_MSG_1	= "manage.controlpanel.settings.ldap.ldaprequired.enable.actual.success.message.1";
	public static String ENABLE_LDAP_REQUIRED_ACTUAL_SUCCESS_MSG_2 	= "manage.controlpanel.settings.ldap.ldaprequired.enable.actual.success.message.2";
	public static String ENABLE_LDAP_REQUIRED_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.ldap.ldaprequired.enable.actual.failure.message";
	
		
	public static String DISABLE_LDAP_REQUIRED_DESC 				= "manage.controlpanel.settings.ldap.ldaprequired.disable.description";
	public static String DISABLE_LDAP_REQUIRED_APPEND_MSG 			= "manage.controlpanel.settings.ldap.ldaprequired.disable.append.message";
	public static String DISABLE_LDAP_REQUIRED_EXP_MSG_1 			= "manage.controlpanel.settings.ldap.ldaprequired.disable.expected.message.1";
	public static String DISABLE_LDAP_REQUIRED_EXP_MSG_2 			= "manage.controlpanel.settings.ldap.ldaprequired.disable.expected.message.2";
	public static String DISABLE_LDAP_REQUIRED_ACTUAL_SUCCESS_MSG_1	= "manage.controlpanel.settings.ldap.ldaprequired.disable.actual.success.message.1";
	public static String DISABLE_LDAP_REQUIRED_ACTUAL_SUCCESS_MSG_2 = "manage.controlpanel.settings.ldap.ldaprequired.disable.actual.success.message.2";
	public static String DISABLE_LDAP_REQUIRED_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.ldap.ldaprequired.disable.actual.failure.message";
	
		
	public static String VALIDATE_DISABLE_LDAP_REQUIRED_DESC 				= "manage.controlpanel.settings.ldap.ldaprequired.validate.disable.description";
	public static String VALIDATE_DISABLE_LDAP_REQUIRED_APPEND_MSG 			= "manage.controlpanel.settings.ldap.ldaprequired.validate.disable.append.message";
	public static String VALIDATE_DISABLE_LDAP_REQUIRED_EXP_MSG 			= "manage.controlpanel.settings.ldap.ldaprequired.validate.disable.expected.message";
	public static String VALIDATE_DISABLE_LDAP_REQUIRED_ACTUAL_SUCCESS_MSG	= "manage.controlpanel.settings.ldap.ldaprequired.validate.disable.actual.success.message";
	public static String VALIDATE_DISABLE_LDAP_REQUIRED_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.ldap.ldaprequired.validate.disable.actual.failure.message";
	
	
	public static String VALIDATE_ENABLE_LDAP_ENABLED_DESC 					= "manage.controlpanel.settings.ldap.ldapenabled.validate.enable.description";
	public static String VALIDATE_ENABLE_LDAP_ENABLED_APPEND_MSG 			= "manage.controlpanel.settings.ldap.ldapenabled.validate.enable.append.message";
	public static String VALIDATE_ENABLE_LDAP_ENABLED_EXP_MSG 				= "manage.controlpanel.settings.ldap.ldapenabled.validate.enable.expected.message";
	public static String VALIDATE_ENABLE_LDAP_ENABLED_ACTUAL_SUCCESS_MSG	= "manage.controlpanel.settings.ldap.ldapenabled.validate.enable.actual.success.message";
	public static String VALIDATE_ENABLE_LDAP_ENABLED_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.ldap.ldapenabled.validate.enable.actual.failure.message";
		
	
	public static String FETCH_USER_AUTHENTICATION_FORMAT_DESC 					= "manage.controlpanel.settings.authentication.fetch.description";
	public static String FETCH_USER_AUTHENTICATION_FORMAT_APPEND_MSG 			= "manage.controlpanel.settings.authentication.fetch.append.message";
	public static String FETCH_USER_AUTHENTICATION_FORMAT_EXP_MSG 				= "manage.controlpanel.settings.authentication.fetch.expected.message";
	public static String FETCH_USER_AUTHENTICATION_FORMAT_ACTUAL_SUCCESS_MSG	= "manage.controlpanel.settings.authentication.fetch.actual.success.message";
	public static String FETCH_USER_AUTHENTICATION_FORMAT_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.settings.authentication.fetch.actual.failure.message";
		
	
	public static String LDAP_USERS_LOGIN_DESC 					= "users.ldap.authentication.validate.description";
	public static String LDAP_USERS_LOGIN_APPEND_MSG 			= "users.ldap.authentication.validate.append.message";
	public static String LDAP_USERS_LOGIN_EXP_MSG 				= "users.ldap.authentication.validate.enable.expected.message";
	public static String LDAP_USERS_LOGIN_ACTUAL_SUCCESS_MSG	= "users.ldap.authentication.validate.actual.success.message";
	public static String LDAP_USERS_LOGIN_ACTUAL_FAILURE_MSG 	= "users.ldap.authentication.validate.actual.failure.message";
		
	
	public static String CONTROL_PANEL_EXPAND_DESC 					= "manage.controlpanel.expand_collapse.description";
	public static String CONTROL_PANEL_EXPAND_APPEND_MSG 			= "manage.controlpanel.expand_collapse.append.message";
	public static String CONTROL_PANEL_EXPAND_EXP_MSG 				= "manage.controlpanel.expand_collapse.expected.message";
	public static String CONTROL_PANEL_EXPAND_ACTUAL_SUCCESS_MSG	= "manage.controlpanel.expand_collapse.success.message";
	public static String CONTROL_PANEL_EXPAND_ACTUAL_FAILURE_MSG 	= "manage.controlpanel.expand_collapse.failure.message";
	
	
	
	public static String VALID_LOGIN_DESC 					= "user.valid.login.validate.description";
	public static String VALID_LOGIN_APPEND_MSG 			= "user.valid.login.validate.append.message";
	public static String VALID_LOGIN_EXP_MSG 				= "user.valid.login.validate.enable.expected.message";
	public static String VALID_LOGIN_ACTUAL_SUCCESS_MSG		= "user.valid.login.validate.actual.success.message";
	public static String VALID_LOGIN_ACTUAL_FAILURE_MSG 	= "user.valid.login.validate.actual.failure.message";
		
	
	public static String INVALID_LOGIN_DESC 				= "user.invalid.login.validate.description";
	public static String INVALID_LOGIN_APPEND_MSG 			= "user.invalid.login.validate.append.message";
	public static String INVALID_LOGIN_EXP_MSG 				= "user.invalid.login.validate.enable.expected.message";
	public static String INVALID_LOGIN_ACTUAL_SUCCESS_MSG	= "user.invalid.login.validate.actual.success.message";
	public static String INVALID_LOGIN_ACTUAL_FAILURE_MSG 	= "user.invalid.login.validate.actual.failure.message";
	
	
	public static String LOGIN_PAGE_VALIDATION_DESC 				= "login_page.validate.description";
	public static String LOGIN_PAGE_VALIDATION_APPEND_MSG 			= "login_page.validate.append.message";
	public static String LOGIN_PAGE_VALIDATION_EXP_MSG 				= "login_page.validate.enable.expected.message";
	public static String LOGIN_PAGE_VALIDATION_ACTUAL_SUCCESS_MSG	= "login_page.validate.actual.success.message";
	public static String LOGIN_PAGE_VALIDATION_ACTUAL_FAILURE_MSG 	= "login_page.validate.actual.failure.message";
	
	
	public static String PORLET_REFRESH_CLICK_DESC 					= "portlet.click.refresh.description";
	public static String PORLET_REFRESH_CLICK_APPEND_MSG			= "portlet.click.refresh.append.message";
	public static String PORLET_REFRESH_CLICK_EXP_MSG 				= "portlet.click.refresh.expected.message";
	public static String PORLET_REFRESH_CLICK_ACTUAL_SUCCESS_MSG	= "portlet.click.refresh.actual.success.message";
	public static String PORLET_REFRESH_CLICK_ACTUAL_FAILURE_MSG 	= "portlet.click.refresh.actual.failure.message";
	
	
	public static String CHECK_PORLET_REFRESH_CONTENT_DESC 					= "portlet.check.refresh.description";
	public static String CHECK_PORLET_REFRESH_CONTENT_APPEND_MSG 			= "portlet.check.refresh.append.message";
	public static String CHECK_PORLET_REFRESH_CONTENT_EXP_MSG 				= "portlet.check.refresh.expected.message";
	public static String CHECK_PORLET_REFRESH_CONTENT_ACTUAL_SUCCESS_MSG	= "portlet.check.refresh.actual.success.message";
	public static String CHECK_PORLET_REFRESH_CONTENT_ACTUAL_FAILURE_MSG 	= "portlet.check.refresh.actual.failure.message";
		
	
	public static String SEARCH_DEVICE_SERIAL_NUMBER_DESC 				= "advancedsearch.devicemanagement.search.device.description";
	public static String SEARCH_DEVICE_SERIAL_NUMBER_APPEND_MSG 		= "advancedsearch.devicemanagement.search.device.append.message";
	public static String SEARCH_DEVICE_SERIAL_NUMBER_EXP_MSG 			= "advancedsearch.devicemanagement.search.device.expected.message";
	public static String SEARCH_DEVICE_SERIAL_NUMBER_ACTUAL_SUCCESS_MSG	= "advancedsearch.devicemanagement.search.device.actual.success.message";
	public static String SEARCH_DEVICE_SERIAL_NUMBER_ACTUAL_FAILURE_MSG = "advancedsearch.devicemanagement.search.device.actual.failure.message";
	
		
	public static String NAVIGATE_TO_DEVICE_DESC 				= "operations.devicemanagement.search.device.description";
	public static String NAVIGATE_TO_DEVICE_APPEND_MSG 			= "operations.devicemanagement.search.device.append.message";
	public static String NAVIGATE_TO_DEVICE_EXP_MSG 			= "operations.devicemanagement.search.device.expected.message";
	public static String NAVIGATE_TO_DEVICE_ACTUAL_SUCCESS_MSG	= "operations.devicemanagement.search.device.actual.success.message";
	public static String NAVIGATE_TO_DEVICE_ACTUAL_FAILURE_MSG 	= "operations.devicemanagement.search.device.actual.failure.message";
	
		
	public static String NAVIGATE_TO_LINK_DESC 					= "navigation.link.description";
	public static String NAVIGATE_TO_LINK_APPEND_MSG 			= "navigation.link.append.message";
	public static String NAVIGATE_TO_LINK_EXP_MSG 				= "navigation.link.expected.message";
	public static String NAVIGATE_TO_LINK_ACTUAL_SUCCESS_MSG	= "navigation.link.actual.success.message";
	public static String NAVIGATE_TO_LINK_ACTUAL_FAILURE_MSG 	= "navigation.link.actual.failure.message";
	
	
	public static String CLICK_CALCULATE_VALIDATE_DESC 					= "operations.groups.calculate.validate.description";
	public static String CLICK_CALCULATE_VALIDATE_APPEND_MSG 			= "operations.groups.calculate.validate.append.message";
	public static String CLICK_CALCULATE_VALIDATE_EXP_MSG 				= "operations.groups.calculate.validate.expected.message";
	public static String CLICK_CALCULATE_VALIDATE_ACTUAL_SUCCESS_MSG	= "operations.groups.calculate.validate.actual.success.message";
	public static String CLICK_CALCULATE_VALIDATE_ACTUAL_FAILURE_MSG 	= "operations.groups.calculate.validate.actual.success.message";
	
	
	public static String CLICK_CALCULATE_DESC 				= "operations.groups.click.calculate.description";
	public static String CLICK_CALCULATE_APPEND_MSG 		= "operations.groups.click.calculate.append.message";
	public static String CLICK_CALCULATE_EXP_MSG 			= "operations.groups.click.calculate.expected.message";
	public static String CLICK_CALCULATE_ACTUAL_SUCCESS_MSG	= "operations.groups.click.calculate.actual.success.message";
	public static String CLICK_CALCULATE_ACTUAL_FAILURE_MSG = "operations.groups.click.calculate.actual.failure.message";
	
	
	public static String DM_CREATE_DYNAMIC_GROUP_DESC 				= "operations.devicemanagemet.create.dynamic.description";
	public static String DM_CREATE_DYNAMIC_GROUP_APPEND_MSG 		= "operations.devicemanagemet.create.dynamic.append.message";
	public static String DM_CREATE_DYNAMIC_GROUP_EXP_MSG 			= "operations.devicemanagemet.create.dynamic.expected.message";
	public static String DM_CREATE_DYNAMIC_GROUP_ACTUAL_SUCCESS_MSG	= "operations.devicemanagemet.create.dynamic.actual.success.message";
	public static String DM_CREATE_DYNAMIC_GROUP_ACTUAL_FAILURE_MSG = "operations.devicemanagemet.create.dynamic.actual.failure.message";
	
	
	public static String GROUPS_CREATE_DYNAMIC_GROUP_DESC 				= "operations.groups.create.dynamic.description";
	public static String GROUPS_CREATE_DYNAMIC_GROUP_APPEND_MSG 		= "operations.groups.create.dynamic.append.message";
	public static String GROUPS_CREATE_DYNAMIC_GROUP_EXP_MSG 			= "operations.groups.create.dynamic.expected.message";
	public static String GROUPS_CREATE_DYNAMIC_GROUP_ACTUAL_SUCCESS_MSG	= "operations.groups.create.dynamic.actual.success.message";
	public static String GROUPS_CREATE_DYNAMIC_GROUP_ACTUAL_FAILURE_MSG = "operations.groups.create.dynamic.actual.failure.message";
	
	
	public static String DM_CREATE_STATIC_GROUP_DESC 				= "operations.devicemanagemet.create.static.description";
	public static String DM_CREATE_STATIC_GROUP_APPEND_MSG 			= "operations.devicemanagemet.create.static.append.message";
	public static String DM_CREATE_STATIC_GROUP_EXP_MSG 			= "operations.devicemanagemet.create.static.expected.message";
	public static String DM_CREATE_STATIC_GROUP_ACTUAL_SUCCESS_MSG	= "operations.devicemanagemet.create.static.actual.success.message";
	public static String DM_CREATE_STATIC_GROUP_ACTUAL_FAILURE_MSG 	= "operations.devicemanagemet.create.static.actual.failure.message";
	
	
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_DESC 					= "operations.groups.delete.already_created.description";
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_APPEND_MSG 			= "operations.groups.delete.already_created.append.message";
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_EXP_MSG_1 				= "operations.groups.delete.already_created.expected.message.1";
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_EXP_MSG_2 				= "operations.groups.delete.already_created.expected.message.2";
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_ACTUAL_SUCCESS_MSG_1	= "operations.groups.delete.already_created.actual.success.message.1";
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_ACTUAL_SUCCESS_MSG_2	= "operations.groups.delete.already_created.actual.success.message.2";
	public static String GROUPS_DELETE_ALREADY_CREATED_GROUP_ACTUAL_FAILURE_MSG 	= "operations.groups.delete.already_created.actual.failure.message";
	
	
	public static String GROUPS_DELETE_GROUP_DESC 					= "operations.groups.delete.description";
	public static String GROUPS_DELETE_GROUP_APPEND_MSG				= "operations.groups.delete.append.message";
	public static String GROUPS_DELETE_GROUP_EXP_MSG 				= "operations.groups.delete.expected.message";
	public static String GROUPS_DELETE_GROUP_ACTUAL_SUCCESS_MSG		= "operations.groups.delete.actual.success.message";
	public static String GROUPS_DELETE_GROUP_ACTUAL_FAILURE_MSG 	= "operations.groups.delete.actual.failure.message";
	
	
	public static String NAVIGATE_BACK_DESC 				= "browser_action.navigate_back.description";
	public static String NAVIGATE_BACK_APPEND_MSG 			= "browser_action.navigate_back.append.message";
	public static String NAVIGATE_BACK_EXP_MSG 				= "browser_action.navigate_back.expected.message";
	public static String NAVIGATE_BACK_ACTUAL_SUCCESS_MSG	= "browser_action.navigate_back.actual.success.message";
	public static String NAVIGATE_BACK_ACTUAL_FAILURE_MSG 	= "browser_action.navigate_back.actual.failure.message";
	
	
	public static String ADD_TAG_DM_DESC 				= "operations.devicemanagemet.add.tag.description";
	public static String ADD_TAG_DM_APPEND_MSG 			= "operations.devicemanagemet.add.tag.append.message";
	public static String ADD_TAG_DM_EXP_MSG 			= "operations.devicemanagemet.add.tag.expected.message";
	public static String ADD_TAG_DM_ACTUAL_SUCCESS_MSG	= "operations.devicemanagemet.add.tag.actual.success.message";
	public static String ADD_TAG_DM_ACTUAL_FAILURE_MSG 	= "operations.devicemanagemet.add.tag.actual.failure.message";
	
	
	public static String ACTIVATE_OPERATIONS_CONFIGURATION_SET_DESC 				= "operations.configurationset.activate.description";
	public static String ACTIVATE_OPERATIONS_CONFIGURATION_APPEND_MSG				= "operations.configurationset.activate.append.message";
	public static String ACTIVATE_OPERATIONS_CONFIGURATION_SET_EXP_MSG 				= "operations.configurationset.activate.expected.message";
	public static String ACTIVATE_OPERATIONS_CONFIGURATION_SET_ACTUAL_SUCCESS_MSG	= "operations.configurationset.activate.actual.success.message";
	public static String ACTIVATE_OPERATIONS_CONFIGURATION_SET_ACTUAL_FAILURE_MSG 	= "operations.configurationset.activate.actual.failure.message";
	
	
	public static String CREATE_OPERATIONS_CONFIGURATION_SET_DESC 				= "operations.configurationset.create.description";
	public static String CREATE_OPERATIONS_CONFIGURATION_SET_APPEND_MSG 		= "operations.configurationset.create.append.message";
	public static String CREATE_OPERATIONS_CONFIGURATION_SET_EXP_MSG 			= "operations.configurationset.create.expected.message";
	public static String CREATE_OPERATIONS_CONFIGURATION_SET_ACTUAL_SUCCESS_MSG	= "operations.configurationset.create.actual.success.message";
	public static String CREATE_OPERATIONS_CONFIGURATION_SET_ACTUAL_FAILURE_MSG = "operations.configurationset.create.actual.failure.message";
	
	
	public static String CREATE_OPERATIONS_FILE_MANAGEMENT_ENTRY_DESC 				= "operations.filemanagement.create.description";
	public static String CREATE_OPERATIONS_FILE_MANAGEMENT_ENTRY_APPEND_MSG 		= "operations.filemanagement.create.append.message";
	public static String CREATE_OPERATIONS_FILE_MANAGEMENT_ENTRY_EXP_MSG 			= "operations.filemanagement.create.expected.message";
	public static String CREATE_OPERATIONS_FILE_MANAGEMENT_ENTRY_ACTUAL_SUCCESS_MSG	= "operations.filemanagement.create.actual.success.message";
	public static String CREATE_OPERATIONS_FILE_MANAGEMENT_ENTRY_ACTUAL_FAILURE_MSG = "operations.filemanagement.create.actual.failure.message";
	
	
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_DESC 				= "operations.configurationset.delete.already_created.description";
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_APPEND_MSG			= "operations.configurationset.delete.already_created.append.message";
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_EXP_MSG_1 			= "operations.configurationset.delete.already_created.expected.message.1";
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_EXP_MSG_2 			= "operations.configurationset.delete.already_created.expected.message.2";
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_ACTUAL_SUCCESS_MSG_1	= "operations.configurationset.delete.already_created.actual.success.message.1";
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_ACTUAL_SUCCESS_MSG_2	= "operations.configurationset.delete.already_created.actual.success.message.2";
	public static String DELETE_ALREADY_CREATED_CONFIG_SET_ACTUAL_FAILURE_MSG 	= "operations.configurationset.delete.already_created.actual.failure.message";
	
	
	public static String DELETE_CONFIGURATION_SET_DESC 					= "operations.configurationset.delete.description";
	public static String DELETE_CONFIGURATION_SET_APPEND_MSG 			= "operations.configurationset.delete.append.message";
	public static String DELETE_CONFIGURATION_SET_EXP_MSG 				= "operations.configurationset.delete.expected.message";
	public static String DELETE_CONFIGURATION_SET_ACTUAL_SUCCESS_MSG	= "operations.configurationset.delete.actual.success.message";
	public static String DELETE_CONFIGURATION_SET_ACTUAL_FAILURE_MSG 	= "operations.configurationset.delete.actual.failure.message";
	
	
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_DESC 					= "operations.filemanagement.delete.already_created.description";
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_APPEND_MSG 			= "operations.filemanagement.delete.already_created.append.message";
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_EXP_MSG_1 				= "operations.filemanagement.delete.already_created.expected.message.1";
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_EXP_MSG_2 				= "operations.filemanagement.delete.already_created.expected.message.2";
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_ACTUAL_SUCCESS_MSG_1	= "operations.filemanagement.delete.already_created.actual.success.message.1";
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_ACTUAL_SUCCESS_MSG_2	= "operations.filemanagement.delete.already_created.actual.success.message.2";
	public static String DELETE_ALREADY_CREATED_FM_ENTRY_ACTUAL_FAILURE_MSG 	= "operations.filemanagement.delete.already_created.actual.failure.message";
	
	
	public static String DELETE_FM_ENTRY_DESC 					= "operations.filemanagement.delete.description";
	public static String DELETE_FM_ENTRY_APPEND_MSG 			= "operations.filemanagement.delete.append.message";
	public static String DELETE_FM_ENTRY_EXP_MSG 				= "operations.filemanagement.delete.expected.message";
	public static String DELETE_FM_ENTRY_ACTUAL_SUCCESS_MSG		= "operations.filemanagement.delete.actual.success.message";
	public static String DELETE_FM_ENTRY_ACTUAL_FAILURE_MSG 	= "operations.filemanagement.delete.actual.failure.message";
	
	
	public static String EDIT_FILE_MAGMT_ENTRY_DESC 				= "operations.filemanagement.edit.description";
	public static String EDIT_FILE_MAGMT_ENTRY_APPEND_MSG			= "operations.filemanagement.edit.append.message";
	public static String EDIT_FILE_MAGMT_ENTRY_EXP_MSG 				= "operations.filemanagement.edit.expected.message";
	public static String EDIT_FILE_MAGMT_ENTRY_ACTUAL_SUCCESS_MSG	= "operations.filemanagement.edit.actual.success.message";
	public static String EDIT_FILE_MAGMT_ENTRY_ACTUAL_FAILURE_MSG 	= "operations.filemanagement.edit.actual.failure.message";
	
	
	public static String PERFORM_DS_PERIODIC_DESC 				= "device_simulator.perform.periodic.operation.description";
	public static String PERFORM_DS_PERIODIC_APPEND_MSG			= "device_simulator.perform.periodic.operation.append.message";
	public static String PERFORM_DS_PERIODIC_EXP_MSG 			= "device_simulator.perform.periodic.operation.expected.message";
	public static String PERFORM_DS_PERIODIC_ACTUAL_SUCCESS_MSG	= "device_simulator.perform.periodic.operation.actual.success.message";
	public static String PERFORM_DS_PERIODIC_ACTUAL_FAILURE_MSG = "device_simulator.perform.periodic.operation.actual.failure.message";
		
	
	public static String PERFORM_NOTIFI_PARAM_TYPE_CHANGES_DESC 				= "device_simulator.perform.notification.active.operation.description";
	public static String PERFORM_NOTIFI_PARAM_TYPE_CHANGES_APPEND_MSG 			= "device_simulator.perform.notification.active.operation.append.message";
	public static String PERFORM_NOTIFI_PARAM_TYPE_CHANGES_EXP_MSG 				= "device_simulator.perform.notification.active.operation.expected.message";
	public static String PERFORM_NOTIFI_PARAM_TYPE_CHANGES_ACTUAL_SUCCESS_MSG	= "device_simulator.perform.notification.active.operation.actual.success.message";
	public static String PERFORM_NOTIFI_PARAM_TYPE_CHANGES_ACTUAL_FAILURE_MSG 	= "device_simulator.perform.notification.active.operation.actual.failure.message";
		
	
	public static String DEVICEOPERATIONS_BATCH_CHECK_DESC 					= "deviceview.device_operations.batch.availability.description";
	public static String DEVICEOPERATIONS_BATCH_CHECK_APPEND_MSG 			= "deviceview.device_operations.batch.availability.append.message";
	public static String DEVICEOPERATIONS_BATCH_CHECK_EXP_MSG 				= "deviceview.device_operations.batch.availability.expected.message";
	public static String DEVICEOPERATIONS_BATCH_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.group.availability.actual.success.message";
	public static String DEVICEOPERATIONS_BATCH_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.group.availability.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_CONFIG_AFTER_PERIODIC_CHECK_DESC 					= "deviceview.device_operations.configuration.value_changes.after_peridic.description";
	public static String DEVICEOPERATIONS_CONFIG_AFTER_PERIODIC_CHECK_APPEND_MSG 			= "deviceview.device_operations.configuration.value_changes.after_peridic.append.message";
	public static String DEVICEOPERATIONS_CONFIG_AFTER_PERIODIC_CHECK_EXP_MSG 				= "deviceview.device_operations.configuration.value_changes.after_peridic.expected.message";
	public static String DEVICEOPERATIONS_CONFIG_AFTER_PERIODIC_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.configuration.value_changes.after_peridic.actual.success.message";
	public static String DEVICEOPERATIONS_CONFIG_AFTER_PERIODIC_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.configuration.value_changes.after_peridic.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_CONFIG_CHECK_DESC 				= "deviceview.device_operations.configuration.availability.description";
	public static String DEVICEOPERATIONS_CONFIG_CHECK_APPEND_MSG 			= "deviceview.device_operations.configuration.availability.append.message";
	public static String DEVICEOPERATIONS_CONFIG_CHECK_EXP_MSG 				= "deviceview.device_operations.configuration.availability.expected.message";
	public static String DEVICEOPERATIONS_CONFIG_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.configuration.availability.actual.success.message";
	public static String DEVICEOPERATIONS_CONFIG_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.configuration.availability.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_CONFIG_SET_CHECK_DESC 				= "deviceview.device_operations.configurationset.availability.description";
	public static String DEVICEOPERATIONS_CONFIG_SET_CHECK_APPEND_MSG 			= "deviceview.device_operations.configurationset.availability.append.message";
	public static String DEVICEOPERATIONS_CONFIG_SET_CHECK_EXP_MSG 				= "deviceview.device_operations.configurationset.availability.expected.message";
	public static String DEVICEOPERATIONS_CONFIG_SET_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.configurationset.availability.actual.success.message";
	public static String DEVICEOPERATIONS_CONFIG_SET_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.configurationset.availability.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_FIRMWARE_CHECK_DESC 				= "deviceview.device_operations.firmware_image.availability.description";
	public static String DEVICEOPERATIONS_FIRMWARE_CHECK_APPEND_MSG 		= "deviceview.device_operations.firmware_image.availability.append.message";
	public static String DEVICEOPERATIONS_FIRMWARE_CHECK_EXP_MSG 			= "deviceview.device_operations.firmware_image.availability.expected.message";
	public static String DEVICEOPERATIONS_FIRMWARE_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.firmware_image.availability.actual.success.message";
	public static String DEVICEOPERATIONS_FIRMWARE_CHECK_ACTUAL_FAILURE_MSG = "deviceview.device_operations.firmware_image.availability.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_FIRMWARE_EDITED_VALUES_CHECK_DESC 				= "deviceview.device_operations.firmware_image.value_changes.after_fie_management_edit.description";
	public static String DEVICEOPERATIONS_FIRMWARE_EDITED_VALUES_CHECK_APPEND_MSG 			= "deviceview.device_operations.firmware_image.value_changes.after_fie_management_edit.append.message";
	public static String DEVICEOPERATIONS_FIRMWARE_EDITED_VALUES_CHECK_EXP_MSG 				= "deviceview.device_operations.firmware_image.value_changes.after_fie_management_edit.expected.message";
	public static String DEVICEOPERATIONS_FIRMWARE_EDITED_VALUES_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.firmware_image.value_changes.after_fie_management_edit.actual.success.message";
	public static String DEVICEOPERATIONS_FIRMWARE_EDITED_VALUES_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.firmware_image.value_changes.after_fie_management_edit.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_GROUP_CHECK_DESC 					= "deviceview.device_operations.group.availability.description";
	public static String DEVICEOPERATIONS_GROUP_CHECK_APPEND_MSG 			= "deviceview.device_operations.group.availability.append.message";
	public static String DEVICEOPERATIONS_GROUP_CHECK_EXP_MSG 				= "deviceview.device_operations.group.availability.expected.message";
	public static String DEVICEOPERATIONS_GROUP_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.group.availability.actual.success.message";
	public static String DEVICEOPERATIONS_GROUP_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.group.availability.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_NOTIFI_CHECK_DESC 				= "deviceview.device_operations.notification.availability.description";
	public static String DEVICEOPERATIONS_NOTIFI_CHECK_APPEND_MSG 			= "deviceview.device_operations.notification.availability.append.message";
	public static String DEVICEOPERATIONS_NOTIFI_CHECK_EXP_MSG 				= "deviceview.device_operations.notification.availability.expected.message";
	public static String DEVICEOPERATIONS_NOTIFI_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.notification.availability.actual.success.message";
	public static String DEVICEOPERATIONS_NOTIFI_CHECK_ACTUAL_FAILURE_MSG 	= "deviceview.device_operations.notification.availability.actual.failure.message";
	
	
	public static String DEVICEOPERATIONS_NOTIFI_AFTER_TYPE_CHANGE_CHECK_DESC 				= "deviceview.device_operations.notification.value_changes.after_notification_type_changes.description";
	public static String DEVICEOPERATIONS_NOTIFI_AFTER_TYPE_CHANGE_CHECK_APPEND_MSG			= "deviceview.device_operations.notification.value_changes.after_notification_type_changes.append.message";
	public static String DEVICEOPERATIONS_NOTIFI_AFTER_TYPE_CHANGE_CHECK_EXP_MSG 			= "deviceview.device_operations.notification.value_changes.after_notification_type_changes.expected.message";
	public static String DEVICEOPERATIONS_NOTIFI_AFTER_TYPE_CHANGE_CHECK_ACTUAL_SUCCESS_MSG	= "deviceview.device_operations.notification.value_changes.after_notification_type_changes.actual.success.message";
	public static String DEVICEOPERATIONS_NOTIFI_AFTER_TYPE_CHANGE_CHECK_ACTUAL_FAILURE_MSG = "deviceview.device_operations.notification.value_changes.after_notification_type_changes.actual.failure.message";
	
	
	//Check all Portlet Parameter and values
	public static String PARAMETER_COMPARISION_DESC 				= "deviceview.check.parameters.values.description";
	public static String PARAMETER_COMPARISION_APPEND_MSG 			= "deviceview.check.parameters.values.append.message";
	public static String PARAMETER_COMPARISION_EXP_MSG 				= "deviceview.check.parameters.values.expected.message";
	public static String PARAMETER_COMPARISION_ACTUAL_FAILURE_MSG 	= "deviceview.check.parameters.values.actual.failure.message";
	
	
	//Check all Portlet Parameter and values 
	public static String CHECK_PORTLET_PARAMS_VALUES_DESC_1 			= "deviceview.portlets.check.parameters.values.description.1";
	public static String CHECK_PORTLET_PARAMS_VALUES_DESC_2 			= "deviceview.portlets.check.parameters.values.description.2";
	public static String CHECK_PORTLET_PARAMS_VALUES_APPEND_MSG_1		= "deviceview.portlets.check.parameters.values.append.message.1";
	public static String CHECK_PORTLET_PARAMS_VALUES_APPEND_MSG_2		= "deviceview.portlets.check.parameters.values.append.message.2";
	public static String CHECK_PORTLET_PARAMS_VALUES_EXP_MSG 			= "deviceview.portlets.check.parameters.values.expected.message";
	public static String CHECK_PORTLET_PARAMS_VALUES_ACTUAL_SUCCESS_MSG	= "deviceview.portlets.check.parameters.values.actual.success.message";
	public static String CHECK_PORTLET_PARAMS_VALUES_ACTUAL_FAILURE_MSG = "deviceview.portlets.check.parameters.values.actual.failure.message";
	
	
	//LAN Hosts
	public static String CLONE_LAN_HOSTS_INDEX_DESC 				= "device_simulator.perform.clone.lan_hosts.description";
	public static String CLONE_LAN_HOSTS_INDEX_APPEND_MSG 			= "device_simulator.perform.clone.lan_hosts.append.message";
	public static String CLONE_LAN_HOSTS_INDEX_EXP_MSG 				= "device_simulator.perform.clone.lan_hosts.expected.message";
	public static String CLONE_LAN_HOSTS_INDEX_ACTUAL_SUCCESS_MSG	= "device_simulator.perform.clone.lan_hosts.actual.success.message";
	public static String CLONE_LAN_HOSTS_INDEX_ACTUAL_FAILURE_MSG 	= "device_simulator.perform.clone.lan_hosts.actual.failure.message";

	
	//LAN Hosts	
	public static String CHECK_CLONED_LAN_HOSTS_INDEX_DESC 					= "deviceview.lan_hosts.check.cloned.description";
	public static String CHECK_CLONED_LAN_HOSTS_INDEX_APPEND_MSG 			= "deviceview.lan_hosts.check.cloned.append.message";
	public static String CHECK_CLONED_LAN_HOSTS_INDEX_EXP_MSG 				= "deviceview.lan_hosts.check.cloned.expected.message";
	public static String CHECK_CLONED_LAN_HOSTS_INDEX_ACTUAL_SUCCESS_MSG	= "deviceview.lan_hosts.check.cloned.actual.success.message";
	public static String CHECK_CLONED_LAN_HOSTS_INDEX_ACTUAL_FAILURE_MSG 	= "deviceview.lan_hosts.check.cloned.actual.failure.message";
	
	//Skip Validation
	public static String  SKIP_VALIDATION_DESC			="skip.validate.content.description";
	public static String  SKIP_VALIDATION_APPEND_MSG	="skip.validate.content.append.message"; 
	public static String  SKIP_VALIDATION_EXP_MSG		="skip.validate.content.expected.message";
	public static String  SKIP_VALIDATION_ACTUAL_MSG	="skip.validate.content.actual.success.message";

	//LAN Hosts	
	public static String CHECK_LAN_HOSTS_HEADER_DESC 				= "deviceview.lan_hosts.check.headers.description";
	public static String CHECK_LAN_HOSTS_HEADER_APPEND_MSG 			= "deviceview.lan_hosts.check.headers.append.message";
	public static String CHECK_LAN_HOSTS_HEADER_EXP_MSG 			= "deviceview.lan_hosts.check.headers.expected.message";
	public static String CHECK_LAN_HOSTS_HEADER_ACTUAL_SUCCESS_MSG	= "deviceview.lan_hosts.check.headers.actual.success.message";
	public static String CHECK_LAN_HOSTS_HEADER_ACTUAL_FAILURE_MSG 	= "deviceview.lan_hosts.check.headers.actual.failure.message";
	
	//LAN Hosts
	public static String CHECK_LAN_HOSTS_LIST_BOX_DESC 					= "deviceview.lan_hosts.check.listbox.description";
	public static String CHECK_LAN_HOSTS_LIST_BOX_APPEND_MSG 			= "deviceview.lan_hosts.check.listbox.append.message";
	public static String CHECK_LAN_HOSTS_LIST_BOX_EXP_MSG 				= "deviceview.lan_hosts.check.listbox.expected.message";
	public static String CHECK_LAN_HOSTS_LIST_BOX_ACTUAL_SUCCESS_MSG	= "deviceview.lan_hosts.check.listbox.actual.success.message";
	public static String CHECK_LAN_HOSTS_LIST_BOX_ACTUAL_FAILURE_MSG 	= "deviceview.lan_hosts.check.listbox.actual.failure.message";

	
	//System Status Update Parameter
	public static String UPDATE_SYSTEM_STATUS_PARAM_DESC 				= "device_simulator.update.system_status.parameter_value.description";
	public static String UPDATE_SYSTEM_STATUS_PARAM_APPEND_MSG 		= "device_simulator.update.system_status.parameter_value.append.message";
	public static String UPDATE_SYSTEM_STATUS_PARAM_EXP_MSG 			= "device_simulator.update.system_status.parameter_value.expected.message";
	public static String UPDATE_SYSTEM_STATUS_PARAM_ACTUAL_SUCCESS_MSG	= "device_simulator.update.system_status.parameter_value.actual.success.message";
	public static String UPDATE_SYSTEM_STATUS_PARAM_ACTUAL_FAILURE_MSG 	= "device_simulator.update.system_status.parameter_value.actual.failure.message";

	
	//System Status after Update Parameter
	public static String CHECK_UPDATED_SYSTEM_STATUS_PARAM_DESC 				= "deviceview.system_status.check.updated_parameter_value.description";
	public static String CHECK_UPDATED_SYSTEM_STATUS_PARAM_APPEND_MSG 			= "deviceview.system_status.check.updated_parameter_value.append.message";
	public static String CHECK_UPDATED_SYSTEM_STATUS_PARAM_EXP_MSG 				= "deviceview.system_status.check.updated_parameter_value.expected.message";
	public static String CHECK_UPDATED_SYSTEM_STATUS_PARAM_ACTUAL_SUCCESS_MSG	= "deviceview.system_status.check.updated_parameter_value.actual.success.message";
	public static String CHECK_UPDATED_SYSTEM_STATUS_PARAM_ACTUAL_FAILURE_MSG 	= "deviceview.system_status.check.updated_parameter_value.actual.failure.message";

	
	//LAN Settings
	public static String CHECK_LAN_SETTINGS_BUTTONS_DESC 				= "deviceview.lan_settings.check.buttons.description";
	public static String CHECK_LAN_SETTINGS_BUTTONS_APPEND_MSG 			= "deviceview.lan_settings.check.buttons.append.message";
	public static String CHECK_LAN_SETTINGS_BUTTONS_EXP_MSG 			= "deviceview.lan_settings.check.buttons.expected.message";
	public static String CHECK_LAN_SETTINGS_BUTTONS_ACTUAL_SUCCESS_MSG	= "deviceview.lan_settings.check.buttons.actual.success.message";
	public static String CHECK_LAN_SETTINGS_BUTTONS_ACTUAL_FAILURE_MSG 	= "deviceview.lan_settings.check.buttons.actual.failure.message";
	
	
	//LAN Settings Update Parameter 
	public static String UPDATE_LAN_SETTINGS_PARAM_DESC 				= "device_simulator.update.lan_settings.parameter_value.description";
	public static String UPDATE_LAN_SETTINGS_PARAM_APPEND_MSG 			= "device_simulator.update.lan_settings.parameter_value.append.message";
	public static String UPDATE_LAN_SETTINGS_PARAM_EXP_MSG 				= "device_simulator.update.lan_settings.parameter_value.expected.message";
	public static String UPDATE_LAN_SETTINGS_PARAM_ACTUAL_SUCCESS_MSG	= "device_simulator.update.lan_settings.parameter_value.actual.success.message";
	public static String UPDATE_LAN_SETTINGS_PARAM_ACTUAL_FAILURE_MSG 	= "device_simulator.update.lan_settings.parameter_value.actual.failure.message";

	
	//LAN Settings After Parameter Update
	public static String CHECK_UPDATED_LAN_SETTINGS_PARAM_DESC 					= "deviceview.lan_settings.check.updated_parameter_value.description";
	public static String CHECK_UPDATED_LAN_SETTINGS_PARAM_APPEND_MSG 			= "deviceview.lan_settings.check.updated_parameter_value.append.message";
	public static String CHECK_UPDATED_LAN_SETTINGS_PARAM_EXP_MSG 				= "deviceview.lan_settings.check.updated_parameter_value.expected.message";
	public static String CHECK_UPDATED_LAN_SETTINGS_PARAM_ACTUAL_SUCCESS_MSG	= "deviceview.lan_settings.check.updated_parameter_value.actual.success.message";
	public static String CHECK_UPDATED_LAN_SETTINGS_PARAM_ACTUAL_FAILURE_MSG 	= "deviceview.lan_settings.check.updated_parameter_value.actual.failure.message";
	

	//WAN Connectivity
	public static String CHECK_WAN_CONNECTIVITY_BUTTONS_DESC 				= "deviceview.wan_connectivity.check.buttons.description";
	public static String CHECK_WAN_CONNECTIVITY_BUTTONS_APPEND_MSG 			= "deviceview.wan_connectivity.check.buttons.append.message";
	public static String CHECK_WAN_CONNECTIVITY_BUTTONS_EXP_MSG 			= "deviceview.wan_connectivity.check.buttons.expected.message";
	public static String CHECK_WAN_CONNECTIVITY_BUTTONS_ACTUAL_SUCCESS_MSG	= "deviceview.wan_connectivity.check.buttons.actual.success.message";
	public static String CHECK_WAN_CONNECTIVITY_BUTTONS_ACTUAL_FAILURE_MSG 	= "deviceview.wan_connectivity.check.buttons.actual.failure.message";
	
	
	//WAN Connectivity Update Parameter
	public static String UPDATE_WAN_CONNECTIVITY_PARAM_DESC 				= "device_simulator.update.wan_connectivity.parameter_value.description";
	public static String UPDATE_WAN_CONNECTIVITY_PARAM_APPEND_MSG 			= "device_simulator.update.wan_connectivity.parameter_value.append.message";
	public static String UPDATE_WAN_CONNECTIVITY_PARAM_EXP_MSG 				= "device_simulator.update.wan_connectivity.parameter_value.expected.message";
	public static String UPDATE_WAN_CONNECTIVITY_PARAM_ACTUAL_SUCCESS_MSG	= "device_simulator.update.wan_connectivity.parameter_value.actual.success.message";
	public static String UPDATE_WAN_CONNECTIVITY_PARAM_ACTUAL_FAILURE_MSG 	= "device_simulator.update.wan_connectivity.parameter_value.actual.failure.message";
	
	
	//WAN Connectivity after Parameter UPdate
	public static String CHECK_UPDATED_WAN_CONNECTIVITY_PARAM_DESC 					= "deviceview.wan_connectivity.check.updated_parameter_value.description";
	public static String CHECK_UPDATED_WAN_CONNECTIVITY_PARAM_APPEND_MSG 			= "deviceview.wan_connectivity.check.updated_parameter_value.append.message";
	public static String CHECK_UPDATED_WAN_CONNECTIVITY_PARAM_EXP_MSG 				= "deviceview.wan_connectivity.check.updated_parameter_value.expected.message";
	public static String CHECK_UPDATED_WAN_CONNECTIVITY_PARAM_ACTUAL_SUCCESS_MSG	= "deviceview.wan_connectivity.check.updated_parameter_value.actual.success.message";
	public static String CHECK_UPDATED_WAN_CONNECTIVITY_PARAM_ACTUAL_FAILURE_MSG 	= "deviceview.wan_connectivity.check.updated_parameter_value.actual.failure.message";	
		
	
	//Statistics - New Devices
	public static String STATISTICS_NEW_DEVICES_PORTLET_DESC 				= "statistics.new_devices.graph.check.description";
	public static String STATISTICS_NEW_DEVICES_PORTLET_APPEND_MSG			= "statistics.new_devices.graph.check.append.message";
	public static String STATISTICS_NEW_DEVICES_PORTLET_EXP_MSG 			= "statistics.new_devices.graph.check.expected.message";
	public static String STATISTICS_NEW_DEVICES_PORTLET_ACTUAL_SUCCESS_MSG	= "statistics.new_devices.graph.check.actual.success.message";
	public static String STATISTICS_NEW_DEVICES_PORTLET_ACTUAL_FAILURE_MSG 	= "statistics.new_devices.graph.check.actual.failure.message";
	
	
	//Statistics - New Devices After new devices discovered
	public static String STATISTICS_NEW_DEVICES_PORTLET_AFTER_DEVICE_ADD_DESC 				= "statistics.new_devices.graph.check.after_device_discovery.description";
	public static String STATISTICS_NEW_DEVICES_PORTLET_AFTER_DEVICE_ADD_APPEND_MSG 		= "statistics.new_devices.graph.check.after_device_discovery.append.message";
	public static String STATISTICS_NEW_DEVICES_PORTLET_AFTER_DEVICE_ADD_EXP_MSG 			= "statistics.new_devices.graph.check.after_device_discovery.expected.message";
	public static String STATISTICS_NEW_DEVICES_PORTLET_AFTER_DEVICE_ADD_ACTUAL_SUCCESS_MSG	= "statistics.new_devices.graph.check.after_device_discovery.actual.success.message";
	public static String STATISTICS_NEW_DEVICES_PORTLET_AFTER_DEVICE_ADD_ACTUAL_FAILURE_MSG	= "statistics.new_devices.graph.check.after_device_discovery.actual.failure.message";
	
	
	//Statistics - DLC Health & Device Distribution
	public static String STATISTICS_PORTLET_GRAPH_DESC 					= "statistics.graph.portlet.check.description";
	public static String STATISTICS_PORTLET_GRAPH_APPEND_MSG			= "statistics.graph.portlet.check.append.message";
	public static String STATISTICS_PORTLET_GRAPH_EXP_MSG 				= "statistics.graph.portlet.check.expected.message";
	public static String STATISTICS_PORTLET_GRAPH_ACTUAL_SUCCESS_MSG	= "statistics.graph.portlet.check.actual.success.message";
	public static String STATISTICS_PORTLET_GRAPH_ACTUAL_FAILURE_MSG 	= "statistics.graph.portlet.check.actual.failure.message";


	//	Software Inventory - General
	public static String SOFTWARE_INVENTORY_VERIFY_DESC					= "device_view.software_inventory.check.description";
	public static String SOFTWARE_INVENTORY_VERIFY_APPEND_MSG			= "device_view.software_inventory.check.append.message";
	public static String SOFTWARE_INVENTORY_VERIFY_EXP_MSG 				= "device_view.software_inventory.check.expected.message";
	public static String SOFTWARE_INVENTORY_VERIFY_ACTUAL_SUCCESS_MSG	= "device_view.software_inventory.check.actual.success.message";
	public static String SOFTWARE_INVENTORY_VERIFY_ACTUAL_FAILURE_MSG 	= "device_view.software_inventory.check.actual.failure.message";
	
	//	Software Inventory  - Componet Check
	public static String SOFTWARE_INVENTORY_COMPONENT_CHECK_DESC		= "device_view.software_inventory.check.components.description";
	public static String SOFTWARE_INVENTORY_COMPONENT_CHECK_APPEND_MSG	= "device_view.software_inventory.check.components.append.message";
	public static String SOFTWARE_INVENTORY_COMPONENT_CHECK_EXP_MSG 	= "device_view.software_inventory.check.components.expected.message";
	public static String SOFTWARE_INVENTORY_COMPONENT_CHECK_SUCCESS_MSG	= "device_view.software_inventory.check.components.actual.success.message";
	public static String SOFTWARE_INVENTORY_COMPONENT_CHECK_FAILURE_MSG = "device_view.software_inventory.check.components.actual.failure.message";
	

	//	Software Inventory  - Add/remove Check
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_DESC			= "device_view.software_inventory.add_remove.check.description";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_APPEND_MSG		= "device_view.software_inventory.add_remove.check.append.message";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_EXP_MSG 		= "device_view.software_inventory.add_remove.check.expected.message";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_SUCCESS_MSG	= "device_view.software_inventory.add_remove.check.actual.success.message";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_FAILURE_MSG	= "device_view.software_inventory.add_remove.check.actual.failure.message";
	
	
	
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_DESC			= "device_view.software_inventory.add_remove.check.updated.description";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_APPEND_MSG		= "device_view.software_inventory.add_remove.check.updated.append.message";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_EXP_MSG_1 		= "device_view.software_inventory.add_remove.check.updated.expected.message.1";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_EXP_MSG_2 		= "device_view.software_inventory.add_remove.check.updated.expected.message.2";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_SUCCESS_MSG_1	= "device_view.software_inventory.add_remove.check.updated.actual.success.message.1";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_SUCCESS_MSG_2	= "device_view.software_inventory.add_remove.check.updated.actual.success.message.2";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_FAILURE_MSG_1	= "device_view.software_inventory.add_remove.check.updated.actual.failure.message.1";
	public static String SOFTWARE_INVENTORY_ADD_REMOVE_CHECK_UPDATED_FAILURE_MSG_2	= "device_view.software_inventory.add_remove.check.updated.actual.failure.message.2";
	
	
	
	// ================================================= JAGEE =============================================================//
		//Dashboard Recently Managed Devices
		public static String MANAGED_DEVICE_LASTCONNECTED_DESC 	=	"dashboard.lastconnected.description";				
		public static String MANAGED_DEVICE_EXPECTED_MSG 		=	"dashboard.lastconnected.expected.message";			
		public static String MANAGED_DEVICE_SUCCESS_MSG			=	"dashboard.lastconnected.actual.success.message";		
		public static String MANAGED_DEVICE_FAILURE_MSG			=	"dashboard.lastconnected.actual.failure.message";	


		//Dashboard Recently ManagedTime Devices
		public static String MANAGED_DEVICE_MANAGEDTIME_DESC 			=	"dashboard.managedTime.description";					
		public static String MANAGED_DEVICE_MANAGEDTIME_EXPECTED_MSG 	=	"dashboard.managedTime.expected.message";					
		public static String MANAGED_DEVICE_MANAGEDTIME_SUCCESS_MSG		=	"dashboard.managedTime.actual.success.message";			
		public static String MANAGED_DEVICE_MANAGEDTIME_FAILURE_MSG		=	"dashboard.managedTime.actual.failure.message";			
			

		//Online Actions (Dashboard Recently Managed Devices)
		public static String MANAGED_DEVICE_ONLINE_DESC 				=	"dashboard.lastconnected.online.description";				
		public static String MANAGED_DEVICE_ONLINE_EXPECTED_MSG 		=	"dashboard.lastconnected.online.expected.message";		
		public static String MANAGED_DEVICE_ONLINE_SUCCESS_MSG			=	"dashboard.lastconnected.online.actual.success.message";		
		public static String MANAGED_DEVICE_ONLINE_FAILURE_MSG			=	"dashboard.lastconnected.online.actual.failure.message";	

		//Offline Actions (Dashboard Recently ManagedTime Devices)
		public static String MANAGED_DEVICE_OFFLINE_DESC 				=	"dashboard.managedTime.offline.description";						
		public static String MANAGED_DEVICE_OFFLINE_EXPECTED_MSG 		=	"dashboard.managedTime.offline.expected.message";					
		public static String MANAGED_DEVICE_OFFLINE_SUCCESS_MSG			=	"dashboard.managedTime.offline.actual.success.message";			
		public static String MANAGED_DEVICE_OFFLINE_FAILURE_MSG			=	"dashboard.managedTime.offline.actual.failure.message";	
				
		//Add Group
		public static String ADD_GROUP_DESC			=	 "operations.group.add.description";		
		public static String ADD_GROUP_EXPECTED		= 	"operations.group.add.expected.message";		
		public static String ADD_GROUP_SUCCESS		= 	"operations.group.add.actual.success.message";		
		public static String ADD_GROUP_FAILURE		=	 "operations.group.add.actual.failure.message";		

		//Add Batch Event
		public static String ADD_BATCH_EVENT_DESC 		= 	"operations.batch.event.description";			
		public static String ADD_BATCH_EVENT_EXPECTED	= 	"operations.batch.event.expected.message";		
		public static String ADD_BATCH_EVENT_SUCCESS	=	 "operations.batch.event.actual.success.message";		
		public static String ADD_BATCH_EVENT_FAILURE	= 	"operations.batch.event.actual.failure.message";		

		//Add Batch Immediate
		public static String ADD_BATCH_IMMEDIATE_DESC		= 	"operations.batch.event.description";					
		public static String ADD_BATCH_IMMEDIATE_EXPECTED	= 	"operations.batch.event.expected.message";			
		public static String ADD_BATCH_IMMEDIATE_SUCCESS	=	 "operations.batch.event.actual.success.message";	
		public static String ADD_BATCH_IMMEDIATE_FAILURE	= 	"operations.batch.event.actual.failure.message";	

		//Add Batch TimeBased
		public static String ADD_BATCH_TIMEBASED_DESC		= "operations.batch.event.description";				
		public static String ADD_BATCH_TIMEBASED_EXPECTED	= "operations.batch.event.expected.message";			
		public static String ADD_BATCH_TIMEBASED_SUCCESS	= "operations.batch.event.actual.success.message";	
		public static String ADD_BATCH_TIMEBASED_FAILURE	= "operations.batch.event.actual.failure.message";	

		//Remove Batch
		public static String REMOVE_BATCH_DESC		= "operations.batch.remove.description";	
		public static String REMOVE_BATCH_EXPECTED	= "operations.batch.remove.expected.message";			
		public static String REMOVE_BATCH_SUCCESS	= "operations.batch.remove.actual.success.message";		
		public static String REMOVE_BATCH_FAILURE	= "operations.batch.remove.actual.failure.message";	
			

		//Remove Group
		public static String REMOVE_GROUP_DESC		= "operations.group.remove.description";			
		public static String REMOVE_GROUP_EXPECTED	= "operations.group.remove.expected.message";			
		public static String REMOVE_GROUP_SUCCESS	= "operations.group.remove.actual.success.message";		
		public static String REMOVE_GROUP_FAILURE	= "operations.group.remove.actual.failure.message";	

		//Validate UI 
		public static String VALIDATE_BATCH_UI_DESC		= "operations.batch.validate.UI.description";				
		public static String VALIDATE_BATCH_UI_EXPECTED	= "operations.batch.validate.UI.expected.message";			
		public static String VALIDATE_BATCH_UI_SUCCESS	= "operations.batch.validate.UI.actual.success.message";			
		public static String VALIDATE_BATCH_UI_FAILURE	= "operations.batch.validate.UI.actual.failure.message";			

		//Validate Batch Processing 
		public static String VALIDATE_BATCH_PROC_DESC		= "operations.batch.validate.batchpage.description";			
		public static String VALIDATE_BATCH_PROC_EXPECTED	= "operations.batch.validate.batchpage.expected.message";			
		public static String VALIDATE_BATCH_PROC_SUCCESS	= "operations.batch.validate.batchpage.actual.success.message";	
		public static String VALIDATE_BATCH_PROC_FAILURE	= "operations.batch.validate.batchpage.actual.failure.message";	

		//Validate Batch Result
		public static String VALIDATE_BATCH_RESULT_DESC		= "operations.groups.batchresult.description";		
		public static String VALIDATE_BATCH_RESULT_EXPECTED	= "operations.groups.batchresult.expected.message";			
		public static String VALIDATE_BATCH_RESULT_SUCCESS	= "operations.groups.batchresult.actual.success.message";		
		public static String VALIDATE_BATCH_RESULT_FAILURE	= "operations.groups.batchresult.actual.failure.message";		

		//Validate Batch Result Before Add
		public static String VALIDATE_BATCH_BEFORE_ADD_DESC		= "operations.groups.batchresult.before.description";		
		public static String VALIDATE_BATCH_BEFORE_ADD_EXPECTED	= "operations.groups.batchresult.before.expected.message";		
		public static String VALIDATE_BATCH_BEFORE_ADD_SUCCESS	= "operations.groups.batchresult.before.actual.success.message";		
		public static String VALIDATE_BATCH_BEFORE_ADD_FAILURE	= "operations.groups.batchresult.before.actual.failure.message";	

		//Validate Batch Result After Add
		public static String VALIDATE_BATCH_AFTER_ADD_DESC		= "operations.groups.batchresult.after.description";				
		public static String VALIDATE_BATCH_AFTER_ADD_EXPECTED	= "operations.groups.batchresult.after.expected.message";		
		public static String VALIDATE_BATCH_AFTER_ADD_SUCCESS	= "operations.groups.batchresult.after.actual.success.message";		
		public static String VALIDATE_BATCH_AFTER_ADD_FAILURE	= "operations.groups.batchresult.after.actual.failure.message";	
		
		//Create Configuration set
		public static String CREATE_CONFIG_SET_DESC="operations.configurationset.add.description";
		public static String CREATE_CONFIG_SET_EXPECTED="operations.configurationset.add.expected.message";
		public static String CREATE_CONFIG_SET_SUCCESS="operations.configurationset.add.actual.success.message";
		public static String CREATE_CONFIG_SET_FAILURE="operations.configurationset.add.actual.failure.message";
		public static String CREATE_CONFIG_SET_MESSAGE="operations.configurationset.add.validation.message";

		//Remove Configuration Set
		public static String DELETE_CONFIG_SET_DESC="operations.configurationset.remove.description";
		public static String DELETE_CONFIG_SET_EXPECTED="operations.configurationset.remove.expected.message";
		public static String DELETE_CONFIG_SET_SUCCESS="operations.configurationset.remove.actual.success.message";
		public static String DELETE_CONFIG_SET_FAILURE="operations.configurationset.remove.actual.failure.message";
		public static String DELETE_CONFIG_SET_MESSAGE="operations.configurationset.remove.validation.message";


		//Create File Management
		public static String CREATE_FILEMANAGEMENT_DESC="operations.filemanagement.add.description";
		public static String CREATE_FILEMANAGEMENT_EXPECTED="operations.filemanagement.add.expected.message";
		public static String CREATE_FILEMANAGEMENT_SUCCESS="operations.filemanagement.add.actual.success.message";
		public static String CREATE_FILEMANAGEMENT_FAILURE="operations.filemanagement.add.actual.failure.message";
		public static String CREATE_FILEMANAGEMENT_MESSAGE="operations.filemanagement.add.validation.message";
		                            
		//Remove File Management   
		public static String DELETE_FILEMANAGEMENT_DESC="operations.filemanagement.remove.description";
		public static String DELETE_FILEMANAGEMENT_EXPECTED="operations.filemanagement.remove.expected.message";
		public static String DELETE_FILEMANAGEMENT_SUCCESS="operations.filemanagement.remove.actual.success.message";
		public static String DELETE_FILEMANAGEMENT_FAILURE="operations.filemanagement.remove.actual.failure.message";
		public static String DELETE_FILEMANAGEMENT_MESSAGE="operations.filemanagement.remove.validation.message";

		//DLC UPGRADE
		public static String DLC_UPGRADE_DESC="deviceview.quick-actions.description";
		public static String DLC_UPGRADE_MESSAGE="deviceview.quick-actions.validation.message";

		//Firmware Monitoring
		public static String FIRMWARE_MONITORING_DESC="operations.firmwaremonitoring.description";
		public static String FIRMWARE_MONITORING_EXP="operations.firmwaremonitoring.expected";
		public static String FIRMWARE_MONITORING_SUCCESS="operations.firmwaremonitoring.success";
		public static String FIRMWARE_MONITORING_FAILURE="operations.firmwaremonitoring.failure";
		public static String FIRMWARE_MONITORING_MESSAGE="operations.firmwaremonitoring.validation.message";
		                            
		//Software Version
		public static String SOFTWARE_VERSION_DESC="deviceview.properties.description";
		public static String SOFTWARE_VERSION_MESSAGE="deviceview.properties.validation.message";

		//Wireless settings
		public static String WIRELESS_SETTINGS_DESC="deviceview.wireless-settings.description";
		public static String WIRELESS_SETTINGS_VAL_MSG="deviceview.wireless-settings.validation.message";

		//SSID Adv
		public static String WIRELESS_SETTINGS_SSID_DESC="operations.wireless-settings.ssid.description";
		public static String WIRELESS_SETTINGS_SSID_VAL_MSG="operations.wireless-settings.ssid.validation.message";
		                            
		//Enable or Disable Wireless
		public static String WIRELESS_SETTINGS_EN_DESC="operations.wireless-settings.en.description";
		public static String WIRELESS_SETTINGS_EN_VAL_MSG="operations.wireless-settings.en.validation.message";
		
		
		//Tags
		public static String TAG_DESC="system.tags.description";
		public static String TAG_MESSAGE="system.tags.validation.message";

		//Groups
		public static String GROUPS_DESC="system.groups.description";
		public static String GROUPS_MESSAGE="system.groups.validation.message";
		                            
		//Batches
		public static String BATCHES_DESC="system.batches.description";
		public static String BATCHES_MESSAGE="system.batches.validation.message";

		//Workflows
		public static String WORKFLOW_DESC="system.workflows.description";
		public static String WORKFLOW_VAL_MSG="system.workflows.validation.message";

		//Workflow Template
		public static String TEMPLATE_DESC="system.templates.ssid.description";
		public static String TEMPLATE_VAL_MSG="system.templates.ssid.validation.message";
		                            
		//File Types
		public static String FILETYPES_DESC="system.filetypes.description";
		public static String FILETYPES_VAL_MSG="system.filetypes.validation.message";
		
		
		//role add
		public static String ROLE_DESC="settings.controlpanel.role.description";
		public static String ROLE_EXP_MSG="settings.controlpanel.role.expected.message";
		public static String ROLE_SUCCESS_MSG="settings.controlpanel.role.success.message";
		public static String ROLE_FAILURE_MSG="settings.controlpanel.role.failure.message";
		public static String ROLE_VAL_MSG="settings.controlpanel.role.validation.message";

		//user group add
		public static String GROUP_ADD_DESC="settings.controlpanel.group.add.description";
		public static String GROUP_ADD_EXP_MSG="settings.controlpanel.group.add.expected.message";
		public static String GROUP_ADD_SUCCESS_MSG="settings.controlpanel.group.add.success.message";
		public static String GROUP_ADD_FAILURE_MSG="settings.controlpanel.group.add.failure.message";
		public static String GROUP_ADD_VAL_MSG="settings.controlpanel.group.add.validation.message";

		//user group remove
		public static String GROUP_REMOVE_DESC="settings.controlpanel.group.remove.description";
		public static String GROUP_REMOVE_EXP_MSG="settings.controlpanel.group.remove.expected.message";
		public static String GROUP_REMOVE_SUCCESS_MSG="settings.controlpanel.group.remove.success.message";
		public static String GROUP_REMOVE_FAILURE_MSG="settings.controlpanel.group.remove.failure.message";
		public static String GROUP_REMOVE_VAL_MSG="settings.controlpanel.group.remove.validation.message";
		   
		//user add   
		public static String USER_ADD_DESC="settings.controlpanel.user.add.description";
		public static String USER_ADD_EXP_MSG="settings.controlpanel.user.add.expected.message";
		public static String USER_ADD_SUCCESS_MSG="settings.controlpanel.user.add.success.message";
		public static String USER_ADD_FAILURE_MSG="settings.controlpanel.user.add.failure.message";
		public static String USER_ADD_VAL_MSG="settings.controlpanel.user.add.validation.message";

		//user remove
		public static String USER_REMOVE_DESC="settings.controlpanel.user.remove.description";
		public static String USER_REMOVE_EXP_MSG="settings.controlpanel.user.remove.expected.message";
		public static String USER_REMOVE_SUCCESS_MSG="settings.controlpanel.user.remove.success.message";
		public static String USER_REMOVE_FAILURE_MSG="settings.controlpanel.user.remove.failure.message";
		public static String USER_REMOVE_VAL_MSG="settings.controlpanel.user.remove.validation.message";
		
		
		
		// ================================================= ANGU =============================================================//
		
		//VerifyValueChange
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_DESC="operations.workflowtemplates.verifyvaluechange.validation.description";
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_EXP_MSG="operations.workflowtemplates.verifyvaluechange.validation.expected.message";
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_ACTUAL_SUCCESS_MSG="operations.workflowtemplates.verifyvaluechange.validation.actual.success.message";
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_ACTUAL_FAILURE_MSG="operations.workflowtemplates.verifyvaluechange.validation.actual.failure.message";
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_ERROR_MSG_1="operations.workflowtemplates.verifyvaluechange.validation.errormessage.1";
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_ERROR_MSG_2="operations.workflowtemplates.verifyvaluechange.validation.errormessage.2";
		public static String WFT_VERIFYVALUECHANGE_VALIDATE_ERROR_MSG_3="operations.workflowtemplates.verifyvaluechange.validation.errormessage.3";

		//VerifyTagsInDevice
		public static String OP_TAGS_VERIFYTAGSINDEVICE_VALIDATE_DESC="operations.tags.verifytagsindevice.validation.description";
		public static String OP_TAGS_VERIFYTAGSINDEVICE_VALIDATE_EXP_MSG="operations.tags.verifytagsindevice.validation.expected.message";
		public static String OP_TAGS_VERIFYTAGSINDEVICE_VALIDATE_ACTUAL_SUCCESS_MSG="operations.tags.verifytagsindevice.validation.actual.success.message";
		public static String OP_TAGS_VERIFYTAGSINDEVICE_VALIDATE_ACTUAL_FAILURE_MSG="operations.tags.verifytagsindevice.validation.actual.failure.message";
		public static String OP_TAGS_VERIFYTAGSINDEVICE_VALIDATE_ERROR_MSG_1="operations.tags.verifytagsindevice.validation.errormessage.1";

		//VerifyTabsToView
		public static String TAB_VALIDATE_DESC="tabs.verifytabstoview.validation.description";
		public static String TAB_VALIDATE_EXP_MSG="tabs.verifytabstoview.validation.expected.message";
		public static String TAB_VALIDATE_ACTUAL_SUCCESS_MSG="tabs.verifytabstoview.validation.actual.success.message";
		public static String TAB_VALIDATE_ACTUAL_FAILURE_MSG="tabs.verifytabstoview.validation.actual.failure.message";
		public static String TAB_VALIDATE_ERROR_MSG_1="tabs.verifytabstoview.validation.errormessage.1";

		//VerifySideMenu
		public static String TAB_SIDEMENU_VALIDATE_DESC="tabs.sidemenu.verifysidemenu.validation.description";
		public static String TAB_SIDEMENU_VALIDATE_EXP_MSG="tabs.sidemenu.verifysidemenu.validation.expected.message";
		public static String TAB_SIDEMENU_VALIDATE_ACTUAL_SUCCESS_MSG="tabs.sidemenu.verifysidemenu.validation.actual.success.message";
		public static String TAB_SIDEMENU_VALIDATE_ACTUAL_FAILURE_MSG="tabs.sidemenu.verifysidemenu.validation.actual.failure.message";
		public static String TAB_SIDEMENU_VALIDATE_ERROR_MSG_1="tabs.sidemenu.verifysidemenu.validation.errormessage.1";
		public static String TAB_SIDEMENU_VALIDATE_ERROR_MSG_2="tabs.sidemenu.verifysidemenu.validation.errormessage.2";
		public static String TAB_SIDEMENU_VALIDATE_ERROR_MSG_3="tabs.sidemenu.verifysidemenu.validation.errormessage.3";
		public static String TAB_SIDEMENU_VALIDATE_ERROR_MSG_4="tabs.sidemenu.verifysidemenu.validation.errormessage.4";
		
		//NavigateToURL
		public static String NAV_URL_VALIDATE_DESC="browser.url.validation.description";
		public static String NAV_URL_VALIDATE_EXP_MSG="browser.url.validation.expected.message";
		public static String NAV_URL_VALIDATE_ACTUAL_SUCCESS_MSG="browser.url.validation.actual.success.message";
		public static String NAV_URL_VALIDATE_ACTUAL_FAILURE_MSG="browser.url.validation.actual.failure.message";
		
		//CheckVersionAndBuildNumber
		public static String CHECK_VERSION_BUILDNO_VALIDATE_DESC="primehome.ui.versionandbuildnumber.validation.desc";
		public static String CHECK_VERSION_BUILDNO_VALIDATE_EXP_MSG="primehome.ui.versionandbuildnumber.validation.expected.message";
		public static String CHECK_VERSION_BUILDNO_VALIDATE_ACTUAL_SUCCESS_MSG="primehome.ui.versionandbuildnumber.validation.actual.success.message";
		public static String CHECK_VERSION_BUILDNO_VALIDATE_ACTUAL_FAILURE_MSG="primehome.ui.versionandbuildnumber.validation.actual.failure.message";
		public static String CHECK_VERSION_BUILDNO_VALIDATE_ERROR_MSG_1="primehome.ui.versionandbuildnumber.validation.errormessage.1";
		public static String CHECK_VERSION_BUILDNO_VALIDATE_ERROR_MSG_2="primehome.ui.versionandbuildnumber.validation.errormessage.1";
		
		//NavigateToSideMenu
		public static String NAV_SIDEMENU_VALIDATE_DESC="tabs.sidemenu.navigatetosidemenu.validation.description";
		public static String NAV_SIDEMENU_EXP_VALIDATE_MSG="tabs.sidemenu.navigatetosidemenu.validation.expected.message";
		public static String NAV_SIDEMENU_ACT_FAIL_MSG="tabs.sidemenu.navigatetosidemenu.validation.actual.failure.message";
		
		//Navigate to tab
		public static String NAV_TAB_VALIDATE_DESC="tabs.navigatetotab.validation.description";
		public static String NAV_TAB_EXP_VALIDATE_MSG="tabs.navigatetotab.validation.expected.message";
		public static String NAV_TAB_ACT_VALIDATE_MSG="tabs.navigatetotab.validation.actual.success.message";
		public static String NAV_TAB_ACT_FAIL_MSG="tabs.navigatetotab.validation.actual.failure.message";
		
		//Verify Dashboard Side Menu
		public static String NAV_TO_ALL_DASHBOARD_SIDEMENU_DESC="dashboard.sidemenu.verifydashboardsidemenu.validation.description";
		public static String NAV_TO_ALL_DASHBOARD_SIDEMENU_FAILURE_MSG="dashboard.sidemenu.verifydashboardsidemenu.validation.failure.msg";
		
		//Verify All Dashboard Side Menus Portlet
		public static String NAV_DASHBOARD_SIDEMENU_PORTLET_DESC="dashboard.verifydashboardportlets.validation.description";
		public static String NAV_DASHBOARD_SIDEMENU_PORTLET_EXP_MSG="dashboard.verifydashboardportlets.validation.expected.message";
		public static String NAV_DASHBOARD_SIDEMENU_PORTLET_ACT_SUCCESS_MSG="dashboard.verifydashboardportlets.validation.actual.success.message";
		public static String NAV_DASHBOARD_SIDEMENU_PORTLET_FAILURE_MSG="dashboard.verifydashboardportlets.validation.actual.failure.message";
		
		//NavigateToDeviceByAdvancedSearch
		public static String DEV_NAV_BY_ADV_SEARCH_DESC="advancedsearch.navigatetodevicebyadvancedsearch.validation.description";
		public static String DEV_NAV_BY_ADV_SEARCH_EXP_VAL_MSG="advancedsearch.navigatetodevicebyadvancedsearch.validation.expected.message";
		public static String DEV_NAV_BY_ADV_SEARCH_ACT_VAL_SUCCESS_MSG="advancedsearch.navigatetodevicebyadvancedsearch.validation.actual.success.message";
		public static String DEV_NAV_BY_ADV_SEARCH_ACT_VAL_FAILURE_MSG="advancedsearch.navigatetodevicebyadvancedsearch.validation.actual.failure.message";
		
		//VerifySideMenu
		public static String NAV_DEVICEVIEW_SIDEMENU_VALIDATION_DESC="tabs.sidemenu.verifysidemenu.validation.description";
		public static String NAV_DEVICEVIEW_SIDEMENU_VALIDATION_FAILURE_MSG="tabs.sidemenu.verifysidemenu.validation.actual.failure.message";
		
		//VerifyQuickActions
		public static String NAV_DEVICEVIEW_QUICKACTIONS_VALIDATION_DESC="tabs.quickaction.verifyquickactionslistforrole.validation.description";
		public static String NAV_DEVICEVIEW_QUICKACTIONS_VALIDATION_FAILURE_MSG="tabs.quickaction.verifyquickactionslistforrole.validation.actual.failure.message";
		
		//VerifyDeviceViewportlets
		public static String VER_DEVICEVIEW_PORTLETS_VAL_DESC="tab.deviceview.verifydeviceportlets.validation.description";
		public static String VER_DEVICEVIEW_PORTLETS_VAL_EXP_MSG="tab.deviceview.verifydeviceportlets.validation.expected.message";
		public static String VER_DEVICEVIEW_PORTLETS_VAL_SUCCESS_MSG="tab.deviceview.verifydeviceportlets.validation.success.message";
		public static String VER_DEVICEVIEW_PORTLETS_VAL_FAILURE_MSG="tab.deviceview.verifydeviceportlets.validation.failure.message";
		
		

		//================================================ GOPI ==================================================//
		
		
		public static String NBI_REQ_DESCRIPION = "nbi.request.description";
		public static String NBI_RESP_HANDLER_MESSAGE = "nbi.response.handler.message";
		public static String NBI_RESP_HANDLER_EXCEPTION = "nbi.response.handler.exception";
		
		public static String NBI_RESP_VALID_RESULT_SUCCESS = "nbi.response.validation.result.success";
		public static String NBI_RESP_VALID_RESULT_FAILURE = "nbi.response.validation.result.failure";
		
		public static String NBI_RESP_GET_ALL_TAGS_EXP = "nbi.response.getAllEnabledTags.expected";
		public static String NBI_RESP_GET_ALL_TAGS_ACT_SUCCESS = "nbi.response.getAllEnabledTags.actual.success";
		public static String NBI_RESP_GET_ALL_TAGS_ACT_FAILURE = "nbi.response.getAllEnabledTags.actual.failure";
		
		public static String NBI_RESP_DEV_PARAM_VALUES_EXP = "nbi.response.getParametersValues.expected";
		public static String NBI_RESP_DEV_PARAM_VALUES_ACT_SUCCESS = "nbi.response.getParametersValues.actual.success";
		public static String NBI_RESP_DEV_PARAM_VALUES_ACT_FAILURE = "nbi.response.getParametersValues.actual.failure";
		
		public static String NBI_RESP_TRACE_ROUTE_DIAG_EXP = "nbi.response.tracerouteDiagnostics.expected";
		public static String NBI_RESP_TRACE_ROUTE_DIAG_ACT_SUCCESS = "nbi.response.tracerouteDiagnostics.actual.success";
		public static String NBI_RESP_TRACE_ROUTE_DIAG_ACT_FAILURE = "nbi.response.tracerouteDiagnostics.actual.failure";
		
		public static String NBI_RESP_PERFORM_WIFI_SCAN_EXP = "nbi.response.performWifiScan.expected";
		public static String NBI_RESP_PERFORM_WIFI_SCAN_ACT_SUCCESS = "nbi.response.performWifiScan.actual.success";
		public static String NBI_RESP_PERFORM_WIFI_SCAN_ACT_FAILURE = "nbi.response.performWifiScan.actual.failure";
		
		public static String NBI_RESP_DEV_PROP_EXP = "nbi.response.getDeviceProperties.expected";
		public static String NBI_RESP_DEV_PROP_DEV_INFO_ACT_SUCCESS = "nbi.response.getDeviceProperties.devInfo.actual.success";
		public static String NBI_RESP_DEV_PROP_DEV_INFO_ACT_FAILURE = "nbi.response.getDeviceProperties.devInfo.actual.failure";
		
		public static String NBI_RESP_DEV_PROP_MGMT_SERVER_ACT_SUCCESS = "nbi.response.getDeviceProperties.mgmtServer.actual.success";
		public static String NBI_RESP_DEV_PROP_MGMT_SERVER__ACT_FAILURE = "nbi.response.getDeviceProperties.mgmtServer.actual.failure";
		
		public static String NBI_RESP_FILE_UPLOAD_EXP = "nbi.response.fileUpload.expected";
		public static String NBI_RESP_FILE_UPLOAD_ACT_SUCCESS = "nbi.response.fileUpload.actual.success";
		public static String NBI_RESP_FILE_UPLOAD_ACT_FAILURE = "nbi.response.fileUpload.actual.failure";
		
		public static String NBI_RESP_DWLOAD_DIAG_EXP = "nbi.response.dwnloadDiag.expected";
		public static String NBI_RESP_DWLOAD_DIAG_ACT_SUCCESS = "nbi.response.dwnloadDiag.actual.success";
		public static String NBI_RESP_DWLOAD_DIAG_ACT_FAILURE =  "nbi.response.dwnloadDiag.actual.failure";
		
		public static String NBI_RESP_UPLOAD_DIAG_EXP = "nbi.response.uploadDiag.expected";
		public static String NBI_RESP_UPLOAD_DIAG_ACT_SUCCESS = "nbi.response.uploadDiag.actual.success";
		public static String NBI_RESP_UPLOAD_DIAG_ACT_FAILURE =  "nbi.response.uploadDiag.actual.failure";
		
		public static String NBI_RESP_PING_DIAG_EXP = "nbi.response.pingDiag.expected";
		public static String NBI_RESP_PING_DIAG_ACT_SUCCESS = "nbi.response.pingDiag.actual.success";
		public static String NBI_RESP_PING_DIAG_ACT_FAILURE =  "nbi.response.pingDiag.actual.failure";
		
		public static String NBI_RESP_PROV_EXP = "nbi.response.provision.expected";
		public static String NBI_RESP_PROV_ACT_SUCCESS = "nbi.response.provision.actual.success";
		public static String NBI_RESP_PROV_ACT_FAILURE =  "nbi.response.provision.actual.failure";
		
		public static String NBI_RESP_CPE_EXP = "nbi.response.cpe.expected";
		public static String NBI_RESP_CPE_ACT_SUCCESS = "nbi.response.cpe.actual.success";
		public static String NBI_RESP_CPE_ACT_FAILURE =  "nbi.response.cpe.actual.failure";
		
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_DESC = "deviceView.speedTest.performSpeedTest.validation.description";
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_EXPECTED = "deviceView.speedTest.performSpeedTest.validation.expected";
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_SUCCESS = "deviceView.speedTest.performSpeedTest.validation.actual.success";
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_FAILURE = "deviceView.speedTest.performSpeedTest.validation.actual.failure";
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_ERROR = "deviceView.speedTest.performSpeedTest.validation.actual.error";
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_NOTIF_ERROR = "deviceView.speedTest.performSpeedTest.validation.notification.error";
		public static String VAL_DEV_VIEW_SPEEDTEST_PERFORM_SPEEDTEST_NOTIF_MISSIN_ERROR = "deviceView.speedTest.performSpeedTest.validation.notification.missing.error";
		
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_RESULTS_DESC = "deviceView.speedTest.historyResults.validation.description";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_RESULTS_EXPECTED = "deviceView.speedTest.historyResults.validation.expected";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_RESULTS_SUCCESS = "deviceView.speedTest.historyResults.validation.actual.success";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_RESULTS_FAILURE = "deviceView.speedTest.historyResults.validation.actual.failure";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_RESULTS_ERROR = "deviceView.speedTest.historyResults.validation.actual.error";
		
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_CHARTS_DESC = "deviceView.speedTest.historyCharts.validation.description";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_CHARTS_EXPECTED = "deviceView.speedTest.historyCharts.validation.expected";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_CHARTS_SUCCESS = "deviceView.speedTest.historyCharts.validation.actual.success";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_CHARTS_FAILURE = "deviceView.speedTest.historyCharts.validation.actual.failure";
		public static String VAL_DEV_VIEW_SPEEDTEST_HISTORY_CHARTS_ERROR = "deviceView.speedTest.historyCharts.validation.actual.error";
		
		public static String VAL_DEV_VIEW_SPEEDTEST_EXPECTED_DATA_DESC = "deviceView.speedTest.expectedData.validation.description";
		public static String VAL_DEV_VIEW_SPEEDTEST_EXPECTED_DATA_EXPECTED = "deviceView.speedTest.expectedData.validation.expected";
		public static String VAL_DEV_VIEW_SPEEDTEST_EXPECTED_DATA_SUCCESS = "deviceView.speedTest.expectedData.validation.actual.success";
		public static String VAL_DEV_VIEW_SPEEDTEST_EXPECTED_DATA_FAILURE = "deviceView.speedTest.expectedData.validation.actual.failure";
		public static String VAL_DEV_VIEW_SPEEDTEST_EXPECTED_DATA_ERROR = "deviceView.speedTest.expectedData.validation.actual.error";
		
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_DESC = "deviceView.speedTest.compareData.validation.description";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_EXPECTED = "deviceView.speedTest.compareData.validation.expected";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_SUCCESS = "deviceView.speedTest.compareData.validation.actual.success";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_FAILURE = "deviceView.speedTest.compareData.validation.actual.failure";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_ERROR = "deviceView.speedTest.compareData.validation.actual.error";
		
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_HISTORY_PORTLET_DESC = "deviceView.speedTest.compareData.historyPortlet.validation.description";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_HISTORY_PORTLET_EXPECTED = "deviceView.speedTest.compareData.historyPortlet.validation.expected";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_HISTORY_PORTLET_SUCCESS = "deviceView.speedTest.compareData.historyPortlet.validation.actual.success";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_HISTORY_PORTLET_FAILURE = "deviceView.speedTest.compareData.historyPortlet.validation.actual.failure";
		public static String VAL_DEV_VIEW_SPEEDTEST_COMPARE_DATA_HISTORY_PORTLET_ERROR = "deviceView.speedTest.compareData.historyPortlet.validation.actual.error";
		
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_PORTLET_DESC = "deviceView.deviceOperations.devInitialPortlet.validation.description";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_GATEWAY_EXPECTED = "deviceView.deviceOperations.devInitialPortlet.gateway.validation.expected";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_GATEWAY_SUCCESS = "deviceView.deviceOperations.devInitialPortlet.gateway.validation.actual.success";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_GATEWAY_FAILURE = "deviceView.deviceOperations.devInitialPortlet.gateway.validation.actual.failure";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_TAGS_EXPECTED = "deviceView.deviceOperations.devInitialPortlet.tags.validation.expected";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_TAGS_SUCCESS = "deviceView.deviceOperations.devInitialPortlet.tags.validation.actual.success";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_TAGS_FAILURE = "deviceView.deviceOperations.devInitialPortlet.tags.validation.actual.failure";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_PORTLET_SUCCESS = "deviceView.deviceOperations.devInitialPortlet.validation.success";
		public static String VAL_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_PORTLET_ERROR = "deviceView.deviceOperations.devInitialPortlet.validation.error";
		
	//==========================================================================================================================================//
	//	Resources Message Constansts
	//==========================================================================================================================================//
		
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_PERFORM_SPEED_TEST_INTERFACE = "page.deviceview.sidemenu.speedTest.performSpeedTest.interface.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_PERFORM_SPEED_TEST_BUTTON = "page.deviceview.sidemenu.speedTest.performSpeedTest.button.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_PERFORM_SPEED_LAST_TEST_LABEL = "page.deviceview.sidemenu.speedTest.performSpeedTest.lastTestLabel.xpath";
		
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_TABNAME_LABEL = "page.deviceview.sidemenu.speedTest.histResults.tab.xpath";		
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_PORTLET_LABEL = "page.deviceview.sidemenu.speedTest.histResults.portletName.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_DWNLOAD_BTN = "page.deviceview.sidemenu.speedTest.histResults.dwnloadBtn.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_UPLOAD_BTN = "page.deviceview.sidemenu.speedTest.histResults.uploadBtn.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_RTT_VAL = "page.deviceview.sidemenu.speedTest.histResults.rttVal.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_LASTTEST_LABEL = "page.deviceview.sidemenu.speedTest.histResults.lastTestLabel.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_SELECTBOX_LABEL = "page.deviceview.sidemenu.speedTest.histResults.selectBoxLabel.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_RESULTS_TABLE_WRAPPER_LABEL = "page.deviceview.sidemenu.speedTest.histResults.tableWrapperLabel.xpath";
		
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_CHARTS_TABNAME_LABEL = "page.deviceview.sidemenu.speedTest.histCharts.tab.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_CHARTS_ST_CHART = "page.deviceview.sidemenu.speedTest.histCharts.stChart.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_CHARTS_CHART_SERIES = "page.deviceview.sidemenu.speedTest.histCharts.chartSeries.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_CHARTS_HIGH_CHART_SERIAL ="page.deviceview.sidemenu.speedTest.histCharts.highChartSerial.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_CHARTS_HIGH_CHART_TOOLTIP = "page.deviceview.sidemenu.speedTest.histCharts.toolTip.xpath";
		public static String WEBDRIVER_ID_DEV_VIEW_SPEEDTEST_HIST_CHARTS_HIGH_CHART_TOOLTIP_TSPAN = "page.deviceview.sidemenu.speedTest.histCharts.toolTip.tspan.xpath";
		
		public static String WEBDRIVER_ID_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_PORTLET = "page.deviceview.sidemenu.deviceOperations.devInitialPortlet";
		public static String WEBDRIVER_ID_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_GATEWAY_NAME = "page.deviceview.sidemenu.deviceOperations.devInitialPortlet.gateway";
		public static String WEBDRIVER_ID_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_TAGS_NAME = "page.deviceview.sidemenu.deviceOperations.devInitialPortlet.provTags";
		public static String WEBDRIVER_ID_DEV_VIEW_DEV_OPERATIONS_DEV_INITIAL_PROV_TAGVALUES_NAME = "page.deviceview.sidemenu.deviceOperations.devInitialPortlet.provTagValues";
}
