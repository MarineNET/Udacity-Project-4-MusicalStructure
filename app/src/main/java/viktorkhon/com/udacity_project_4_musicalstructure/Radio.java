package viktorkhon.com.udacity_project_4_musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Radio extends AppCompatActivity {

    static class ViewHolder {
        private TextView title;
        private TextView description;
        private Button forYou;
        private Button playlist;
        private Button yourLibrary;
        private Button payment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);

        ViewHolder holder = new ViewHolder();

        holder.title = (TextView) findViewById(R.id.title);
        holder.title.setText(R.string.radio);

        holder.description = (TextView) findViewById(R.id.description);
        holder.description.setText("Listen to the available Radio Stations");

        holder.playlist = (Button) findViewById(R.id.playlists);
        holder.playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(Radio.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

        holder.forYou = (Button) findViewById(R.id.for_you);
        holder.forYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forYouIntent = new Intent(Radio.this, ForYou.class);
                startActivity(forYouIntent);
            }
        });

        holder.yourLibrary = (Button) findViewById(R.id.your_library);
        holder.yourLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yourLibraryIntent = new Intent(Radio.this, YourLibrary.class);
                startActivity(yourLibraryIntent);
            }
        });

        holder.payment = (Button) findViewById(R.id.payment);
        holder.payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(Radio.this, Payment.class);
                startActivity(paymentIntent);
            }
        });
    }
}
