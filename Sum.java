import java.io.PrintStream;
import java.util.*;
public class Sum{

    public static void main(String[] args) {
        System.out.println("Result : ");

        final int total = 100;
        print(total);
    }

    static void print(int givenSum) {
        Statement state = new Statement();
        for (int i=0;i<Statement.numberstate;i++,state.after()) 
        {
            if (state.toInt() == givenSum) {
                state.print();
            }
        }
    }
        
    public static class Statement {

        public final static int NUMBER_OF_DIGITS = 9;
        public final static byte ADD = 0;
        public final static byte SUB = 1;
        public final static byte JOIN = 2;

        final byte[] code = new byte[NUMBER_OF_DIGITS];
        final static int numberstate = 2 * 3 * 3 * 3 * 3 * 3 * 3 * 3 * 3;

        Statement after() {
            for (int i=0;i<NUMBER_OF_DIGITS;i++) {
                if (++code[i] > JOIN) {
                    code[i] = ADD;
                } 
                else {
                    break;
                }
            }
            return this;
        }
    

        int toInt() {
            int value = 0;
            int number = 0;
            int sign = (+1);
            for (int digit = 1; digit <= 9; digit++) {
                switch (code[NUMBER_OF_DIGITS - digit]) {
                    case ADD:
                        value += sign * number;
                        number = digit;
                        sign = (+1);
                        break;
                    case SUB:
                        value += sign * number;
                        number = digit;
                        sign = (-1);
                        break;
                    case JOIN:
                        number = 10 * number + digit;
                        break;
                }
            }
            return value + sign * number;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder(2 * NUMBER_OF_DIGITS + 1);
            for (int digit = 1; digit <= NUMBER_OF_DIGITS; digit++) {
                switch (code[NUMBER_OF_DIGITS - digit]) {
                    case ADD:
                        if (digit > 1) {
                            s.append('+');
                        }
                        break;
                    case SUB:
                        s.append('-');
                        break;
                }
                s.append(digit);
            }
            return s.toString();
        }

        void print() {
            print(System.out);
        }

        void print(PrintStream printStream) {
            printStream.format("%9d", this.toInt());
            printStream.println(" = " + this);
        }
    }
}