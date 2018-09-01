package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/31.
 */
public class HexReader {
    String[] input = {"0005FFFFFFFFF", "135F4545AD", "65846DD2545"};

    public static void main (String[] args) {
        HexReader hex = new HexReader();
        for (int i = 0; i < hex.input.length; i++)
            hex.readLine(hex.input[i]);
    }

    void readLine(String code){
        try {
            for (int j = 0; j + 1 < code.length(); j += 2){
                String sub = code.substring(j, j + 2);
                int num = Integer.parseInt(sub, 16);
                if (num == 255) {
                    return;
                }
                System.out.print(num + " ");
            }
        }finally {
            System.out.println("**");
        }
        return;
    }
}
