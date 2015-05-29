package com.tukmob.sdk;

import java.util.List;

public class TukmobImp {
	/**
	 * required
	 */
	private String tImpId;
	private TukmobBanner tImpBanner;
	private TukmobVideo tImpVideo;
	private TukmobNative tImpNative;
	private String tImpDisplaymanager;
	private String tImpDisplaymanagerver;
	/**
	 * default 0, 1 = the ad is interstitial or full screen,
	 * 0 = not interstitial.
	 */
	private int tImpInstl = 0;
	private String tImpTagid;
	/**
	 * default 0, Minimum bid for this impression expressed in CPM.
	 */
	private float tImpBidfloor = 0;
	/**
	 * default "USD";
	 * Currency specified using ISO-4217 alpha codes. 
	 * This may be different from bid currency 
	 * returned by bidder if this is 
	 * allowed by the exchange.
	 */
	private String tImpBidfloorcur = "USD";
	private int tImpSecure;
	private List<String> tImpIframebuster;
	private TukmobPmp tImpPmp;
	private TukmobExt tImpExt;
	
}
