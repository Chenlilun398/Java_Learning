package com.java.test;

/**
 * Created by viruser on 2018/8/28.
 */
public class Logger {
    public String format;

    public String getFormat(){
        return this.format;
    }

    public void setFormat(String fmt) {
        if( (fmt.equals("common") ) || (fmt.equals("combined"))) {
            this.format = fmt;
        }
    }
}
