package viktorkhon.com.udacity_project_4_musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    static class ViewHolder {
        private TextView title;
        private TextView description;
        private Button forYou;
        private Button radio;
        private Button yourLibrary;
        private Button payment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        ViewHolder holder = new ViewHolder();

        holder.title = (TextView) findViewById(R.id.title);
        holder.title.setText(R.string.playlists);

        holder.description = (TextView) findViewById(R.id.description);
        holder.description.setText("List of current songs to play");

        holder.radio = (Button) findViewById(R.id.radio);
        holder.radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radioIntent = new Intent(Playlist.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        holder.forYou = (Button) findViewById(R.id.for_you);
        holder.forYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forYouIntent = new Intent(Playlist.this, ForYou.class);
                startActivity(forYouIntent);
            }
        });

        holder.yourLibrary = (Button) findViewById(R.id.your_library);
        holder.yourLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yourLibraryIntent = new Intent(Playlist.this, YourLibrary.class);
                startActivity(yourLibraryIntent);
            }
        });

        holder.payment = (Button) findViewById(R.id.payment);
        holder.payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(Playlist.this, Payment.class);
                startActivity(paymentIntent);
            }
        });
    }
}
