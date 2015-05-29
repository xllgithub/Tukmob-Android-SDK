package com.tukmob.sdk;

import java.util.List;

public class TukmobPmp {
	
	/**
	 * Indicator of auction eligibility to seats named in the Direct Deals object,
	 * where 0 = all bids are accepted,1 = bids are restricted to the deals specified
	 * and the terms thereof.
	 */
	private int tPmpPrivate_auction;
	/**
	 * Array of Deal(Section 3.2.18)objects that convey the specific deals applicaable to this impression.
	 */
	private List<Object> tPmpDeals;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tPmpExt;
	
}
