package com.tukmob.sdk;

import java.util.List;

public class TukmobVideo {
	
	/**
	 * Required.
	 * Content MIME types supported.Popular MIME types may include"video/x-ms-wmv"
	 * for Windows Media and "video/x-flv" for Flash Video.
	 */
	private List<String> tVideoMimes;
	/**
	 * Recommended
	 * Minimum video ad duration in seconds.
	 */
	private int tVideoMinduration;
	/**
	 * Recommended.
	 * Maximum video ad duration in seconds.
	 */
	private int tVideoMaxduration;
	/**
	 * Deprecated.
	 */
	@Deprecated
	private int tVideoProtocol;
	/**
	 * Recommended.
	 * Array of supported video bid response protocols.Refer to List 5.8.At leastone supported
	 * protocol must be specified in either the protocol or protocols attribute.
	 */
	private int [] tVideoProtocols;
	/**
	 * Recommended.
	 * Width of the video player in pixels.
	 */
	private int tVideoWidth;
	/**
	 * Recommended.
	 * Height of the video player in pixels.
	 */
	private int tVideoHeight;
	/**
	 * Recommended.
	 * Indicates the start delay in seconds for pre-roll,mid-roll,or post-roll ad placements.
	 * Refer to List 5.10 for additional generic values.
	 */
	private int tVideoStartdelay;
	/**
	 * Indicates if the impression must be linear,nonlinear,etc.
	 * If none specified,assume all are allowed.Refer to List5.7.
	 */
	private int tVideoLinearity;
	/**
	 * If multiple ad impressions are offered in the same bid request,the sequence
	 * number will allow for the coordinated delivery of multiple creatives.
	 */
	private int tVideoSequence;
	/**
	 * Blocked creatvie attributes.Refer to List 5.3.
	 */
	private int[] tVideoBattr;
	/**
	 * Maximum extended video ad duration if extension is allowed.If blank or 0,extension is not
	 * allowed.If-1,extension id allowed,and there is no time limit imposed.if greater than 0,then
	 * the value represents the number of seconds of extended play supported beyond the maxduration value.
	 */
	private int tVideoMaxextended;
	/**
	 * Minimum bit rate in Kbps.Exchange may set this dynamically
	 * or universally across their set of publishers.
	 */
	private int tVideoMaxbitrate;
	/**
	 * default 1.
	 * Indicates if letter-boxing of 4:3 content into a 16:9 window is allowed,where 0 = no,1 = yes.
	 */
	private int tVideoBoxingallowed;
	/**
	 * Allowed playback methods.If none specified,assume all are allowed.refer  to List 5.9.
	 */
	private int[] tVideoDelivery;
	/**
	 * Ad position on screen.Refer to List 5.4.
	 */
	private int tVideoPos;
	/**
	 * Array of Banner objects(Section3.2.3)if companion ads are available.
	 */
	private List<Object> tVideoCompanionad;
	/**
	 * List of supported API frameworks for this impression.Refer to List 5.6.If an API
	 * is not explicitly listed,it is assumed not to be supported.
	 */
	private int[] tVideoApi;
	/**
	 * Supported VAST companion ad types.Refer to List 5.12.Recommended if companion 
	 * Banner objects are included via the companionad array.
	 */
	private int[] tVideoCompaniontype;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tVideoExt;
	
	
	
	
}
