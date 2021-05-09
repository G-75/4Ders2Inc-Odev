package dorduncuDers2Odev.entities;

import dorduncuDers2Odev.abstracts.Entity;

public class Campaign implements Entity {
	private String campaignName;
	private int campaignPerCent;
	
	public Campaign() {
		
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignPerCent() {
		return campaignPerCent;
	}

	public void setCampaignPerCent(int campaignPerCent) {
		this.campaignPerCent = campaignPerCent;
	}

	public Campaign(String campaignName, int campaignPerCent) {
		super();
		this.campaignName = campaignName;
		this.campaignPerCent = campaignPerCent;
	}

}
