package org.cadenhead.ecommerce;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by viruser on 2018/8/31.
 */
public class CodeKeeper {
    ArrayList list;
    String[] codes = {"alpha", "lamdda", "gamma", "delta", "zeta"};

    public CodeKeeper(String[] userCodes){
        list = new ArrayList();

        for (int i = 0; i < codes.length; i++){
            addCode(codes[i]);
        }

        for (int j = 0; j <userCodes.length; j++){
            addCode(userCodes[j]);
        }

        for (Object name : list)
            System.out.println(name);
    }

    private void addCode(String code){
        if (!list.contains(code)){
            list.add(code);
        }
    }

    public static void main(String[] args){
        String[] adfa = {"lamdda","dfa"};
        CodeKeeper keeper = new CodeKeeper(adfa);
    }
}
