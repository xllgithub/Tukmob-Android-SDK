package com.tukmob.sdk;

public class TukmobNative {
	
	/**
	 * Required.
	 * Request payload complying with the Native Ad Specification.
	 */
	private String tNativeRequest;
	/**
	 * Recommended.
	 * Version of the Native Ad Specification to which request complies;
	 * highly recommended for efficient parsing.
	 */
	private String tNativeVer;
	/**
	 * List of supported API framworks for this impression.Refer to List 5.6.If an API
	 * is not explicitly listed,it is assumed not to be supported.
	 */
	private int[] tNativeApi;
	/**
	 * Blocked creative attributes.Refer to List 5.3.
	 */
	private int[] tNativeBattr;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tukmobExt;
	
}
