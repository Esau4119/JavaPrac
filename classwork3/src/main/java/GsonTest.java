import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


class MyDto{
    public final String a;
    public final String b;


    public MyDto(String a, String b){
        this.a = a;
        this.b = b;
    }
}


public class GsonTest {

    public static void main(String[] args) throws IOException {
        //Gson gson = new Gson();// Simple

        Gson gson = new GsonBuilder() // builder pattern, just for readability
                        .setPrettyPrinting().create();

        //a java object in the heap
        MyDto myDto = new MyDto("hello", "world");

        // java object -> json string
        String myDtoString = gson.toJson(myDto);
        System.out.println(myDtoString);

        //Opposite: json string _> Java Object
        //First read raw json/txt file into java heap
        String rawJson = new String(Files.readAllBytes(Paths.get("src/myDto.json")));
        MyDto myDto1 = gson.fromJson(rawJson, MyDto.class);
        System.out.println(myDto1.a);
        System.out.println(myDto1.b);
    }
}
