package hk.edu.polyu.comp.comp2021.assignment1;

public class BalancedBrackets {

    public static boolean isBalanced(String str) {
        // Task 4: Return true if and only if 'str' 1) is non-empty, 2) contains only
        // the six characters, and 3) is balanced.
        String[] string = str.split("");
        //System.out.println(string[1]); chek point
        int ed = string.length;
        String[] stack = new String[ed];
        for (int i = 0; i < ed; i++) {
            stack[i] = "";
        }
        int insert = 0;
        for (int tag = 0; tag < ed; tag++) {
            if (string[0].equals(")") && string[0].equals("]") && string[0].equals("}")) {
                return false;
            }
            //add into stack
            if (string[tag].equals("(") || string[tag].equals("[") || string[tag].equals("{")) {
                stack[insert] = string[tag];
                continue;
            }
            if (string[tag].equals(")") && stack[insert].equals("(")) {
                stack[insert] = "";
                insert--;
            }
            if (string[tag].equals("]") && stack[insert].equals("[")) {
                stack[insert] = "";
                insert--;
            }
            if (string[tag].equals("}") && stack[insert].equals("{")) {
                stack[insert] = "";
                insert--;
            }
            insert++;
    }
        //System.out.println(stack);
        if (stack[0].equals("")){
            return true;
        }
        return false;
    }
}