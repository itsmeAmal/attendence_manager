/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.model;

/**
 *
 * @author personal
 */
import com.google.gson.JsonObject;

public class DataObject {

    JsonObject jo;
    private final String attribute;

    public DataObject(String defaultAttribute) {
        jo = new JsonObject();
        attribute = defaultAttribute;
    }

    public void addProperty(String property, String value) {
        jo.addProperty(property, value);
    }

    public String get(String property) {
        return jo.get(property).getAsString();
    }

    @Override
    public String toString() {
        return get(attribute);
    }

}
