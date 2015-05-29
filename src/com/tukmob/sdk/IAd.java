package com.tukmob.sdk;

import java.io.Serializable;

public interface IAd extends Serializable {
	
	public void setAdType(int adType);
	
	public int getAdType();
}
