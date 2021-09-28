package hk.edu.polyu.comp.comp2021.assignment1;

public class MiniFloat {

    public static void main(String[] args){
        System.out.println(numIntegralMiniFloats());
    }

    public static float miniFloatFromString(String bitSequence) {
        // Task 1: compute the miniFloat value from "bitSequence";
        String[] string = bitSequence.split("");
        int[] str = new int[8];
        for (int i = 0; i < string.length; i++) {
            str[i] = Integer.parseInt(string[i]);
        }
        double out = 0.5*str[5] + 0.25*str[6] + 0.125*str[7];//mantissa
        double out2 = 8*str[1] + 4*str[2] + 2*str[3] + 1*str[4];//exponent
        double result  = (out+1) * Math.pow(2,out2);
        if(str[0]==1){
            result  = -result;}
        System.out.println(result);
        return (float) result;
    }

    public static int numIntegralMiniFloats() {
        int count = 0;
        // Task 2: return the number of integral miniFloat values
        for(String s: getValidMiniFloatBitSequences()){
          float ss = MiniFloat.miniFloatFromString(s);
          if(ss % 1 == 0){count++;}
        }
        return count;
    }

    /**
     * Get all valid bit sequences for miniFloat values.
     */
    private static String[] getValidMiniFloatBitSequences(){
        int nbrValues = (int)Math.pow(2, MINI_FLOAT_SIZE);

        String[] result = new String[nbrValues];
        for(int i = 0; i < nbrValues; i++){
            result[i] = String.format("%" + MINI_FLOAT_SIZE + "s", Integer.toBinaryString(i))
                    .replace(' ', '0');
        }
        return result;
    }

    private static int MINI_FLOAT_SIZE = 8;
}