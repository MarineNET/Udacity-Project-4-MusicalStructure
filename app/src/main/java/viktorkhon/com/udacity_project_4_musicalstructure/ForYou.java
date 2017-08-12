package viktorkhon.com.udacity_project_4_musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForYou extends AppCompatActivity {

    static class ViewHolder {
        private TextView title;
        private TextView description;
        private Button playlist;
        private Button radio;
        private Button yourLibrary;
        private Button payment;
        private Button forYou;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.for_you);

        ViewHolder holder = new ViewHolder();

        holder.title = (TextView) findViewById(R.id.title);
        holder.title.setText(R.string.for_you);

        holder.description = (TextView) findViewById(R.id.description);
        holder.description.setText("This is the main screen with personalized recommendations" +
                "for the user");

        holder.playlist = (Button) findViewById(R.id.playlists);
        holder.playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(ForYou.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

        holder.radio = (Button) findViewById(R.id.radio);
        holder.radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radioIntent = new Intent(ForYou.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        holder.yourLibrary = (Button) findViewById(R.id.your_library);
        holder.yourLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yourLibraryIntent = new Intent(ForYou.this, YourLibrary.class);
                startActivity(yourLibraryIntent);
            }
        });

        holder.payment = (Button) findViewById(R.id.payment);
        holder.payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(ForYou.this, Payment.class);
                startActivity(paymentIntent);
            }
        });
    }
}
