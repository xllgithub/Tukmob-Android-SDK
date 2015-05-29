package com.tukmob.sdk;

import java.util.List;

public class TukmobUser {
	/**
	 * Recommended.
	 * Exchange-specific ID for the user.At least one of id or
	 * buyerId is recommended.
	 */
	private String tUserId;
	/**
	 * Recommended.
	 * Buyer-specific ID for the user ad mapped by the exchange for
	 * the buyer.At least one of buyerId or id is recommended.
	 */
	private String tUserBuyerid;
	/**
	 * Year of birth as a 4-digit integer.
	 */
	private int tUserYob;
	/**
	 * Gender, where "M" = male,"F" = female,"O" = known to be
	 * other(i.e.,omitted is unknown).
	 */
	private String tUserGender;
	/**
	 * Comma separated list of keywords,interests,or intent.
	 */
	private String tUserKeywords;
	/**
	 * 
	 */
	private String tUserCustomdata;
	/**
	 * Location of the user's home base defined by a Geo object
	 * (Section 3.2.12).This is not necessarily their current location.
	 */
	private TukmobGeo tUserGeo;
	/**
	 * Additional user data.Each Data object(Section 3.2.14)
	 * represents a different data source.
	 */
	private List<Object> tUserData;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tUserExt;
	
	
}
