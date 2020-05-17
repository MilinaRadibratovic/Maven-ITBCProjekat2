package objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

public class Data extends Read {

	public static int rowNumb;// Row Number
	public static int colNumb;// Column Number
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static HashMap<String, String> hm;
	// Elements on landing page
	public static final String USERNAME_NAME = readKey("USERNAME_NAME");
	public static final String SANDBOX_URL = readKey("SANDBOX_URL");
	public static final String PASSWORD_ID = readKey("PASSWORD_ID");
	public static final String LOGIN_BTN_XPATH = readKey("LOGIN_BTN_XPATH");
	public static final String SIGNUP_LINK_TEXT = readKey("SIGNUP_LINK_TEXT");
	public static final String LOGIN_ERROR_XPATH = readKey("LOGIN_ERROR_XPATH");
	public static final String LOGIN_INCORRECT_XPATH = readKey("LOGIN_INCORRECT_XPATH");
	// elements on home page
	public static final String ACCOUNT_AVATAR_ID = readKey("ACCOUNT_AVATAR_ID");
	public static final String LOGOUT_BTN_ID = readKey("LOGOUT_BTN_ID");

	// elements on product page
	public static final String PRODUCTS_PAGE_URL = readKey("PRODUCTS_PAGE_URL");
	public static final String PRODUCTS_PAGE_XPATH = readKey("PRODUCTS_PAGE_XPATH");
	public static final String ADD_PRODUCT_XPATH = readKey("ADD_PRODUCT_XPATH");
	public static final String PRODUCT_NAME_XPATH = readKey("PRODUCT_NAME_XPATH");
	public static final String PRODUCT_ID_XPATH = readKey("PRODUCT_ID_XPATH");
	public static final String PRODUCT_PRICE_XPATH = readKey("PRODUCT_PRICE_XPATH");
	public static final String SAVE_PRODUCT_XPATH = readKey("SAVE_PRODUCT_XPATH");
	public static final String NUM_PRODUCTS_XPATH = readKey("NUM_PRODUCTS_XPATH");
	public static final String FIND_PRODUCTS_XPATH = readKey("FIND_PRODUCTS_XPATH");
	public static final String EDIT_PAGE_XPATH = readKey("EDIT_PAGE_XPATH");
	public static final String SAVE_CHANGES_XPATH = readKey("SAVE_CHANGES_XPATH");
	public static final String CHANGE_PRICE_XPATH = readKey("CHANGE_PRICE_XPATH");
	public static final String PRODUCTS_XPATH = readKey("PRODUCTS_XPATH");
}
