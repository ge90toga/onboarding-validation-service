package au.edu.unsw.soacourse.onboardingservice;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

