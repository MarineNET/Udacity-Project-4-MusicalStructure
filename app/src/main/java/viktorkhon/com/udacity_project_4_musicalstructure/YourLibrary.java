package viktorkhon.com.udacity_project_4_musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YourLibrary extends AppCompatActivity {

    static class ViewHolder {
        private TextView title;
        private TextView description;
        private Button forYou;
        private Button playlist;
        private Button radio;
        private Button payment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_library);

        ViewHolder holder = new ViewHolder();

        holder.title = (TextView) findViewById(R.id.title);
        holder.title.setText(R.string.your_library);

        holder.description = (TextView) findViewById(R.id.description);
        holder.description.setText("Individual library of the user");

        holder.playlist = (Button) findViewById(R.id.playlists);
        holder.playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(YourLibrary.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

        holder.radio = (Button) findViewById(R.id.radio);
        holder.radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radioIntent = new Intent(YourLibrary.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        holder.forYou = (Button) findViewById(R.id.for_you);
        holder.forYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forYouIntent = new Intent(YourLibrary.this, ForYou.class);
                startActivity(forYouIntent);
            }
        });

        holder.payment = (Button) findViewById(R.id.payment);
        holder.payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(YourLibrary.this, Payment.class);
                startActivity(paymentIntent);
            }
        });
    }
}
