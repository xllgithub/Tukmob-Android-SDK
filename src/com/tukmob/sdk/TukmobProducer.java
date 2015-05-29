package com.tukmob.sdk;

import java.util.List;

public class TukmobProducer {

	/**
	 * Content producer or originator ID.Useful if content is syndicated
	 * and may be posted on a site using embed tags.
	 */
	private String tProducerId;
	/**
	 * Content producer or originator name(e.g.,"Warner Bros").
	 */
	private String tProducerName;
	/**
	 * Array of IAB content categories thar describe the content producer.Refer to List 5.1.
	 */
	private List<String> tProducerCat;
	/**
	 * Highest level domain of the content producer(e.g.,"producer.com").
	 */
	private String tProducerDomain;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tProducerExt;
}
