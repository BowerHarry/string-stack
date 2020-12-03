/** A stack abstract data type that contains Strings. */
public class StringStack {
    String[] stack;
    public StringStack(int capacity) {
        stack = new String[capacity];
    }

    /**
     * Puts the given String on top of the stack (if there is enough space).
     * @param s the String to add to the top of the stack
     * @return false if there was not enough space in the stack to add the string;
     *         otherwise true
     */
    public boolean push(String s) {
        int count = count();
        int length = stack.length;
        if (count < length){
            for (int i=0; i < length; i++){
                if (stack[i] == null){
                    stack[i] = s;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Removes the String on top of the stack from the stack and returns it.
     * @return the String on top of the stack, or null if the stack is empty.
     */
    public String pop() {
        int length = stack.length;
        for (int i=0; i < length; i++){
            if (i == length-1){
                String str = stack[i];
                stack[i] = null;
                return str;
            }
            if ((stack[i] == null) && (i >= 1))  {
                String str = stack[i - 1];
                stack[i - 1] = null;
                return str;
            }
        }
        return null;
    }

    /**
     * Returns the number of Strings in the stack.
     * @return the number of Strings in the stack
     */
    public int count() {
        int count = 0;
        for(int i=0; i < stack.length; i++){
            if (stack[i] != null){
                count++;
            }
        }
        return count;
    }
}
