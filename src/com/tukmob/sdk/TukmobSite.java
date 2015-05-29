package com.tukmob.sdk;

import java.util.List;

public class TukmobSite {
	
	/**
	 * Exchange-specific site ID.
	 * Recommended
	 */
	private String tSiteId;
	/**
	 * Site name(may be aliased at the publisher's request).
	 */
	private String tSiteName;
	/**
	 * Domain of the site(e.g.,"mysite.foo.com").
	 */
	private String tSiteDomain;
	/**
	 * Array of IAB content categories of the site.Refer to List 5.1.
	 */
	private List<String> tSiteCat;
	/**
	 * Array of IAB content categories that describe the current page 
	 * of the site.Refer to List 5.1.
	 */
	private List<String> tSiteSectioncat;
	/**
	 * Array of IAB content categories that describe the current page
	 * or view of the site.Refer to List 5.1.
	 */
	private List<String> tSitePagecat;
	/**
	 * URL of the page where the impression will be shown.
	 */
	private String tSitePage;
	/**
	 * Referrer URL that caused navigation to the current page.
	 */
	private String tSiteRef;
	/**
	 * Search String that caused navigation of the current page.
	 */
	private String tSiteSearch;
	/**
	 * Mobile-optimized signal,where 0 = no,1 = yes.
	 */
	private int tSiteMobile;
	/**
	 * Indicates if the site has a privacy policy,where 0  = no,1 = yes.
	 */
	private int tSitePrivacypolicy;
	/**
	 * Details about the Publisher(Seaction3.2.8)of the site.
	 */
	private TukmobPublisher tSitePublisher;
	/**
	 * Details about the Content(Section 3.2.9)within the site.
	 */
	private TukmobContent tSiteContent;
	/**
	 * Comma separated list of keywords about the site.
	 */
	private String tSiteKeywords;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tSiteExt;
	
	
}
