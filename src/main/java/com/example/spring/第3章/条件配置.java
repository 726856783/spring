package com.example.spring.第3章;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class 条件配置 implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getEnvironment() != null) {
            MultiValueMap<String, Object> multiValueMap = metadata.getAllAnnotationAttributes(Profile.class.getName());
            if (multiValueMap != null) {
                for (Object value : multiValueMap.get("配置值")) {
                    if (context.getEnvironment().acceptsProfiles((String[]) value)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
