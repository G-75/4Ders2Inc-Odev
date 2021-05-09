package dorduncuDers2Odev.conretes;

import dorduncuDers2Odev.abstracts.CampaignService;
import dorduncuDers2Odev.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Kampanya eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Kampanya silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Kampanya güncellendi.");
		
	}

}
