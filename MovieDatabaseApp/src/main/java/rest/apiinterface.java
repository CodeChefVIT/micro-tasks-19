package rest;

import model.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface apiinterface {

    @GET("movie/popular")

    Call<MovieResponse> getPopMovies(@Query("api_key") String apiKey);
}
