package ee.taltech.vk.sabenin.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_question extends AppCompatActivity {
    ImageView imgCapital;
    TextView txtQuestion;
    Button btnAnnswer1;
    Button btnAnnswer2;
    Button btnAnnswer3;
    Button btnAnnswer4;

    int total = 0;
    int n = 0;

    Question[] quiz = new Question[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        quiz[0] = new Question(1, "What is capital of Estonia", new String[]{"Tallinn", "Riga", "Vilnius", "Praha"}, "Tallinn", "tallinn");
        quiz[1] = new Question(2, "What is capital of Russia", new String[]{"Varssavi", "Moscow", "Vilnius", "Paris"}, "Moscow", "moscow");
        quiz[2] = new Question(3, "What is capital of  United States of America", new String[]{"Vilnius", "Paris", "Washington", "Moscow"}, "Washington", "washington");
        quiz[3] = new Question(4, "What is capital of Poland", new String[]{"Riga", "Varssavi", "Helsinki", "Washington"}, "Varssavi", "varssavi");
        quiz[4] = new Question(5, "What is capital of Ukraine", new String[]{"Kiev", "Helsinki", "Tallinn", "Berlin"}, "Kiev", "kiev");
        quiz[5] = new Question(6, "What is capital of Lithuania", new String[]{"Praha", "Moscow", "Tallinn", " Vilnius"}, "Vilnius", "vilnius");
        quiz[6] = new Question(7, "What is capital of Latvia", new String[]{"Riga", "Washington", "Vilnius", "Praha"}, "Riga", "riga");
        quiz[7] = new Question(8, "What is capital of France", new String[]{"Paris", "Moscow", "Vilnius", "Helsinki"}, "Paris", "paris");
        quiz[8] = new Question(9, "What is capital of Finland", new String[]{"Vilnius", "Helsinki", "Riga", "Moscow"}, "Helsinki", "helsinki");
        quiz[9] = new Question(10, "What is capital of Germany", new String[]{"Riga", "Moscow", "Berlin", "Praha"}, "Berlin", "berlin");


        imgCapital = findViewById(R.id.image);
        txtQuestion = findViewById(R.id.textView3);
        btnAnnswer1 = findViewById(R.id.answer1);
        btnAnnswer2 = findViewById(R.id.answer2);
        btnAnnswer3 = findViewById(R.id.answer3);
        btnAnnswer4 = findViewById(R.id.answer4);


        txtQuestion.setText(quiz[n].getQuestion());
        btnAnnswer1.setText(quiz[n].getAnswers()[0]);
        btnAnnswer2.setText(quiz[n].getAnswers()[1]);
        btnAnnswer3.setText(quiz[n].getAnswers()[2]);
        btnAnnswer4.setText(quiz[n].getAnswers()[3]);
        int resID = getResources().getIdentifier(quiz[n].getCapitalImage(), "drawable", getPackageName());
        Drawable myDrawable = getResources().getDrawable(resID);
        imgCapital.setImageDrawable(myDrawable);

        btnAnnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAnnswer1.getText().equals(quiz[n].getTrueAnswer())) {
                    Toast.makeText(getApplicationContext(), "Yes, this is correct answer", Toast.LENGTH_LONG).show();
                    total = total + 10;
                } else {
                    Toast.makeText(getApplicationContext(), "Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                }
                n++;
                if (n == 10) {
                    openactivity_end();
                } else {

                    txtQuestion.setText(quiz[n].getQuestion());
                    btnAnnswer1.setText(quiz[n].getAnswers()[0]);
                    btnAnnswer2.setText(quiz[n].getAnswers()[1]);
                    btnAnnswer3.setText(quiz[n].getAnswers()[2]);
                    btnAnnswer4.setText(quiz[n].getAnswers()[3]);
                    int resID = getResources().getIdentifier(quiz[n].getCapitalImage(), "drawable", getPackageName());
                    Drawable myDrawable = getResources().getDrawable(resID);
                    imgCapital.setImageDrawable(myDrawable);
                }
            }
        });

        btnAnnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAnnswer2.getText().equals(quiz[n].getTrueAnswer())) {
                    Toast.makeText(getApplicationContext(), "Yes, this is correct answer", Toast.LENGTH_LONG).show();
                    total = total + 10;
                } else {
                    Toast.makeText(getApplicationContext(), "Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                }
                n++;
                if (n == 10) {
                    openactivity_end();
                } else {
                    txtQuestion.setText(quiz[n].getQuestion());
                    btnAnnswer1.setText(quiz[n].getAnswers()[0]);
                    btnAnnswer2.setText(quiz[n].getAnswers()[1]);
                    btnAnnswer3.setText(quiz[n].getAnswers()[2]);
                    btnAnnswer4.setText(quiz[n].getAnswers()[3]);
                    int resID = getResources().getIdentifier(quiz[n].getCapitalImage(), "drawable", getPackageName());
                    Drawable myDrawable = getResources().getDrawable(resID);
                    imgCapital.setImageDrawable(myDrawable);
                }
            }
        });

        btnAnnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAnnswer3.getText().equals(quiz[n].getTrueAnswer())) {
                    Toast.makeText(getApplicationContext(), "Yes, this is correct answer", Toast.LENGTH_LONG).show();
                    total = total + 10;
                } else {
                    Toast.makeText(getApplicationContext(), "Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                }
                n++;
                if (n == 10) {
                    openactivity_end();
                } else {
                    txtQuestion.setText(quiz[n].getQuestion());
                    btnAnnswer1.setText(quiz[n].getAnswers()[0]);
                    btnAnnswer2.setText(quiz[n].getAnswers()[1]);
                    btnAnnswer3.setText(quiz[n].getAnswers()[2]);
                    btnAnnswer4.setText(quiz[n].getAnswers()[3]);
                    int resID = getResources().getIdentifier(quiz[n].getCapitalImage(), "drawable", getPackageName());
                    Drawable myDrawable = getResources().getDrawable(resID);
                    imgCapital.setImageDrawable(myDrawable);
                }
            }
        });
        btnAnnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAnnswer4.getText().equals(quiz[n].getTrueAnswer())) {
                    Toast.makeText(getApplicationContext(), "Yes, this is correct answer", Toast.LENGTH_LONG).show();
                    total = total + 10;
                } else {
                    Toast.makeText(getApplicationContext(), "Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                }
                n++;
                if (n == 10) {
                    openactivity_end();
                } else {

                    txtQuestion.setText(quiz[n].getQuestion());
                    btnAnnswer1.setText(quiz[n].getAnswers()[0]);
                    btnAnnswer2.setText(quiz[n].getAnswers()[1]);
                    btnAnnswer3.setText(quiz[n].getAnswers()[2]);
                    btnAnnswer4.setText(quiz[n].getAnswers()[3]);
                    int resID = getResources().getIdentifier(quiz[n].getCapitalImage(), "drawable", getPackageName());
                    Drawable myDrawable = getResources().getDrawable(resID);
                    imgCapital.setImageDrawable(myDrawable);
                }
            }
        });
        }
        public void openactivity_end () {
            Intent intent = new Intent(this, activity_end.class);
            startActivity(intent);
    }
}