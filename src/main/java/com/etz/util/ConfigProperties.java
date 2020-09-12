/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olugbenga.falodun
 */
public enum ConfigProperties {

    /**
     *
     */
    INSTANCE;

    private final Properties properties;

    ConfigProperties() {
        properties = new Properties();
        try {
            
            String path = System.getProperty("user.dir") + "\\config\\dataset.properties";
            path = path.replace("\\", "/");
            InputStream in = new FileInputStream(path);
            properties.load(in);
            
        } catch (IOException | IllegalArgumentException | NullPointerException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    /**
     *
     * @return string
     */
    public String getStates() {
        return properties.getProperty("states");
    }

}
