package com.tukmob.sdk;

import java.util.List;

public class TukmobContent {
	
	/**
	 * ID uniquely identifying the content.
	 */
	private String tContentID;
	/**
	 * Episode number(typically applies to video content).
	 */
	private int tContentEpisode;
	/**
	 * Content title.
	 * Video Examples:"Search Committee"(television)."A New Hope"(movie),or "Endgame"(made for web).
	 * Non-video example:"Why an Antarctic Glacier Is Melting So Quickly"(Time magazine article).
	 */
	private String tContentTitle;
	/**
	 * Content Series.
	 * Video Examples:"The Office"(television),"Start Wars"(movie),or "Arby 'N' The Chief"(made for web).
	 * Non-Video Example:"Ecocentric"(Time Magazine blog).
	 */
	private String tContentSeries;
	/**
	 * Content season;typically for video content(e.g.,"Season 3").
	 */
	private String tContentSeason;
	/**
	 * Details about the content Producer(Senson 3.2.10);
	 */
	private TukmobProducer tContentProducer;
	/**
	 * URL of the content,for buy-side contextualization or review.
	 */
	private String tContentUrl;
	/**
	 * Array of IAB content categories that describe the content producer.Refer to List 5.1.
	 */
	private List<String> tContentCat;
	/**
	 * Video quality per IAB'sclassification.Refer to List 5.11.
	 */
	private int tContentVideoquality;
	/**
	 * Type of content(game,video,text,etc.).Refer to List 5.14.
	 */
	private int tContentContext;
	/**
	 * Content rating(e.g.,MAPP).
	 */
	private String tContentrating;
	/**
	 * Media rating per QAG guidelines.Refer to List 5.15.
	 */
	private int tContentQagmediarating;
	/**
	 * Comma separated list or keywords describing the content.
	 */
	private String tContentKeywords;
	/**
	 * 0 = not live,1 = content is live(e.g.,stream,live blog).
	 */
	private int tContentLivestream;
	/**
	 * 0 = indirect,1 = direct.
	 */
	private int tContentSourcerelationship;
	/**
	 * Length of content ins seconds ;appropriate for video or audio.
	 */
	private int tContentLen;
	/**
	 * Content language using ISO-639-1-alpha-2.
	 */
	private String tContentLanguage;
	/**
	 * Indicator of whether or not the content is embeddable(e.g.,an embeddable video
	 * player),where 0 = no,1 = yes.
	 */
	private int tContentEmbeddable;
	/**
	 * Placeholder for exchange-specific extensions to OpenRTB.
	 */
	private TukmobExt tContentExt;
	
	
}
