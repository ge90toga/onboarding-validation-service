
package au.edu.unsw.soacourse.onboardingservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.4
 * 2017-03-16T16:41:52.425+11:00
 * Generated source version: 3.0.4
 */

@WebFault(name = "ValidateDriverLicenseFault", targetNamespace = "http://onboardingservice.soacourse.unsw.edu.au")
public class ValidateDriverLicenseFaultMsg extends Exception {
    
    private au.edu.unsw.soacourse.onboardingservice.ServiceFaultType validateDriverLicenseFault;

    public ValidateDriverLicenseFaultMsg() {
        super();
    }
    
    public ValidateDriverLicenseFaultMsg(String message) {
        super(message);
    }
    
    public ValidateDriverLicenseFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateDriverLicenseFaultMsg(String message, au.edu.unsw.soacourse.onboardingservice.ServiceFaultType validateDriverLicenseFault) {
        super(message);
        this.validateDriverLicenseFault = validateDriverLicenseFault;
    }

    public ValidateDriverLicenseFaultMsg(String message, au.edu.unsw.soacourse.onboardingservice.ServiceFaultType validateDriverLicenseFault, Throwable cause) {
        super(message, cause);
        this.validateDriverLicenseFault = validateDriverLicenseFault;
    }

    public au.edu.unsw.soacourse.onboardingservice.ServiceFaultType getFaultInfo() {
        return this.validateDriverLicenseFault;
    }
}
