package pkg;

public class Movie{
	String movie;
	double rating;
	int numberOfRating;
	int revenue;
	
	public Movie(){
	    movie = "Avengers";
	    rating = 8.0;
	    numberOfRating = 33;
	    revenue = 623357910;
	}
	public Movie(String m, double ra, int n, int re){
	    movie = m;
	    rating = ra;
	    numberOfRating = n;
	    revenue = re;
	}
	public void movieToString(){
	    System.out.println("Movie: " + movie);
	    System.out.println("Rating: " + rating);
	    System.out.println("Number of Ratings: " + numberOfRating);
	    System.out.println("Revenue: " + revenue);
	}
	public String getMovieName(){
	    return movie;
	}
	public int getRevenue(){
	    return revenue;
	}
	public double addRating(double r){
	    double average = ((rating * numberOfRating) + r);
	    numberOfRating = numberOfRating + 1;
	    rating = average / numberOfRating;
	    return rating;
	}
	public boolean compareRatings(Movie x){
	 return rating > x.rating;
	}
}
