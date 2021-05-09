package dorduncuDers2Odev.adapters;

import dorduncuDers2Odev.abstracts.UserCheckService;
import dorduncuDers2Odev.entities.Gamer;
import dorduncuDers2Odev.mernis.PersonValidation;

public class MernisService implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		PersonValidation personValidation = new PersonValidation();
		
		
		boolean kullaniciKontrolu = true;
		
		try {
			kullaniciKontrolu =personValidation.ValidateByPersonalInfo(gamer.getGamerFirstName(), gamer.getGamerLastName(), gamer.getNationalityId(), gamer.getDateOfBirthday());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kullaniciKontrolu;
	
	}

}
