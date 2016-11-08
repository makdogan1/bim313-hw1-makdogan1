package edu.bim313;

import org.paukov.combinatorics3.Generator;
import java.util.ArrayList;
import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        ArrayList<Integer> cityList = new ArrayList<>();
        List<TriangleClass> triangleList= new ArrayList<TriangleClass>();

        for(int i=0;i<81;i++){
            cityList.add(i);
        }

        Generator.combination(cityList)
                .simple(3)
                .stream()
                .forEach((t)->triangleList.add(new TriangleClass(t)));

        triangleList
                .stream()
                .filter(((t) ->t.checkInEquality() ))
                .forEach(System.out::println);
    }
}
