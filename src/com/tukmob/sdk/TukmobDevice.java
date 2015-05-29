package com.tukmob.sdk;

public class TukmobDevice {
	
	/**
	 * Recommended.
	 * Browser user agent string.
	 */
	private String tDeviceUa;
	/**
	 * Recommended.
	 * Location of the device assumed to be the user's cuttent
	 * loctin defined by a Geo object.
	 */
	private TukmobGeo tDeviceGeo;
	/**
	 * Recommended.
	 * Standard "Do Not Track" flag as set in the header by the
	 * browser,where 0 = tracking is unrestricted,1 = do not track.
	 */
	private int tDeviceDnt;
	/**
	 * Recommended.
	 * "Limit Ad Tracking"signal commercially endorsed(e.g.,IOS,Android),
	 * where 0 = tracking is unrestricted,1 = tracking must be limited
	 * per commercial guidelines.
	 */
	private int tDevicelmt;
	/**
	 * Recommended.
	 * IPv4 address closest to device.
	 */
	private String tDeviceIP;
	/**
	 * IP address closest to device ad IPv6.
	 */
	private String tDeviceIPv6;
	/**
	 * The general type of device.Refer to List 5.17.
	 */
	private int tDeviceType;
	/**
	 * Device make(e.g., "Apple").
	 */
	private String tDeviceMake;
	/**
	 * Device model(e.g.,"iphone").
	 */
	private String tDeviceModel;
	/**
	 * Device operating system(e.g.,"IOS").
	 */
	private String tDeviceOS;
	/**
	 * Device operating system version(e.g.,"3.1.2").
	 */
	private String tDeviceOSV;
	/**
	 * Hardware version of the device(e.g.,"5S"for iphone 5S).
	 */
	private String tDeviceHWV;
	/**
	 * Physical height of the screen in pixels.
	 */
	private int tDeviceScreenHeight;
	/**
	 * Physical width of the screen in pixels.
	 */
	private int tDeviceScreenWidth;
	/**
	 * Screen size ad pixels per linearinch.
	 */
	private int tDeviceScreenPPI;
	/**
	 * The ratio of physical pixels to device independent pixels.
	 */
	private float tDevicePxratio;
	/**
	 * Support for JavaScript, where 0 = no,1 = yes.
	 */
	private int tDeviceJS;
	/**
	 * Version of Flash supported by the browser.
	 */
	private String tDeviceFlashver;
	/**
	 * Browser language using ISO-639-1-alpha-2.
	 */
	private String tDeviceLanguage;
	/**
	 * Carrier or ISP(e.g.,"VERIZON")."WIFI" is often used in mobile
	 * to indicate high bandwidth(e.g.,video friendly vs.cellular).
	 */
	private String tDeviceCarrier;
	/**
	 * Network connection type.Refer to List 5.18.
	 */
	private int tDeviceConnectiontype;
	/**
	 * ID sanctioned ofr advertiser use in the clear(i.e.,not hashed).
	 */
	private String tDviceIfa;
	/**
	 * Hardware device ID(e.g.,IMEI);hashed via SHA1.
	 */
	private String tDeviceDidsha1;
	/**
	 * Hardware device ID(e.g.,IMEI);hashed via MD5.
	 */
	private String tDeviceDidmd5;
	/**
	 * Platform device Id (e.g.,Android ID);hashed via SHA1.
	 */
	private String tDeviceDpidsha1;
	/**
	 * Platform device ID (e.g.,Android ID);hashed via MD5.
	 */
	private String tDeviceDpidmd5;
	/**
	 * MAC address of the device;hashed via SHA1.
	 */
	private String tDeviceMacsha1;
	/**
	 * MAC address of the device;hashed via MD5.
	 */
	private String tDeviceMacmd5;
	/**
	 * Placeholder for exchanger-specific extensions to OpenRTB.
	 */
	private TukmobExt tDevice;
	
	
	
}
