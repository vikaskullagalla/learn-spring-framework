package com.in28minutes.learn_spring_framework.RealWorldSpringContextLauncherApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    @Autowired //Field injection
    private DataService dataService;

    /*
    //    Constructor injection
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    */

    /*
    @Autowired //Setter injection
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
    */

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
