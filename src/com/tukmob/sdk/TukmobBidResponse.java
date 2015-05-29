package com.tukmob.sdk;

import java.util.List;

public class TukmobBidResponse {

	/**
	 * Required.
	 * ID of the bid request or which this is a response.
	 */
	private String tBidResponseId;
	/**
	 * Array of seatbid objects;1+ required if a bid is to be made.
	 */
	private List<Object> tBidResponseSeatbid;
	/**
	 * Bidder generated response ID to assist with logging/tracking.
	 */
	private String tBidResponseBidid;
	/**
	 * Default  "USD"
	 * Bid currency using ISO-4217 alpha codes.
	 */
	private String tBidResponseCur;
	/**
	 * Optional feature to allow a bidder to set data in the exchange's cookie.The string must be in base85 cookie safe
	 * characters and be in any format.Proper JSON encoding must be used to include "escaped" quotation marks.
	 */
	private String tBidResponseCustomdata;
	/**
	 * Reason for not bidding.Refer to List 5.19.
	 */
	private int tBidResponseNbr;
	/**
	 * Placeholder for bidder-specific extensions to OpenRTB.
	 */
	private TukmobExt tBidResponseExt;
}
