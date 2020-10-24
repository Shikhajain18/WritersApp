package com.example.writersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text2);
        String para="kdjl//////////////////////////////////////////////////////////" +
                "/n"+
                "/n"+
                "/n"+
                "jgmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm"+
                "/n"+
                "/n"+
                "/n"+
                "ghkgjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"+
                "/n"+
                "/n"+
                "/n"+
                "Politics does not limit to those in power in the government. It is also about the ones who are in the run to achieve the same power. The candidates of the opposition party question the party on power during political debates. They intend to inform people and make them aware of their agenda and what the present government is doing. All this is done with the help of politics only.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Dirty Politics\n" +
                "Dirty politics refers to the kind of politics in which moves are made for the personal interest of a person or party. It ignores the overall development of a nation and hurts the essence of the country. If we look at it closely, there are various constituents of dirty politics.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "The ministers of various political parties, in order to defame the opposition, spread fake news and give provocative speeches against them. This hampers with the harmony of the country and also degrades the essence of politics. They pass sexist remarks and instill hate in the hearts of people to watch their party win with a majority of seats.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Read 500 Words Essay on Corruption Here\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Furthermore, the majority of politicians are corrupt. They abuse their power to advance their personal interests rather than that of the country. We see the news flooded with articles like ministers and their families involving in scams and illegal practices. The power they have makes them feel invincible which is why they get away with any crime.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Before coming into power, the government makes numerous promises to the public. They influence and manipulate them into thinking all their promises will be fulfilled. However, as soon as they gain power, they turn their back on the public. They work for their selfish motives and keep fooling people in every election. Out of all this, only the common suffers at the hands of lying and corrupt politicians."
                ;
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}