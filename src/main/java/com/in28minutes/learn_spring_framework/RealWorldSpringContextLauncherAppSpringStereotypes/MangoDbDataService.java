package com.in28minutes.learn_spring_framework.RealWorldSpringContextLauncherAppSpringStereotypes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository // Indicates an annotated class is used to retrieve and manipulate data from a database
public class MangoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
