package compsci290.edu.duke.imageviewer;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Callback method for clicks on the buttons in Main Screen.
     *
     * @param v View clicked
     */

    public void onButtonClick(View v) {

        switch (v.getId()) {

            case R.id.button_gallery:
                Intent galleryIntent =
                        new Intent(
                                Intent.ACTION_PICK,
                                android.
                                        provider.
                                        MediaStore.
                                        Images.
                                        Media.
                                        EXTERNAL_CONTENT_URI
                        );
                startActivityForResult(galleryIntent, 0);
                break;

            case R.id.button_dukeimages:
                Intent i = new Intent (MainActivity.this,
                        ImageGridActivity.class);
                startActivity(i);
                break;

            default:
        }

    }
}
