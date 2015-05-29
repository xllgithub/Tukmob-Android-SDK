package com.tukmob.sdk;

public class TukmobGeo {
	
	/**
	 * Latitude from -90.0 to +90.0,where negative is south.
	 */
	private float tGeoLat;
	/**
	 * Longitude from -180.0 to +180.0,where negative is west.
	 */
	private float tGeoLon;
	/**
	 * Source of location data;recommended when passing lat/lon.Refer to List 5.16.
	 */
	private int tGeoType;
	/**
	 * Country code using ISO-3166-1-alpha-3.
	 */
	private String tGeoCountry;
	/**
	 * Region code using ISO-3166-2;2-letter state code if USA.
	 */
	private String tGeoRegion;
	/**
	 * Region of a country using FIPS 10-4 notation.While OpenRTB supports this
	 * attribute,it has been withdrawn by NIST in 2008.
	 */
	private String tGeoRegionfips104;
	/**
	 * Google metro code;similar to but not exactly Nielsen DMAs.
	 * See Appendix A for a link to the codes.
	 */
	private String tGeoMetro;
	/**
	 * City using United Nations Code for  Trade&Transport Location.
	 * See Appendix A for a link to the codes.
	 */
	private String tGeoCity;
	/**
	 * Zip or postal code.
	 */
	private String tGeoZip;
	/**
	 * Local time as the number +/- of minutes from UTC.
	 */
	private int tGeoUtcoffset;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tGeoExt;
	
}
