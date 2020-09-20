/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.controller;

import com.toedter.calendar.JDateChooser;
import com.sams.model.DataObject;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amal
 */
public class commonController {

    public static java.sql.Date getMysqlDateFromJDateChooser(JDateChooser dateChooser) {
        if (dateChooser.getDate() == null) {
            return null;
        }
        java.sql.Date sqlDate = new java.sql.Date(dateChooser.getDate().getTime());
        return sqlDate;
    }

    public static java.sql.Date getCurrentJavaSqlDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }

    public static java.sql.Time getCurrentJavaSqlTime() {
        java.util.Date date = new java.util.Date();
        return new java.sql.Time(date.getTime());
    }

    public static BigDecimal getBigDecimalOrZeroFromString(String value) {
        if (value != null) {
            value = value.replaceAll(",", "");
        }
        if (isBigDecimal(value)) {
            return new BigDecimal(value);
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static boolean isBigDecimal(String value) {
        try {
            if (value != null) {
                value = value.replaceAll(",", "");
            }
            new BigDecimal(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Date getSqlDateByString(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return new Date(format.parse(date).getTime());
    }

    public static void loadDataToTable(JTable table, ResultSet rst, String[] columnList) throws SQLException {
        DefaultTableModel dtm1 = (DefaultTableModel) table.getModel();
        int rw = dtm1.getRowCount();
        for (int i = 0; i < rw; i++) {
            dtm1.removeRow(0);
        }
        while (rst.next()) {
            Object[] rowCells = new Object[columnList.length];
            for (int i = 0; i < columnList.length; i++) {
                rowCells[i] = rst.getString(columnList[i]);
            }
            dtm1.addRow(rowCells);
        }
        rst.getStatement().close();
        rst.close();
    }

    public static void loadDataToComboBox(JComboBox comboBox, ResultSet rst, String attribute) throws SQLException {
        comboBox.removeAllItems();
        while (rst.next()) {
            comboBox.addItem(rst.getString(attribute));
        }
    }

    public static void loadDataObjectsIntoComboBox(JComboBox comboBox, ResultSet rst, String[] columnList,
            String defaultAttribute) throws SQLException {
        comboBox.removeAllItems();
        while (rst.next()) {
            DataObject object = new DataObject(defaultAttribute);
            for (int i = 0; i < columnList.length; i++) {
                object.addProperty(columnList[i], rst.getString(columnList[i]));
            }
            comboBox.addItem(object);
        }
    }

    public static int getIntOrZeroFromString(String value) {
        if (isInteger(value)) {
            return Integer.parseInt(value);
        } else {
            return 0;
        }
    }

    public static BigDecimal getBigDecimalFromString(String value) {
        return new BigDecimal(value);
    }

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isLong(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isBigdDecimal(String value) {
        try {
            new BigDecimal(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isNotEmpty(String value) {
        return !value.isEmpty();
    }

}
