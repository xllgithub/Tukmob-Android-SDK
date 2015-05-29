package com.tukmob.sdk;

import java.util.List;

public class TukmobData {
	
	/**
	 * Exchange-specific Id for the data provider.
	 */
	private String tDataId;
	/**
	 * Exchange-specific name for the data provider.
	 */
	private String tDataName;
	/**
	 * Array of Segment (Section 3.2.15)objects that contain the actual data values.
	 */
	private List<Object> tDataSegment;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tDataExt;
	
}
