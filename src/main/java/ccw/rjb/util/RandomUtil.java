package ccw.rjb.util;

import java.util.Random;
import java.util.UUID;

/**
 * @author 陈翔
 */
public class RandomUtil {

    public static Integer getInteger(int start,int end){
        Random rand = new Random();
        return rand.nextInt(end)+ start;
    }

    public static String getString(){
        return UUID.randomUUID().toString().replace("-", "_");
    }

}
