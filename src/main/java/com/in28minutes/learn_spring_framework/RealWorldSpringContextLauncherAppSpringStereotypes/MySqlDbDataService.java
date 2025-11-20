package com.in28minutes.learn_spring_framework.RealWorldSpringContextLauncherAppSpringStereotypes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository // Indicates an annotated class is used to retrieve and manipulate data from a database
public class MySqlDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11,22,33,44,55};
    }
}
