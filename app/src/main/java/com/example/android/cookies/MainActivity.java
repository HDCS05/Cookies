package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        displayPic();

        // TODO: Find a reference to the TextView in the layout. Change the text.
        String cookieMessage = "I\'m so full";
        displayMessage(cookieMessage);
    }

    /**
     * This method displays the given picture on the screen.
     */
    private void displayPic() {
        ImageView cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImageView.setImageResource(R.drawable.after_cookie);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText(message);
    }

}
