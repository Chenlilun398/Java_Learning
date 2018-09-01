package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/31.
 */
public class Comic {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor){
        price = basePrice * factor;
    }
}
