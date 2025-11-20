package com.in28minutes.learn_spring_framework.RealWorldSpringContextLauncherAppJakartaCDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MySqlDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11,22,33,44,55};
    }
}
