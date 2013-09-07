package com.tmm.android.twitter.util;

import android.view.Menu;

public class Constants {
	
	//Menu item IDs
	public static final int ACTIVITY_PROFILE = Menu.FIRST;
	public static final int ACTIVITY_FRIENDS = Menu.FIRST + 1;
	public static final int ACTIVITY_REPLIES = Menu.FIRST + 2;
	public static final int ACTIVITY_LOGIN = Menu.FIRST + 3; 
	public static final int ACTIVITY_REFRESH = Menu.FIRST + 4;
	public static final int ACTIVITY_MENU_SCREEN = Menu.FIRST + 5;
	public static final int ACTIVITY_LATEST_TWEETS = Menu.FIRST + 6;
	
	//context menu item IDs
	public static final int CONTEXT_PROFILE = Menu.FIRST;
	public static final int CONTEXT_TWEETS = Menu.FIRST+1;
	public static final int CONTEXT_REPLY = Menu.FIRST+2;
	public static final int CONTEXT_RETWEET = Menu.FIRST+3;
	
  // jaisal account
  	public static final String CONSUMER_KEY = "K4itZ8RH6kPGIlrWhh5BQ";
	public static final String CONSUMER_SECRET = "Ufj3Co5HRvBSXm2J0pqSoMAT8qlS4KgHE57D3ZHJfM";
	
	final public static String ACCESS_TOKEN = "557434688-Ze5YeX33kraRPFYrzEbUINozzyIvXdRflDRsOF7o";

	final public static String TOKEN_SECRET = "2B3pzYflGlgxKAaX8gwQNb3Xna4shEqEFk7tOT4XIA";

	public static final String OAUTH_CALLBACK_SCHEME = "MyInteger";
	public static final String OAUTH_CALLBACK_HOST = "callback";
	//public static final String OAUTH_CALLBACK_URL = OAUTH_CALLBACK_SCHEME+ "://" + OAUTH_CALLBACK_HOST;
	
    public static final String OAUTH_CALLBACK_URL = "http://www.github.com";
	
/*	public static final String CONSUMER_KEY = "TaEGBnzIYEmOIFM5pu4ihA";
	public static final String CONSUMER_SECRET = "SG31d8IGBZiPrRZCZp0LdLfeDA65zB0BRfDNU4qa4";
	
	final public static String ACCESS_TOKEN = "378415892-sriTtkYKqS7CLX8SgXoEN4RBuJGjkrQK2kRcYX07";

	final public static String TOKEN_SECRET = "8MQPjPO5wuCzYizXCfJKSHejSFHislV2YAEL5UuLms";

	public static final String OAUTH_CALLBACK_SCHEME = "MyInteger";
	public static final String OAUTH_CALLBACK_HOST = "callback";
	//public static final String OAUTH_CALLBACK_URL = OAUTH_CALLBACK_SCHEME+ "://" + OAUTH_CALLBACK_HOST;
	
    public static final String OAUTH_CALLBACK_URL = "http://www.github.com";
	*/
	//SharedPreference user logon ID
	public static final String PREFS_NAME = "TwitterLogin";

}