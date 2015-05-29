package com.tukmob.sdk;

import java.util.List;

public class TukmobPublisher {
	
	/**
	 * Exchange-specific publisher ID.
	 */
	private String tPlublisherId;
	/**
	 * Publisher name (may be aliased at the publisher¡¯s request).
	 */
	private String tPlublisherName;
	/**
	 * Array of IAB content categories that describe the publisher.
	 * Refer to List 5.1.
	 */
	private List<String> tPlublisherCat;
	/**
	 * Highest level domain of the publisher (e.g., ¡°publisher.com¡±).
	 */
	private String tPlublisherDomian;
	
	private TukmobExt tPlublisherExt;
	
}
