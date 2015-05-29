package com.tukmob.sdk;

import java.util.List;

public class TukmobSeatBid {
	
	/**
	 * Required.
	 * Array of 1+Bid objects(Section 4.2.3)each related to an impression.
	 * Multiple bids can relate to the same impression.
	 */
	private List<TukmobBid> tSeatBidBid;
	/**
	 * ID of the bidder seat on whose behalf this bid si made.
	 */
	private String tSeatBidSeat;
	/**
	 * Default 0.
	 * 0 = impressions can be won individually;1 = impressions must be won or lost as a group.
	 */
	private int tSeatBidGroup;
	/**
	 * Placeholder for bidder-specific extensions to OpenRTB.
	 */
	private TukmobExt tukmobExt;
}
