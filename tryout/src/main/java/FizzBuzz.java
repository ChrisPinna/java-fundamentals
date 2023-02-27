public class FizzBuzz {
    public String generate(int upto) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= upto; i++) {
            if (i % 3 == 0) {
                sb.append(", Fizz");
            } else if (i == 1) {
                sb.append("1");
            } else {
                sb.append(String.format(", %d", i));
            }
        }
        return sb.toString();
    }
}