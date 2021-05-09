package dorduncuDers2Odev.mernis;

import java.time.LocalDate;

public class PersonValidation {
	
	public boolean ValidateByPersonalInfo(String nationalId, String firstName, String lastName, LocalDate dateOfBirthday)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}

}
