package majer.kraje;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button europa;
    private Button azja;
    private Button afryka;
    private Button swiat;
    private ImageButton settings;
    private CheckBox checkBoxSounds;
    private boolean sounds = true;
    private int score = 0;
    private int lives = 3;
    final int red = Color.parseColor("#C8E20C0C");
    final int green = Color.parseColor("#C825E20C");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        europa = findViewById(R.id.button);
        azja = findViewById(R.id.button2);
        afryka = findViewById(R.id.button3);
        swiat = findViewById(R.id.button4);
        settings = findViewById(R.id.bSettings);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settings();
            }
        });

        europa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                europe();
            }
        });
        azja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asia();
            }
        });
        afryka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                africa();
            }
        });

        swiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swiat();
            }
        });

    }
    public void settings()
    {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.settings);
        dialog.setTitle(R.string.settings);

        TextView settings_exit = dialog.findViewById(R.id.settings_exit);
        settings_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        checkBoxSounds = (dialog).findViewById(R.id.checkBoxSounds);

        checkBoxSounds.setChecked(sounds);
        checkBoxSounds.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sounds = isChecked;
            }
        });

        dialog.show();
    }

    public void africa()
    {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.africa);
        dialog.setTitle(R.string.africa);


        Button exit = (dialog).findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                score = 0;
                lives = 3;
            }
        });


        ImageView image = (dialog).findViewById(R.id.imgRandom);
        Button b1 = dialog.findViewById(R.id.b1);
        Button b2 = dialog.findViewById(R.id.b2);
        Button b3 = dialog.findViewById(R.id.b3);
        Button b4 = dialog.findViewById(R.id.b4);


        final int min = 1;
        final int max = 27;
        final Random r = new Random();
        final int number = r.nextInt(max - min + 1) + min;
        final String myString = String.valueOf(number);

        if(lives > 0) {
            if (myString.equals("1")) {
                image.setImageResource(R.drawable.algeria);
                b1.setText(R.string.algeria);
                b2.setText(R.string.maroko);
                b3.setText(R.string.rpa);
                b4.setText(R.string.etiopia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("2")) {
                image.setImageResource(R.drawable.angola);
                b1.setText(R.string.togo);
                b2.setText(R.string.ghana);
                b3.setText(R.string.gabon);
                b4.setText(R.string.angola);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("3")) {
                image.setImageResource(R.drawable.burkinafaso);
                b1.setText(R.string.kongo);
                b2.setText(R.string.burkina_faso);
                b3.setText(R.string.libia);
                b4.setText(R.string.lesotho);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("4")) {
                image.setImageResource(R.drawable.burundi);
                b1.setText(R.string.kongo);
                b2.setText(R.string.mauritius);
                b3.setText(R.string.madagaskar);
                b4.setText(R.string.burundi);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("5")) {
                image.setImageResource(R.drawable.cameroon);
                b1.setText(R.string.kamerun);
                b2.setText(R.string.sudan);
                b3.setText(R.string.zimbabwe);
                b4.setText(R.string.libia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("6")) {
                image.setImageResource(R.drawable.capeverde);
                b1.setText(R.string.sudan);
                b2.setText(R.string.etiopia);
                b3.setText(R.string.rep_ziel);
                b4.setText(R.string.gabon);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("7")) {
                image.setImageResource(R.drawable.centralafricanrepublic);
                b1.setText(R.string.egipt);
                b2.setText(R.string.uganda);
                b3.setText(R.string.kenia);
                b4.setText(R.string.rep_sr);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("8")) {
                image.setImageResource(R.drawable.chad);
                b1.setText(R.string.nigeria);
                b2.setText(R.string.czad);
                b3.setText(R.string.mali);
                b4.setText(R.string.burkina_faso);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("9")) {
                image.setImageResource(R.drawable.comoros);
                b1.setText(R.string.komory);
                b2.setText(R.string.rpa);
                b3.setText(R.string.liberia);
                b4.setText(R.string.senegal);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("10")) {
                image.setImageResource(R.drawable.congo);
                b1.setText(R.string.ghana);
                b2.setText(R.string.kamerun);
                b3.setText(R.string.angola);
                b4.setText(R.string.kongo);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("11")) {
                image.setImageResource(R.drawable.egypt);
                b1.setText(R.string.lesotho);
                b2.setText(R.string.egipt);
                b3.setText(R.string.maroko);
                b4.setText(R.string.libia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("12")) {
                image.setImageResource(R.drawable.eritrea);
                b1.setText(R.string.madagaskar);
                b2.setText(R.string.namibia);
                b3.setText(R.string.zambia);
                b4.setText(R.string.erytrea);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("13")) {
                image.setImageResource(R.drawable.ethiopia);
                b1.setText(R.string.etiopia);
                b2.setText(R.string.kongo);
                b3.setText(R.string.sudan);
                b4.setText(R.string.mozambik);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("14")) {
                image.setImageResource(R.drawable.gabon);
                b1.setText(R.string.tanzania);
                b2.setText(R.string.uganda);
                b3.setText(R.string.gabon);
                b4.setText(R.string.somalia);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("15")) {
                image.setImageResource(R.drawable.ghana);
                b1.setText(R.string.czad);
                b2.setText(R.string.mali);
                b3.setText(R.string.togo);
                b4.setText(R.string.ghana);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("16")) {
                image.setImageResource(R.drawable.guinea);
                b1.setText(R.string.sahara);
                b2.setText(R.string.gwinea);
                b3.setText(R.string.maroko);
                b4.setText(R.string.gwinea);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("17")) {
                image.setImageResource(R.drawable.kenya);
                b1.setText(R.string.etiopia);
                b2.setText(R.string.kenia);
                b3.setText(R.string.zimbabwe);
                b4.setText(R.string.kongo);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("18")) {
                image.setImageResource(R.drawable.lesotho);
                b1.setText(R.string.algeria);
                b2.setText(R.string.angola);
                b3.setText(R.string.togo);
                b4.setText(R.string.lesotho);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("19")) {
                image.setImageResource(R.drawable.liberia);
                b1.setText(R.string.liberia);
                b2.setText(R.string.lesotho);
                b3.setText(R.string.ghana);
                b4.setText(R.string.rpa);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("20")) {
                image.setImageResource(R.drawable.libya);
                b1.setText(R.string.madagaskar);
                b2.setText(R.string.egipt);
                b3.setText(R.string.libia);
                b4.setText(R.string.lesotho);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("21")) {
                image.setImageResource(R.drawable.madagascar);
                b1.setText(R.string.burkina_faso);
                b2.setText(R.string.sudan);
                b3.setText(R.string.libia);
                b4.setText(R.string.madagaskar);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("22")) {
                image.setImageResource(R.drawable.mauritius);
                b1.setText(R.string.kamerun);
                b2.setText(R.string.mauritius);
                b3.setText(R.string.togo);
                b4.setText(R.string.angola);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("23")) {
                image.setImageResource(R.drawable.morocco);
                b1.setText(R.string.maroko);
                b2.setText(R.string.gabon);
                b3.setText(R.string.liberia);
                b4.setText(R.string.czad);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("24")) {
                image.setImageResource(R.drawable.seychelles);
                b1.setText(R.string.senegal);
                b2.setText(R.string.burundi);
                b3.setText(R.string.ghana);
                b4.setText(R.string.seszele);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("25")) {
                image.setImageResource(R.drawable.southafrica);
                b1.setText(R.string.madagaskar);
                b2.setText(R.string.rpa);
                b3.setText(R.string.erytrea);
                b4.setText(R.string.gabon);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("26")) {
                image.setImageResource(R.drawable.swaziland);
                b1.setText(R.string.kenia);
                b2.setText(R.string.seszele);
                b3.setText(R.string.angola);
                b4.setText(R.string.suazi);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                africa();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("27")) {
                image.setImageResource(R.drawable.togo);
                b1.setText(R.string.togo);
                b2.setText(R.string.suazi);
                b3.setText(R.string.egipt);
                b4.setText(R.string.libia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }

            dialog.show();
        }

        else
        {
            dialog.dismiss();
            lostAfrica();
            score = 0;
            lives = 3;
        }

    }
    public void asia()
    {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.asia);
        dialog.setTitle(R.string.azja);


        Button exit = (dialog).findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                score = 0;
                lives = 3;
            }
        });


        ImageView image = (dialog).findViewById(R.id.imgRandom);
        Button b1 = dialog.findViewById(R.id.b1);
        Button b2 = dialog.findViewById(R.id.b2);
        Button b3 = dialog.findViewById(R.id.b3);
        Button b4 = dialog.findViewById(R.id.b4);


        final int min = 1;
        final int max = 29;
        final Random r = new Random();
        final int number = r.nextInt(max - min + 1) + min;
        final String myString = String.valueOf(number);

        if(lives > 0) {
            if (myString.equals("1")) {
                image.setImageResource(R.drawable.afghanistan);
                b1.setText(R.string.afganistan);
                b2.setText(R.string.irak);
                b3.setText(R.string.armenia);
                b4.setText(R.string.mongolia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                      incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("2")) {
                image.setImageResource(R.drawable.armenia);
                b1.setText(R.string.indonezja);
                b2.setText(R.string.nepal);
                b3.setText(R.string.syria);
                b4.setText(R.string.armenia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("3")) {
                image.setImageResource(R.drawable.azerbaijan);
                b1.setText(R.string.bhutan);
                b2.setText(R.string.azerbejdzan);
                b3.setText(R.string.armenia);
                b4.setText(R.string.pakistan);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("4")) {
                image.setImageResource(R.drawable.bahrain);
                b1.setText(R.string.wietnam);
                b2.setText(R.string.kazachstan);
                b3.setText(R.string.laos);
                b4.setText(R.string.bahrajn);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("5")) {
                image.setImageResource(R.drawable.bangladesh);
                b1.setText(R.string.bangladesz);
                b2.setText(R.string.indie);
                b3.setText(R.string.japonia);
                b4.setText(R.string.jordania);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("6")) {
                image.setImageResource(R.drawable.bhutan);
                b1.setText(R.string.pakistan);
                b2.setText(R.string.bangladesz);
                b3.setText(R.string.bhutan);
                b4.setText(R.string.indonezja);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("7")) {
                image.setImageResource(R.drawable.brunei);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.turcja);
                b3.setText(R.string.wietnam);
                b4.setText(R.string.brunei);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("8")) {
                image.setImageResource(R.drawable.cambodia);
                b1.setText(R.string.mongolia);
                b2.setText(R.string.kambodza);
                b3.setText(R.string.kazachstan);
                b4.setText(R.string.timor);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("9")) {
                image.setImageResource(R.drawable.china);
                b1.setText(R.string.chiny);
                b2.setText(R.string.wietnam);
                b3.setText(R.string.pakistan);
                b4.setText(R.string.laos);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("10")) {
                image.setImageResource(R.drawable.easttimor);
                b1.setText(R.string.armenia);
                b2.setText(R.string.bhutan);
                b3.setText(R.string.brunei);
                b4.setText(R.string.timor);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("11")) {
                image.setImageResource(R.drawable.georgia);
                b1.setText(R.string.iran);
                b2.setText(R.string.gruzja);
                b3.setText(R.string.chiny);
                b4.setText(R.string.azerbejdzan);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("12")) {
                image.setImageResource(R.drawable.india);
                b1.setText(R.string.bahrajn);
                b2.setText(R.string.nepal);
                b3.setText(R.string.pakistan);
                b4.setText(R.string.indie);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("13")) {
                image.setImageResource(R.drawable.indonesia);
                b1.setText(R.string.indonezja);
                b2.setText(R.string.kambodza);
                b3.setText(R.string.kuwejt);
                b4.setText(R.string.jordania);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("14")) {
                image.setImageResource(R.drawable.iran);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.syria);
                b3.setText(R.string.iran);
                b4.setText(R.string.irak);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("15")) {
                image.setImageResource(R.drawable.iraq);
                b1.setText(R.string.laos);
                b2.setText(R.string.iran);
                b3.setText(R.string.indie);
                b4.setText(R.string.irak);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("16")) {
                image.setImageResource(R.drawable.japan);
                b1.setText(R.string.chiny);
                b2.setText(R.string.japonia);
                b3.setText(R.string.korea_pln);
                b4.setText(R.string.bangladesz);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("17")) {
                image.setImageResource(R.drawable.jordan);
                b1.setText(R.string.kuwejt);
                b2.setText(R.string.jordania);
                b3.setText(R.string.turcja);
                b4.setText(R.string.wietnam);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("18")) {
                image.setImageResource(R.drawable.kazakhstan);
                b1.setText(R.string.indie);
                b2.setText(R.string.mongolia);
                b3.setText(R.string.syria);
                b4.setText(R.string.kazachstan);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("19")) {
                image.setImageResource(R.drawable.kuwait);
                b1.setText(R.string.kuwejt);
                b2.setText(R.string.izrael);
                b3.setText(R.string.liban);
                b4.setText(R.string.jordania);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("20")) {
                image.setImageResource(R.drawable.laos);
                b1.setText(R.string.iran);
                b2.setText(R.string.bangladesz);
                b3.setText(R.string.laos);
                b4.setText(R.string.liban);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("21")) {
                image.setImageResource(R.drawable.lebanon);
                b1.setText(R.string.indonezja);
                b2.setText(R.string.iran);
                b3.setText(R.string.laos);
                b4.setText(R.string.liban);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("22")) {
                image.setImageResource(R.drawable.mongolia);
                b1.setText(R.string.nepal);
                b2.setText(R.string.mongolia);
                b3.setText(R.string.bangladesz);
                b4.setText(R.string.armenia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("23")) {
                image.setImageResource(R.drawable.nepal);
                b1.setText(R.string.nepal);
                b2.setText(R.string.indie);
                b3.setText(R.string.azerbejdzan);
                b4.setText(R.string.japonia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("24")) {
                image.setImageResource(R.drawable.pakistan);
                b1.setText(R.string.irak);
                b2.setText(R.string.iran);
                b3.setText(R.string.afganistan);
                b4.setText(R.string.pakistan);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("25")) {
                image.setImageResource(R.drawable.southkorea);
                b1.setText(R.string.korea_pln);
                b2.setText(R.string.korea_pl);
                b3.setText(R.string.kuwejt);
                b4.setText(R.string.jordania);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("26")) {
                image.setImageResource(R.drawable.syria);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.iran);
                b3.setText(R.string.irak);
                b4.setText(R.string.syria);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("27")) {
                image.setImageResource(R.drawable.thailand);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.laos);
                b3.setText(R.string.bangladesz);
                b4.setText(R.string.timor);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("28")) {
                image.setImageResource(R.drawable.turkey);
                b1.setText(R.string.armenia);
                b2.setText(R.string.gruzja);
                b3.setText(R.string.turcja);
                b4.setText(R.string.izrael);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("29")) {
                image.setImageResource(R.drawable.vietnam);
                b1.setText(R.string.pakistan);
                b2.setText(R.string.armenia);
                b3.setText(R.string.chiny);
                b4.setText(R.string.wietnam);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                asia();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }

            dialog.show();
        }

        else
        {
            dialog.dismiss();
            lostAsia();
            score = 0;
            lives = 3;
        }

    }
    public void europe()
    {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.europe);
        dialog.setTitle(R.string.europa);


        Button exit = (dialog).findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                score = 0;
                lives = 3;
            }
        });


        ImageView image = (dialog).findViewById(R.id.imgRandom);
        Button b1 = dialog.findViewById(R.id.b1);
        Button b2 = dialog.findViewById(R.id.b2);
        Button b3 = dialog.findViewById(R.id.b3);
        Button b4 = dialog.findViewById(R.id.b4);


        final int min = 1;
        final int max = 30;
        final Random r = new Random();
        final int number = r.nextInt(max - min + 1) + min;
        final String myStringEurope = String.valueOf(number);

        if(lives > 0) {
            if (myStringEurope.equals("1")) {
                image.setImageResource(R.drawable.albania);
                b1.setText(R.string.albania);
                b2.setText(R.string.macedonia);
                b3.setText(R.string.belgia);
                b4.setText(R.string.czarnogora);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("2")) {
                image.setImageResource(R.drawable.andorra);
                b1.setText(R.string.niemcy);
                b2.setText(R.string.albania);
                b3.setText(R.string.belgia);
                b4.setText(R.string.andora);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("3")) {
                image.setImageResource(R.drawable.austria);
                b1.setText(R.string.indie);
                b2.setText(R.string.austria);
                b3.setText(R.string.australia);
                b4.setText(R.string.nowa_zelandia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("4")) {
                image.setImageResource(R.drawable.belarus);
                b1.setText(R.string.wietnam);
                b2.setText(R.string.watykan);
                b3.setText(R.string.portugalia);
                b4.setText(R.string.bialorus);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("5")) {
                image.setImageResource(R.drawable.belgium);
                b1.setText(R.string.belgia);
                b2.setText(R.string.niemcy);
                b3.setText(R.string.argentyna);
                b4.setText(R.string.madagaskar);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("6")) {
                image.setImageResource(R.drawable.bosnia);
                b1.setText(R.string.pakistan);
                b2.setText(R.string.bangladesz);
                b3.setText(R.string.bosnia);
                b4.setText(R.string.andora);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("7")) {
                image.setImageResource(R.drawable.bulgaria);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.polska);
                b3.setText(R.string.wlochy);
                b4.setText(R.string.bulgaria);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("8")) {
                image.setImageResource(R.drawable.croatia);
                b1.setText(R.string.monako);
                b2.setText(R.string.chorwacja);
                b3.setText(R.string.slowenia);
                b4.setText(R.string.slowacja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("9")) {
                image.setImageResource(R.drawable.czechy);
                b1.setText(R.string.czechy);
                b2.setText(R.string.islandia);
                b3.setText(R.string.norwegia);
                b4.setText(R.string.czarnogora);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();


                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("10")) {
                image.setImageResource(R.drawable.denmark);
                b1.setText(R.string.niemcy);
                b2.setText(R.string.norwegia);
                b3.setText(R.string.belgia);
                b4.setText(R.string.dania);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("11")) {
                image.setImageResource(R.drawable.estonia);
                b1.setText(R.string.serbia);
                b2.setText(R.string.estonia);
                b3.setText(R.string.luksemburg);
                b4.setText(R.string.grecja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("12")) {
                image.setImageResource(R.drawable.finland);
                b1.setText(R.string.dania);
                b2.setText(R.string.szwecja);
                b3.setText(R.string.norwegia);
                b4.setText(R.string.finlandia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("13")) {
                image.setImageResource(R.drawable.france);
                b1.setText(R.string.francja);
                b2.setText(R.string.hiszpania);
                b3.setText(R.string.moldawia);
                b4.setText(R.string.finlandia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("14")) {
                image.setImageResource(R.drawable.germany);
                b1.setText(R.string.belgia);
                b2.setText(R.string.chorwacja);
                b3.setText(R.string.niemcy);
                b4.setText(R.string.holandia);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("15")) {
                image.setImageResource(R.drawable.greece);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.polska);
                b3.setText(R.string.wlochy);
                b4.setText(R.string.grecja);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("16")) {
                image.setImageResource(R.drawable.iceland);
                b1.setText(R.string.norwegia);
                b2.setText(R.string.islandia);
                b3.setText(R.string.finlandia);
                b4.setText(R.string.slowacja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("17")) {
                image.setImageResource(R.drawable.kosovo);
                b1.setText(R.string.macedonia);
                b2.setText(R.string.kosowo);
                b3.setText(R.string.grecja);
                b4.setText(R.string.moldawia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("18")) {
                image.setImageResource(R.drawable.liechtenstein);
                b1.setText(R.string.hiszpania);
                b2.setText(R.string.watykan);
                b3.setText(R.string.holandia);
                b4.setText(R.string.liechtenstein);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("19")) {
                image.setImageResource(R.drawable.luxembourg);
                b1.setText(R.string.luksemburg);
                b2.setText(R.string.liechtenstein);
                b3.setText(R.string.holandia);
                b4.setText(R.string.polska);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("20")) {
                image.setImageResource(R.drawable.macedonia);
                b1.setText(R.string.niemcy);
                b2.setText(R.string.san_marino);
                b3.setText(R.string.macedonia);
                b4.setText(R.string.norwegia);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("21")) {
                image.setImageResource(R.drawable.moldova);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.serbia);
                b3.setText(R.string.czarnogora);
                b4.setText(R.string.moldawia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("22")) {
                image.setImageResource(R.drawable.montenegro);
                b1.setText(R.string.monako);
                b2.setText(R.string.czarnogora);
                b3.setText(R.string.slowenia);
                b4.setText(R.string.macedonia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("23")) {
                image.setImageResource(R.drawable.netherlands);
                b1.setText(R.string.holandia);
                b2.setText(R.string.islandia);
                b3.setText(R.string.luksemburg);
                b4.setText(R.string.belgia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();


                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("24")) {
                image.setImageResource(R.drawable.norway);
                b1.setText(R.string.islandia);
                b2.setText(R.string.finlandia);
                b3.setText(R.string.dania);
                b4.setText(R.string.norwegia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myStringEurope.equals("25")) {
                image.setImageResource(R.drawable.poland);
                b1.setText(R.string.serbia);
                b2.setText(R.string.polska);
                b3.setText(R.string.luksemburg);
                b4.setText(R.string.grecja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("26")) {
                image.setImageResource(R.drawable.sanmarino);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.watykan);
                b3.setText(R.string.norwegia);
                b4.setText(R.string.san_marino);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("27")) {
                image.setImageResource(R.drawable.serbia);
                b1.setText(R.string.serbia);
                b2.setText(R.string.slowacja);
                b3.setText(R.string.slowenia);
                b4.setText(R.string.estonia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("28")) {
                image.setImageResource(R.drawable.slovakia);
                b1.setText(R.string.slowenia);
                b2.setText(R.string.chorwacja);
                b3.setText(R.string.slowacja);
                b4.setText(R.string.czarnogora);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("29")) {
                image.setImageResource(R.drawable.slovenia);
                b1.setText(R.string.chorwacja);
                b2.setText(R.string.slowacja);
                b3.setText(R.string.wlochy);
                b4.setText(R.string.slowenia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myStringEurope.equals("30")) {
                image.setImageResource(R.drawable.spain);
                b1.setText(R.string.norwegia);
                b2.setText(R.string.hiszpania);
                b3.setText(R.string.finlandia);
                b4.setText(R.string.portugalia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                europe();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }


            dialog.show();
        }

        else
        {
            dialog.dismiss();
            lostEurope();
            score = 0;
            lives = 3;
        }

    }

    public void swiat() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.swiat);
        dialog.setTitle(R.string.world);


        Button exit = (dialog).findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                score = 0;
                lives = 3;
            }
        });


        ImageView image = (dialog).findViewById(R.id.imgRandom);
        Button b1 = dialog.findViewById(R.id.b1);
        Button b2 = dialog.findViewById(R.id.b2);
        Button b3 = dialog.findViewById(R.id.b3);
        Button b4 = dialog.findViewById(R.id.b4);


        final int min = 1;
        final int max = 86;
        final Random r = new Random();
        final int number = r.nextInt(max - min + 1) + min;
        final String myString = String.valueOf(number);

        if(lives > 0) {
            if (myString.equals("1")) {
                image.setImageResource(R.drawable.afghanistan);
                b1.setText(R.string.afganistan);
                b2.setText(R.string.irak);
                b3.setText(R.string.armenia);
                b4.setText(R.string.mongolia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("2")) {
                image.setImageResource(R.drawable.armenia);
                b1.setText(R.string.indonezja);
                b2.setText(R.string.nepal);
                b3.setText(R.string.syria);
                b4.setText(R.string.armenia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("3")) {
                image.setImageResource(R.drawable.azerbaijan);
                b1.setText(R.string.bhutan);
                b2.setText(R.string.azerbejdzan);
                b3.setText(R.string.armenia);
                b4.setText(R.string.pakistan);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("4")) {
                image.setImageResource(R.drawable.bahrain);
                b1.setText(R.string.wietnam);
                b2.setText(R.string.kazachstan);
                b3.setText(R.string.laos);
                b4.setText(R.string.bahrajn);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("5")) {
                image.setImageResource(R.drawable.bangladesh);
                b1.setText(R.string.bangladesz);
                b2.setText(R.string.indie);
                b3.setText(R.string.japonia);
                b4.setText(R.string.jordania);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("6")) {
                image.setImageResource(R.drawable.bhutan);
                b1.setText(R.string.pakistan);
                b2.setText(R.string.bangladesz);
                b3.setText(R.string.bhutan);
                b4.setText(R.string.indonezja);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("7")) {
                image.setImageResource(R.drawable.brunei);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.turcja);
                b3.setText(R.string.wietnam);
                b4.setText(R.string.brunei);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("8")) {
                image.setImageResource(R.drawable.cambodia);
                b1.setText(R.string.mongolia);
                b2.setText(R.string.kambodza);
                b3.setText(R.string.kazachstan);
                b4.setText(R.string.timor);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("9")) {
                image.setImageResource(R.drawable.china);
                b1.setText(R.string.chiny);
                b2.setText(R.string.wietnam);
                b3.setText(R.string.pakistan);
                b4.setText(R.string.laos);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("10")) {
                image.setImageResource(R.drawable.easttimor);
                b1.setText(R.string.armenia);
                b2.setText(R.string.bhutan);
                b3.setText(R.string.brunei);
                b4.setText(R.string.timor);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("11")) {
                image.setImageResource(R.drawable.georgia);
                b1.setText(R.string.iran);
                b2.setText(R.string.gruzja);
                b3.setText(R.string.chiny);
                b4.setText(R.string.azerbejdzan);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("12")) {
                image.setImageResource(R.drawable.india);
                b1.setText(R.string.bahrajn);
                b2.setText(R.string.nepal);
                b3.setText(R.string.pakistan);
                b4.setText(R.string.indie);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("13")) {
                image.setImageResource(R.drawable.indonesia);
                b1.setText(R.string.indonezja);
                b2.setText(R.string.kambodza);
                b3.setText(R.string.kuwejt);
                b4.setText(R.string.jordania);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("14")) {
                image.setImageResource(R.drawable.iran);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.syria);
                b3.setText(R.string.iran);
                b4.setText(R.string.irak);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("15")) {
                image.setImageResource(R.drawable.iraq);
                b1.setText(R.string.laos);
                b2.setText(R.string.iran);
                b3.setText(R.string.indonezja);
                b4.setText(R.string.irak);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("16")) {
                image.setImageResource(R.drawable.japan);
                b1.setText(R.string.chiny);
                b2.setText(R.string.japonia);
                b3.setText(R.string.korea_pln);
                b4.setText(R.string.bangladesz);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("17")) {
                image.setImageResource(R.drawable.jordan);
                b1.setText(R.string.kuwejt);
                b2.setText(R.string.jordania);
                b3.setText(R.string.turcja);
                b4.setText(R.string.wietnam);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("18")) {
                image.setImageResource(R.drawable.kazakhstan);
                b1.setText(R.string.indie);
                b2.setText(R.string.mongolia);
                b3.setText(R.string.syria);
                b4.setText(R.string.kazachstan);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("19")) {
                image.setImageResource(R.drawable.kuwait);
                b1.setText(R.string.kuwejt);
                b2.setText(R.string.izrael);
                b3.setText(R.string.liban);
                b4.setText(R.string.jordania);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("20")) {
                image.setImageResource(R.drawable.laos);
                b1.setText(R.string.iran);
                b2.setText(R.string.bangladesz);
                b3.setText(R.string.laos);
                b4.setText(R.string.liban);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("21")) {
                image.setImageResource(R.drawable.lebanon);
                b1.setText(R.string.indonezja);
                b2.setText(R.string.iran);
                b3.setText(R.string.laos);
                b4.setText(R.string.liban);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("22")) {
                image.setImageResource(R.drawable.mongolia);
                b1.setText(R.string.nepal);
                b2.setText(R.string.mongolia);
                b3.setText(R.string.bangladesz);
                b4.setText(R.string.armenia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("23")) {
                image.setImageResource(R.drawable.nepal);
                b1.setText(R.string.nepal);
                b2.setText(R.string.indie);
                b3.setText(R.string.azerbejdzan);
                b4.setText(R.string.iran);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("24")) {
                image.setImageResource(R.drawable.pakistan);
                b1.setText(R.string.irak);
                b2.setText(R.string.iran);
                b3.setText(R.string.afganistan);
                b4.setText(R.string.pakistan);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("25")) {
                image.setImageResource(R.drawable.southkorea);
                b1.setText(R.string.korea_pln);
                b2.setText(R.string.korea_pl);
                b3.setText(R.string.kuwejt);
                b4.setText(R.string.jordania);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("26")) {
                image.setImageResource(R.drawable.syria);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.iran);
                b3.setText(R.string.irak);
                b4.setText(R.string.syria);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("27")) {
                image.setImageResource(R.drawable.thailand);
                b1.setText(R.string.tajlandia);
                b2.setText(R.string.laos);
                b3.setText(R.string.bangladesz);
                b4.setText(R.string.timor);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("28")) {
                image.setImageResource(R.drawable.turkey);
                b1.setText(R.string.armenia);
                b2.setText(R.string.gruzja);
                b3.setText(R.string.turcja);
                b4.setText(R.string.izrael);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("29")) {
                image.setImageResource(R.drawable.vietnam);
                b1.setText(R.string.pakistan);
                b2.setText(R.string.armenia);
                b3.setText(R.string.chiny);
                b4.setText(R.string.wietnam);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("30")) {
                image.setImageResource(R.drawable.albania);
                b1.setText(R.string.albania);
                b2.setText(R.string.macedonia);
                b3.setText(R.string.belgia);
                b4.setText(R.string.czarnogora);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("31")) {
                image.setImageResource(R.drawable.andorra);
                b1.setText(R.string.niemcy);
                b2.setText(R.string.albania);
                b3.setText(R.string.belgia);
                b4.setText(R.string.andora);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("32")) {
                image.setImageResource(R.drawable.austria);
                b1.setText(R.string.indie);
                b2.setText(R.string.austria);
                b3.setText(R.string.australia);
                b4.setText(R.string.nowa_zelandia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("33")) {
                image.setImageResource(R.drawable.belarus);
                b1.setText(R.string.wietnam);
                b2.setText(R.string.watykan);
                b3.setText(R.string.portugalia);
                b4.setText(R.string.bialorus);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("34")) {
                image.setImageResource(R.drawable.belgium);
                b1.setText(R.string.belgia);
                b2.setText(R.string.niemcy);
                b3.setText(R.string.argentyna);
                b4.setText(R.string.madagaskar);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("35")) {
                image.setImageResource(R.drawable.bosnia);
                b1.setText(R.string.pakistan);
                b2.setText(R.string.bangladesz);
                b3.setText(R.string.bosnia);
                b4.setText(R.string.kuwejt);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("36")) {
                image.setImageResource(R.drawable.bulgaria);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.polska);
                b3.setText(R.string.wlochy);
                b4.setText(R.string.bulgaria);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("37")) {
                image.setImageResource(R.drawable.croatia);
                b1.setText(R.string.monako);
                b2.setText(R.string.chorwacja);
                b3.setText(R.string.slowenia);
                b4.setText(R.string.slowacja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("38")) {
                image.setImageResource(R.drawable.czechy);
                b1.setText(R.string.czechy);
                b2.setText(R.string.islandia);
                b3.setText(R.string.norwegia);
                b4.setText(R.string.czarnogora);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("39")) {
                image.setImageResource(R.drawable.denmark);
                b1.setText(R.string.niemcy);
                b2.setText(R.string.norwegia);
                b3.setText(R.string.belgia);
                b4.setText(R.string.dania);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("40")) {
                image.setImageResource(R.drawable.estonia);
                b1.setText(R.string.serbia);
                b2.setText(R.string.estonia);
                b3.setText(R.string.luksemburg);
                b4.setText(R.string.grecja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("41")) {
                image.setImageResource(R.drawable.finland);
                b1.setText(R.string.dania);
                b2.setText(R.string.szwecja);
                b3.setText(R.string.norwegia);
                b4.setText(R.string.finlandia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("42")) {
                image.setImageResource(R.drawable.france);
                b1.setText(R.string.francja);
                b2.setText(R.string.hiszpania);
                b3.setText(R.string.moldawia);
                b4.setText(R.string.finlandia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("43")) {
                image.setImageResource(R.drawable.germany);
                b1.setText(R.string.belgia);
                b2.setText(R.string.chorwacja);
                b3.setText(R.string.niemcy);
                b4.setText(R.string.holandia);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("44")) {
                image.setImageResource(R.drawable.greece);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.polska);
                b3.setText(R.string.wlochy);
                b4.setText(R.string.grecja);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("45")) {
                image.setImageResource(R.drawable.iceland);
                b1.setText(R.string.norwegia);
                b2.setText(R.string.islandia);
                b3.setText(R.string.finlandia);
                b4.setText(R.string.slowacja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("46")) {
                image.setImageResource(R.drawable.kosovo);
                b1.setText(R.string.macedonia);
                b2.setText(R.string.kosowo);
                b3.setText(R.string.grecja);
                b4.setText(R.string.moldawia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("47")) {
                image.setImageResource(R.drawable.liechtenstein);
                b1.setText(R.string.hiszpania);
                b2.setText(R.string.watykan);
                b3.setText(R.string.holandia);
                b4.setText(R.string.liechtenstein);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("48")) {
                image.setImageResource(R.drawable.luxembourg);
                b1.setText(R.string.luksemburg);
                b2.setText(R.string.liechtenstein);
                b3.setText(R.string.holandia);
                b4.setText(R.string.polska);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("49")) {
                image.setImageResource(R.drawable.macedonia);
                b1.setText(R.string.niemcy);
                b2.setText(R.string.san_marino);
                b3.setText(R.string.macedonia);
                b4.setText(R.string.norwegia);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("50")) {
                image.setImageResource(R.drawable.moldova);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.serbia);
                b3.setText(R.string.czarnogora);
                b4.setText(R.string.moldawia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("51")) {
                image.setImageResource(R.drawable.montenegro);
                b1.setText(R.string.monako);
                b2.setText(R.string.czarnogora);
                b3.setText(R.string.slowenia);
                b4.setText(R.string.macedonia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("52")) {
                image.setImageResource(R.drawable.netherlands);
                b1.setText(R.string.holandia);
                b2.setText(R.string.islandia);
                b3.setText(R.string.luksemburg);
                b4.setText(R.string.belgia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("53")) {
                image.setImageResource(R.drawable.norway);
                b1.setText(R.string.islandia);
                b2.setText(R.string.finlandia);
                b3.setText(R.string.dania);
                b4.setText(R.string.norwegia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("54")) {
                image.setImageResource(R.drawable.poland);
                b1.setText(R.string.serbia);
                b2.setText(R.string.polska);
                b3.setText(R.string.luksemburg);
                b4.setText(R.string.grecja);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("55")) {
                image.setImageResource(R.drawable.sanmarino);
                b1.setText(R.string.kosowo);
                b2.setText(R.string.watykan);
                b3.setText(R.string.norwegia);
                b4.setText(R.string.san_marino);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("56")) {
                image.setImageResource(R.drawable.serbia);
                b1.setText(R.string.serbia);
                b2.setText(R.string.slowacja);
                b3.setText(R.string.slowenia);
                b4.setText(R.string.estonia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("57")) {
                image.setImageResource(R.drawable.slovakia);
                b1.setText(R.string.slowenia);
                b2.setText(R.string.chorwacja);
                b3.setText(R.string.slowacja);
                b4.setText(R.string.czarnogora);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("58")) {
                image.setImageResource(R.drawable.slovenia);
                b1.setText(R.string.chorwacja);
                b2.setText(R.string.slowacja);
                b3.setText(R.string.wlochy);
                b4.setText(R.string.slowenia);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("59")) {
                image.setImageResource(R.drawable.spain);
                b1.setText(R.string.norwegia);
                b2.setText(R.string.hiszpania);
                b3.setText(R.string.finlandia);
                b4.setText(R.string.portugalia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("60")) {
                image.setImageResource(R.drawable.algeria);
                b1.setText(R.string.algeria);
                b2.setText(R.string.maroko);
                b3.setText(R.string.rpa);
                b4.setText(R.string.etiopia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("61")) {
                image.setImageResource(R.drawable.angola);
                b1.setText(R.string.togo);
                b2.setText(R.string.ghana);
                b3.setText(R.string.gabon);
                b4.setText(R.string.angola);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("62")) {
                image.setImageResource(R.drawable.burkinafaso);
                b1.setText(R.string.kongo);
                b2.setText(R.string.burkina_faso);
                b3.setText(R.string.libia);
                b4.setText(R.string.lesotho);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("63")) {
                image.setImageResource(R.drawable.burundi);
                b1.setText(R.string.kongo);
                b2.setText(R.string.mauritius);
                b3.setText(R.string.madagaskar);
                b4.setText(R.string.burundi);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("64")) {
                image.setImageResource(R.drawable.cameroon);
                b1.setText(R.string.kamerun);
                b2.setText(R.string.sudan);
                b3.setText(R.string.zimbabwe);
                b4.setText(R.string.libia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("65")) {
                image.setImageResource(R.drawable.capeverde);
                b1.setText(R.string.sudan);
                b2.setText(R.string.etiopia);
                b3.setText(R.string.rep_ziel);
                b4.setText(R.string.gabon);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("66")) {
                image.setImageResource(R.drawable.centralafricanrepublic);
                b1.setText(R.string.egipt);
                b2.setText(R.string.uganda);
                b3.setText(R.string.kenia);
                b4.setText(R.string.rep_sr);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("67")) {
                image.setImageResource(R.drawable.chad);
                b1.setText(R.string.nigeria);
                b2.setText(R.string.czad);
                b3.setText(R.string.mali);
                b4.setText(R.string.burkina_faso);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("68")) {
                image.setImageResource(R.drawable.comoros);
                b1.setText(R.string.komory);
                b2.setText(R.string.rpa);
                b3.setText(R.string.liberia);
                b4.setText(R.string.senegal);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("69")) {
                image.setImageResource(R.drawable.congo);
                b1.setText(R.string.ghana);
                b2.setText(R.string.kamerun);
                b3.setText(R.string.angola);
                b4.setText(R.string.kongo);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("70")) {
                image.setImageResource(R.drawable.egypt);
                b1.setText(R.string.lesotho);
                b2.setText(R.string.egipt);
                b3.setText(R.string.maroko);
                b4.setText(R.string.libia);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("71")) {
                image.setImageResource(R.drawable.eritrea);
                b1.setText(R.string.madagaskar);
                b2.setText(R.string.namibia);
                b3.setText(R.string.zambia);
                b4.setText(R.string.erytrea);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("72")) {
                image.setImageResource(R.drawable.ethiopia);
                b1.setText(R.string.etiopia);
                b2.setText(R.string.kongo);
                b3.setText(R.string.sudan);
                b4.setText(R.string.mozambik);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("73")) {
                image.setImageResource(R.drawable.gabon);
                b1.setText(R.string.tanzania);
                b2.setText(R.string.uganda);
                b3.setText(R.string.gabon);
                b4.setText(R.string.somalia);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("74")) {
                image.setImageResource(R.drawable.ghana);
                b1.setText(R.string.czad);
                b2.setText(R.string.mali);
                b3.setText(R.string.togo);
                b4.setText(R.string.ghana);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("75")) {
                image.setImageResource(R.drawable.guinea);
                b1.setText(R.string.sahara);
                b2.setText(R.string.gwinea);
                b3.setText(R.string.maroko);
                b4.setText(R.string.burundi);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("76")) {
                image.setImageResource(R.drawable.kenya);
                b1.setText(R.string.etiopia);
                b2.setText(R.string.kenia);
                b3.setText(R.string.zimbabwe);
                b4.setText(R.string.kongo);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("77")) {
                image.setImageResource(R.drawable.lesotho);
                b1.setText(R.string.algeria);
                b2.setText(R.string.angola);
                b3.setText(R.string.togo);
                b4.setText(R.string.lesotho);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("78")) {
                image.setImageResource(R.drawable.liberia);
                b1.setText(R.string.liberia);
                b2.setText(R.string.lesotho);
                b3.setText(R.string.ghana);
                b4.setText(R.string.rpa);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("79")) {
                image.setImageResource(R.drawable.libya);
                b1.setText(R.string.madagaskar);
                b2.setText(R.string.egipt);
                b3.setText(R.string.libia);
                b4.setText(R.string.lesotho);

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("80")) {
                image.setImageResource(R.drawable.madagascar);
                b1.setText(R.string.burkina_faso);
                b2.setText(R.string.sudan);
                b3.setText(R.string.libia);
                b4.setText(R.string.madagaskar);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("81")) {
                image.setImageResource(R.drawable.mauritius);
                b1.setText(R.string.kamerun);
                b2.setText(R.string.mauritius);
                b3.setText(R.string.togo);
                b4.setText(R.string.angola);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("82")) {
                image.setImageResource(R.drawable.morocco);
                b1.setText(R.string.maroko);
                b2.setText(R.string.gabon);
                b3.setText(R.string.liberia);
                b4.setText(R.string.czad);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();

                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("83")) {
                image.setImageResource(R.drawable.seychelles);
                b1.setText(R.string.senegal);
                b2.setText(R.string.burundi);
                b3.setText(R.string.ghana);
                b4.setText(R.string.seszele);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });

            }
            if (myString.equals("84")) {
                image.setImageResource(R.drawable.southafrica);
                b1.setText(R.string.madagaskar);
                b2.setText(R.string.rpa);
                b3.setText(R.string.erytrea);
                b4.setText(R.string.gabon);

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("85")) {
                image.setImageResource(R.drawable.swaziland);
                b1.setText(R.string.kenia);
                b2.setText(R.string.seszele);
                b3.setText(R.string.angola);
                b4.setText(R.string.suazi);

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
            }
            if (myString.equals("86")) {
                image.setImageResource(R.drawable.togo);
                b1.setText(R.string.togo);
                b2.setText(R.string.suazi);
                b3.setText(R.string.egipt);
                b4.setText(R.string.libia);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(green);
                        correct();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                                swiat();
                            }
                        }, 1000);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(red);
                        incorrect();
                    }
                });


            }  dialog.show();
        }

        else
        {
            dialog.dismiss();
            lostWorld();
            score = 0;
            lives = 3;
        }

    }
    public void correct()
    {
        score++;

        if(sounds) {
            MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.correct);
            mp.start();
        }

        Context context = getApplicationContext();
        CharSequence text = "Punkty: " + score;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 230);
        toast.show();
    }
    public void incorrect()
    {
        lives--;

        if(sounds) {
            MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.incorrect);
            mp.start();
        }

        Context context = getApplicationContext();
        CharSequence text = "Życia: " + lives;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 230);
        toast.show();
    }

    public void lostEurope()
    {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Przegrałeś")
                .setMessage("Straciłeś już wszystkie życia, czy chcesz zacząć od nowa?")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false) //okno nie będzie się zamykać po kliknięciu poza nie
                .setPositiveButton("Tak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        europe();
                    }
                })
                .setNegativeButton("Nie", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        return;
                    }
                })
                .show();
    }
    public void lostAsia()
    {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Przegrałeś")
                .setMessage("Straciłeś już wszystkie życia, czy chcesz zacząć od nowa?")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false) //okno nie będzie się zamykać po kliknięciu poza nie
                .setPositiveButton("Tak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        asia();
                    }
                })
                .setNegativeButton("Nie", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
    public void lostAfrica()
    {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Przegrałeś")
                .setMessage("Straciłeś już wszystkie życia, czy chcesz zacząć od nowa?")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false) //okno nie będzie się zamykać po kliknięciu poza nie
                .setPositiveButton("Tak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        africa();
                    }
                })
                .setNegativeButton("Nie", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
    public void lostWorld()
    {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Przegrałeś")
                .setMessage("Straciłeś już wszystkie życia, czy chcesz zacząć od nowa?")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false) //okno nie będzie się zamykać po kliknięciu poza nie
                .setPositiveButton("Tak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        swiat();
                    }
                })
                .setNegativeButton("Nie", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

}

