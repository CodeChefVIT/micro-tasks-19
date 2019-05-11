An App to display the most popular movies around the world(Updated daily)

This android app uses the TMDB API to access movie data from themoviedatabase.org website
it makes use of android recyclerview and cardview to display the data in the UI.
The api returns a JSON format response to a query.the network requests are handled by the retrofit library.
the returned response is parsed by gson convertor to a java POJO.An adapter class is used to set the adapter for
the recyclrview displaying the results from pojo.Picasso is used to display the movie posters.