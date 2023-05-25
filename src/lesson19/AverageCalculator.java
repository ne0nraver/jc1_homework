package lesson19;
import java.beans.IntrospectionException;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;

public class AverageCalculator {

    public final Double DEFAULT_AVERAGE = 0.0;

    public Double average(List<Integer> list) {
        //ToIntFunction<Integer> toIntFunction = (x) -> x.intValue();

        if (list == null || list.isEmpty()) {
            return DEFAULT_AVERAGE;
        }

        return list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElseGet(DEFAULT_AVERAGE::doubleValue);
                //.orElse(DEFAULT_AVERAGE);
    }

    public Integer getMinEvenNumber(List<Integer> list) {
        if (list==null || list.isEmpty()) {
            return 0;
        }

        return  list.stream()
                .filter(Objects::nonNull)
                .filter(x->x%2 == 0)
                .min(Integer::compare)
                .orElse(0);
    }

}
