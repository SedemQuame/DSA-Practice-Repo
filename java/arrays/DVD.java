// The actual code for creating an Array to hold DVD's.

// A simple definition for a DVD.
public class DVD{
    public String name;
    public int releaseYear;
    public String director;

    // Constructor
    public DVD(String name, int releaseYear, String director){
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString(){
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[15];

        // Firstly, we need to actually create a DVD object for The Avengers.

        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

        // Next, we'll put it into the 8th place of the Array. Remember, because we
        // started numbering from 0, the index we want is 7.

        dvdCollection[7] = avengersDVD;

        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");

        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        System.out.println(dvdCollection[7]);
    }
}



