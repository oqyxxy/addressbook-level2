package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

public class Formatter {
	 /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    public static String addLinePrefix(String message) {
		return LINE_PREFIX + message;
	}
    
    public static String addLineInput(String message) {
		return "[Command entered:" + message + "]";
	}
    
    public static String formatStorageFilePath(String path) {
		return String.format(MESSAGE_USING_STORAGE_FILE, path);
	}
    
    public static String formatWelcomeMessage(String version, String storageFilePath) {
    	return DIVIDER + 
    			DIVIDER + 
    			MESSAGE_WELCOME + 
    			version + 
    			MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE + 
    			Formatter.formatStorageFilePath(storageFilePath) + 
    			DIVIDER;
	}
    
    public static String formatGoodbyeMessage() {
		return MESSAGE_GOODBYE + DIVIDER + DIVIDER;
	}
    
    public static String formatInitFailedMessage() {
		return MESSAGE_INIT_FAILED + DIVIDER + DIVIDER;
	}
    
    public static String formatShowToUserMessage(String message) {
		return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
	}
    
    public static String formatShowResultToUserMessage(String message) {
		return message + DIVIDER;
	}

    public static String formatListItem(int visibleIndex, String listItem) {
		return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
	}
}