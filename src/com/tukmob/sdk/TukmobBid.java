package com.tukmob.sdk;

import java.util.List;

public class TukmobBid {
	
	/**
	 * Required.
	 * Bidder generated bid ID to assist with logging/tracking.
	 */
	private String tBidId;
	/**
	 * Required.
	 * ID of the Imp object in the related bid request.
	 */
	private String tBidImpid;
	/**
	 * Required.
	 * Bid price expressed ad CPM although the actual transaction is for a unit
	 * impression only.Note that while the type indicates float,integer math is 
	 * highly recommended when handling currencies(e.g.,BigDecimal in java).
	 */
	private String tBidPrice;
	/**
	 * ID of a preloaded ad to be served if the bid wins.
	 */
	private String tBidAdid;
	/**
	 * Win notice URL called by the exchange if the bid wins;
	 * optional means of serving ad markup.
	 */
	private String tBidNurl;
	/**
	 * Optional means of conveying ad markup in case the bid wins;
	 * supersedes the win notice if markup is included in both.
	 */
	private String tBidAdm;
	/**
	 * Advertiser domain for block list checking(e.g.,"ford.com").This can be an array of for
	 * the case of rotating creatives.Exchanges can mandate that only one domain is allowed.
	 */
	private List<String> tBidAdomain;
	/**
	 * Bundle or package name(e.g.,com.foo.mygame)of the app being advertised,
	 * if application;intended to be a unique ID across exchanges.
	 */
	private String tBidBundle;
	/**
	 * URL without cache-busting to an image that is representative 
	 * of the content of the campaign for ad quality/safety checking.
	 */
	private String tBidIurl;
	/**
	 * Campaign ID assist with ad quality checking;the collection of 
	 * creatives for which iurl should be representative.
	 */
	private String tBidCid;
	/**
	 * Creative ID to assist with ad quality checking.
	 */
	private String tBidCrid;
	/**
	 * IAB content categories of the creative.Refer to List 5.1.
	 */
	private List<String> tBidCat;
	/**
	 * Set of attributes describing the creative.Refer to List 5.3.
	 */
	private int[] tBidAttr;
	/**
	 * Reference to the deal.id from the bid request if this bid pertains 
	 * to a private marketplace direct deal.
	 */
	private String tBidDealid;
	/**
	 * Height of the creative in pixels.
	 */
	private int tBidCreateHeight;
	/**
	 * width of the creative in pixels.
	 */
	private int tBidCreateWidth;
	/**
	 * Placeholder for bidder-specific extensions to OpenRTB.
	 */
	private TukmobExt tBidExt;
	
}
