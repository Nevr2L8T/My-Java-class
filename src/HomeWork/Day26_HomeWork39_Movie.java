package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Write "Movie" Class Where it has following Attribute (Instance Variables)
1) String "Name"
2) String "Type"
3) double "Rating" (out of 10) ex: 8.7
4) String "Star" ex: Tom Hanks
Every time when you are creating an object from Movie Class, User should be prompt to Enter the attributes (hint Scanner)*/
public class Day26_HomeWork39_Movie {
    String Name;
    String Type;
    double Rating;
    String Star;

    public void Day26_HomeWork39_Movie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of movie: ");
        this.Name = sc.nextLine();
        System.out.println("Please enter type of movie: ");
        this.Type = sc.nextLine();
        System.out.println("Please enter Rating of movie 1-10: ");
        this.Rating = sc.nextDouble();
        System.out.println("Please enter the star of the movie: ");
        this.Star = sc.next();
        System.out.println("The name of the movie is: "+this.Name+" The type of the movie is: "
        +this.Type+" The Rating of the movie is: "+this.Rating+" The star of the movie is: "+this.Star);
    }
    /*Use "Movie" Class to create objects.
Create 5 Movie instances (Objects)
Write a Method where it takes List of all the movies and returns to List of Movies those are "Action" types*/
    public void Movies(){
        Day26_HomeWork39_Movie mv1 = new Day26_HomeWork39_Movie();
        mv1.Day26_HomeWork39_Movie();
        Day26_HomeWork39_Movie mv2 = new Day26_HomeWork39_Movie();
        mv2.Day26_HomeWork39_Movie();
        Day26_HomeWork39_Movie mv3 = new Day26_HomeWork39_Movie();
        mv3.Day26_HomeWork39_Movie();
        Day26_HomeWork39_Movie mv4 = new Day26_HomeWork39_Movie();
        mv4.Day26_HomeWork39_Movie();
        Day26_HomeWork39_Movie mv5 = new Day26_HomeWork39_Movie();
        mv5.Day26_HomeWork39_Movie();
        ArrayList<Day26_HomeWork39_Movie> ActLst= new ArrayList<>();
        ActLst.addAll(Arrays.asList(mv1,mv2,mv3,mv4,mv5));
        for (int i = 0; i < ActLst.size(); i++) {
                System.out.println("The Actors are: "+ActLst.get(i).Star);
            if (ActLst.get(i).Type.equalsIgnoreCase("Action")){
                System.out.println("The Action movies are: "+ActLst.get(i).Name);
            }

        }
    }

    public static void main(String[] args) {
    Day26_HomeWork39_Movie Mv = new Day26_HomeWork39_Movie();
    Mv.Movies();






        }

    }





