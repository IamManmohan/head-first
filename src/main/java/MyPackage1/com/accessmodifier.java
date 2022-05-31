package MyPackage1.com;

import MyPackage2.InitilizerBlock;

public class accessmodifier {
    public  int publicVariable=1;
    private int privateVariable=2;
    protected int protectedVariable=1;
    int defaultVariable=1;

    public void showData(){
        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
    }


}
class WithinSameClass{
    public void withinClassShowData(){
        System.out.println();
    }
}

