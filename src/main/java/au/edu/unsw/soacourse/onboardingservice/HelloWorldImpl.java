
package au.edu.unsw.soacourse.onboardingservice;

import javax.jws.WebService;

@WebService(endpointInterface = "au.edu.unsw.soacourse.onboardingservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

