package lesson22;

import com.google.gson.Gson;
import lesson19.BodyType;
import lesson19.CarColor;
import lesson19.CarValueObject;

import java.math.BigDecimal;

public class JsonParseExample {
    public static void main(String[] args) {

        CarValueObject carValueObject = new CarValueObject(
                "BMW",
                CarColor.BLACK,
                BodyType.COUPE,
                (short)2020,
                12345,
                "Gasoline",
                (byte)5,
                new BigDecimal(12231)
        );


        Gson gson = new Gson();
        final String s = gson.toJson(carValueObject);
        System.out.println(s);

        final CarValueObject carValueObject2 = gson.fromJson(s, CarValueObject.class);
        System.out.println(carValueObject2);
    }
}
