package com.example.coderscodes.todos.components;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ComponentScanner {
    public static List<Object> scan(String basePackage) throws Exception {
        List<Object> beans = new ArrayList<>();
        String basePath = basePackage.replace('.', '/');
        String classpath = ComponentScanner.class.getClassLoader().getResource(basePath).getPath();
        for (String className : ClassFinder.find(basePackage)) {
            Class<?> clazz = Class.forName(className);
            if (clazz.isAnnotationPresent(Component.class)) {
                Constructor<?> constructor = clazz.getConstructor();
                Object bean = constructor.newInstance();
                beans.add(bean);
            }
        }
        return beans;
    }
}
