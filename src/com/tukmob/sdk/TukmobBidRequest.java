package com.tukmob.sdk;

import java.util.List;

public class TukmobBidRequest {
	/**
	 * required
	 */
	private String tBidRequestId;
	/**
	 * required
	 */
	private TukmobImp bidRequestImp;
	/**
	 * recommended
	 */
	private TukmobSite bidRequestSite;
	/**
	 * recommended
	 */
	private TukmobApp bidRequestApp;
	/**
	 * recommended
	 */
	private TukmobDevice bidRequestDevice;
	/**
	 * recommended
	 */
	private TukmobUser bidRequestUser;
	/**
	 * default 0
	 * where 0 = live mode, 1 = test mode.
	 */
	private int bidRequestTest;
	/**
	 * default 2
	 * Auction type,where 1= First Price,2 = Second Price Plus.
	 */
	private int bidRequestAt;
	private int bidRequestTmax;
	private List<String> bidRequestWseat;
	private int bidRequestAllimps;
	private List<String> bidRequestCur;
	private List<String> bidRequestBcat;
	private List<String> bidRequestBadv;
	private TukmobRegs bidRequestRegs;
	private TukmobExt bidRequestExt;
	
}
