package adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import model.Result;

public class UIAdapter extends RecyclerView.Adapter<UIAdapter.MovieViewHolder>{

              private  List<Result> result;


               private int rowLayout;

               private Context context;

               public static final String
               Img_Url_Base = "https://image.tmdb.org/t/p/w400";

    public UIAdapter(List<Result> result, int rowLayout, Context context) {

        this.result = result;

        this.rowLayout = rowLayout;

        this.context = context;

    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

      CardView moviesLayout;
      TextView MovieTitle;
      TextView MovieDescription;
      ImageView movieImage;
      TextView data;


     public MovieViewHolder(View v) {

         super(v);

         moviesLayout = (CardView) v.findViewById(R.id.movies_layout);

         movieImage = (ImageView)v.findViewById(R.id.movie_image);

         MovieTitle = (TextView) v.findViewById(R.id.title);

         data = (TextView) v.findViewById(R.id.date);

         MovieDescription=(TextView) v.findViewById(R.id.description);



     }
    }
    @Override
    public UIAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent,false);

        return new MovieViewHolder(view);


    }
    @Override
    public void onBindViewHolder(MovieViewHolder holder,final int position){


        String image_url =  Img_Url_Base + result.get(position).getPosterPath();
          Picasso.with(context)
           .load(image_url)
           .placeholder(android.R.drawable.sym_def_app_icon)
            .error(android.R.drawable.sym_def_app_icon)
            .into(holder.movieImage);
           holder.MovieTitle.setText(result.get(position).getTitle());
          holder.data.setText(result.get(position).getReleaseDate());

           holder.MovieDescription.setText(result.get(position).getOverview());

    }
        @Override
        public int getItemCount(){

               return result.size();


        }



    }




