/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz;

import com.etz.util.ConfigProperties;

/**
 *
 * @author Olugbenga.Falodun
 */
public class Reader {

    public static void main(String[] args) {
            String states = ConfigProperties.INSTANCE.getStates();
            System.out.println("states :: " + states);
    }
}
