package com.tukmob.sdk;

import java.util.List;

public class TukmobDeal {

	/**
	 * Required.
	 * A unique identifier for the direct deal.
	 */
	private String tDealId;
	/**
	 * default 0.
	 * Minimum bid for this impression expressed in CPM.
	 */
	private float tDealBidfloor;
	/**
	 * default "USD".
	 * Currency specified using ISO-4217 alpha codes.This may be different from bid
	 * currency returned by bidder if this is allowed by the exchange.
	 */
	private String tDealBidfloorcur;
	/**
	 * Optional override of the overall auction type or the bid request,
	 * where 1 = First Price,2 = Second Price Plus,3 = the value passed in bidfloor is 
	 * the agreed upon deal price.Additional auction types can be defined by the exchange.
	 */
	private int tDealAt;
	/**
	 * Whitelist of buyer seats allowed to bid on this deal.Seat IDs must be communicated
	 * between bidders and the exchange a priori.Omission implies no seat restrictions.
	 */
	private List<String> tDealWseat;
	/**
	 * Array of advertiser domains(e.g.,advertiser.com)allowed to bid on this deal.
	 * Omission implies no advertiser restrictions.
	 */
	private List<String> tDealWadomain;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tDealExt;
}
