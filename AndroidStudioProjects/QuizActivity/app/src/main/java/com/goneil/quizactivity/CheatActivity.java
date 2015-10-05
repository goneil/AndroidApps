package com.goneil.quizactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by goneil on 9/9/15.
 */
public class CheatActivity extends Activity{
    public static final String EXTRA_ANSWER_IS_TRUE =
            "com.bignerdranch.android.geoquiz.answer_is_true";

    public static final String EXTRA_ANSWER_SHOWN =
            "com.bignerdranch.adnroid.geoquiz.answer_shown";

    private static final String IS_CHEATER =
            "is_cheater";
    private boolean mAnswerIsTrue;

    private TextView mAnswerTextView;
    private Button mShowAnswer;
    private boolean mIsAnswerShown = false;

    private void setAnswerShownResult(boolean isAnswerShown) {
        mIsAnswerShown = isAnswerShown;
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
        setResult(RESULT_OK, data);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(IS_CHEATER, mIsAnswerShown);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mIsAnswerShown = savedInstanceState.getBoolean(IS_CHEATER, false);
        }

        setAnswerShownResult(mIsAnswerShown);

        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView)findViewById(R.id.answer_text_view);
        mShowAnswer = (Button)findViewById(R.id.show_answer_button);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswerIsTrue) {
                    mAnswerTextView.setText(R.string.true_button);
                } else {
                    mAnswerTextView.setText(R.string.false_button);
                }
                setAnswerShownResult(true);
            }
        });

        TextView versionView = (TextView)findViewById(R.id.version_text_view);
        versionView.setText("API level " + Build.VERSION.SDK_INT);
    }
}
