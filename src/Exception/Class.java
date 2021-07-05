package Exception;

public class Class {

    static String str = "a";


    void method1(){
        try{
            method2();
        } catch(Exception e){
            str += "b";
        }

    }

    void method2() throws Exception{
        try{
            method3();
            str += "c";
        } catch (Exception e ){
            throw  new Exception();
        }
        finally {
            str += "d";
        }
        method3();
    }

    void method3() throws Exception{
        throw  new Exception();
    }



    public static void main(String[] args) {
        new Class().method1();
        System.out.println(str);
    }
}
	

