package au.edu.unsw.soacourse.onboardingservice;

import javax.jws.WebService;

@WebService(endpointInterface = "au.edu.unsw.soacourse.onboardingservice.OnboadrdingValidationService")
public class OnboadrdingValidationServiceImpl implements OnboadrdingValidationService {

	@Override
	public ValidateAddressResponse validateAddress(ValidateAddressRequest request) throws ValidateAddressFaultMsg {
		if (request.getHouseNumber() != null && request.getHouseNumber().equals("455")) {
			ValidateAddressResponse response = new ValidateAddressResponse();
			response.setCouncilName("Sydney");
			return response;
		} else {
			ServiceFaultType validateAddressFault = new ServiceFaultType();
			validateAddressFault.errcode = "800";
			validateAddressFault.errtext = "Invalid Address";
			ValidateAddressFaultMsg validateAddressFaultMsg = new ValidateAddressFaultMsg("Validation Error",
					validateAddressFault);
			throw validateAddressFaultMsg;
		}
	}

	@Override
	public ValidateDriverLicenseResponse validateDriverLicense(ValidateDriverLicenseRequest request)
			throws ValidateDriverLicenseFaultMsg {
		String licenseNumber = request.getDriverLicenseNumber();

		if (!licenseNumber.matches("^[0-9]{8}$")) {
			throw new ValidateDriverLicenseFaultMsg("Fault Message must be 8 digits");
		}
		
		ValidateDriverLicenseResponse response = new ValidateDriverLicenseResponse();
		response.setDriverName("Linus");

		return response;
	}
}
