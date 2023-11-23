package lambda_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fib_Com_Stream {
    public static void main(String[] args) {

        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}
