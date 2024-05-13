package com.example.coderscodes.todos.components;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ClassFinder {
    public static List<String> find(String basePackage) {
        List<String> classNames = new ArrayList<>();
        String basePath = basePackage.replace('.', '/');
        String classpath = ClassFinder.class.getClassLoader().getResource(basePath).getPath();
        File baseDir = new File(classpath);
        for (File file : baseDir.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".class")) {
                String className = basePackage + '.' + file.getName().replace(".class", "");
                classNames.add(className);
            }
        }
        return classNames;
    }
}
