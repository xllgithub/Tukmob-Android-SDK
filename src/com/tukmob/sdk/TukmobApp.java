package com.tukmob.sdk;

import java.util.List;

public class TukmobApp {
	
	/**
	 * recommended
	 * Exchange-specific app ID.
	 */
	private String tAppId;
	/**
	 * App name (may be aliased at the publisher¡¯s request).
	 */
	private String tAppName;
	/**
	 * Application bundle or package name (e.g., com.foo.mygame);
	 * intended to be a unique ID across exchanges.
	 */
	private String tAppBundle;
	/**
	 * Domain of the app (e.g., ¡°mygame.foo.com¡±).
	 */
	private String tAppDomain;
	/**
	 * App store URL for an installed app;
	 */
	private String tAppStoreurl;
	/**
	 * Array of IAB content categories of the app.
	 */
	private List<String> tAppCat;
	/**
	 * Array of IAB content categories that describe the current 
	 * section of the app. Refer to List 5.1.
	 */
	private List<String> tAppSectioncat;
	/**
	 * Array of IAB content categories that describe the current page 
	 * or view of the app. Refer to List 5.1.
	 */
	private List<String> tAppPagecat;
	/**
	 * Application version;
	 */
	private String tAppVer;
	/**
	 * Indicates if the app has a privacy policy, where 0 = no, 1 = yes.
	 */
	private int tAppPrivacypolicy;
	/**
	 * 0 = app is free, 1 = the app is a paid version.
	 */
	private int tAppPaid;
	private TukmobPublisher tAppPublisher;
	private TukmobContent tAppContent;
	/**
	 * Comma separated list of keywords about the app.
	 */
	private String tAppKeywords;
	
	private TukmobExt tAppExt;
	
}
