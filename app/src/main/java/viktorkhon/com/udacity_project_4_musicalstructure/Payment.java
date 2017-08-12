package viktorkhon.com.udacity_project_4_musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Payment extends AppCompatActivity {

    static class ViewHolder {
        private TextView title;
        private TextView description;
        private Button playlist;
        private Button radio;
        private Button yourLibrary;
        private Button payment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        ViewHolder holder = new ViewHolder();

        holder.title = (TextView) findViewById(R.id.title);
        holder.title.setText(R.string.payment);

        holder.description = (TextView) findViewById(R.id.description);
        holder.description.setText("For the payment, I could use REST API from Paypal" +
        "There Orders API would do a good job of collecting the payment information for an order");

        holder.playlist = (Button) findViewById(R.id.playlists);
        holder.playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(Payment.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

        holder.radio = (Button) findViewById(R.id.radio);
        holder.radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radioIntent = new Intent(Payment.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        holder.yourLibrary = (Button) findViewById(R.id.your_library);
        holder.yourLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yourLibraryIntent = new Intent(Payment.this, YourLibrary.class);
                startActivity(yourLibraryIntent);
            }
        });

        holder.payment = (Button) findViewById(R.id.payment);
        holder.payment.setText(R.string.for_you);
        holder.payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forYouIntent = new Intent(Payment.this, ForYou.class);
                startActivity(forYouIntent);
            }
        });
    }
}
