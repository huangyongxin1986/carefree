package classDefine;

/**
 * Created by cb on 2016/5/20.
 */
public class StaticClass {
    private static int mPrivateValue = 0;

    public static int getMockValue() {
        mPrivateValue = mPrivateValue + 10;
        return mPrivateValue;
    }

    public static void setRealValue(int value){
        mPrivateValue = value;
    }

    public static int getRealValue(){
        return mPrivateValue;
    }
}
