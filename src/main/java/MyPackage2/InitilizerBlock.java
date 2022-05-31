package MyPackage2;
/* *Intilaizer block intilize the instance member when object created
    It calls before contructor
    Intilazer blocker has no return type
 */
public class InitilizerBlock {
    int a;
    int b;
    {
        System.out.println("Before constructor");
         a++;
         b++;

    }
    static {
        int a=10;
        int b=11;
        System.out.println("Static block called" +a+" "+b );
    }
    InitilizerBlock(){
        System.out.println("After initilalizer block value of a and b"+a+ " " +b);
    }

}
class Driver{
    public static void main(String x []){
        InitilizerBlock obj = new InitilizerBlock();
        EnumPractice [] signals = EnumPractice.values();
        for( EnumPractice signal : signals){
            System.out.println("Name : "+  signal.name() + " action : "+ signal.getAction());

        }
    }
}

