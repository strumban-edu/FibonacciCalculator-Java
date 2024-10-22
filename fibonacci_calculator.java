public class fibonacci_calculator {
    public static int fibonacci(int currentCount) {
        if (currentCount == 0) {
            return 0;
        } else if (currentCount == 1) {
            return 1;
        } else {
            return fibonacci(currentCount - 1) + fibonacci(currentCount - 2);
        }
    }

    public static void main(String [] args) {
        int num = -1;

        if (args.length > 0) {
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument '" + num + "' is invalid. Argument must be a positive integer or 0.");
                System.exit(1);
            }
        } else {
            System.err.println("Please run the program with an argument.");
            System.exit(1);
        }

        if (num < 0) {
            System.err.println("Argument '" + num + "' is invalid. Argument must be a positive integer or 0.");
        } else {
            System.out.println(fibonacci(num));
        }
    }
}
