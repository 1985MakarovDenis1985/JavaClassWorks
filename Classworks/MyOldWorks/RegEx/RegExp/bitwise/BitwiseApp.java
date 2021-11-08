package old.unitTests.RegExp.bitwise;

public class BitwiseApp {

    public static void main(String[] args) {
//        int x = 3;
//        int z = x << 3;
//        System.out.println(z);
//
//        x = 24;
//        z = x >> 3;
//        System.out.println(z);
//        System.out.println("=========================");

        int secretKey = 84;
        int massage = 5647;
        int encrypt = massage ^ secretKey;
        System.out.println(encrypt);
        System.out.println(Integer.toBinaryString(massage));
        System.out.println(Integer.toBinaryString(secretKey));
        System.out.println(Integer.toBinaryString(encrypt));

        int decrypt = encrypt ^ secretKey;
        System.out.println(decrypt);



    }
}
