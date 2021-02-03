package com.example.dejahits;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    ImageButton arrow, arrow1, arrow2, arrow3, arrow4, arrow5, arrow6, arrow7, arrow8, arrow9, arrow10;
    LinearLayout hiddenView, hiddenView1, hiddenView2, hiddenView3, hiddenView4, hiddenView5, hiddenView6, hiddenView7, hiddenView8, hiddenView9, hiddenView10;
    CardView cardView, cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.base_cardview);
        arrow = findViewById(R.id.arrow_button);
        hiddenView = findViewById(R.id.hidden_view);

        cardView1 = findViewById(R.id.base_cardview1);
        arrow1 = findViewById(R.id.arrow_button1);
        hiddenView1 = findViewById(R.id.hidden_view1);

        cardView2 = findViewById(R.id.base_cardview2);
        arrow2 = findViewById(R.id.arrow_button2);
        hiddenView2 = findViewById(R.id.hidden_view2);

        cardView3 = findViewById(R.id.base_cardview3);
        arrow3 = findViewById(R.id.arrow_button3);
        hiddenView3 = findViewById(R.id.hidden_view3);

        cardView4 = findViewById(R.id.base_cardview4);
        arrow4 = findViewById(R.id.arrow_button4);
        hiddenView4 = findViewById(R.id.hidden_view4);

        cardView5 = findViewById(R.id.base_cardview5);
        arrow5 = findViewById(R.id.arrow_button5);
        hiddenView5 = findViewById(R.id.hidden_view5);

        cardView6 = findViewById(R.id.base_cardview6);
        arrow6 = findViewById(R.id.arrow_button6);
        hiddenView6 = findViewById(R.id.hidden_view6);

        cardView7 = findViewById(R.id.base_cardview7);
        arrow7 = findViewById(R.id.arrow_button7);
        hiddenView7 = findViewById(R.id.hidden_view7);

        cardView8 = findViewById(R.id.base_cardview8);
        arrow8 = findViewById(R.id.arrow_button8);
        hiddenView8 = findViewById(R.id.hidden_view8);

        cardView9 = findViewById(R.id.base_cardview9);
        arrow9 = findViewById(R.id.arrow_button9);
        hiddenView9 = findViewById(R.id.hidden_view9);

        cardView10 = findViewById(R.id.base_cardview10);
        arrow10 = findViewById(R.id.arrow_button10);
        hiddenView10 = findViewById(R.id.hidden_view10);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility((View.GONE));
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView1.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView1,
                            new AutoTransition());
                    hiddenView1.setVisibility((View.GONE));
                    arrow1.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView1,
                            new AutoTransition());
                    hiddenView1.setVisibility(View.VISIBLE);
                    arrow1.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView2.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hiddenView2.setVisibility((View.GONE));
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hiddenView2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView3.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView3,
                            new AutoTransition());
                    hiddenView3.setVisibility((View.GONE));
                    arrow3.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView3,
                            new AutoTransition());
                    hiddenView3.setVisibility(View.VISIBLE);
                    arrow3.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView4.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView4,
                            new AutoTransition());
                    hiddenView4.setVisibility((View.GONE));
                    arrow4.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView4,
                            new AutoTransition());
                    hiddenView4.setVisibility(View.VISIBLE);
                    arrow4.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility((View.GONE));
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView6.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView6,
                            new AutoTransition());
                    hiddenView6.setVisibility((View.GONE));
                    arrow6.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView6,
                            new AutoTransition());
                    hiddenView6.setVisibility(View.VISIBLE);
                    arrow6.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView7.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView7,
                            new AutoTransition());
                    hiddenView7.setVisibility((View.GONE));
                    arrow7.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView7,
                            new AutoTransition());
                    hiddenView7.setVisibility(View.VISIBLE);
                    arrow7.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView8.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView8,
                            new AutoTransition());
                    hiddenView8.setVisibility((View.GONE));
                    arrow8.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView8,
                            new AutoTransition());
                    hiddenView8.setVisibility(View.VISIBLE);
                    arrow8.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView9.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView9,
                            new AutoTransition());
                    hiddenView9.setVisibility((View.GONE));
                    arrow9.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView9,
                            new AutoTransition());
                    hiddenView9.setVisibility(View.VISIBLE);
                    arrow9.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
        arrow10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView10.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView10,
                            new AutoTransition());
                    hiddenView10.setVisibility((View.GONE));
                    arrow10.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView10,
                            new AutoTransition());
                    hiddenView10.setVisibility(View.VISIBLE);
                    arrow10.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
    }
}