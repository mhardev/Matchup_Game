package com.example.matchinggame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView Card1, Card2, Card3, Card4, Card5, Card6, Card7, Card8, Card9, Card10, Card11, Card12;

    // Array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    // Actual images
    int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning the images to the variables
        Card1 = (ImageView) findViewById(R.id.Card1);
        Card2 = (ImageView) findViewById(R.id.Card2);
        Card3 = (ImageView) findViewById(R.id.Card3);
        Card4 = (ImageView) findViewById(R.id.Card4);
        Card5 = (ImageView) findViewById(R.id.Card5);
        Card6 = (ImageView) findViewById(R.id.Card6);
        Card7 = (ImageView) findViewById(R.id.Card7);
        Card8 = (ImageView) findViewById(R.id.Card8);
        Card9 = (ImageView) findViewById(R.id.Card9);
        Card10 = (ImageView) findViewById(R.id.Card10);
        Card11 = (ImageView) findViewById(R.id.Card11);
        Card12 = (ImageView) findViewById(R.id.Card12);

        // Load the card images
        Card1.setTag("0");
        Card2.setTag("1");
        Card3.setTag("2");
        Card4.setTag("3");
        Card5.setTag("4");
        Card6.setTag("5");
        Card7.setTag("6");
        Card8.setTag("7");
        Card9.setTag("8");
        Card10.setTag("9");
        Card11.setTag("10");
        Card12.setTag("11");

        // front of the cards resources
        frontOfCardsResources();

        // Shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        // Setting the click listener to the cards
        Card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card1, theCard);
            }
        });

        Card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card2, theCard);
            }
        });

        Card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card3, theCard);
            }
        });

        Card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card4, theCard);
            }
        });

        Card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card5, theCard);
            }
        });

        Card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card6, theCard);
            }
        });

        Card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card7, theCard);
            }
        });

        Card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card8, theCard);
            }
        });

        Card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card9, theCard);
            }
        });

        Card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card10, theCard);
            }
        });

        Card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card11, theCard);
            }
        });

        Card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(Card12, theCard);
            }
        });

    }

    private void doStuff(ImageView iv, int card) {
        // Setting the correct image to the image view
        if (cardsArray[card] == 101) {
            iv.setImageResource(image101);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(image102);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(image103);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(image104);
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(image105);
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(image106);
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(image201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(image202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(image203);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(image204);
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(image205);
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(image206);
        }

        // Check which image is selected and save it to temporary variable
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            Card1.setEnabled(false);
            Card2.setEnabled(false);
            Card3.setEnabled(false);
            Card4.setEnabled(false);
            Card5.setEnabled(false);
            Card6.setEnabled(false);
            Card7.setEnabled(false);
            Card8.setEnabled(false);
            Card9.setEnabled(false);
            Card10.setEnabled(false);
            Card11.setEnabled(false);
            Card12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Check if the selected images are equal
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        // If images are equal remove them and add point
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                Card1.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                Card2.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                Card3.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                Card4.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                Card5.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                Card6.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                Card7.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                Card8.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                Card9.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                Card10.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                Card11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                Card12.setVisibility(View.INVISIBLE);
            }

            // second image invisible too if it is the same as the first
            if (clickedSecond == 0) {
                Card1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                Card2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                Card3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                Card4.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                Card5.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                Card6.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                Card7.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                Card8.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                Card9.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                Card10.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                Card11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                Card12.setVisibility(View.INVISIBLE);
            }

        } else {
            // if the images are not equal set the image back to the default image
            Card1.setImageResource(R.drawable.card);
            Card2.setImageResource(R.drawable.card);
            Card3.setImageResource(R.drawable.card);
            Card4.setImageResource(R.drawable.card);
            Card5.setImageResource(R.drawable.card);
            Card6.setImageResource(R.drawable.card);
            Card7.setImageResource(R.drawable.card);
            Card8.setImageResource(R.drawable.card);
            Card9.setImageResource(R.drawable.card);
            Card10.setImageResource(R.drawable.card);
            Card11.setImageResource(R.drawable.card);
            Card12.setImageResource(R.drawable.card);
        }

        // Make all the images clickable again
        Card1.setEnabled(true);
        Card2.setEnabled(true);
        Card3.setEnabled(true);
        Card4.setEnabled(true);
        Card5.setEnabled(true);
        Card6.setEnabled(true);
        Card7.setEnabled(true);
        Card8.setEnabled(true);
        Card9.setEnabled(true);
        Card10.setEnabled(true);
        Card11.setEnabled(true);
        Card12.setEnabled(true);

        // Check if the game is over
        checkEnd();
    }

    private void checkEnd() {
        // if all the images are invisible then the game is over
        if (Card1.getVisibility() == View.INVISIBLE &&
                Card2.getVisibility() == View.INVISIBLE &&
                Card3.getVisibility() == View.INVISIBLE &&
                Card4.getVisibility() == View.INVISIBLE &&
                Card5.getVisibility() == View.INVISIBLE &&
                Card6.getVisibility() == View.INVISIBLE &&
                Card7.getVisibility() == View.INVISIBLE &&
                Card8.getVisibility() == View.INVISIBLE &&
                Card9.getVisibility() == View.INVISIBLE &&
                Card10.getVisibility() == View.INVISIBLE &&
                Card11.getVisibility() == View.INVISIBLE &&
                Card12.getVisibility() == View.INVISIBLE) {
            // Show an alert dialog
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER! Do you want to play again?")
                    .setCancelable(false)
                    .setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            })
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources() {
        image101 = R.drawable.bntb;
        image102 = R.drawable.lmp;
        image103 = R.drawable.jpq;
        image104 = R.drawable.sw;
        image105 = R.drawable.bb;
        image106 = R.drawable.bbc;
        image201 = R.drawable.bntb1;
        image202 = R.drawable.lmp1;
        image203 = R.drawable.jpq1;
        image204 = R.drawable.sw1;
        image205 = R.drawable.bb1;
        image206 = R.drawable.bbc1;
    }
}